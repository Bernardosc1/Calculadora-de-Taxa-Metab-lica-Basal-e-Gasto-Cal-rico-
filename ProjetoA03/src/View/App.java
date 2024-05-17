package View;

public class App {
    public static void main(String[] args) {
        GerenciadorTelas gerenciador = GerenciadorTelas.getInstance();

        // Criar instâncias das telas
        TelaHome telaHome = new TelaHome();
        telaHome.setVisible(true);
    }
}
