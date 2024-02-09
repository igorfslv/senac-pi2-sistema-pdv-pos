
package com.senac.lojafacic.Classes;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Produto {
    private int idProduto;
    private String nomeProduto;
    private String precoVendaProduto;
    private String precoCustoProduto;
    private int quantidadeEstoque;
    private String categoriaProduto;
    
    public Produto() {
    }

    public Produto(String nome_produto, String precoVendaProduto, String precoCustoProduto, int quantidade_estoque, String categoriaProduto) {
        this.nomeProduto = nome_produto;
        this.precoVendaProduto = precoVendaProduto;
        this.precoCustoProduto = precoCustoProduto;
        this.quantidadeEstoque = quantidade_estoque;
        this.categoriaProduto = categoriaProduto;
    }
    
    public Produto(JTextField txtNomeProduto, JFormattedTextField txtPrecoCustoProduto, JFormattedTextField txtPrecoVendaProduto, JFormattedTextField txtQtdeEstoque,JComboBox jcbCategoriaProduto){
        this.nomeProduto = txtNomeProduto.getText();
        this.precoVendaProduto = txtPrecoCustoProduto.getText().replace(".","").replace(",", ".");
        this.precoCustoProduto = txtPrecoVendaProduto.getText().replace(".","").replace(",", ".");
        this.quantidadeEstoque = Integer.parseInt(txtQtdeEstoque.getText());
        this.categoriaProduto = jcbCategoriaProduto.getSelectedItem().toString();
    }
    
    public Produto(JTextField txtCodigoProduto, JTextField txtNomeProduto, JFormattedTextField txtPrecoCustoProduto, JFormattedTextField txtPrecoVendaProduto, JFormattedTextField txtQtdeEstoque,JComboBox jcbCategoriaProduto){
        this.idProduto = Integer.parseInt(txtCodigoProduto.getText());
        this.nomeProduto = txtNomeProduto.getText();
        this.precoVendaProduto = txtPrecoVendaProduto.getText().replace(".","").replace(",", ".");
        this.precoCustoProduto = txtPrecoCustoProduto.getText().replace(".","").replace(",", ".");
        this.quantidadeEstoque = Integer.parseInt(txtQtdeEstoque.getText());txtQtdeEstoque.getText();
        this.categoriaProduto = jcbCategoriaProduto.getSelectedItem().toString();
    }

    public int getId_produto() {
        return idProduto;
    }

    public void setId_produto(int id_produto) {
        this.idProduto = id_produto;
    }

    public String getNome_produto() {
        return nomeProduto;
    }

    public void setNome_produto(String nome_produto) {
        this.nomeProduto = nome_produto;
    }

    public String getPrecoVendaProduto() {
        return precoVendaProduto;
    }

    public void setPrecoVendaProduto(String preco_produto) {
        this.precoVendaProduto = preco_produto;
    }

    public String getPrecoCustoProduto() {
        return precoCustoProduto;
    }

    public void setPrecoCustoProduto(String precoCustoProduto) {
        this.precoCustoProduto = precoCustoProduto;
    }

    public int getQuantidade_estoque() {
        return quantidadeEstoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidadeEstoque = quantidade_estoque;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
    
    
}
