import java.util.LinkedList;

public class ListaPronta {
    public static void main(String[] args) {
        LinkedList<String> alunos = new LinkedList<String>();

        alunos.add("Jose");
        alunos.add("Maria");
        alunos.add("Ana");
        alunos.add("Pedro");

        System.out.println("Tamanho da Lista: " + alunos.size());
        System.out.println("Conteudo da Lista: " + alunos);
        System.out.println("Inicio da Lista: " + alunos.getFirst());
        System.out.println("Fim da Lista: " + alunos.getLast());

    }
}
