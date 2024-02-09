package com.senac.lojafacic.Main;


//comentário para commit
import com.formdev.flatlaf.FlatDarkLaf;
import com.senac.lojafacic.JFrames.TelaLogin;
import javax.swing.UIManager;

public class LojaFACIC {

    public static void main(String[] args) {
       FlatDarkLaf.registerCustomDefaultsSource("style");
       FlatDarkLaf.setup();
        
       TelaLogin Login = new TelaLogin();
       Login.setVisible(true);
    
    }
}
