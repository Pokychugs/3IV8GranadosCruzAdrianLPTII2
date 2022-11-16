/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 *
 * @author alumno
 */
import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VistaPersona ventana = new VistaPersona();
        //ventana.Principal();
        JFrame ventana = new JFrame("Dormiditos");
        ventana.setSize(550,270);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ventana.add(panel);
        
        agregarComponentes(panel);
        ventana.setVisible(true);
        
    }
    
    private static void agregarComponentes(JPanel panel){
        panel.setLayout(null);
        
        //etiqutas
        JLabel userlabel = new JLabel("Nombre de usuario");
        //definir tamaño y orentacion dentro del panel
        userlabel.setBounds(10,10, 120, 50);
        panel.add(userlabel);
        
        //campo de texto
        JTextField usertext = new JTextField();
        usertext.setBounds(160, 20, 160, 25);
        panel.add(usertext);
        
        //etiqutas
        JLabel userpassword = new JLabel("Contraseña del usuario");
        //definir tamaño y orentacion dentro del panel
        userpassword.setBounds(10,40, 120, 50);
        panel.add(userpassword);
        
        //campo de texto
        JTextField passtext = new JTextField();
        passtext.setBounds(160, 50, 160, 25);
        panel.add(passtext);
        
         //etiqutas
        JButton loginbutton = new JButton("Iniciar sesion");
        //definir tamaño y orentacion dentro del panel
        loginbutton.setBounds(10,80, 120, 25);
        panel.add(loginbutton);
        
        //campo de texto
        JButton registerbutton = new JButton("Registrate");
        registerbutton.setBounds(180, 80, 120, 25);
        panel.add(registerbutton);
    }
    
}
