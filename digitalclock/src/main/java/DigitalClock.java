import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Esse exemplo Utiliza o recurso de Threads para exibir no Console a hora atual do PC

    @tags formatacao data hora, thread, console, orientação a objetos

    Explicar em Slides como funciona uma Thread, e seus métodos,
    formatação de data/hora

    Explicar como threads são independentes da thread principal, aquela que à invocou
    Explicar por que usar o Runnable ao invés do Thread, a vantagem de Composição versus Herança
    Explicar as Otimizações da JVM ao utilizar variaveis do tipo final
    Explicar diferença entre Thread.start e Thread.run
    Explicar por que operações de IO lançam excessões, a diferença entre try/catch e throws
    Melhorar o exemplo e separar métodos para melhor entendimento
 */
public class DigitalClock {
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("hh:MM:ss");
    private static final Integer UM_SEGUNDO = 1000;

    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println(FORMATTER.format(new Date()));

            try {
                Thread.sleep(UM_SEGUNDO);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
