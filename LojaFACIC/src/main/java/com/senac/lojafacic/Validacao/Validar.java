
package com.senac.lojafacic.Validacao;

import com.senac.lojafacic.Classes.Clientes;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Validar {
    public ArrayList<String> mensagensErro = new ArrayList<>();
    
    
     /**
     * Valida somente campos de Lista 
     * @param jcb Recebe um objeto do tipo JComboBox
     */
    public void ValidarLista(JComboBox jcb){
        if(jcb.getSelectedIndex()==-1){
            this.mensagensErro.add("Selecione um item na lista: " + jcb.getName());
        }
    }
    
     /**
     * Reseta somente campos de Lista
     * @param jcb Recebe um objeto do tipo JComboBox
     */
    public void LimparLista(JComboBox jcb){
        jcb.setSelectedIndex(-1);
    }
    
    /**
     * Valida somente campos inteiros
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void ValidarNumero(JTextField txt){
        try{
            //Verificação de campo vazio ,troca os caracteres da mascara por vazio
            if(txt.getText().replace(".", "")
                            .replace("-", "")
                            .replace("/","")
                            .replace("(", "")
                            .replace(")", "")
                            .replace(",", "")
                            .replace(" ", "")
                            .trim().equals("")){
                throw new IllegalArgumentException();
            }
            //Converte o valor para inteiro
            String Valor = txt.getText();
            int valorConvertidoInt = Integer.parseInt(Valor);
           
        }catch(NumberFormatException e){
            this.mensagensErro.add("Falha na conversão do campo " + txt.getName() + " em inteiro");
             txt.setText("");
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txt.getName());
             txt.setText("");
        }
    }
    
    /**
     * Valida somente campos de Texto
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void ValidarTexto(JTextField txt){
        try{
            //Verificação de campo vazio ,troca os caracteres da mascara por vazio
            if(txt.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }
            //Atribui o valor a um variavel
            String texto = txt.getText();
            
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txt.getName());
            txt.setText("");
        }
    }   
  
    /**
     * Limpa campos de texto
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void LimparTexto(JTextField txt){
       txt.setText("");
   } 
    
    public void ValidarCliente(JTextField txtNomeCliente,JFormattedTextField txtCpfCliente, JFormattedTextField txtTelefoneCliente, JDateChooser txtDtNascimentoCliente, JTextField txtEmailCliente, JComboBox jcbEstadoCivilCliente, JComboBox jcbSexoCliente, JTextField txtLogradouroCliente, JTextField txtNumeroCliente, JTextField txtBairroCliente, JTextField txtCidadeCliente, JComboBox jcbUfCliente, JFormattedTextField txtCepCliente){
// Nome
        try{//Tenta Verificar campo vazio
            if(txtNomeCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtNomeCliente.getName());
            txtNomeCliente.setText("");
        }//FIM TRY CATCH
// Cpf        
        try{//Tenta Verificar campo vazio
            if(txtCpfCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtCpfCliente.getName());
            txtCpfCliente.setText("");
        }//FIM TRY CATCH  
// Telefone        
        try{//Tenta Verificar campo vazio
            if(txtTelefoneCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtTelefoneCliente.getName());
            txtTelefoneCliente.setText("");
        }//FIM TRY CATCH  
// DtNascimento        
//        try{//Tenta Verificar campo vazio
//            if(txtDtNascimentoCliente.getDate(){
//                throw new IllegalArgumentException();
//            }//FIM IF
//        }catch(IllegalArgumentException e){
//            this.mensagensErro.add("Informe um valor no campo: " + txtTelefoneCliente.getName());
//            txtTelefoneCliente.setText("");
//        }//FIM TRY CATCH  
// Email        
         try{//Tenta Verificar campo vazio
            if(txtEmailCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtEmailCliente.getName());
            txtEmailCliente.setText("");
        }//FIM TRY CATCH
// EstadoCivil         
         try{//Tenta Verificar campo vazio
            if(jcbEstadoCivilCliente.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbEstadoCivilCliente.getName());
            jcbEstadoCivilCliente.setSelectedIndex(-1);
        }//FIM TRY CATCH
// Sexo         
         try{//Tenta Verificar campo vazio
            if(jcbSexoCliente.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbSexoCliente.getName());
            jcbSexoCliente.setSelectedIndex(-1);
        }//FIM TRY CATCH
// Logradouro         
         try{//Tenta Verificar campo vazio
            if(txtLogradouroCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtLogradouroCliente.getName());
            txtLogradouroCliente.setText("");
        }//FIM TRY CATCH  
// Numero         
         try{//Tenta Verificar campo vazio
            if(txtNumeroCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtNumeroCliente.getName());
            txtNumeroCliente.setText("");
        }//FIM TRY CATCH
// Bairro         
         try{//Tenta Verificar campo vazio
            if(txtBairroCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtBairroCliente.getName());
            txtBairroCliente.setText("");
        }//FIM TRY CATCH
// Cidade         
         try{//Tenta Verificar campo vazio
            if(txtCidadeCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtCidadeCliente.getName());
            txtCidadeCliente.setText("");
        }//FIM TRY CATCH
// Uf
         try{//Tenta Verificar campo vazio
            if(jcbUfCliente.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbUfCliente.getName());
            jcbUfCliente.setSelectedIndex(-1);
        }//FIM TRY CATCH
// Cep         
         try{//Tenta Verificar campo vazio
            if(txtCepCliente.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtCepCliente.getName());
            
            txtCepCliente.setText("");
        }//FIM TRY CATCH   
    }
    
    public void ValidarVendedor(JTextField txtNomeVendedor,JFormattedTextField txtCpfVendedor, JFormattedTextField txtTelefoneVendedor, JDateChooser  txtDtNascimentoVendedor, JTextField txtEmailVendedor, JComboBox jcbEstadoCivilVendedor, JComboBox jcbSexoVendedor, JComboBox jcbCargoVendedor, JTextField txtLogradouroVendedor, JTextField txtNumeroVendedor, JTextField txtBairroVendedor, JTextField txtCidadeVendedor, JComboBox jcbUfVendedor, JFormattedTextField txtCepVendedor){
// Nome
        try{//Tenta Verificar campo vazio
            if(txtNomeVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtNomeVendedor.getName());
            txtNomeVendedor.setText("");
        }//FIM TRY CATCH
// Cpf        
        try{//Tenta Verificar campo vazio
            if(txtCpfVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtCpfVendedor.getName());
            txtCpfVendedor.setText("");
        }//FIM TRY CATCH  
// Telefone        
        try{//Tenta Verificar campo vazio
            if(txtTelefoneVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtTelefoneVendedor.getName());
            txtTelefoneVendedor.setText("");
        }//FIM TRY CATCH  
// DtNascimento        
//        try{//Tenta Verificar campo vazio
//            if(txtDtNascimentoVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
//                throw new IllegalArgumentException();
//            }//FIM IF
//        }catch(IllegalArgumentException e){
//            this.mensagensErro.add("Informe um valor no campo: " + txtDtNascimentoVendedor.getName());
//            txtDtNascimentoVendedor.setText("");
//        }//FIM TRY CATCH
// Email        
         try{//Tenta Verificar campo vazio
            if(txtEmailVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtEmailVendedor.getName());
            txtEmailVendedor.setText("");
        }//FIM TRY CATCH
// EstadoCivil         
         try{//Tenta Verificar campo vazio
            if(jcbEstadoCivilVendedor.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbEstadoCivilVendedor.getName());
            jcbEstadoCivilVendedor.setSelectedIndex(-1);
        }//FIM TRY CATCH
// Sexo         
         try{//Tenta Verificar campo vazio
            if(jcbSexoVendedor.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbSexoVendedor.getName());
            jcbSexoVendedor.setSelectedIndex(-1);
        }//FIM TRY CATCH
 // Cargo         
         try{//Tenta Verificar campo vazio
            if(jcbCargoVendedor.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbCargoVendedor.getName());
            jcbCargoVendedor.setSelectedIndex(-1);
        }//FIM TRY CATCH
// Logradouro         
         try{//Tenta Verificar campo vazio
            if(txtLogradouroVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtLogradouroVendedor.getName());
            txtLogradouroVendedor.setText("");
        }//FIM TRY CATCH  
// Numero         
         try{//Tenta Verificar campo vazio
            if(txtNumeroVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtNumeroVendedor.getName());
            txtNumeroVendedor.setText("");
        }//FIM TRY CATCH
// Bairro         
         try{//Tenta Verificar campo vazio
            if(txtBairroVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtBairroVendedor.getName());
            txtBairroVendedor.setText("");
        }//FIM TRY CATCH
// Cidade         
         try{//Tenta Verificar campo vazio
            if(txtCidadeVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtCidadeVendedor.getName());
            txtCidadeVendedor.setText("");
        }//FIM TRY CATCH
// Uf
         try{//Tenta Verificar campo vazio
            if(jcbUfVendedor.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbUfVendedor.getName());
            jcbUfVendedor.setSelectedIndex(-1);
        }//FIM TRY CATCH
// Cep         
         try{//Tenta Verificar campo vazio
            if(txtCepVendedor.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtCepVendedor.getName());
            
            txtCepVendedor.setText("");
        }//FIM TRY CATCH   
    }
    
    public void ValidarProduto(JTextField txtNomeProduto,JFormattedTextField txtPrecoCustoProduto, JFormattedTextField txtPrecoVendaProduto, JFormattedTextField txtQtdeEstoque, JComboBox jcbCategoriaProduto){
// Nome
        try{//Tenta Verificar campo vazio
            if(txtNomeProduto.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtNomeProduto.getName());
            txtNomeProduto.setText("");
        }//FIM TRY CATCH
// PrecoCusto       
        try{//Tenta Verificar campo vazio
            if(txtPrecoCustoProduto.getText().replace(".", "").replace(",", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtPrecoCustoProduto.getName());
            txtPrecoCustoProduto.setText("");
        }//FIM TRY CATCH  
// PrecoVenda        
        try{//Tenta Verificar campo vazio
            if(txtPrecoVendaProduto.getText().replace(".", "").replace(",", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtPrecoVendaProduto.getName());
            txtPrecoVendaProduto.setText("");
        }//FIM TRY CATCH
// Qtde        
         try{//Tenta Verificar campo vazio
            if(txtQtdeEstoque.getText().replace(".", "").replace("-", "").replace("/", "").replace("(", "").replace(")", "").trim().equals("")){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + txtQtdeEstoque.getName());
            txtQtdeEstoque.setText("");
        }//FIM TRY CATCH
// Categoria         
         try{//Tenta Verificar campo vazio
            if(jcbCategoriaProduto.getSelectedIndex()==-1){
                throw new IllegalArgumentException();
            }//FIM IF
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo: " + jcbCategoriaProduto.getName());
            jcbCategoriaProduto.setSelectedIndex(-1);
        }//FIM TRY CATCH

     }
    
    public void LimparCliente(JTextField txtNomeCliente,JFormattedTextField txtCpfCliente, JFormattedTextField txtTelefoneCliente, JDateChooser  txtDtNascimentoCliente, JTextField txtEmailCliente, JComboBox jcbEstadoCivilCliente, JComboBox jcbSexoCliente, JTextField txtLogradouroCliente, JTextField txtNumeroCliente, JTextField txtBairroCliente, JTextField txtCidadeCliente, JComboBox jcbUfCliente, JFormattedTextField txtCepCliente){

        txtNomeCliente.setText("");
        txtCpfCliente.setText("");
        txtTelefoneCliente.setText("");
        txtDtNascimentoCliente.setDate(null);
        txtEmailCliente.setText("");
        jcbEstadoCivilCliente.setSelectedIndex(-1);
        jcbSexoCliente.setSelectedIndex(-1);
        txtLogradouroCliente.setText("");
        txtNumeroCliente.setText("");
        txtBairroCliente.setText("");
        txtCidadeCliente.setText("");
        jcbUfCliente.setSelectedIndex(-1);
        txtCepCliente.setText("");  
    }
    
    public void LimparVendedor(JTextField txtNomeVendedor,JFormattedTextField txtCpfVendedor, JFormattedTextField txtTelefoneVendedor, JDateChooser  txtDtNascimentoVendedor, JTextField txtEmailVendedor, JComboBox jcbEstadoCivilVendedor, JComboBox jcbSexoVendedor, JComboBox jcbCargoVendedor, JTextField txtLogradouroVendedor, JTextField txtNumeroVendedor, JTextField txtBairroVendedor, JTextField txtCidadeVendedor, JComboBox jcbUfVendedor, JFormattedTextField txtCepVendedor){

        txtNomeVendedor.setText("");
        txtCpfVendedor.setText("");txtTelefoneVendedor.setText("");
        txtDtNascimentoVendedor.setDate(null);
        txtEmailVendedor.setText("");
        jcbEstadoCivilVendedor.setSelectedIndex(-1);
        jcbSexoVendedor.setSelectedIndex(-1);
        jcbCargoVendedor.setSelectedIndex(-1);
        txtLogradouroVendedor.setText("");
        txtNumeroVendedor.setText("");
        txtBairroVendedor.setText("");
        txtCidadeVendedor.setText("");
        jcbUfVendedor.setSelectedIndex(-1);
        txtCepVendedor.setText("");
    }
    
    public void LimparProduto(JTextField txtNomeProduto,JFormattedTextField txtCodigoProduto, JFormattedTextField txtPrecoCustoProduto, JFormattedTextField txtPrecoVendaProduto, JFormattedTextField txtQtdeEstoque, JComboBox jcbCategoriaProduto){
        
        txtNomeProduto.setText("");
        txtCodigoProduto.setText("");
        txtPrecoCustoProduto.setText("");
        txtPrecoVendaProduto.setText("");
        txtQtdeEstoque.setText("");
        jcbCategoriaProduto.setSelectedIndex(-1);
     }
    
    /**
     * Valida somente campos Float
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void ValidarFloat(JTextField txt){
        try{
            //Verifico se o campo está vazio
            if(txt.getText().replace("-", "")
                            .replace("/", "")
                            .replace("(", "")
                            .replace(")", "")
                            .replace(" ", "")
                            .trim().equals("")){
                throw new IllegalArgumentException();
            }
            //Converte o valor em Float
            float valorConvertidoFloat = Float.parseFloat(txt.getText());
            
        }catch(NumberFormatException e){
            this.mensagensErro.add("Falha na conversão do campo " + txt.getName() + " em float");
            txt.setText("");
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo:  " + txt.getName());
            txt.setText("");
        }
     }
    
    /**
     * Valida somente campos Double
     * @param txt Recebe um objeto do tipo JTextField
     */
    public void ValidarDouble(JTextField txt){
     
         try{
            //Verifico se o campo está vazio
            if(txt.getText().replace("-", "")
                            .replace("/", "")
                            .replace("(", "")
                            .replace(")", "")
                            .replace(" ", "")
                            .trim().equals("")){
                throw new IllegalArgumentException();
            }
            //Converte o valor em Double
            double valorConvertidoDouble = Double.parseDouble(txt.getText());
            
        }catch(NumberFormatException e){
            this.mensagensErro.add("Falha na conversão do campo " + txt.getName() + " em Double");
            
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Informe um valor no campo:  " + txt.getName());
            
        }
     }
     
    /**
     * Limpa as mensagens de Erro do Array
     */
    public void limparMensagens(){
     
         this.mensagensErro.clear();
     }
     
     /**@deprecated substituida por {@link #getMensagensErro()}
      * Método para exibir mensagens de erro na tela com JOptionPane
      */
    public void ExibirMensagensErro(){
         
        String errosFormulario = "";
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            JOptionPane.showMessageDialog(null, errosFormulario);
            this.limparMensagens();
        }     
     }
     
     /**
      * Resgata todos os erros gerados em uma única String
      * @return 
      */
     public String getMensagensErro(){
         
        String errosFormulario = "";
        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            this.limparMensagens();
        }     
        return errosFormulario;
     }
     
     public boolean hasErro(){
     
         if(this.mensagensErro.size()>0){
            return true;    
         }else{
             return false;
         }
     }
}
