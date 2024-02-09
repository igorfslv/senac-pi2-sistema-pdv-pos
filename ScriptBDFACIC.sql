-- -----------------------------------------------------


-- lojafacic Database


-- -----------------------------------------------------


CREATE DATABASE IF NOT EXISTS lojafacic;

USE lojafacic;
    
    
-- -----------------------------------------------------
-- Table lojafacic.clientes
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS clientes
(
	idCliente 				INT   AUTO_INCREMENT,
    nomeCliente 			VARCHAR(70) NOT NULL,
    cpfCliente 				CHAR(14) 	NOT NULL UNIQUE,
    telCliente 				VARCHAR(15) NOT NULL,
    dtNascimentoCliente		DATE 		NOT NULL,
    emailCliente 			VARCHAR(50) NOT NULL,
    estadoCivil 			VARCHAR(20) NOT NULL,
    sexoCliente 			VARCHAR(20) NOT NULL,
    logradouroCliente 		VARCHAR(60) NOT NULL,
    numeroCliente 			VARCHAR(10) NOT NULL,
    bairroCliente 			VARCHAR(40) NOT NULL,
    cidadeCliente 			VARCHAR(60) NOT NULL,
    ufCliente 				CHAR(2)		NOT NULL,
    cepCliente      		CHAR(10)	NOT NULL,
    
	CONSTRAINT pkClie PRIMARY KEY (idCliente)
);


-- -----------------------------------------------------
-- Table lojafacic.vendedores
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS vendedores
(
	idVendedor 				INT   AUTO_INCREMENT,
    nomeVendedor 			VARCHAR(70) NOT NULL,
    cpfVendedor				CHAR(14) 	NOT NULL UNIQUE,
    telVendedor				VARCHAR(15) NOT NULL,
    dtNascimentoVendedor	DATE 		NOT NULL,
    emailVendedor 			VARCHAR(50) NOT NULL,
    cargoVendedor 			VARCHAR(20) NOT NULL,
    estadoCivilVendedor 	VARCHAR(20) NOT NULL,
    sexoVendedor 			VARCHAR(20) NOT NULL,
    logradouroVendedor 		VARCHAR(60) NOT NULL,
    numeroVendedor 			VARCHAR(10) NOT NULL,
    bairroVendedor 			VARCHAR(40) NOT NULL,
    cidadeVendedor 			VARCHAR(60) NOT NULL,
    ufVendedor 				CHAR(2)		NOT NULL,
    cepVendedor      		CHAR(10)	NOT NULL,
    
	CONSTRAINT pkVend PRIMARY KEY (idVendedor)
);


-- -----------------------------------------------------
-- Table lojafacic.produtos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS produtos
(
	idProduto 		INT       AUTO_INCREMENT,
    nomeProduto 	VARCHAR(70) 	NOT NULL,
    precoCusto		DECIMAL(13,2) 	NOT NULL,
    precoVenda		DECIMAL(13,2) 	NOT NULL,
    qtdeEstoque 	INT(10) 		NOT NULL,
    categoriaProd 	VARCHAR(50) 	NOT NULL,
    
	CONSTRAINT pkProd PRIMARY KEY (idProduto)
);


-- -----------------------------------------------------
-- Table lojafacic.pedidos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS pedidos
(
	idPedido 		INT 	  AUTO_INCREMENT,
    idVendedor		INT				NOT NULL,	    	
    idCliente		INT				NOT NULL,
    dataPedido 		DATE 			NOT NULL,
    pagamentoPedido VARCHAR(30)		NOT NULL,
    parcelamento 	VARCHAR(30) 	NOT NULL,
    valorTotal		DECIMAL(13,2) 	NOT NULL,
    
	CONSTRAINT pkPedi PRIMARY KEY (idPedido)
);


-- -----------------------------------------------------
-- Constraints - Relacionamentos
-- -----------------------------------------------------
ALTER TABLE pedidos ADD CONSTRAINT fkIdClie FOREIGN KEY
(idCliente) REFERENCES clientes (idCliente);

ALTER TABLE pedidos ADD CONSTRAINT fkIdVend FOREIGN KEY
(idVendedor) REFERENCES vendedores (idVendedor);


-- -----------------------------------------------------
-- Table lojafacic.itemPedido
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS itemPedido
(
	idItemPedido		INT 	  AUTO_INCREMENT,
	idPedido 			INT 			NOT NULL,
    idProduto			INT				NOT NULL,
    qtdeItem 			INT 			NOT NULL,
    precoVenda			DECIMAL(13,2) 	NOT NULL,
    valorTotalItem		DECIMAL(13,2) 	NOT NULL,
    
	CONSTRAINT pkItemPedi PRIMARY KEY (idItemPedido)
);


-- -----------------------------------------------------
-- Constraints - Relacionamentos
-- -----------------------------------------------------
ALTER TABLE itemPedido ADD CONSTRAINT fkIdPedi FOREIGN KEY(idPedido) REFERENCES pedidos (idPedido);

ALTER TABLE itemPedido ADD CONSTRAINT fkIdProd FOREIGN KEY(idProduto) REFERENCES produtos (idProduto);


-- -----------------------------------------------------
-- Dados lojafacic.clientes
-- -----------------------------------------------------
INSERT INTO clientes (nomeCliente, cpfCliente, telCliente, dtNascimentoCliente, emailCliente, estadoCivil, sexoCliente, logradouroCliente, numeroCliente, bairroCliente, cidadeCliente, ufCliente, cepCliente)
			  VALUES ('Alice Bruna Cavalcanti'			, '986.374.068-31', '(11)9 9110-0642', '1988-09-03', 'alicebrunacavalcanti@editorazap.com.br'		, 'Solteiro(a)'		, 'Feminino'	, 'Viela Onze Garotos'			, 10	, 'Morumbi'				, 'São Paulo', 'SP', '08226-026'),
					 ('Nelson Manoel Gomes Pereira'		, '669.628.308-07', '(11)9 8453-3562', '1978-12-31', 'nelson_pereira@lojapetline.com.br'			, 'Solteiro(a)'		, 'Masculino'	, 'Rua Maresias de Abreu'		, 552	, 'Vila dos Andrades'	, 'São Paulo', 'SP', '02610-100'),
					 ('Marcos Giovanni Lucas da Mata'	, '201.877.628-21', '(11)9 8348-3167', '1998-01-22', 'marcos_damata@santander.com.br'				, 'Casado(a)'		, 'Masculino'	, 'Vila Heloísa Maria'			, 4546	, 'Brás'				, 'São Paulo', 'SP', '03045-012'),
					 ('Felipe Samuel Bernardes'			, '817.030.328-10', '(11)9 9385-6208', '2003-04-15', 'felipe_bernardes@bessa.net.br'				, 'Solteiro(a)'		, 'Masculino'	, 'Rua Jaime Bruno Roschel'		, 57	, 'Jardim Casa Grande'	, 'São Paulo', 'SP', '04865-015'),
					 ('Sebastião Emanuel Souza'			, '886.194.918-57', '(11)9 9996-4362', '1999-07-04', 'sebastiaoemanuelsouza@vanguarda.tv'			, 'Solteiro(a)'		, 'Masculino'	, 'Rua Santa Rita Maria Rosa'	, 3		, 'Jardim Guanhembu'	, 'São Paulo', 'SP', '04814-045'),
					 ('Francisca Jéssica da Rocha'		, '124.316.038-14', '(11)9 9844-3518', '1996-09-09', 'francisca_darocha@termakui.com.br'			, 'Casado(a)'		, 'Feminino'	, 'Rua Henrique Mazzauti'		, 844	, 'Jardim Tietê'		, 'São Paulo', 'SP', '03944-170'),
					 ('Aparecida Alana Agatha Novaes'	, '161.256.528-07', '(11)9 8773-3934', '2000-03-16', 'aparecida_novaes@saa.com.br'					, 'Viuvo(a)'		, 'Feminino'	, 'Rua Mario Leme da Silva'		, 52	, 'Alto da Mooca'		, 'São Paulo', 'SP', '03182-030'),
					 ('Patrícia Carolina Ramos'			, '356.566.338-37', '(11)9 8891-2229', '1989-02-27', 'patricia.carolina.ramos@gustavoscoelho.com.br', 'Solteiro(a)'		, 'Feminino'	, 'Rua Guanás'					, 34	, 'Vila Sônia'			, 'São Paulo', 'SP', '05627-001'),
					 ('Luís Tiago Silveira'				, '791.342.948-80', '(11)9 8122-0268', '1987-10-01', 'luistiagosilveira@lojapetline.com.br'			, 'Divorciado(a)'	, 'Masculino'	, 'Rua Maria Vaz de Carvalho'	, 1267	, 'Jardim Itacolomi'	, 'São Paulo', 'SP', '04386-060'),
					 ('Isabela Bruna Elisa Lopes'		, '519.292.258-57', '(11)9 8838-4264', '1998-03-11', 'isabela-lopes80@paae.com.br'					, 'Solteiro(a)'		, 'Feminino'	, 'Rua Conselheiro Benevides'	, 593	, 'Mooca'				, 'São Paulo', 'SP', '03110-050');
                     

-- -----------------------------------------------------
-- Dados lojafacic.vendedores
-- ----------------------------------------------------- 
INSERT INTO vendedores (nomeVendedor, cpfVendedor, telVendedor, dtNascimentoVendedor, emailVendedor, cargoVendedor, estadoCivilVendedor, sexoVendedor, logradouroVendedor, numeroVendedor, bairroVendedor, cidadeVendedor, ufVendedor, cepVendedor)
				VALUES ('Caio Pereira dos Santos'	,'986.777.666-31', '(11)9 9977-6662', '1996-04-03', 'caio.psantos8@senacsp.edu.br'	, 'Gerente'		, 'Solteiro(a)', 'Masculino', 'Rua Misarela de Algualva'	, 8		, 'Morumbi'				, 'São Paulo', 'SP', '04476-090'),
					   ('Igor Felipe da Silva'		,'996.377.066-33', '(11)9 4589-1649', '1998-09-25', 'igor.fsilva13@senacsp.edu.br'	, 'Gerente'		, 'Solteiro(a)', 'Masculino', 'Rua Tamanduá'				, 104	, 'Jardins'				, 'São Paulo', 'SP', '04462-000'),
					   ('Caique Costa Alves'		,'963.258.741-11', '(11)9 3794-5752', '2000-09-16', 'caique.caalves@senacsp.edu.br'	, 'Caixa'		, 'Solteiro(a)', 'Masculino', 'Rua Saci'					, 576	, 'Jardim Brasil'		, 'São Paulo', 'SP', '01511-080'),
					   ('André Félix Pereira'		,'789.456.123-37', '(11)9 9441-2764', '2001/06/17', 'andre.fpereira@senacsp.edu.br'	, 'Vendedor'	, 'Solteiro(a)', 'Masculino', 'Avenida miguel Yunes'		, 2544	, 'Jardim Campo grande'	, 'São Paulo', 'SP', '01313-100'),
					   ('Felipe Mendes Luz'			,'957.486.176-39', '(11)9 9191-1919', '2002-05-10', 'felipe.mluz@senacsp.edu.br'	, 'Vendedor'	, 'Solteiro(a)', 'Masculino', 'Rua Padre Pedro Gay'			, 24	, 'Flores'				, 'São Paulo', 'SP', '02354-024'); 


-- -----------------------------------------------------
-- Dados lojafacic.produtos
-- -----------------------------------------------------  
INSERT INTO produtos (nomeProduto, precoCusto,precoVenda,qtdeEstoque,categoriaProd) 
			   VALUES('Areia fina m2'					,200.00		,230.00	,154	,'Alvenaria'),
					 ('Saco Cimento CP-2 50kg'			,26.00		,32.00	,87		,'Alvenaria'),
					 ('Saco Areia'						,1.30		,2.60	,476	,'Alvenaria'),
					 ('Trena 5m'						,16.99		,20.99	,36		,'Ferramenta'),
					 ('Chave de Fenda'					,13.90		,18.90	,67		,'Ferramenta'),
					 ('Chave de Boca n13'				,14.90		,20.90	,14		,'Ferramenta'),
					 ('Glifo'							,30.00		,49.00	,7		,'Ferramenta'),
					 ('Massa Corrida LT 18Kg'			,98.00		,128.00	,16		,'Alvenaria'),
					 ('Tinta Branca Acetinada LT 18Kg'	,139.00		,189.00	,6		,'Alvenaria'),
					 ('Tinta Azul Epoxi GL 3,6L'		,102.00		,119.00	,23		,'Alvenaria'),
					 ('Massa Acrilica 900ml'			,16.00		,26.00	,43		,'Alvenaria'),
					 ('Tubo PVC 2Pol m2'				,13.00		,18.00	,60		,'Hidraulica'),
					 ('Curva 1/2 Pol '					,1.89		,3.49	,36		,'Hidraulica'),
					 ('Fio Rígido m2'					,19.99		,28.99	,430	,'Elétrica'),
					 ('Fio Flexivel m2'					,26.00		,49.99	,640	,'Elétrica'),
					 ('Torneira EcoLus 2x23x5'			,16.49		,36.89	,13		,'Alvenaria'),
					 ('Lavabo c/Caixa Aclopada 6L'		,329.00		,469.00	,9		,'Alvenaria'),
					 ('Tomada 3Pontos c/Espelho'		,3.29		,7.00	,25		,'Elétrica'),
					 ('Extenção 5m'						,6.99		,10.99	,12		,'Elétrica'),
					 ('Extensão 10m'					,8.99		,18.99	,8		,'Elétrica'),
					 ('Coluna 4 Ferros 10mm m2'			,16.99		,26.99	,46		,'Alvenaria'),
					 ('Coluna 6 Ferros 10mm m2'			,23.00		,36.00	,51		,'Alvenaria'),
					 ('Areia média m2 '					,135.00		,195.00	,239	,'Alvenaria'),
					 ('Cimento CP-II '					,26.90		,36.90	,42		,'Alvenaria'),
					 ('Pedra reciclada m2'				,129.00		,169.00	,640	,'Alvenaria'),
					 ('Pedra/Areia embalados '			,3.00		,7.00	,500	,'Alvenaria'),
					 ('Viga 4 Ferros 10mm m2'			,27.90		,32.90	,203	,'Alvenaria'),
					 ('Viga 6 Ferros 10mm m2'			,30.90		,36.90	,420	,'Alvenaria');       
   
   
-- Fim Script-------------------------------------------------------------------------------------------