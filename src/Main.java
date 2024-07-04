import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descricao curso Js");
        curso2. setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria carreira");
        mentoria1.setDescricao("descricao mentoria carreira");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Joao");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao" + dev1.getConteudosInscritos() + "\n");
        dev1.progedir();
        dev1.progedir();
        System.out.println("Conteúdos concluídos Joao" + dev1.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Joao" + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("----------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Maria" + dev2.getConteudosInscritos() + "\n");
        dev2.progedir();
        System.out.println("Conteúdos concluídos Maria" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}