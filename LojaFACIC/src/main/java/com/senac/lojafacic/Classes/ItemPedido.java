
package com.senac.lojafacic.Classes;


public class ItemPedido {
 
  private int idItemPedido;
  private int idPedido;  
  private int idProduto;
  private int qtdeItem;
  private Double precoVendaProduto;
  private Double valorItemPedido;  

  
    public ItemPedido() {
    }

    public ItemPedido(int idPedido, int idProduto, int qtdeItem, Double precoVendaProduto, Double valorItemPedido) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.qtdeItem = qtdeItem;
        this.precoVendaProduto = precoVendaProduto;
        this.valorItemPedido = valorItemPedido;
    }

    public int getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(int idItemPedido) {
        this.idItemPedido = idItemPedido;
    }
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public int getQtdeItem() {
        return qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public Double getValorItemPedido() {
        return valorItemPedido;
    }

    public void setValorItemPedido(Double valorItemPedido) {
        this.valorItemPedido = valorItemPedido;
    }

    public Double getPrecoVendaProduto() {
        return precoVendaProduto;
    }

    public void setPrecoVendaProduto(Double precoVendaProduto) {
        this.precoVendaProduto = precoVendaProduto;
    }
    
    
    
    
}
