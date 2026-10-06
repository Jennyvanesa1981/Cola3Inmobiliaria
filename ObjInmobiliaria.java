public class ObjInmobiliaria {

    private int IdCliente;
    private String Nombre;
    private String Telefono;
    private int  IdPropiedad;
    private String HorarioAtencion;
    private String Estado;
    private String Autoriza;;

    
    public ObjInmobiliaria(int idCliente, String nombre, String telefono, int idPropiedad, String horarioAtencion,
            String estado, String autoriza) {
        IdCliente = idCliente;
        Nombre = nombre;
        Telefono = telefono;
        IdPropiedad = idPropiedad;
        HorarioAtencion = horarioAtencion;
        Estado = estado;
        Autoriza = autoriza;    
    }


    public ObjInmobiliaria() {
    }


    public String getAutoriza() {
        return Autoriza;
    }


    public void setAutoriza(String autoriza) {
        Autoriza = autoriza;
    }


    public int getIdCliente() {
        return IdCliente;
    }


    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getTelefono() {
        return Telefono;
    }


    public void setTelefono(String telefono) {
        Telefono = telefono;
    }


    public int getIdPropiedad() {
        return IdPropiedad;
    }


    public void setIdPropiedad(int idPropiedad) {
        IdPropiedad = idPropiedad;
    }


    public String getHorarioAtencion() {
        return HorarioAtencion;
    }


    public void setHorarioAtencion(String horarioAtencion) {
        HorarioAtencion = horarioAtencion;
    }


    public String getEstado() {
        return Estado;
    }


    public void setEstado(String estado) {
        Estado = estado;
    }
    
}
