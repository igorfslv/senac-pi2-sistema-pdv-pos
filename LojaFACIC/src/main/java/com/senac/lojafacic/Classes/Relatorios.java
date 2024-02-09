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
public class Relatorios {
    //Pedido
    private int idPedido;
    private Date dtPedido;
    private String formaPagamento;
    private String parcelamento;
    private Double valorTotalPedido;
    //Vendedor
    private int idVendedor;
    private String nomeVendedor;
    private String cargoVendedor;
    //Cliente
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private String telCliente;
    private String emailCliente;
    private String logCliente;
    private String numCliente;
    private String bairroCliente;
    private String cidCliente;
    private String ufCliente;
    private String cepCliente;
    //Produto
    private int idProduto;
    private String nomeProduto;
    private Double valorItem;
    //ItemPedido
    private int qtdeItem;
    private Double valorTotalItem;
    
    public Relatorios() {
    }

    public Relatorios(int idPedido, Date dtPedido, String formaPagamento, String parcelamento, Double valorTotalPedido, int idVendedor, String nomeVendedor, String cargoVendedor, int idCliente, String nomeCliente, String cpfCliente, String telCliente, String emailCliente, String logCliente, String numCliente, String bairroCliente, String cidCliente, String ufCliente, String cepCliente, int idProduto, String nomeProduto, Double valorItem, int qtdeItem, Double valorTotalItem) {
        this.idPedido = idPedido;
        this.dtPedido = dtPedido;
        this.formaPagamento = formaPagamento;
        this.parcelamento = parcelamento;
        this.valorTotalPedido = valorTotalPedido;
        this.idVendedor = idVendedor;
        this.nomeVendedor = nomeVendedor;
        this.cargoVendedor = cargoVendedor;
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telCliente = telCliente;
        this.emailCliente = emailCliente;
        this.logCliente = logCliente;
        this.numCliente = numCliente;
        this.bairroCliente = bairroCliente;
        this.cidCliente = cidCliente;
        this.ufCliente = ufCliente;
        this.cepCliente = cepCliente;
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valorItem = valorItem;
        this.qtdeItem = qtdeItem;
        this.valorTotalItem = valorTotalItem;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorItem() {
        return valorItem;
    }

    public void setValorItem(Double valorItem) {
        this.valorItem = valorItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public void setQtdeItem(int qtdeItem) {
        this.qtdeItem = qtdeItem;
    }

    public Double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(Double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    
    public String getLogCliente() {
        return logCliente;
    }

    public void setLogCliente(String logCliente) {
        this.logCliente = logCliente;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidCliente() {
        return cidCliente;
    }

    public void setCidCliente(String cidCliente) {
        this.cidCliente = cidCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getCargoVendedor() {
        return cargoVendedor;
    }

    public void setCargoVendedor(String cargoVendedor) {
        this.cargoVendedor = cargoVendedor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(String parcelamento) {
        this.parcelamento = parcelamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(Double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }






}

