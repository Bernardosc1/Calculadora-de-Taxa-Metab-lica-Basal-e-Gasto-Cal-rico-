package View;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

public class GerenciadorTelas {
    private static GerenciadorTelas instance;
    private Map<String, JFrame> telas;

    private GerenciadorTelas() {
        telas = new HashMap<>();
    }

    public static GerenciadorTelas getInstance() {
        if (instance == null) {
            instance = new GerenciadorTelas();
        }
        return instance;
    }

    public void adicionarTela(String nome, JFrame tela) {
        telas.put(nome, tela);
    }

    public JFrame obterTela(String nome) {
        return telas.get(nome);
    }

    public void mostrarTela(String nome) {
        JFrame tela = telas.get(nome);
        if (tela != null) {
            tela.setVisible(true);
        }
    }

    public void esconderTela(String nome) {
        JFrame tela = telas.get(nome);
        if (tela != null) {
            tela.setVisible(false);
        }
    }

    // Outros métodos conforme necessário, como remover tela, trocar tela, etc.
}