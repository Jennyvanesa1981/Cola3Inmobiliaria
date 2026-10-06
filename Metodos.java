import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    
    public ObjInmobiliaria RegistrarVisita(Queue<ObjInmobiliaria> visitas, Scanner sc) {

        System.out.println("Ingrese el ID de cliente:");
        int idCliente = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = sc.nextLine();

        System.out.println("Ingrese el ID de propiedad:");
        int idPropiedad = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Ingrese el horario de atención:");
        String horarioAtencion = sc.nextLine();

        ObjInmobiliaria visita = new ObjInmobiliaria(
                idCliente, nombre, telefono, idPropiedad,
                horarioAtencion, "Pendiente", ""
        );
        
        visitas.offer(visita);

        System.out.println("Visita registrada exitosamente.");

        return visita;
    }


    public ObjInmobiliaria CancelarVisita(Queue<ObjInmobiliaria> visitas, int idCliente) {

        for(ObjInmobiliaria visita : visitas) {
           
            if(visita.getIdCliente() == idCliente) {
                
                visita.setEstado("Cancelada");

                System.out.println("Visita cancelada exitosamente.");

                return visita;
            }
        }

        return null;
    }


    public ObjInmobiliaria CambiarHorario(Queue<ObjInmobiliaria> visitas, int idCliente, Scanner sc) {

        for(ObjInmobiliaria visita : visitas) {
           
            if(visita.getIdCliente() == idCliente) {

                System.out.println("Ingresar Nuevo horario de visita:");
                String nuevoHorario = sc.nextLine(); 
                
                visita.setHorarioAtencion(nuevoHorario);

                System.out.println("Horario de visita actualizado exitosamente.");

                return visita;
            }
        }

        return null;
    }


    public ObjInmobiliaria AutorizadoReemplazar(Queue<ObjInmobiliaria> visitas, int idCliente, Scanner sc) {

        for(ObjInmobiliaria visita : visitas) {
           
            if(visita.getIdCliente() == idCliente) {

                System.out.println("Ingrese quien autoriza el reemplazo:");
                String autoriza = sc.nextLine(); 
                
                if(autoriza.equalsIgnoreCase("Gerente") || autoriza.equalsIgnoreCase("Subgerente")) {

                    visita.setAutoriza(autoriza);

                    System.out.println("Ingrese el nuevo ID de cliente:");
                    int nuevoIdCliente = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nuevo nombre:");
                    String nuevoNombre = sc.nextLine();

                    System.out.println("Ingrese el nuevo teléfono:");
                    String nuevoTelefono = sc.nextLine();

                    visita.setIdCliente(nuevoIdCliente);
                    visita.setNombre(nuevoNombre);
                    visita.setTelefono(nuevoTelefono);

                    System.out.println("Cliente reemplazado exitosamente.");

                    return visita;

                } else {

                    System.out.println("Solo el Gerente o Subgerente puede autorizar el reemplazo.");

                    return null;
                }
            }
        }

        return null;
    }
}    


