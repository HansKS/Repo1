
package Modelos;

public class Estudiante extends Persona{
    private int CarnetNumero;
    private int anosDeEstudio;

    //Constructor con parametros de persona. 
    public Estudiante(int CarnetNumero, int anosDeEstudio, int cedula, String nombre, String apellido, String genero, int telefono, String email) {
        super(cedula, nombre, apellido, genero, telefono, email);
        this.CarnetNumero = CarnetNumero;
        this.anosDeEstudio = anosDeEstudio;
    }
 
    //Constructor vacio. 
    public Estudiante() {
    }

    public int getCarnetNumero() {
        return CarnetNumero;
    }

    public void setCarnetNumero(int CarnetNumero) {
        this.CarnetNumero = CarnetNumero;
    }

    public int getAnosDeEstudio() {
        return anosDeEstudio;
    }

    public void setAnosDeEstudio(int anosDeEstudio) {
        this.anosDeEstudio = anosDeEstudio;
    }

}
