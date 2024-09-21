package br.com.alura.screenmatchV2.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
