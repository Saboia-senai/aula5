package aula5;

public class ObjetoComputador {
public static void main(String[] args) {
        Computador pc1 = new Home();
        Computador pc2 = new Gamer();
        
        pc1.ligar();
        pc1.carregandoSistema();
        pc1.reiniciar();
        pc1.desligar();

        System.out.println("");

        pc2.ligar();
        pc2.carregandoSistema();
        pc2.reiniciar();
        pc2.desligar();
    }
}

