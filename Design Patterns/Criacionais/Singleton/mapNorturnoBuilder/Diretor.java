package mapNorturnoBuilder;

public class Diretor {
	private ConstrutorAluno construtorAluno;

    public Diretor(ConstrutorAluno construtorAluno) {
        this.construtorAluno = construtorAluno;
    }

    public Aluno construir() {
        construtorAluno.construirNome("Miguel Seliahel");
        construtorAluno.construirIdade(23);
        construtorAluno.construirMatricula("987456321");
        construtorAluno.construirTurno("Noturno");
        construtorAluno.construirTurma("308");
        construtorAluno.construirCurso("Ciencia da Computação");
        construtorAluno.construirPeriodo(5);
        return construtorAluno.getAluno();
    }

}
