package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionar("B");
            vetor.adicionar("G");
            vetor.adicionar("D");
            vetor.adicionar("E");
            vetor.adicionar("F");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(vetor.toString());

        vetor.remove(1);

        System.out.println(vetor.toString());

        vetor.remove(vetor.busca("B"));

        System.out.println(vetor.toString());
    }
}
