import java.util.List;
import java.util.ArrayList;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;
    private List<Mentorias> mentorias;
    private List<Dev> devs;
    
    // Construtor
    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    
    // Métodos para adicionar cursos, mentorias e devs
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }
    
    public void adicionarMentoria(Mentorias mentoria) {
        mentorias.add(mentoria);
    }
    
    public void adicionarDev(Dev dev) {
        devs.add(dev);
    }
    
     // Getters e Setters
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Mentorias> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentorias> mentorias) {
        this.mentorias = mentorias;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }
}
