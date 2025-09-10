package aula5;

public class ExemploFuncionario {
	
    public static void main(String[] args) {
        System.out.println("TESTANDO FUNCIONÁRIOS");
        
        Jornada funcJornada = new Jornada(1111, "Ana Silva", "TI", 1234123, "Rua 1, 124", 50.0, 8, 22);
        Horista funcHorista = new Horista(1112, "Carlos Santos", "Suporte", 9898324, "Av. 2, 099", 35.0, 200);
        PessoaJuridica funcPJ = new PessoaJuridica(1003, "Maria Oliveira", "Consultoria", 2024003, "Rua 3, 012", 12000.0, 1800.0);
        
        funcJornada.exibirDados();
        funcHorista.exibirDados();
        funcPJ.exibirDados();
    }
}
