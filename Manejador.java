
/**
 * Write a description of class manejador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Manejador implements ActionListener
{
    //JTextField t= new JTextField();
   public  FormLogin padreFrame; 
   //constructor
   public Manejador(FormLogin padreFrame){
       this.padreFrame=padreFrame;
    }
    
    public void actionPerformed(ActionEvent e){        
        
        if (padreFrame.comprobarDatos())
          padreFrame.texto3.setText("datos cor");
        else padreFrame.texto3.setText("datos inco");
    }
        
        
        
    }
    
   
   

