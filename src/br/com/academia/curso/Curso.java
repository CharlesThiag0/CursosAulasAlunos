package br.com.academia.curso;

import br.com.academia.aluno.Aluno;
import br.com.academia.aula.Aula;

import java.util.*;

public class Curso {
    private String name;
    private String instructor;
    private List<Aula> aulas;
    private Set<Aluno> alunos;
    private Map<Integer, Aluno> registrationStudent;

    public Curso(String name, String instructor) {
        this.name = name;
        this.instructor = instructor;
        this.aulas = new ArrayList<>();
        this.alunos = new HashSet<>();
        this.registrationStudent = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void registration(Aluno aluno) {
        this.alunos.add(aluno);
        this.registrationStudent.put(aluno.getIdStudent(), aluno);
    }

    public void addAula(Aula aula) {
        this.aulas.add(aula);
    }

    public boolean thisRegistration (Aluno aluno){
        return this.alunos.contains(aluno);
    }

    public Aluno searchRegistration(int numRegistration) {
        if(!registrationStudent.containsKey(numRegistration)) {
            throw new NoSuchElementException("Matricula não encontrada: " + numRegistration);
        }
        return this.registrationStudent.get(numRegistration);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", instructor='" + instructor + '\'';
    }

}
