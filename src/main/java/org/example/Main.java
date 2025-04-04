package org.example;


public class Main {
    //Cria uma nova instância de SmartTv
    public static void main(String[] args) {

        // Exibe status inicial da TV
        SmartTv smartTv = new SmartTv();

        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.aumentarVolume();
        // Exibe o canal inicial da TV
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual : " + smartTv.canal);
        // Exibe o volume inicial da TV
        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal : " + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);

        // Liga a TV e exibe novo status
        smartTv.ligar();
        System.out.println("Novo status => Tv ligada ? " + smartTv.ligada);

        // Desliga a TV e exibe novo status
        smartTv.desligar();
        System.out.println("Novo status => Tv ligada ? " + smartTv.ligada);


    }
}