package mapNorturnoBuilder;

public class ConstrutorAluno {
	private Aluno aluno = new Aluno();

    public void construirNome(String nome) {
        aluno.setNome(nome);
    }

    public void construirIdade(int idade) {
        aluno.setIdade(idade);
    }

    public void construirMatricula(String matricula) {
        aluno.setMatricula(matricula);
    }

    public void construirTurno(String turno) {
        aluno.setTurno(turno);
    }

    public void construirTurma(String turma) {
        aluno.setTurma(turma);
    }

    public void construirCurso(String curso) {
        aluno.setCurso(curso);
    }

    public void construirPeriodo(int periodo) {
        aluno.setPeriodo(periodo);
    }

    public Aluno getAluno() {
        return aluno;
    }
}
