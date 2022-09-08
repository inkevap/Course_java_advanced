package Tarea6;

import java.util.ArrayList;

public interface UsuariosDB {
    ArrayList<Usuario> listarUsuarios();
    Usuario obtenerUsuario(Usuario usuario);
    void crearUsuario(Usuario usuario);
    void borrarUsuario(Usuario usuario);
}
