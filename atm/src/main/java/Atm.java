/**
 * Explicar composição x herança
 * criar implementações de novos bancos que geram tarifas diferentes
 * criar validações que podem ser comuns para todos os bancos
 * como reaproveitar métodos
 * Testes unitarios
 * Exceptions
 *
 */
public interface Atm {
    void withdrawal(Double value) throws Exception;
    void deposit(Double value);
}
