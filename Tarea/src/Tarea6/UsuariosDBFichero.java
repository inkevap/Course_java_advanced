package Tarea6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosDBFichero implements UsuariosDB {
    private final String ficheroDatos = "usuarios.txt";
    private ArrayList<Usuario> convertirUsuariosFicheroEnArrayList() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

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
            System.out.println("Error leyendo base de datos: "+ e.getMessage());
        }

        return usuarios;
    }

    public ArrayList<Usuario> listarUsuarios() {
        return convertirUsuariosFicheroEnArrayList();
    }

    public Usuario obtenerUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = convertirUsuariosFicheroEnArrayList();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void crearUsuario(Usuario usuario) {
        if (obtenerUsuario(usuario) != null) {
            return;
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos,true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separarUsuarioPorComas(usuario));
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    private String separarUsuarioPorComas(Usuario usuario) {
        return usuario.nombreUsuario + ","
                + usuario.nombre + ","
                + usuario.apellidos + ","
                + usuario.email + ","
                + usuario.nivelAcceso;
    }

    public void borrarUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = convertirUsuariosFicheroEnArrayList();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)) {
                usuarios.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioActual : usuarios) {
                String usuarioComas = separarUsuarioPorComas(usuarioActual);
                printStream.println(usuarioComas);
            }
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
            System.out.println("Error borrando usuario: " + e.getMessage());
        }
    }
}
