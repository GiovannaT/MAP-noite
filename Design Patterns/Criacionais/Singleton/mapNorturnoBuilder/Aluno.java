package mapNorturnoBuilder;

public class Aluno {
	
	private String nome;
    private int idade;
    private String matricula;
    private String turno;
    private String turma;
    private String curso;
    private int periodo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTurno() {
        return turno;
    }

    public String getTurma() {
        return turma;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }
}
