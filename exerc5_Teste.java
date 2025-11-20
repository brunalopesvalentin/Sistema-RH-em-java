package unidade_5;

public class exerc5_Teste {

    public static void main(String[] args) {
        exerc5_Fornecedor fornecedor = new exerc5_Fornecedor("Faber-Castell", 1212L, (byte) 0, 57540.0, 900000.0);
        
        System.out.println("Informações do Fornecedor:");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Contribuinte: " + fornecedor.getContribuinte());
        System.out.println("Idade: " + fornecedor.getIdade());
        System.out.println("Receita: " + fornecedor.getReceita());
        System.out.println("Despesa: " + fornecedor.getDespesa());
        System.out.println("Saldo: " + fornecedor.obterSaldo() + "\n");
        
        exerc5_Cliente cliente = new exerc5_Cliente("Sara", 9876L, (byte) 25, "sara@gmail.com", "(61)999673854");
        
        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Contribuinte: " + cliente.getContribuinte());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone() + "\n");

        exerc5_Administrador administrador = new exerc5_Administrador("Lara", 4567L, (byte) 35, 1001, 8000.0, "Administrativo", 1500.0);
        
        System.out.println("Informações do Administrador:");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Contribuinte: " + administrador.getContribuinte());
        System.out.println("Idade: " + administrador.getIdade());
        System.out.println("Matrícula: " + administrador.getMatricula());
        System.out.println("Salário: " + administrador.getSalario());
        System.out.println("Setor: " + administrador.getSetor());
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario() + "\n");

        exerc5_Operario operario = new exerc5_Operario("Isabela", 7891L, (byte) 19, 2001, 2500.0, "Produção", 0.05, 5000.0);
        
        System.out.println("Informações do Operário:");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Contribuinte: " + operario.getContribuinte());
        System.out.println("Idade: " + operario.getIdade());
        System.out.println("Matrícula: " + operario.getMatricula());
        System.out.println("Salário: " + operario.getSalario());
        System.out.println("Setor: " + operario.getSetor());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Salário Líquido: " + operario.calcularSalario() + "\n");

        exerc5_Vendedor vendedor = new exerc5_Vendedor("Lavínia", 654987321L, (byte) 28, 3001, 3000.0, "Vendas", 0.1, 10000.0);
        
        System.out.println("Informações do Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Contribuinte: " + vendedor.getContribuinte());
        System.out.println("Idade: " + vendedor.getIdade());
        System.out.println("Matrícula: " + vendedor.getMatricula());
        System.out.println("Salário: " + vendedor.getSalario());
        System.out.println("Setor: " + vendedor.getSetor());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Valor Vendas: " + vendedor.getValorVendas());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}

