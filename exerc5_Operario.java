package unidade_5;

public class exerc5_Operario extends exerc5_Empregado {
    
    double comissao;
    double valorProducao;
    
    public exerc5_Operario() {
    }

    public exerc5_Operario(String nome, long contribuinte, byte idade, int matricula, double salario, String setor, double comissao, double valorProducao) {
        super(nome, contribuinte, idade, matricula, salario, setor);
        this.comissao = comissao;
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (comissao * valorProducao);
    }

    @Override
    public String toString() {
        return "exerc5_Operario{" + 
                "nome=" + getNome() + 
                ", contribuinte=" + getContribuinte() + 
                ", idade=" + getIdade() + 
                ", matricula=" + getMatricula() + 
                ", salario=" + getSalario() + 
                ", setor=" + getSetor() + 
                ", comissao=" + comissao + 
                ", valorProducao=" + valorProducao + 
                ", salarioLiquido=" + calcularSalario() + 
                '}';
    }
}
