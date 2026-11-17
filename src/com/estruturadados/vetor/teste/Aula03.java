package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        try {
            vetor.adicionar("elemento 1");
            vetor.adicionar("elemento 2");
            vetor.adicionar("Elemento 3");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
