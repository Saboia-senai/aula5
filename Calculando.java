package aula5;

public class Calculando implements Calculos {
    private double numero1;
    private double numero2;
    
    public Calculando(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
   
    public double somar() {
        double resultado = numero1 + numero2;
        System.out.println("➕ " + numero1 + " + " + numero2 + " = " + resultado);
        return resultado;
    }
    
    
    public double sub() {
        double resultado = numero1 - numero2;
        System.out.println("➖ " + numero1 + " - " + numero2 + " = " + resultado);
        return resultado;
    }
    
    
    public double mult() {
        double resultado = numero1 * numero2;
        System.out.println("✖️ " + numero1 + " × " + numero2 + " = " + resultado);
        return resultado;
    }
    
   
    public int div() {
        if (numero2 == 0) {
            System.out.println("❌ ERRO: Divisão por zero!");
            return 0;
        }
        int resultado = (int) (numero1 / numero2);
        System.out.println("➗ " + numero1 + " ÷ " + numero2 + " = " + resultado);
        return resultado;
    }
    
   
    public int exp() {
        int resultado = (int) Math.pow(numero1, numero2);
        System.out.println("⚡ " + numero1 + " ^ " + numero2 + " = " + resultado);
        return resultado;
    }
}

