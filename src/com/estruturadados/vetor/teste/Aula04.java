package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionar("elemento 1");
            vetor.adicionar("elemento 2");
            vetor.adicionar("Elemento 3");

            System.out.println(vetor.getTamanho());
            System.out.println(vetor.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
