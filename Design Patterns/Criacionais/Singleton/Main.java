package com.whosvictorm;

public class Main {
    public static void main(String[] args) {
        AlunoBuilder alunoBuilder = new AlunoBuilder();

        Director director = new Director(alunoBuilder);

        Aluno aluno = director.build();

        System.out.println(aluno);
    }
}