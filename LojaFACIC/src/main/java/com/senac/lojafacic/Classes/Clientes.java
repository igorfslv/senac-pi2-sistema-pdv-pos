
package com.senac.lojafacic.Classes;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.Date.parse;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;


public class Clientes {
    
    private int IdCliente;
    private String NomeCliente;
    private String CpfCliente;
    private String EmailCliente;
    private String TelefoneCliente;
    private Date DtNascimentoCliente;
    private String EstadoCivilCliente;
    private String SexoCliente;
    private String LogradouroCliente;
    private String NumeroCliente;
    private String BairroCliente;
    private String CidadeCliente;
    private String UfCliente;
    private String CepCliente;

    public Clientes() {
    }
    
    public Clientes(String NomeCliente,String CpfCliente,String TelefoneCliente,Date DtNascimentoCliente,String EmailCliente,String EstadoCivilCliente,String SexoCliente,String LogradouroCliente,String NumeroCliente,String BairroCliente,String CidadeCliente,String UfCliente,String CepCliente) {
        this.NomeCliente = NomeCliente;
        this.CpfCliente = CpfCliente;
        this.TelefoneCliente = TelefoneCliente;
        this.DtNascimentoCliente = DtNascimentoCliente;
        this.EmailCliente = EmailCliente;
        this.EstadoCivilCliente = EstadoCivilCliente;
        this.SexoCliente = SexoCliente;
        this.LogradouroCliente = LogradouroCliente;
        this.NumeroCliente = NumeroCliente;
        this.BairroCliente = BairroCliente;
        this.CidadeCliente = CidadeCliente;
        this.UfCliente = UfCliente;
        this.CepCliente = CepCliente;
    }
    
    public Clientes(JTextField txtNomeCliente, JFormattedTextField txtCpfCliente, JFormattedTextField txtTelefoneCliente, JDateChooser  txtDtNascimentoCliente, JTextField txtEmailCliente, JComboBox jcbEstadoCivilCliente, JComboBox jcbSexoCliente, JTextField txtLogradouroCliente, JTextField txtNumeroCliente, JTextField txtBairroCliente, JTextField txtCidadeCliente, JComboBox jcbUfCliente, JFormattedTextField txtCepCliente) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        this.NomeCliente = txtNomeCliente.getText();
        this.CpfCliente = txtCpfCliente.getText();
        this.TelefoneCliente = txtTelefoneCliente.getText();
        this.DtNascimentoCliente = formato.parse(formato.format(txtDtNascimentoCliente.getDate()));
        this.EmailCliente = txtEmailCliente.getText();
        this.EstadoCivilCliente = jcbEstadoCivilCliente.getSelectedItem().toString();
        this.SexoCliente = jcbSexoCliente.getSelectedItem().toString();
        this.LogradouroCliente = txtLogradouroCliente.getText();
        this.NumeroCliente = txtNumeroCliente.getText();
        this.BairroCliente = txtBairroCliente.getText();
        this.CidadeCliente = txtCidadeCliente.getText();
        this.UfCliente = jcbUfCliente.getSelectedItem().toString();
        this.CepCliente = txtCepCliente.getText();
    }
    
    public Clientes(JTextField txtIdCliente, JTextField txtNomeCliente, JFormattedTextField txtCpfCliente, JFormattedTextField txtTelefoneCliente, JDateChooser txtDtNascimentoCliente, JTextField txtEmailCliente, JComboBox jcbEstadoCivilCliente, JComboBox jcbSexoCliente, JTextField txtLogradouroCliente, JTextField txtNumeroCliente, JTextField txtBairroCliente, JTextField txtCidadeCliente, JComboBox jcbUfCliente, JFormattedTextField txtCepCliente) throws ParseException {
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        this.IdCliente = Integer.parseInt(txtIdCliente.getText());
        this.NomeCliente = txtNomeCliente.getText();
        this.CpfCliente = txtCpfCliente.getText();
        this.TelefoneCliente = txtTelefoneCliente.getText();
        this.DtNascimentoCliente = formato.parse(formato.format(txtDtNascimentoCliente.getDate()));
        this.EmailCliente = txtEmailCliente.getText();
        this.EstadoCivilCliente = jcbEstadoCivilCliente.getSelectedItem().toString();
        this.SexoCliente = jcbSexoCliente.getSelectedItem().toString();
        this.LogradouroCliente = txtLogradouroCliente.getText();
        this.NumeroCliente = txtNumeroCliente.getText();
        this.BairroCliente = txtBairroCliente.getText();
        this.CidadeCliente = txtCidadeCliente.getText();
        this.UfCliente = jcbUfCliente.getSelectedItem().toString();
        this.CepCliente = txtCepCliente.getText();
    }

    
    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getCpfCliente() {
        return CpfCliente;
    }

    public void setCpfCliente(String CpfCliente) {
        this.CpfCliente = CpfCliente;
    }

    public String getEmailCliente() {
        return EmailCliente;
    }

    public void setEmailCliente(String EmailCliente) {
        this.EmailCliente = EmailCliente;
    }

    public String getTelefoneCliente() {
        return TelefoneCliente;
    }

    public void setTelefoneCliente(String TelefoneCliente) {
        this.TelefoneCliente = TelefoneCliente;
    }

    public Date getDtNascimentoCliente() {
        return DtNascimentoCliente;
    }

    public void setDtNascimentoCliente(Date DtNascimentoCliente)  {
      
        this.DtNascimentoCliente = DtNascimentoCliente;
    }

    public String getEstadoCivilCliente() {
        return EstadoCivilCliente;
    }

    public void setEstadoCivilCliente(String EstadoCivilCliente) {
        this.EstadoCivilCliente = EstadoCivilCliente;
    }

    public String getSexoCliente() {
        return SexoCliente;
    }

    public void setSexoCliente(String SexoCliente) {
        this.SexoCliente = SexoCliente;
    }

    public String getLogradouroCliente() {
        return LogradouroCliente;
    }

    public void setLogradouroCliente(String LogradouroCliente) {
        this.LogradouroCliente = LogradouroCliente;
    }

    public String getNumeroCliente() {
        return NumeroCliente;
    }

    public void setNumeroCliente(String NumeroCliente) {
        this.NumeroCliente = NumeroCliente;
    }

    public String getBairroCliente() {
        return BairroCliente;
    }

    public void setBairroCliente(String BairroCliente) {
        this.BairroCliente = BairroCliente;
    }

    public String getCidadeCliente() {
        return CidadeCliente;
    }

    public void setCidadeCliente(String CidadeCliente) {
        this.CidadeCliente = CidadeCliente;
    }

    public String getUfCliente() {
        return UfCliente;
    }

    public void setUfCliente(String UfCliente) {
        this.UfCliente = UfCliente;
    }

    public String getCepCliente() {
        return CepCliente;
    }

    public void setCepCliente(String CepCliente) {
        this.CepCliente = CepCliente;
    }
    
    
    
}
