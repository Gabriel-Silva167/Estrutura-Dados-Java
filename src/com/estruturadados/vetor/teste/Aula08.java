package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        try {
            vetor.adicionar("B");
            vetor.adicionar("C");
            vetor.adicionar("E");
            vetor.adicionar("F");
            vetor.adicionar("G");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(vetor.toString());
    }
}
