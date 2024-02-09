package com.senac.lojafacic.DAO;

import com.senac.lojafacic.Classes.Clientes;
import com.senac.lojafacic.Classes.ItemPedido;
import com.senac.lojafacic.Classes.Produto;
import com.senac.lojafacic.Classes.Relatorios;
import com.senac.lojafacic.Classes.Vendedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adm
 */
public class BuscarDAO {

    static String url = "jdbc:mysql://localhost:3306/lojafacic";
    static String login = "root";
    static String senha = "senha";
    //static String senha = "iguinhoTopz@1";
    
    //Buscas
    public static ArrayList<Relatorios> listarPedidos() {

        ArrayList<Relatorios> dadosPedido = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT pedidos.* , vendedores.idVendedor, vendedores.nomeVendedor, vendedores.cargoVendedor , clientes.* FROM pedidos INNER JOIN vendedores ON pedidos.idVendedor = vendedores.idVendedor INNER JOIN clientes ON pedidos.idCliente = clientes.idCliente;");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Relatorios itemPedido = new Relatorios();

                    itemPedido.setIdPedido(rs.getInt("idPedido"));
                    itemPedido.setDtPedido(rs.getDate("dataPedido"));
                    itemPedido.setNomeVendedor(rs.getString("nomeVendedor"));
                    itemPedido.setCargoVendedor(rs.getString("cargoVendedor"));
                    itemPedido.setNomeCliente(rs.getString("nomeCliente"));
                    itemPedido.setCpfCliente(rs.getString("cpfCliente"));
                    itemPedido.setTelCliente(rs.getString("telCliente"));
                    itemPedido.setEmailCliente(rs.getString("emailCliente"));
                    itemPedido.setFormaPagamento(rs.getString("pagamentoPedido"));
                    itemPedido.setParcelamento(rs.getString("parcelamento"));
                    itemPedido.setValorTotalPedido(rs.getDouble("valorTotal"));

                    dadosPedido.add(itemPedido);
                    
                    
                   
                
                }
                
                
                
                
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dadosPedido;
    }

    public static ArrayList<Clientes> listarCliente()  {

        ArrayList<Clientes> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM clientes");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Clientes item = new Clientes();
                    item.setIdCliente(rs.getInt("idCliente"));
                    item.setNomeCliente(rs.getString("nomeCliente"));
                    item.setCpfCliente(rs.getString("cpfCliente"));
                    item.setTelefoneCliente(rs.getString("telCliente"));
                    item.setDtNascimentoCliente(rs.getDate("dtNascimentoCliente"));
                    item.setEmailCliente(rs.getString("emailCliente"));
                    item.setEstadoCivilCliente(rs.getString("estadoCivil"));
                    item.setSexoCliente(rs.getString("sexoCliente"));
                    item.setLogradouroCliente(rs.getString("logradouroCliente"));
                    item.setNumeroCliente(rs.getString("numeroCliente"));
                    item.setBairroCliente(rs.getString("bairroCliente"));
                    item.setCidadeCliente(rs.getString("cidadeCliente"));
                    item.setUfCliente(rs.getString("ufCliente"));
                    item.setCepCliente(rs.getString("cepCliente"));

                    lista.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }

    public static ArrayList<Vendedores> listarVendedor() {

        ArrayList<Vendedores> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM vendedores");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Vendedores item = new Vendedores();
                    item.setIdVendedor(rs.getInt("idVendedor"));
                    item.setNomeVendedor(rs.getString("nomeVendedor"));
                    item.setCpfVendedor(rs.getString("cpfVendedor"));
                    item.setTelefoneVendedor(rs.getString("telVendedor"));
                    item.setDtNascimentoVendedor(rs.getDate("dtNascimentoVendedor"));
                    item.setEmailVendedor(rs.getString("emailVendedor"));
                    item.setCargoVendedor(rs.getString("cargoVendedor"));
                    item.setEstadoCivilVendedor(rs.getString("estadoCivilVendedor"));
                    item.setSexoVendedor(rs.getString("sexoVendedor"));
                    item.setLogradouroVendedor(rs.getString("logradouroVendedor"));
                    item.setNumeroVendedor(rs.getString("numeroVendedor"));
                    item.setBairroVendedor(rs.getString("bairroVendedor"));
                    item.setCidadeVendedor(rs.getString("cidadeVendedor"));
                    item.setUfVendedor(rs.getString("ufVendedor"));
                    item.setCepVendedor(rs.getString("cepVendedor"));

                    lista.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }

    public static ArrayList<Produto> listarProduto() {

        ArrayList<Produto> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM produtos");

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setId_produto(rs.getInt("idProduto"));
                    item.setNome_produto(rs.getString("nomeProduto"));
                    item.setPrecoCustoProduto(rs.getString("precoCusto".replace(".","-").replace(",", ".").replace("-",",")));
                    item.setPrecoVendaProduto(rs.getString("precoVenda".replace(".","-").replace(",", ".").replace("-",",")));
                    item.setQuantidade_estoque(rs.getInt("qtdeEstoque"));
                    item.setCategoriaProduto(rs.getString("categoriaProd"));

                    lista.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }

    
    //Buscas por Filtro
    public static ArrayList<Relatorios> buscarPeriodoPedidos(Date dataInicio, Date dataFim) {

        ArrayList<Relatorios> dadosPedido = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT pedidos.* , vendedores.idVendedor, vendedores.nomeVendedor, vendedores.cargoVendedor , clientes.* FROM pedidos INNER JOIN vendedores ON pedidos.idVendedor = vendedores.idVendedor INNER JOIN clientes ON pedidos.idCliente = clientes.idCliente WHERE dataPedido >= ? AND dataPedido <= ? ;");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            comandoSQL.setString(1, (sdf.format(dataInicio.getTime())));
            comandoSQL.setString(2, (sdf.format(dataFim.getTime())));
            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Relatorios itemPedido = new Relatorios();

                    itemPedido.setIdPedido(rs.getInt("idPedido"));
                    itemPedido.setDtPedido(rs.getDate("dataPedido"));
                    itemPedido.setNomeVendedor(rs.getString("nomeVendedor"));
                    itemPedido.setCargoVendedor(rs.getString("cargoVendedor"));
                    itemPedido.setNomeCliente(rs.getString("nomeCliente"));
                    itemPedido.setCpfCliente(rs.getString("cpfCliente"));
                    itemPedido.setTelCliente(rs.getString("telCliente"));
                    itemPedido.setEmailCliente(rs.getString("emailCliente"));
                    itemPedido.setFormaPagamento(rs.getString("pagamentoPedido"));
                    itemPedido.setParcelamento(rs.getString("parcelamento"));
                    itemPedido.setValorTotalPedido(rs.getDouble("valorTotal"));
                    
                    dadosPedido.add(itemPedido);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dadosPedido;
    }
    
    public static ArrayList<Relatorios> detalharPedidos(int idPedido) {

        ArrayList<Relatorios> dadosPedido = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT pedidos.* , vendedores.idVendedor, vendedores.nomeVendedor, vendedores.cargoVendedor , clientes.* , itemPedido.* , produtos.nomeProduto FROM pedidos  INNER JOIN vendedores ON pedidos.idVendedor = vendedores.idVendedor  INNER JOIN clientes ON pedidos.idCliente = clientes.idCliente  INNER JOIN itemPedido ON pedidos.idPedido = itemPedido.idPedido INNER JOIN produtos ON itemPedido.idProduto = produtos.idProduto WHERE pedidos.idPedido = ?;");
            
            comandoSQL.setInt(1, idPedido);
            
            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Relatorios itemPedido = new Relatorios();

                    itemPedido.setIdPedido(rs.getInt("idPedido"));
                    itemPedido.setDtPedido(rs.getDate("dataPedido"));
                    itemPedido.setNomeVendedor(rs.getString("nomeVendedor"));
                    itemPedido.setCargoVendedor(rs.getString("cargoVendedor"));
                    itemPedido.setValorTotalPedido(rs.getDouble("valorTotal"));
                    itemPedido.setIdVendedor(rs.getInt("idVendedor"));
                    itemPedido.setIdCliente(rs.getInt("idCliente"));
                    itemPedido.setNomeCliente(rs.getString("nomeCliente"));
                    itemPedido.setCpfCliente(rs.getString("cpfCliente"));
                    itemPedido.setTelCliente(rs.getString("telCliente"));
                    itemPedido.setEmailCliente(rs.getString("emailCliente"));
                    itemPedido.setLogCliente(rs.getString("logradouroCliente"));
                    itemPedido.setNumCliente(rs.getString("numeroCliente"));
                    itemPedido.setBairroCliente(rs.getString("bairroCliente"));
                    itemPedido.setCidCliente(rs.getString("cidadeCliente"));
                    itemPedido.setUfCliente(rs.getString("ufCliente"));
                    itemPedido.setCepCliente(rs.getString("cepCliente"));
                    itemPedido.setFormaPagamento(rs.getString("pagamentoPedido"));
                    itemPedido.setParcelamento(rs.getString("parcelamento"));
                    itemPedido.setIdProduto(rs.getInt("idProduto"));
                    itemPedido.setNomeProduto(rs.getString("nomeProduto"));
                    itemPedido.setValorItem(rs.getDouble("precoVenda"));
                    itemPedido.setQtdeItem(rs.getInt("qtdeItem"));
                    itemPedido.setValorTotalItem(rs.getDouble("valorTotalItem"));
                    
                    dadosPedido.add(itemPedido);
                }
                 
                    
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dadosPedido;
    }
    
    public static ArrayList<Clientes> buscarCpfCliente(String cpfBuscar) {

        ArrayList<Clientes> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE cpfCliente = ?");
            comandoSQL.setString(1, cpfBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Clientes item = new Clientes();
                    item.setIdCliente(rs.getInt("idCliente"));
                    item.setNomeCliente(rs.getString("nomeCliente"));
                    item.setCpfCliente(rs.getString("cpfCliente"));
                    item.setTelefoneCliente(rs.getString("telCliente"));
                    item.setDtNascimentoCliente((Date)rs.getDate("dtNascimentoCliente"));
                    item.setEmailCliente(rs.getString("emailCliente"));
                    item.setEstadoCivilCliente(rs.getString("estadoCivil"));
                    item.setSexoCliente(rs.getString("sexoCliente"));
                    item.setLogradouroCliente(rs.getString("logradouroCliente"));
                    item.setNumeroCliente(rs.getString("numeroCliente"));
                    item.setBairroCliente(rs.getString("bairroCliente"));
                    item.setCidadeCliente(rs.getString("cidadeCliente"));
                    item.setUfCliente(rs.getString("ufCliente"));
                    item.setCepCliente(rs.getString("cepCliente"));

                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }

    public static ArrayList<Clientes> buscarIdCliente(int numeroBuscar){

        ArrayList<Clientes> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM clientes WHERE idCliente = ?");
            comandoSQL.setInt(1, numeroBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {
                //Percorrer as linhas do result set
                while (rs.next()) {
                    Clientes item = new Clientes();
                    item.setIdCliente(rs.getInt("idCliente"));
                    item.setNomeCliente(rs.getString("nomeCliente"));
                    item.setCpfCliente(rs.getString("cpfCliente"));
                    item.setTelefoneCliente(rs.getString("telCliente"));
                    item.setDtNascimentoCliente((Date)rs.getDate("dtNascimentoCliente"));
                    item.setEmailCliente(rs.getString("emailCliente"));
                    item.setEstadoCivilCliente(rs.getString("estadoCivil"));
                    item.setSexoCliente(rs.getString("sexoCliente"));
                    item.setLogradouroCliente(rs.getString("logradouroCliente"));
                    item.setNumeroCliente(rs.getString("numeroCliente"));
                    item.setBairroCliente(rs.getString("bairroCliente"));
                    item.setCidadeCliente(rs.getString("cidadeCliente"));
                    item.setUfCliente(rs.getString("ufCliente"));
                    item.setCepCliente(rs.getString("cepCliente"));

                    lista.add(item);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return lista;
    }

    public static ArrayList<Vendedores> buscarCpfVendedor(String cpfBuscar) {

        ArrayList<Vendedores> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM vendedores WHERE cpfVendedor = ?");
            comandoSQL.setString(1, cpfBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {
                    Vendedores item = new Vendedores();
                    item.setIdVendedor(rs.getInt("idVendedor"));
                    item.setNomeVendedor(rs.getString("nomeVendedor"));
                    item.setCpfVendedor(rs.getString("cpfVendedor"));
                    item.setTelefoneVendedor(rs.getString("telVendedor"));
                    item.setDtNascimentoVendedor(rs.getDate("dtNascimentoVendedor"));
                    item.setEmailVendedor(rs.getString("emailVendedor"));
                    item.setCargoVendedor(rs.getString("cargoVendedor"));
                    item.setEstadoCivilVendedor(rs.getString("estadoCivilVendedor"));
                    item.setSexoVendedor(rs.getString("sexoVendedor"));
                    item.setLogradouroVendedor(rs.getString("logradouroVendedor"));
                    item.setNumeroVendedor(rs.getString("numeroVendedor"));
                    item.setBairroVendedor(rs.getString("bairroVendedor"));
                    item.setCidadeVendedor(rs.getString("cidadeVendedor"));
                    item.setUfVendedor(rs.getString("ufVendedor"));
                    item.setCepVendedor(rs.getString("cepVendedor"));

                    lista.add(item);
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }

    public static ArrayList<Vendedores> buscarIdVendedor(int numeroBuscar) {

        ArrayList<Vendedores> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM vendedores WHERE idVendedor = ?");
            comandoSQL.setInt(1, numeroBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {
                    Vendedores item = new Vendedores();
                    item.setIdVendedor(rs.getInt("idVendedor"));
                    item.setNomeVendedor(rs.getString("nomeVendedor"));
                    item.setCpfVendedor(rs.getString("cpfVendedor"));
                    item.setTelefoneVendedor(rs.getString("telVendedor"));
                    item.setDtNascimentoVendedor(rs.getDate("dtNascimentoVendedor"));
                    item.setEmailVendedor(rs.getString("emailVendedor"));
                    item.setCargoVendedor(rs.getString("cargoVendedor"));
                    item.setEstadoCivilVendedor(rs.getString("estadoCivilVendedor"));
                    item.setSexoVendedor(rs.getString("sexoVendedor"));
                    item.setLogradouroVendedor(rs.getString("logradouroVendedor"));
                    item.setNumeroVendedor(rs.getString("numeroVendedor"));
                    item.setBairroVendedor(rs.getString("bairroVendedor"));
                    item.setCidadeVendedor(rs.getString("cidadeVendedor"));
                    item.setUfVendedor(rs.getString("ufVendedor"));
                    item.setCepVendedor(rs.getString("cepVendedor"));

                    lista.add(item);

                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;
    }

    public static ArrayList<Produto> buscarIdProduto(int numeroBuscar) {

        ArrayList<Produto> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE idProduto = ?");
            comandoSQL.setInt(1, numeroBuscar);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setId_produto(rs.getInt("idProduto"));
                    item.setNome_produto(rs.getString("nomeProduto"));
                    item.setPrecoCustoProduto(rs.getString("precoCusto"));
                    item.setPrecoVendaProduto(rs.getString("precoVenda"));
                    item.setQuantidade_estoque(rs.getInt("qtdeEstoque"));
                    item.setCategoriaProduto(rs.getString("categoriaProd"));

                    lista.add(item);

                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;
    }
    
    public static ArrayList<Produto> buscarNomeProduto(String nome) {

        ArrayList<Produto> lista = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;

        try {
            //Passo 1 - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Passo 2 - Abrir a conexao com o mysql
            conexao = DriverManager.getConnection(url, login, senha);

            //Passo 3 - Preparar o comando SQL
            comandoSQL = conexao.prepareStatement("SELECT * FROM produtos WHERE nomeProduto = ?");
            comandoSQL.setString(1, nome);

            //Passo 4 - Executar o comando SQL
            rs = comandoSQL.executeQuery();

            if (rs != null) {

                //Percorrer as linhas do result set
                while (rs.next()) {
                    Produto item = new Produto();
                    item.setId_produto(rs.getInt("idProduto"));
                    item.setNome_produto(rs.getString("nomeProduto"));
                    item.setPrecoCustoProduto(rs.getString("precoCusto"));
                    item.setPrecoVendaProduto(rs.getString("precoVenda"));
                    item.setQuantidade_estoque(rs.getInt("qtdeEstoque"));
                    item.setCategoriaProduto(rs.getString("categoriaProd"));

                    lista.add(item);

                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SalvarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return lista;
    }
    
}
