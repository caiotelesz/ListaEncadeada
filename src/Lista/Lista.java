package Lista;

public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();

//        System.out.println("Tamanho da Lista: " + lista.getTamanho());
//
//        lista.adicionar("Claudio");
//
//        System.out.println(lista);
//        System.out.println("Tamanho da Lista: " + lista.getTamanho());
//        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
//        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
//
//        lista.adicionar("Camila");
//
//        System.out.println(lista);
//        System.out.println("Tamanho da Lista: " + lista.getTamanho());
//        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
//        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        lista.adicionar("Claudio");
        lista.adicionar("Camila");
        lista.adicionar("Miguel");
        lista.adicionar("Elis");

        System.out.println(lista);
        System.out.println("Tamanho da Lista: " + lista.getTamanho());
        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

//        System.out.println("Elemento na posição 2 = " + lista.get(2).getElemento());

        lista.remover("Camila");

        System.out.println(lista);
        System.out.println("Tamanho da Lista: " + lista.getTamanho());
        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

    }
}