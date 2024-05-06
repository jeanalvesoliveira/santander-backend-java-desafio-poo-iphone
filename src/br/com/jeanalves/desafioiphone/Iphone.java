package br.com.jeanalves.desafioiphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    @Override
    public void ligar() {
        System.out.println("Ligando para alguém");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo uma página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausa a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Seleciona a música");
    }
}
