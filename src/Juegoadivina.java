import java.util.Random;
import java.util.Scanner;

public class Juegoadivina {
    public Juegoadivina() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        int numeroUsuario = 0;
        int aleatorio = (new Random()).nextInt(100);
        System.out.println(aleatorio);

        for(int i = 0; i < 5; ++i) {
            System.out.print("Cómo te llamas:");
            nombre = teclado.nextLine();
            System.out.print("Ingrese un número entre 0 y 100:");
            numeroUsuario = teclado.nextInt();
            if (numeroUsuario >= 0 && numeroUsuario <= 100) {
                if (numeroUsuario == aleatorio) {
                    System.out.print("Acertaste el número " + nombre);
                    System.out.print("y es: " + aleatorio);
                    break;
                }

                if (numeroUsuario > aleatorio) {
                    System.out.println("El número aleatorio es menor");
                } else {
                    System.out.println("El número aleatorio es mayor");
                }
            } else {
                System.out.println("Error en ingreso, el número  debe estar comprendido entre 0 y 100");
            }
        }

    }
}