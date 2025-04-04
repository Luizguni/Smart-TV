package org.example;

public class SmartTv {
    // Atributos
    boolean ligada = false;  // Indica se a TV está ligada ou desligada
    int canal = 11;  // Armazena o canal atual da TV
    int volume = 32; // Armazena o nível de volume da TV


    // Métodos para mudar para um canal específico
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    // Aumenta um canal específico
    public void trocarCanalMais() {
        canal++; // Incrementa o canal atual

    }

    // Diminui o canal em uma unidade
    public void trocarCanalMenos() {
        canal--;  // Decrementa o canal atual

    }

    //Aumentar o volume
    public void aumentarVolume() {
        volume++; // Incrementa o volume
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume + 1;
    }

    public void baixarVolume() {
        volume--; // Decrementa o volume
        System.out.println("Baixando o volume para: " + volume);
        //volume = volume +;
    }

    //Para ligar a TV
    public void ligar() {
        ligada = true;
    }

    //Desligar a TV
    public void desligar() {
        ligada = false;

    }
}
