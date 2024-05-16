
public class Mentorias {
    private String tema;
    private String horario;
    private Dev mentor;
    
    // Construtor
    public Mentorias(String tema, String horario, Dev mentor) {
        this.tema = tema;
        this.horario = horario;
        this.mentor = mentor;
    }
    
    // Getters e Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Dev getMentor() {
        return mentor;
    }

    public void setMentor(Dev mentor) {
        this.mentor = mentor;
    }
}
