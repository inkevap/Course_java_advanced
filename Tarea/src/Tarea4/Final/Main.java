package Tarea4.Final;

import Tarea4.Final.Usuario;
import Tarea4.Final.Usuarios;

public class Main {
    public static void main(String []args) {
        Tarea4.Final.Usuario usuario = new Tarea4.Final.Usuario();
        usuario.nombreUsuario = "openbootcamp";
        usuario.nombre = "Open";
        usuario.apellidos = "Bootcamp";
        usuario.email = "ejemplos@open-bootcamp.com";
        usuario.nivelAcceso = 10;

        Tarea4.Final.Usuarios usuarios = new Usuarios();
        usuarios.crearUsuario(usuario);

        Tarea4.Final.Usuario usuario2 = new Tarea4.Final.Usuario();
        usuario2.nombreUsuario = "openbootcamp2";
        usuario2.nombre = "Open";
        usuario2.apellidos = "Bootcamp";
        usuario2.email = "ejemplos@open-bootcamp.com";
        usuario2.nivelAcceso = 10;
        usuarios.crearUsuario(usuario2);

        Tarea4.Final.Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
        System.out.println(openbootcamp.email);

        usuarios.borrarUsuario("openbootcamp2");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println(a.nombreUsuario);
        }
    }
}
