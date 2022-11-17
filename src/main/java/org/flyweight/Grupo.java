package org.flyweight;

import org.flyweight.Jogador;
import org.flyweight.JogadorFactory;
import org.flyweight.LocalJogador;

import java.util.ArrayList;
import java.util.List;

public class Grupo {


    private List<Jogador> jogadores = new ArrayList<>();

    public void createJogador(String nome, String classe, String latitude, String longitude) {
        LocalJogador localJogador = JogadorFactory.getJogador(nome, latitude, longitude);
        Jogador jogador = new Jogador(nome, classe, localJogador);
        jogadores.add(jogador);
    }

    public List<String> getGrupo() {
        List<String> grupo = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            grupo.add(jogador.getJogador());
        }
        return grupo;
    }
}