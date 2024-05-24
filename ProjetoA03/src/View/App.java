package View;

import Model.Usuario;

public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        // Criar instâncias das telas
        TelaHome telaHome = new TelaHome(usuario);
        telaHome.setVisible(true);
        
    }
}
