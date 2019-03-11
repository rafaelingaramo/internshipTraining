public class TesteString {
    public static void main(String[] args) {
        new TesteString().removeDuplicadasSemRepeticao("AABBCCAA");
    }

    public String removeDuplicadasSemRepeticao(String p) {
        final char[] chars = p.toCharArray();
        StringBuilder resultado = new StringBuilder();

        for(char c: chars) {
            if (!resultado.toString().contains(Character.valueOf(c).toString())) {
                resultado.append(c);
            }
        }

        System.out.println(resultado);

        return resultado.toString();
    }
}


