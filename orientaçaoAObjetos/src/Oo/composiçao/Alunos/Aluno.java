package Oo.composiçao.Alunos;

import java.util.ArrayList;

public class Aluno {

	final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();
    
    Aluno(String nome){
    	this.nome = nome;
    }

	void adicionarCurso(Curso cursos) {
    	this.cursos.add(cursos);
    	cursos.alunos.add(this);
    }
    
    
    
}
