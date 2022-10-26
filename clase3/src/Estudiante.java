import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int edad;
    private Curso[] cursoTelecom = new Curso[4];
    private ArrayList<Curso> otrosCursos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Curso[] getCursoTelecom() {
        return cursoTelecom;
    }

    public void setCursoTelecom(Curso[] cursoTelecom) {
        this.cursoTelecom = cursoTelecom;
    }

    public ArrayList<Curso> getOtrosCursos() {
        return otrosCursos;
    }

    public void setOtrosCursos(ArrayList<Curso> otrosCursos) {
        this.otrosCursos = otrosCursos;
    }
}
