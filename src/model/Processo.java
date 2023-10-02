package model;

public class Processo {
    public String nome;
    public int QtdRetornos;

    public Processo(String nome, int qtdRetornos) {
        this.nome = nome;
        this.QtdRetornos = qtdRetornos;
    }

    public Processo() {
        super();
    }

    @Override
    public String toString() {
        return "Processo -> {" +
                "nome = '" + nome + '\'' +
                ", QtdRetornos = " + QtdRetornos +
                '}';
    }
}
