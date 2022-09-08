package Tarea6;

public class Usuario {
    public String nombreUsuario;
    public String nombre;
    public String apellidos;
    public String email = "";
    public int nivelAcceso;

    @Override
    public String toString(){
        return  "Usuario: "+ nombreUsuario +"\n\r"+
                "Nombre: "+ nombre +"\n\r"+
                "Apellido: "+ apellidos +"\n\r"+
                "Email: "+ email +"\n\r"+
                "Nivel de Acceso: "+ nivelAcceso +"\n\r";
    }
}
