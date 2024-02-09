
package com.senac.lojafacic.DAO;

import com.senac.lojafacic.Classes.Clientes;
import com.senac.lojafacic.Classes.Produto;
import com.senac.lojafacic.Classes.Vendedores;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adm
 */
public class AlterarDAO {
    static String url = "jdbc:mysql://localhost:3306/lojafacic";
    static String login = "root";
    static String senha = "senha";
    //static String senha = "iguinhoTopz@1";
    
    
    public static boolean alterarCliente(Clientes clienteAlterar) {

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
            comandoSQL = conexao.prepareStatement("UPDATE clientes SET nomeCliente = ?,cpfCliente = ?,telCliente = ?,dtNascimentoCliente = ?,emailCliente = ?,estadoCivil = ?,sexoCliente = ?,logradouroCliente = ?,numeroCliente = ?,bairroCliente = ?,cidadeCliente = ?,ufCliente = ?,cepCliente = ? where idCliente = ?");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            comandoSQL.setString(1, clienteAlterar.getNomeCliente());
            comandoSQL.setString(2, clienteAlterar.getCpfCliente());
            comandoSQL.setString(3, clienteAlterar.getTelefoneCliente());
            comandoSQL.setDate(4,  new java.sql.Date(clienteAlterar.getDtNascimentoCliente().getTime()));
            comandoSQL.setString(5, clienteAlterar.getEmailCliente());
            comandoSQL.setString(6, clienteAlterar.getEstadoCivilCliente());
            comandoSQL.setString(7, clienteAlterar.getSexoCliente());
            comandoSQL.setString(8, clienteAlterar.getLogradouroCliente());
            comandoSQL.setString(9, clienteAlterar.getNumeroCliente());
            comandoSQL.setString(10, clienteAlterar.getBairroCliente());
            comandoSQL.setString(11, clienteAlterar.getCidadeCliente());
            comandoSQL.setString(12, clienteAlterar.getUfCliente());
            comandoSQL.setString(13, clienteAlterar.getCepCliente());
            comandoSQL.setInt(14, clienteAlterar.getIdCliente());

            //Finalmente... vamos executar o comando!
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

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

    public static boolean alterarVendedor(Vendedores vendedorAlterar) {

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
            comandoSQL = conexao.prepareStatement("UPDATE vendedores SET nomeVendedor = ?,cpfVendedor = ?,telVendedor = ?,dtNascimentoVendedor = ?,emailVendedor = ?,cargoVendedor = ?,estadoCivilVendedor = ?,sexoVendedor = ?,logradouroVendedor = ?,numeroVendedor = ?,bairroVendedor = ?,cidadeVendedor = ?,ufVendedor = ?,cepVendedor = ? where idVendedor = ?");

            comandoSQL.setString(1, vendedorAlterar.getNomeVendedor());
            comandoSQL.setString(2, vendedorAlterar.getCpfVendedor());
            comandoSQL.setString(3, vendedorAlterar.getTelefoneVendedor());
            comandoSQL.setDate(4, new java.sql.Date(vendedorAlterar.getDtNascimentoVendedor().getTime()));
            comandoSQL.setString(5, vendedorAlterar.getEmailVendedor());
            comandoSQL.setString(6, vendedorAlterar.getCargoVendedor());
            comandoSQL.setString(7, vendedorAlterar.getEstadoCivilVendedor());
            comandoSQL.setString(8, vendedorAlterar.getSexoVendedor());
            comandoSQL.setString(9, vendedorAlterar.getLogradouroVendedor());
            comandoSQL.setString(10, vendedorAlterar.getNumeroVendedor());
            comandoSQL.setString(11, vendedorAlterar.getBairroVendedor());
            comandoSQL.setString(12, vendedorAlterar.getCidadeVendedor());
            comandoSQL.setString(13, vendedorAlterar.getUfVendedor());
            comandoSQL.setString(14, vendedorAlterar.getCepVendedor());
            comandoSQL.setInt(15, vendedorAlterar.getIdVendedor());

            //Finalmente... vamos executar o comando!
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

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

    public static boolean alterarProduto(Produto produtoAlterar) {

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
            comandoSQL = conexao.prepareStatement("UPDATE produtos SET nomeProduto = ? , precoCusto = ? , precoVenda = ? , qtdeEstoque = ? , categoriaProd = ? where idProduto = ?");

            comandoSQL.setString(1, produtoAlterar.getNome_produto());
            comandoSQL.setDouble(2, Double.parseDouble(produtoAlterar.getPrecoCustoProduto()));
            comandoSQL.setDouble(3, Double.parseDouble(produtoAlterar.getPrecoVendaProduto()));
            comandoSQL.setInt(4, produtoAlterar.getQuantidade_estoque());
            comandoSQL.setString(5, produtoAlterar.getCategoriaProduto());
            comandoSQL.setInt(6, produtoAlterar.getId_produto());

            //Finalmente... vamos executar o comando!
            int linhasAfetadas = comandoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

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
