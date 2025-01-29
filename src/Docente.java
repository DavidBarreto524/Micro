
public class Docente extends Persona {
    private double sueldo;

    public Docente(String nombre, String apellido, int edad,double sueldo) {
        
        super(nombre, apellido, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
   public void mostrarDatos(){
        System.out.println("DOCENTE");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Apellido:"+getApellido());
        System.out.println("Edad:"+getEdad());
        System.out.println("Sueldo Docente:"+sueldo+"__"+"dollar");
        
        
        
         
        
    }
      
    
  
    
    
}
