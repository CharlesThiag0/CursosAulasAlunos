package br.com.academia.aluno;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Aluno {
    private String name;
    private int idStudent;

    public Aluno(String name, int idStudent) {
        if (name == null){
            throw new NullPointerException("O nome não pode ser nulo");
        }
        this.name = name;
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void alterName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idStudent == aluno.idStudent && Objects.equals(name, aluno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idStudent);
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", idStudent = " + idStudent ;
    }
    
}
