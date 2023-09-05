package com.whosvictorm;

public class AlunoBuilder {
    Aluno aluno = new Aluno();

    public void buildId(Integer id){
        aluno.setId(id);
    }
    public void buildName(String name){
        aluno.setName(name);
    }

    public void buildEmail(String email){
        aluno.setEmail(email);
    }

    public Aluno getAluno(){
        return aluno;
    }

}
