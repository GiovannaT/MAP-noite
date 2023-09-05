package mapNorturnoBuilder;

public class Principal {
	public static void main(String[] args) {
        ConstrutorAluno construtorAluno = new ConstrutorAluno();
        Diretor diretor = new Diretor(construtorAluno);

        Aluno aluno = diretor.construir();

        System.out.println("Aluno construído com:\n");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Turno: " + aluno.getTurno());
        System.out.println("Turma: " + aluno.getTurma());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Período: " + aluno.getPeriodo());
    }
}
