package unidade_5;

public class exerc5_Vendedor extends exerc5_Empregado {
    
    double comissao;
    double valorVendas;
    
    public exerc5_Vendedor() {
    }

    public exerc5_Vendedor(String nome, long contribuinte, byte idade, int matricula, double salario, String setor, double comissao, double valorVendas) {
        super(nome, contribuinte, idade, matricula, salario, setor);
        this.comissao = comissao;
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (comissao * valorVendas);
    }

    @Override
    public String toString() {
        return "exerc5_Vendedor{" + 
                "nome=" + getNome() + 
                ", contribuinte=" + getContribuinte() + 
                ", idade=" + getIdade() + 
                ", matricula=" + getMatricula() + 
                ", salario=" + getSalario() + 
                ", setor=" + getSetor() + 
                ", comissao=" + comissao + 
                ", valorVendas=" + valorVendas + 
                ", salarioLiquido=" + calcularSalario() + 
                '}';
    }
}
