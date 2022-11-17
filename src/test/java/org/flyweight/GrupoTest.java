package org.flyweight;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    public void deveRetornarGrupo() {
        Grupo grupo = new Grupo();
        grupo.createJogador("uiu", "Mago", "2453200", "127580616");
        grupo.createJogador("rodrigo", "Bardo", "2453250", "127580620");
        grupo.createJogador("Lucas", "Guerreiro", "2453299", "127580640");

        List<String> jogadores = Arrays.asList(
                "Jogador{ nome = uiu, classe = Mago, latitude = 2453200, longitude = 127580616}\n",
                "Jogador{ nome = rodrigo, classe = Bardo, latitude = 2453250, longitude = 127580620}\n",
                "Jogador{ nome = Lucas, classe = Guerreiro, latitude = 2453299, longitude = 127580640}\n");

        assertEquals(jogadores, grupo.getGrupo());
    }
}