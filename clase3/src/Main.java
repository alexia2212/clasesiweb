import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};

        Curso[] arr2 = {new Curso(), new Curso()};

        arr2[0].setNombre("iweb");
        Curso c = arr2[1];
        c.setNombre("iweb2");

        System.out.println(arr2[0].getNombre());

        Estudiante[] arr3 = new Estudiante[3];
        for(int i = 0; i < arr3.length; i++){
            arr3[i] = new Estudiante();
        }

        Curso cc = new Curso();

        Estudiante e0 = arr3[0];
        Curso[] arrCursos = e0.getCursoTelecom();
        Curso c0 = arrCursos[0];
        c0.setNombre("gtics");

        arr3[0].setOtrosCursos(new ArrayList<>());

        Curso ccc = new Curso();
        ccc.setNombre("gtics");

        ArrayList<Curso> lista = arr3[0].getOtrosCursos();
        lista.add(ccc);
        arr3[0].getOtrosCursos().add(ccc);

    }
}