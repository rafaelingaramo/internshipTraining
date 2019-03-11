import java.util.Objects;

public class ComparacaoObject implements Comparacao {
    public String cpf;

    ComparacaoObject(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComparacaoObject that = (ComparacaoObject) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cpf);
    }

    public static void main(String[] args) {
        ComparacaoObject c = new ComparacaoObject("1234");
        ComparacaoObject c2 = new ComparacaoObject("1234");

        if (c == c2) {
            System.out.println("Sao iguais");
        } else {
            System.out.println("Nao sao iguais");
        }

        if (c.equals(c2)) {
            System.out.println("Sao iguais usando equals");
        } else {
            System.out.println("Nao sao iguais usando equals");
        }
    }
}
