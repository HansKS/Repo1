
package Modelos;


public class Docente extends Persona{
    private String especialidad;

    //Constructor con parametros de Persona. 
    public Docente(String especialidad, int cedula, String nombre, String apellido, String genero, int telefono, String email) {
        super(cedula, nombre, apellido, genero, telefono, email);
        this.especialidad = especialidad;
    }

    //Constructor vacio.
    public Docente() {
    }
    public Docente(String especialidad) {
        this.especialidad = especialidad;
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
