package com.cesu.apiFesta.exceptions;

public class PessoaApiEmptyException extends RuntimeException{
    public PessoaApiEmptyException(){super("Lista de Convidados vazia!");}
}
