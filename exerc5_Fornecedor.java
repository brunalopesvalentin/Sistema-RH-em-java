package unidade_5;

public class exerc5_Fornecedor extends exerc5_Pessoa {
    
    double receita;
    double despesa;
    
    public exerc5_Fornecedor(String nome, long contribuinte, byte idade, double receita, double despesa) {
        super(nome, contribuinte, idade);
        this.receita = receita;
        this.despesa = despesa;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }

    public double obterSaldo() {
        return receita - despesa;
    }

    @Override
    public String toString() {
        return "exerc5_Fornecedor{" + "nome=" + getNome() + ", contribuinte=" + getContribuinte() + ", idade=" + getIdade() + 
                ", receita=" + receita + ", despesa=" + despesa + ", saldo=" + obterSaldo() + '}';
    }
}

