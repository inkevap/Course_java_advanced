package Tarea6;

public class Main {
    public static void main(String []args) {

        UsuariosDB DB = new UsuariosDBFichero();

        String tipoDB = "fichero";
        if(tipoDB.equalsIgnoreCase("fichero")) {
            DB = new UsuariosDBFichero();
        } else if (tipoDB.equalsIgnoreCase("memoria")) {
            DB = new UsuariosDBMemoria();
        }

        Usuarios users = new Usuarios(DB);

        Usuario usuario2 = new Usuario();
        usuario2.nombreUsuario = "openbootcamp";
        usuario2.nombre = "Open2";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;

        users.insertar(usuario2);
        users.borrar(usuario2);

        for (Usuario a : users.listar()) {
            System.out.println("---------------------------------");
            System.out.println(a);
        }

        System.out.println("Numero de inserciones: "+ users.obtenerInseciones());
        System.out.println("Numero de eliminaciones: "+ users.obtenerEliminaciones());
    }
}
