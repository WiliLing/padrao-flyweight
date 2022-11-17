package org.flyweight;


public class Jogador {

    private String nome;
    private String classe;
    private LocalJogador localJogador;

    public Jogador(String nome, String classe, LocalJogador localJogador) {
        this.nome = nome;
        this.classe = classe;
        this.localJogador = localJogador;
    }

    public String getJogador() {
        return "Jogador{ " +
                "nome = " + this.nome +
                ", classe = " + this.classe  +
                ", latitude = " + localJogador.getLatitude() +
                ", longitude = " + localJogador.getLongitue() +
                "}\n";
    }
}
