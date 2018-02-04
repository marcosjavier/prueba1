
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    public String nombre;
    public String password;

    /**
     * Constructor for objects of class User
     */
    public User()
    {
        // initialise instance variables
        
    }
    public User(String nom, String pass){
        nombre=nom;
        password=pass;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return  los datos de dos Strings
     */
    public void Validar(String nom, String pass)
    {
        if(nom ==this.nombre){
          if(pass==this.password){ System.out.print("usuario Valido");}}
        
    }
}
