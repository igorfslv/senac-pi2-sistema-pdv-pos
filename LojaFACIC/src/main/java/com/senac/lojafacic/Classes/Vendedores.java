/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.lojafacic.Classes;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Vendedores {
    private int IdVendedor;
    private String NomeVendedor;
    private String CpfVendedor;
    private String EmailVendedor;
    private String TelefoneVendedor;
    private Date DtNascimentoVendedor;
    private String CargoVendedor;
    private String EstadoCivilVendedor;
    private String SexoVendedor;
    private String LogradouroVendedor;
    private String NumeroVendedor;
    private String BairroVendedor;
    private String CidadeVendedor;
    private String UfVendedor;
    private String CepVendedor;

    public Vendedores() {
    }

    public Vendedores(String NomeVendedor, String CpfVendedor, String EmailVendedor, String TelefoneVendedor, Date DtNascimentoVendedor, String CargoVendedor, String EstadoCivilVendedor, String SexoVendedor, String LogradouroVendedor, String NumeroVendedor, String BairroVendedor, String CidadeVendedor, String UfVendedor, String CepVendedor) {
        this.NomeVendedor = NomeVendedor;
        this.CpfVendedor = CpfVendedor;
        this.EmailVendedor = EmailVendedor;
        this.TelefoneVendedor = TelefoneVendedor;
        this.DtNascimentoVendedor = DtNascimentoVendedor;
        this.CargoVendedor = CargoVendedor;
        this.EstadoCivilVendedor = EstadoCivilVendedor;
        this.SexoVendedor = SexoVendedor;
        this.LogradouroVendedor = LogradouroVendedor;
        this.NumeroVendedor = NumeroVendedor;
        this.BairroVendedor = BairroVendedor;
        this.CidadeVendedor = CidadeVendedor;
        this.UfVendedor = UfVendedor;
        this.CepVendedor = CepVendedor;
    }

    public Vendedores(JTextField txtNomeVendedor, JFormattedTextField txtCpfVendedor, JFormattedTextField txtTelefoneVendedor, JDateChooser txtDtNascimentoVendedor, JTextField txtEmailVendedor, JComboBox jcbEstadoCivilVendedor, JComboBox jcbSexoVendedor, JComboBox jcbCargoVendedor, JTextField txtLogradouroVendedor, JTextField txtNumeroVendedor, JTextField txtBairroVendedor, JTextField txtCidadeVendedor, JComboBox jcbUfVendedor, JFormattedTextField txtCepVendedor) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        this.NomeVendedor = txtNomeVendedor.getText();
        this.CpfVendedor = txtCpfVendedor.getText();
        this.TelefoneVendedor = txtTelefoneVendedor.getText();
        this.DtNascimentoVendedor = formato.parse(formato.format(txtDtNascimentoVendedor.getDate()));
        this.EmailVendedor =  txtEmailVendedor.getText();
        this.EstadoCivilVendedor = jcbEstadoCivilVendedor.getSelectedItem().toString();
        this.SexoVendedor = jcbSexoVendedor.getSelectedItem().toString();
        this.CargoVendedor = jcbCargoVendedor.getSelectedItem().toString();
        this.LogradouroVendedor = txtLogradouroVendedor.getText();
        this.NumeroVendedor = txtNumeroVendedor.getText();
        this.BairroVendedor = txtBairroVendedor.getText();
        this.CidadeVendedor = txtCidadeVendedor.getText();
        this.UfVendedor = jcbUfVendedor.getSelectedItem().toString();
        this.CepVendedor = txtCepVendedor.getText();
    }
    
    public Vendedores(JTextField txtIdVendedor, JTextField txtNomeVendedor, JFormattedTextField txtCpfVendedor, JFormattedTextField txtTelefoneVendedor, JDateChooser txtDtNascimentoVendedor, JTextField txtEmailVendedor, JComboBox jcbEstadoCivilVendedor, JComboBox jcbSexoVendedor, JComboBox jcbCargoVendedor, JTextField txtLogradouroVendedor, JTextField txtNumeroVendedor, JTextField txtBairroVendedor, JTextField txtCidadeVendedor, JComboBox jcbUfVendedor, JFormattedTextField txtCepVendedor) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.IdVendedor = Integer.parseInt(txtIdVendedor.getText());
        this.NomeVendedor = txtNomeVendedor.getText();
        this.CpfVendedor = txtCpfVendedor.getText();
        this.TelefoneVendedor = txtTelefoneVendedor.getText();
        this.DtNascimentoVendedor = sdf.parse(sdf.format(txtDtNascimentoVendedor.getDate()));
        this.EmailVendedor =  txtEmailVendedor.getText();
        this.EstadoCivilVendedor = jcbEstadoCivilVendedor.getSelectedItem().toString();
        this.SexoVendedor = jcbSexoVendedor.getSelectedItem().toString();
        this.CargoVendedor = jcbCargoVendedor.getSelectedItem().toString();
        this.LogradouroVendedor = txtLogradouroVendedor.getText();
        this.NumeroVendedor = txtNumeroVendedor.getText();
        this.BairroVendedor = txtBairroVendedor.getText();
        this.CidadeVendedor = txtCidadeVendedor.getText();
        this.UfVendedor = jcbUfVendedor.getSelectedItem().toString();
        this.CepVendedor = txtCepVendedor.getText();
    }
    
    
    public int getIdVendedor() {
        return IdVendedor;
    }

    public void setIdVendedor(int IdVendedor) {
        this.IdVendedor = IdVendedor;
    }
    

    public String getNomeVendedor() {
        return NomeVendedor;
    }

    public void setNomeVendedor(String NomeVendedor) {
        this.NomeVendedor = NomeVendedor;
    }

    public String getCpfVendedor() {
        return CpfVendedor;
    }

    public void setCpfVendedor(String CpfVendedor) {
        this.CpfVendedor = CpfVendedor;
    }

    public String getEmailVendedor() {
        return EmailVendedor;
    }

    public void setEmailVendedor(String EmailVendedor) {
        this.EmailVendedor = EmailVendedor;
    }

    public String getTelefoneVendedor() {
        return TelefoneVendedor;
    }

    public void setTelefoneVendedor(String TelefoneVendedor) {
        this.TelefoneVendedor = TelefoneVendedor;
    }

    public Date getDtNascimentoVendedor() {
        return DtNascimentoVendedor;
    }

    public void setDtNascimentoVendedor(Date DtNascimentoVendedor) {
        this.DtNascimentoVendedor = DtNascimentoVendedor;
    }

    public String getCargoVendedor() {
        return CargoVendedor;
    }

    public void setCargoVendedor(String CargoVendedor) {
        this.CargoVendedor = CargoVendedor;
    }

    public String getEstadoCivilVendedor() {
        return EstadoCivilVendedor;
    }

    public void setEstadoCivilVendedor(String EstadoCivilVendedor) {
        this.EstadoCivilVendedor = EstadoCivilVendedor;
    }

    public String getSexoVendedor() {
        return SexoVendedor;
    }

    public void setSexoVendedor(String SexoVendedor) {
        this.SexoVendedor = SexoVendedor;
    }

    public String getLogradouroVendedor() {
        return LogradouroVendedor;
    }

    public void setLogradouroVendedor(String LogradouroVendedor) {
        this.LogradouroVendedor = LogradouroVendedor;
    }

    public String getNumeroVendedor() {
        return NumeroVendedor;
    }

    public void setNumeroVendedor(String NumeroVendedor) {
        this.NumeroVendedor = NumeroVendedor;
    }

    public String getBairroVendedor() {
        return BairroVendedor;
    }

    public void setBairroVendedor(String BairroVendedor) {
        this.BairroVendedor = BairroVendedor;
    }

    public String getCidadeVendedor() {
        return CidadeVendedor;
    }

    public void setCidadeVendedor(String CidadeVendedor) {
        this.CidadeVendedor = CidadeVendedor;
    }

    public String getUfVendedor() {
        return UfVendedor;
    }

    public void setUfVendedor(String UfVendedor) {
        this.UfVendedor = UfVendedor;
    }

    public String getCepVendedor() {
        return CepVendedor;
    }

    public void setCepVendedor(String CepVendedor) {
        this.CepVendedor = CepVendedor;
    }











}

