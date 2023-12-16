package br.com.academia.aluno;

import java.util.NoSuchElementException;

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
    public String toString() {
        return "name = '" + name + '\'' +
                ", idStudent = " + idStudent ;
    }

}
