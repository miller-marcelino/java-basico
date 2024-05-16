// Classe principal para testar o projeto
public class Main {
    public static void main(String[] args) {
        // Criando um bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Java");
        
        // Criando cursos
        Curso cursoJava = new Curso("Java Fundamentals", 40);
        Curso cursoSpring = new Curso("Spring Boot", 60);
        
        // Adicionando cursos ao bootcamp
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoSpring);
        
        // Criando mentorias
        Mentorias mentoria1 = new Mentorias("Arquitetura de Software", "Segunda-feira 10:00", new Dev("Mentor 1", 30, "Arquiteto"));
        Mentorias mentoria2 = new Mentorias("Testes de Software", "Quarta-feira 15:00", new Dev("Mentor 2", 35, "Engenheiro de Software"));
        
        // Adicionando mentorias ao bootcamp
        bootcamp.adicionarMentoria(mentoria1);
        bootcamp.adicionarMentoria(mentoria2);
        
        // Criando devs
        Dev dev1 = new Dev("Alice", 25, "Desenvolvedora Java");
        Dev dev2 = new Dev("Bob", 28, "Desenvolvedor Full Stack");
        
        // Adicionando devs ao bootcamp
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);
        
        // Exibindo informações do bootcamp
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Cursos:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getNome() + " (" + curso.getCargaHoraria() + " horas)");
        }
        System.out.println("Mentorias:");
        for (Mentorias mentoria : bootcamp.getMentorias()) {
            System.out.println("- " + mentoria.getTema() + " - " + mentoria.getHorario() + " - Mentor: " + mentoria.getMentor().getNome());
        }
        System.out.println("Devs:");
        for (Dev dev : bootcamp.getDevs()) {
            System.out.println("- " + dev.getNome() + " - " + dev.getIdade() + " anos - " + dev.getEspecialidade());
        }
    }
}
