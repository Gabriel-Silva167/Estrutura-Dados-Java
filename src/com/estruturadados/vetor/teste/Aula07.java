package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionar("B");
            vetor.adicionar("C");
            vetor.adicionar("E");
            vetor.adicionar("F");
            vetor.adicionar("G");
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        System.out.println(vetor.toString());

        vetor.adicionar(0, "A");

        System.out.println(vetor.toString());

        vetor.adicionar(3, "D");

        System.out.println(vetor.toString());
    }
}
