
/**
 * Write a description of class FormLogin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.*;


public class FormLogin extends JFrame
{
    // instance variables         
   
    JTextField texto1;
    JTextField texto2;
    JTextField texto3;
        
   
    /**
     * Constructor for objects of class FormLogin
     */
    public FormLogin()
    {
       
       setTitle("Fomulario Login");
       setSize(300,200);
       
       //contenedor para el panel
       Container contentpane= this.getContentPane();
       contentpane.setLayout(new BorderLayout());       

      
       contentpane.setBackground(Color.gray);
       
       //creo objetos de tipo JPanel
       JPanel panel= new JPanel(); 
       JPanel panel2= new JPanel();
       panel.setBackground(Color.blue);
       
       //creo objetos para agregar a los paneles       
       texto1= new JTextField(10);
       texto2= new JTextField(10);
       texto3= new JTextField(10);      
       
       JButton boton = new JButton("BOTON");
       boton.addActionListener(new Manejador(this));
       
       // añado los objetos tipo JPanel al objeto contenedor
       contentpane.add(panel, BorderLayout.CENTER);
       contentpane.add(panel2, BorderLayout.SOUTH);
       
       //agrego los objetos a los paneles
       
       panel.add(texto1);
       panel.add(texto2);
       panel.add(texto3);
             
       panel2.add(boton);  
       setVisible(true);
       
        
    }    
    
    
    public boolean comprobarDatos(){  
        String nombre="marcos";
        String pass="ninguna";
                
        
       if(texto1.getText().equals(nombre) && texto2.getText().equals(pass)){
         return true;
        }else return false;
   
    }

    
}

