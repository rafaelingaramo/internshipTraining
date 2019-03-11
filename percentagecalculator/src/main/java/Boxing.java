public class Boxing {
    public int inteiro;
    public Integer inteiroClasse;

    public static void main(String[] args) {
        final Boxing boxing = new Boxing();
//        boxing.doMath(boxing.inteiro);
        boxing.doMath(boxing.inteiroClasse);
    }

    public void doMath(int a) {
        System.out.println(a);
    }

}
