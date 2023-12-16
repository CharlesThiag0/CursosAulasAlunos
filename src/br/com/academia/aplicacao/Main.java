package br.com.academia.aplicacao;

import br.com.academia.aluno.Aluno;
import br.com.academia.aula.Aula;
import br.com.academia.curso.Curso;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Testa Collection","Paulo Silveira");
        curso.addAula(new Aula("Trabalhando com Arrays", 21));
        curso.addAula(new Aula("Criando uma Aula",20));
        curso.addAula(new Aula("Modelando coleções", 22));
        curso.addAula(new Aula("Array Linked",15));

        Aluno aluno1 =new Aluno("Charles",1111);
        Aluno aluno2 = new Aluno("Thiago",1212);
        Aluno aluno3 = new Aluno("Santos",1313);

        curso.registration(aluno1);
        curso.registration(aluno2);
        curso.registration(aluno3);

        System.out.println("Alunos matriculados: ");
        curso.getAlunos().forEach(aluno -> System.out.println(aluno));

        System.out.println("Esta matriculado? " + curso.thisRegistration(aluno1));

        Aluno charles = new Aluno("Charles",1111);
        System.out.println("Esta matriculado Charles: " + curso.thisRegistration(charles));
        System.out.println(charles.equals(aluno1));

        System.out.println("Aulas em ordem alfabetica");
        curso.classRoomAlphabetic();

        System.out.println("Aulas em ordem numerica");
        curso.classRoomNum();

    }
}
