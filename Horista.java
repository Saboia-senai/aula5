package aula5;

public class Horista extends Funcionario {
    private double valorHora;
    private int quantidadeHoras;
    
    public Horista(long id, String nome, String departamento, int matricula, String endereco,
                   double valorHora, int quantidadeHoras) {
        super(id, nome, departamento, matricula, endereco);
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
        calculaSalario();
    }
    
   
    public void calculaSalario() {
        salarioCalculado = valorHora * quantidadeHoras;
        System.out.println("💰 Salário HORISTA calculado: R$ " + String.format("%.2f", salarioCalculado));
    }
}