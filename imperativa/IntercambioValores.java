package imperativa;

public class IntercambioValores {
    public static void main(String[] args) {
        int numeroUno = 35;
        int numeroDos = 20;
        int aux;
        System.out.println("------Antes-----") ;
        System.out.println("numero 1: " + numeroUno);
        System.out.println("numero 2: " + numeroDos);

        aux = numeroDos;
        numeroDos = numeroUno;
        numeroUno = aux;
        System.out.println("Despues");
        System.out.println( "Numero 1: + " + numeroUno);
        System.out.println("Numero 2: + " + numeroDos);
    }
}
