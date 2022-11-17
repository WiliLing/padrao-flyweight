package org.flyweight;
import java.util.HashMap;
import java.util.Map;

public class JogadorFactory {
    private static Map<String, LocalJogador> jogadores = new HashMap<>();

    public static LocalJogador getJogador(String nome, String latitude, String longitude) {
        LocalJogador localJogador = jogadores.get(nome);
        if(localJogador == null) {
            localJogador = new LocalJogador(latitude, longitude);
            jogadores.put(nome, localJogador);
        }
        return localJogador;
    }

    public static int getNumJogadores() {
        return jogadores.size();
    }
}
