import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n===== AGENDA DE CONTACTOS =====");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Error, numero del 1 al 4.");
            }
        } while (opcion != 4);

        sc.close();
    }
}