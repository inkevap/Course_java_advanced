package Tarea6;

import java.util.ArrayList;

public class UsuariosDBMemoria implements UsuariosDB {
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario obtenerUsuario(Usuario usuario) {
        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario.toLowerCase())) {
                return usuario;
            }
        }

        return null;
    }

    public void crearUsuario(Usuario usuario) {
        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario.toLowerCase())) {
                return;
            }
        }

        usuarios.add(usuario);
    }

    public void borrarUsuario(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuarioActual = usuarios.get(i);
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario.toLowerCase())) {
                usuarios.remove(i);
            }
        }
    }
}
