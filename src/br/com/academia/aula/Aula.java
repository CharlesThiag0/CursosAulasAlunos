package br.com.academia.aula;

public class Aula implements Comparable<Aula>{
    private String description;
    private int time;

    public Aula(String description, int time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "description='" + description + '\'' +
                ", time=" + time;
    }

    @Override
    public int compareTo(Aula o) {
        return this.description.compareTo(o.description);
    }

}
