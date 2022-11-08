package br.inatel.SimuVoto.Exceptions;

public class VotoInvalidoException extends RuntimeException{
        public VotoInvalidoException(String erro){
            super(erro);
        }
}
