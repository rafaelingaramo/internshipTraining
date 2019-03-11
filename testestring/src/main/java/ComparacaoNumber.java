public class ComparacaoNumber implements Comparacao {
    public static void main(String[] args) {
        if (new Integer(1).equals(new Integer(1))) {
            System.out.println("OS integers sao iguais");
        }

        if (new Integer(1).equals(1)) {
            System.out.println("Integer com primitivo");
        }

        if (new Integer(1) == new Integer(1)) {
            System.out.println("Comparacao com Igual igual");
        } else {
            System.out.println("Nao funcionou");
        }


        if (1 == 1) {
            System.out.println("Tipo primitivo eh igual");
        }
    }
}
