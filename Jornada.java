package aula5;

public class Jornada extends Funcionario {
    private double salarioHora;
    private int horasTrabalhadasDiarias;
    private int diasTrabalhados;
    
    public Jornada(long id, String nome, String departamento, int matricula, String endereco,
                   double salarioHora, int horasTrabalhadasDiarias, int diasTrabalhados) {
        super(id, nome, departamento, matricula, endereco);
        this.salarioHora = salarioHora;
        this.horasTrabalhadasDiarias = horasTrabalhadasDiarias;
        this.diasTrabalhados = diasTrabalhados;
        calculaSalario();
    }
    
    @Override
    public void calculaSalario() {
        salarioCalculado = salarioHora * horasTrabalhadasDiarias * diasTrabalhados;
        System.out.println("💰 Salário JORNADA calculado: R$ " + String.format("%.2f", salarioCalculado));
    }
}



