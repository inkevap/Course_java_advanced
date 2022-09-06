package Tarea4.Final;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {
    public String ficheroDatos = "usuarios.txt";

    private ArrayList<Usuario> CrearArrayUsuario(){

        ArrayList<Usuario> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return usuarios;

    }
    private String FormatearUsuario(Usuario usuario){
        return usuario.nombreUsuario + ","
                + usuario.nombre + ","
                + usuario.apellidos + ","
                + usuario.email + ","
                + usuario.nivelAcceso;
    }
    public ArrayList<Usuario> listarUsuarios() {
        return CrearArrayUsuario();
    }

    public Usuario obtenerUsuario(String username) {
        ArrayList<Usuario> usuarios = CrearArrayUsuario();

        for(Usuario usuario : usuarios){
            if(usuario.nombreUsuario.equalsIgnoreCase(username)){
                return usuario;
            }
        }
        return null;
    }

    public void crearUsuario(Usuario usuario) {
        if(obtenerUsuario(usuario.nombreUsuario) !=null){
            return;
        }

        try{
            PrintStream printStream = new PrintStream(ficheroDatos);

            for(Usuario usuarioExistente : CrearArrayUsuario()){
                printStream.println(FormatearUsuario(usuarioExistente));
            }

            printStream.println(FormatearUsuario(usuario));
        }catch (Exception e){
            System.out.println("Error al intentar escribir en el fichero: " + e.getMessage());
        }

    }
    public void borrarUsuario(String username) {
        ArrayList<Usuario> usuarios = CrearArrayUsuario();
        for(int i = 0; i< usuarios.size();i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(username)) {
                usuarios.remove(i);
            }
        }
        try {
            PrintStream printStream = new PrintStream(ficheroDatos);
            for (Usuario usuario : usuarios){
                printStream.println(FormatearUsuario(usuario));
            }
        } catch (Exception e) {
        }
    }
}
