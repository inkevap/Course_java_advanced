package Tarea6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosDBFichero implements UsuariosDB { 
    private final String ficheroDatos = "usuarios.txt"; // Cargas en una variable el nombre del archivo
    private ArrayList<Usuario> convertirUsuariosFicheroEnArrayList() {//Leer Usuarios dee un fichero
        ArrayList<Usuario> usuarios = new ArrayList<>();// Creas una base de datos que guarda usuarios en memoria

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));//Cargas el fichero en memoria

            while (scanner.hasNext()) { //Mientras el archivo siga teniendo lineas sin leer se ejecuta =>
                String usuarioActual = scanner.next(); //lee la linea actual
                String []partes = usuarioActual.split(","); //Separa el string en un array de strings.

                Usuario usuario = new Usuario();// creas un usuario, y con base a el formato que le diste al texto le asignas los valores al usuario
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellidos = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);//El usuario creado lo agregas a tu base de datos provisional
            }

            scanner.close(); // cerras el fichero.
        } catch (Exception e) {
            System.out.println("Error leyendo base de datos: "+ e.getMessage());// si no encontro el fichero o el fichero esta dañado te va a tirar un error
        }

        return usuarios;// si todo funciona correctamente y no hubo errores devolves tu base de datos provisional para que sea almacenado
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
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos,true);//Creas un objeto que lee el archivo y todo lo que se escribe se queda en memoria
            PrintStream printStream = new PrintStream(fileOutputStream);// creas un objeto que lee lo que esta en memoria y lo guarda en un fichero en el disco duro
            printStream.println(separarUsuarioPorComas(usuario));// formateas los valores del usuario y lo guardas en el fichero
            printStream.flush();//limpias todo lo guardado en memoria
            printStream.close();//cerras el archivo
        } catch (Exception e) {
            System.out.println("Error al escribir: " + e.getMessage());//te informa si hubo algun error.
        }
    }

    private String separarUsuarioPorComas(Usuario usuario) {//formatea el usuario
        return usuario.nombreUsuario + "," //separas todos los parametros por comas en una sola linea.
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
