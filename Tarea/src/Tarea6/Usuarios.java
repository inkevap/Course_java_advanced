package Tarea6;

import java.util.ArrayList;

public class Usuarios implements UsuariosEstadisticas {
    private int inserciones = 0;
    private int eliminaciones = 0;
    @Override
    public int obtenerInseciones() {
        return inserciones;
    }

    @Override
    public int obtenerEliminaciones() {
        return eliminaciones;
    }

    UsuariosDB  usuariosDB;
    private  Usuarios(){}
    Usuarios(UsuariosDB usuariosDB){this.usuariosDB = usuariosDB;}

    public ArrayList<Usuario> listar(){
        return usuariosDB.listarUsuarios();
    }
    public Usuario buscar(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        return usuariosDB.obtenerUsuario(usuario);
    }
    public void insertar(Usuario usuario){
        if(buscar(usuario.nombreUsuario) != null){
            return;
        }
        usuariosDB.crearUsuario(usuario);
        inserciones++;
    }
    public void borrar(Usuario usuario){
        usuariosDB.borrarUsuario(usuario);
        eliminaciones++;
    }
}
