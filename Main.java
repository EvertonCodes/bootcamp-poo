import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Aprendendo POO com Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Dicas e boas práticas");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();

        System.out.println(dev1);
        System.out.println("Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("Inscritos: " + dev1.getConteudosInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();

        System.out.println(dev2);
        System.out.println("Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("Inscritos: " + dev2.getConteudosInscritos());
    }
}