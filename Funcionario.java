package aula5;

public abstract class Funcionario {
	
    protected long id;
    protected String nome;
    protected String departamento;
    protected int matricula;
    protected String endereco;
    protected double salarioCalculado;
    
    public Funcionario(long id, String nome, String departamento, int matricula, String endereco) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.matricula = matricula;
        this.endereco = endereco;
    }
    
    public abstract void calculaSalario();
    
    public void exibirDados() {
        System.out.println("DADOS DO FUNCIONÁRIO");
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$ " + String.format("%.2f", salarioCalculado));
    }
    
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

}
