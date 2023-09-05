package com.whosvictorm;

public class Director {
    private AlunoBuilder alunoBuilder;

    public Director(AlunoBuilder alunoBuilder) {
        this.alunoBuilder = alunoBuilder;
    }

    public Aluno build(){
        alunoBuilder.buildId(1);
        alunoBuilder.buildName("Victor");
        alunoBuilder.buildEmail("victormagalhaespb@gmail.com");
        return alunoBuilder.getAluno();
    }
}
