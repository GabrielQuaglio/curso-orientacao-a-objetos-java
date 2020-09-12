package Oo.composiçao.Alunos;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("joao");
		
		Aluno aluno2 = new Aluno("Argeri");
		
		Aluno aluno3 = new Aluno("Maria");
		
		
		Curso curso1 = new Curso("Java completo");
		
		Curso curso2 = new Curso("Web completo");
		
		Curso curso3 = new Curso("React native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso "+ curso1.nome);
			System.out.println("... E meu nome é " + aluno.nome);
		}
		
		System.out.println(curso1.alunos.get(0).nome);
		
		String o = aluno1.cursos.get(1).nome;
	     System.out.println(o);
		
		
		
	}
}
