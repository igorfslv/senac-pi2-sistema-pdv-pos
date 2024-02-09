
package com.senac.lojafacic.DAO;

import com.senac.lojafacic.Classes.Clientes;
import com.senac.lojafacic.Classes.ItemPedido;
import com.senac.lojafacic.Classes.Pedidos;
import com.senac.lojafacic.Classes.Produto;
import com.senac.lojafacic.Classes.Vendedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio
 */
public class SalvarDAO {

    static String url = "jdbc:mysql://localhost:3306/lojafacic";
    static String login = "root";
    static String senha = "senha";
    //static String senha = "iguinhoTopz@1";

    public static boolean salvarPedido(Pedidos novoPedido) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO pedidos (idVendedor,idCliente,dataPedido,pagamentoPedido,parcelamento,valorTotal) VALUES (?,?,?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            comandoSQL.setInt(1, novoPedido.getIdVendedor());
            comandoSQL.setInt(2, novoPedido.getIdCliente());
            comandoSQL.setDate(3, new java.sql.Date(novoPedido.getDtPedido().getTime()));
            comandoSQL.setString(4, novoPedido.getPgtoPedido());
            comandoSQL.setString(5, novoPedido.getParcPedido());
            comandoSQL.setDouble(6, Double.parseDouble(novoPedido.getValorTotalPedido().toString()));

            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs.next()) {
                    int idPedido = rs.getInt(1);
                    for (ItemPedido item : novoPedido.getListaItens()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO itemPedido (idPedido,idProduto,qtdeItem,precoVenda,valorTotalItem) VALUES (?,?,?,?,?)");
                        comandoSQLItem.setInt(1, idPedido);
                        comandoSQLItem.setInt(2, item.getIdProduto());
                        comandoSQLItem.setInt(3, item.getQtdeItem());
                        comandoSQLItem.setDouble(4, item.getPrecoVendaProduto());
                        comandoSQLItem.setDouble(5, item.getValorItemPedido());

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if (linhasAfetadasItem > 0) {
                            retorno = true;
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return retorno;

    }

    public static boolean salvarCliente(Clientes novoCliente) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("SELECT cpfCliente FROM clientes WHERE cpfCliente = ?");
            
            comandoSQL.setString(1, novoCliente.getCpfCliente());
            
            rs = comandoSQL.executeQuery();
            if (rs == null ){
                retorno = false;
                 
            }else{
                comandoSQL = conexao.prepareStatement("INSERT INTO clientes (nomeCliente,cpfCliente,telCliente,dtNascimentoCliente,emailCliente,estadoCivil,sexoCliente,logradouroCliente,numeroCliente,bairroCliente,cidadeCliente,ufCliente,cepCliente) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)",
                        PreparedStatement.RETURN_GENERATED_KEYS);

                comandoSQL.setString(1, novoCliente.getNomeCliente());
                comandoSQL.setString(2, novoCliente.getCpfCliente());
                comandoSQL.setString(3, novoCliente.getTelefoneCliente());
                comandoSQL.setDate(4, new java.sql.Date(novoCliente.getDtNascimentoCliente().getTime()));
                comandoSQL.setString(5, novoCliente.getEmailCliente());
                comandoSQL.setString(6, novoCliente.getEstadoCivilCliente());
                comandoSQL.setString(7, novoCliente.getSexoCliente());
                comandoSQL.setString(8, novoCliente.getLogradouroCliente());
                comandoSQL.setString(9, novoCliente.getNumeroCliente());
                comandoSQL.setString(10, novoCliente.getBairroCliente());
                comandoSQL.setString(11, novoCliente.getCidadeCliente());
                comandoSQL.setString(12, novoCliente.getUfCliente());
                comandoSQL.setString(13, novoCliente.getCepCliente());
                //Finalmente... vamos executar o comando!

                int linhasAfetadas = comandoSQL.executeUpdate();
                if (linhasAfetadas > 0) {
                    retorno = true;

                    rs = comandoSQL.getGeneratedKeys();

                    if (rs != null) {
                        while (rs.next()) {
                            int idGerado = rs.getInt(1);
                        }
                    }
                }
                
            }
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
            
        return retorno;
    }

    public static boolean salvarVendedor(Vendedores novoVendedor) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("SELECT cpfVendedor FROM vendedores WHERE cpfVendedor = ?");
            
            comandoSQL.setString(1, novoVendedor.getCpfVendedor());
            
            rs = comandoSQL.executeQuery();
            if (rs == null){
                retorno = false;
               
            }else{
                comandoSQL = conexao.prepareStatement("INSERT INTO vendedores (nomeVendedor,cpfVendedor,telVendedor,dtNascimentoVendedor,emailVendedor,cargoVendedor,estadoCivilVendedor,sexoVendedor,logradouroVendedor,numeroVendedor,bairroVendedor,cidadeVendedor,ufVendedor,cepVendedor) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                        PreparedStatement.RETURN_GENERATED_KEYS);

                comandoSQL.setString(1, novoVendedor.getNomeVendedor());
                comandoSQL.setString(2, novoVendedor.getCpfVendedor());
                comandoSQL.setString(3, novoVendedor.getTelefoneVendedor());
                comandoSQL.setDate(4, new java.sql.Date(novoVendedor.getDtNascimentoVendedor().getTime()));
                comandoSQL.setString(5, novoVendedor.getEmailVendedor());
                comandoSQL.setString(6, novoVendedor.getCargoVendedor());
                comandoSQL.setString(7, novoVendedor.getEstadoCivilVendedor());
                comandoSQL.setString(8, novoVendedor.getSexoVendedor());
                comandoSQL.setString(9, novoVendedor.getLogradouroVendedor());
                comandoSQL.setString(10, novoVendedor.getNumeroVendedor());
                comandoSQL.setString(11, novoVendedor.getBairroVendedor());
                comandoSQL.setString(12, novoVendedor.getCidadeVendedor());
                comandoSQL.setString(13, novoVendedor.getUfVendedor());
                comandoSQL.setString(14, novoVendedor.getCepVendedor());
                //Finalmente... vamos executar o comando!

                int linhasAfetadas = comandoSQL.executeUpdate();
                if (linhasAfetadas > 0) {
                    retorno = true;

                    rs = comandoSQL.getGeneratedKeys();

                    if (rs != null) {
                        while (rs.next()) {
                            int idGerado = rs.getInt(1);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }

    public static boolean salvarProduto(Produto novoProduto) {

        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexão com o banco
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL a ser executado
            comandoSQL = conexao.prepareStatement("INSERT INTO produtos (nomeProduto,precoCusto,precoVenda,qtdeEstoque,categoriaProd) VALUES(?,?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, novoProduto.getNome_produto());
            comandoSQL.setDouble(2, Double.parseDouble(novoProduto.getPrecoCustoProduto()));
            comandoSQL.setDouble(3, Double.parseDouble(novoProduto.getPrecoVendaProduto()));
            comandoSQL.setInt(4, novoProduto.getQuantidade_estoque());
            comandoSQL.setString(5, novoProduto.getCategoriaProduto());

            //Finalmente... vamos executar o comando!
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                rs = comandoSQL.getGeneratedKeys();

                if (rs != null) {
                    while (rs.next()) {
                        int idGerado = rs.getInt(1);
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return retorno;
    }

}
