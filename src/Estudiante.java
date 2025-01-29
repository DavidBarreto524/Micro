

public class Estudiante extends Persona {
    
    
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad,int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("ESTUDIANTE");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Apellido:"+getApellido());
        System.out.println("Edad:"+getEdad());
        System.out.println("Codigo Estudiante:"+codigoEstudiante);
        System.out.println("Nota Final:"+notaFinal);
         
        
    }
    
    
    
}
