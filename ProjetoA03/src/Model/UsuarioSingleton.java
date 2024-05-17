package Model;

public class UsuarioSingleton {
    private static UsuarioSingleton instance;
    private Usuario usuario;

    private UsuarioSingleton() {
        usuario = new Usuario();
    }

    public static UsuarioSingleton getInstance() {
        if (instance == null) {
            instance = new UsuarioSingleton();
        }
        return instance;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}