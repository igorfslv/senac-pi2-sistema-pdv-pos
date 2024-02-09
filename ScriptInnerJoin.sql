use lojafacic;

SELECT pedidos.idPedido, pedidos.dataPedido, pedidos.valorTotal, vendedores.nomeVendedor, clientes.nomeCliente, clientes.telCliente, clientes.emailCliente 

	FROM pedidos INNER JOIN vendedores
     ON pedidos.idVendedor = vendedores.idVendedor
				INNER JOIN clientes
	 ON pedidos.idCliente = clientes.idCliente;

SELECT pedidos.idPedido, pedidos.dataPedido, pedidos.valorTotal, vendedores.nomeVendedor, clientes.nomeCliente, clientes.telCliente, clientes.emailCliente 
	FROM pedidos INNER JOIN vendedores 
	 ON pedidos.idVendedor = vendedores.idVendedor
				INNER JOIN clientes 
	 ON pedidos.idCliente = clientes.idCliente 
     WHERE dataPedido >= "1998-09-25" AND dataPedido <="2024-09-25" ;
				     
				