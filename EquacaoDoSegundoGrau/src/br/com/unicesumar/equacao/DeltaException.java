package br.com.unicesumar.equacao;

public class DeltaException extends Exception{

	public DeltaException(String message) {
        super(message);
    }

    public DeltaException() {
        super("O valor de delta é < 0, não admite solução real!!!");
    }
}