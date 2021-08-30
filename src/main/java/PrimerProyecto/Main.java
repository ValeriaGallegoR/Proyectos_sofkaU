package PrimerProyecto;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            try {

                Scanner teclado = new Scanner(System.in);

                System.out.println("Nombre de usuario: ");
                String nombre = teclado.next();
                System.out.println("Número celular: ");
                int celular = teclado.nextInt();
                System.out.println("Edad: ");
                int edad = teclado.nextInt();

                System.out.println("Bienvenido señor " + nombre + " es un placer para nosotros contar con una persona" +
                        " de " + edad + " años.\n" + "Próximamente nos comunicaremos con usted al número " + celular +
                        "\nFeliz día.");
            } catch (Exception e){
                System.out.println("¡Error! Digite un valor valido ");
            }
        }
}
