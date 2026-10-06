import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<ObjInmobiliaria> visitas = new LinkedList<>();

        Metodos metodos = new Metodos();

        int opcion;

        do {

            System.out.println("\n=== MENU INMOBILIARIA ===");
            System.out.println("1. Registrar Visita");
            System.out.println("2. Cancelar Visita");
            System.out.println("3. Cambiar Horario de Visita");
            System.out.println("4. Reemplazar Cliente Autorizado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    metodos.RegistrarVisita(visitas, sc);

                    break;

                case 2:

                    System.out.print("Ingrese el ID del cliente para cancelar la visita: ");
                    int idClienteCancelar = sc.nextInt();
                    sc.nextLine();

                    metodos.CancelarVisita(visitas, idClienteCancelar);

                    break;

                case 3:

                    System.out.print("Ingrese el ID del cliente para cambiar el horario: ");
                    int idClienteCambiar = sc.nextInt();
                    sc.nextLine();

                    metodos.CambiarHorario(visitas, idClienteCambiar, sc);

                    break;

                case 4:

                    System.out.print("Ingrese el ID del cliente a reemplazar: ");
                    int idClienteReemplazar = sc.nextInt();
                    sc.nextLine();

                    metodos.AutorizadoReemplazar(visitas, idClienteReemplazar, sc);

                    break;

                case 5:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}