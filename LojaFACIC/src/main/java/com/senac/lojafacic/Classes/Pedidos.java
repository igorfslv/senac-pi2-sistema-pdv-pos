/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.lojafacic.Classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Pedidos {
 private int idPedido;
 private int idCliente;
 private int idVendedor;   
 private Date dtPedido;
 private String pgtoPedido;
 private String parcPedido;
 private Double valorTotalPedido;
 
    private ArrayList<ItemPedido> listaItens = null;

    public Pedidos() {
    }

    public Pedidos(int idCliente,int idVendedor, Date dtPedido, String pgtoPedido, String parcPedido, Double valorTotalPedido) {
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.dtPedido = dtPedido;
        this.pgtoPedido = pgtoPedido;
        this.parcPedido = parcPedido;
        this.valorTotalPedido = valorTotalPedido;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public int getIdVendedor() {
        return idVendedor;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public String getPgtoPedido() {
        return pgtoPedido;
    }

    public void setPgtoPedido(String pgtoPedido) {
        this.pgtoPedido = pgtoPedido;
    }

    public String getParcPedido() {
        return parcPedido;
    }

    public void setParcPedido(String parcPedido) {
        this.parcPedido = parcPedido;
    }

    public Double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(Double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
 
    public ArrayList<ItemPedido> getListaItens(){
       return listaItens; 
    }
    
    public void setListaItens(ArrayList<ItemPedido> listaItens){
        this.listaItens = listaItens;
    }
    
    
    
    
    
}
