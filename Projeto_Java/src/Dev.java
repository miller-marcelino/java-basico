// Classe Dev representa um desenvolvedor que participa do bootcamp
public class Dev {
    private String nome;
    private int idade;
    private String especialidade;
    
    // Construtor
    public Dev(String nome, int idade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
    }
    
   // Getters e Setters
   public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getEspecialidade() {
    return especialidade;
}

public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}
}
