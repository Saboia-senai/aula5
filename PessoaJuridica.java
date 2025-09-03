package aula5;

public class PessoaJuridica extends Funcionario {
    private double valorBruto;
    private double impostos;
    
    public PessoaJuridica(long id, String nome, String departamento, int matricula, String endereco,
                          double valorBruto, double impostos) {
        super(id, nome, departamento, matricula, endereco);
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        calculaSalario();
    }
    public void calculaSalario() {
        salarioCalculado = valorBruto - impostos;
        System.out.println("💰 Salário PJ calculado: R$ " + String.format("%.2f", salarioCalculado));
    }
}
