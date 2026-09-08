package br.com.fiap.streamfiap.exception;

/**
 * Lançada quando dados de cadastro não passam nas regras básicas de
 * validação do model (ex.: duração de um conteúdo menor ou igual a zero).
 */
public class DadosInvalidosException extends RuntimeException {

    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
