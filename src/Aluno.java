public class Aluno {
    private String name;
    private int idStudent;

    public Aluno(String name, int idStudent) {
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
