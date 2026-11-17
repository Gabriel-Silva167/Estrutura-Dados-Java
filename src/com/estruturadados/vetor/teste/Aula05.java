package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionar("elemento 1");
            vetor.adicionar("elemento 2");
            vetor.adicionar("Elemento 3");

            System.out.println(vetor.busca(2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
