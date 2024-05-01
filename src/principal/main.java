package principal;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class main {

    public static void main(String[] args) {
        //System.out.println("Bienvenidos a la inmersion en Java");
        System.out.println("Listado de Peliculas");
        
        String nombreDePelicula = "Marix";
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String sinopsis = """
                          La mejor película del fin del milenio.
                          """;
        
        System.out.println("Nombre de película: "+nombreDePelicula);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Evaluación: "+evaluacion);
        System.out.println("Incluio en el plan básico: "+incluidoEnElPlanBasico);
        System.out.println("Sinopsis: "+sinopsis);
        
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de Matrix: "+mediaEvaluacion);
        
        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }
        Scanner leer = new Scanner(System.in);
        double mediaEvaluacionUsuario = 0;
        for(int i = 0;  i < 3; i++){
            System.out.println("Ingrese la nota que le darias a Matrix");
            double notaMatrix = leer.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la película Matrix es: "+mediaEvaluacionUsuario/3);
    }
}
