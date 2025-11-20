package unidade_5;

public class exerc5_Administrador extends exerc5_Empregado {
    
    double ajudaDeCusto;
    
    public exerc5_Administrador() {
    }

    public exerc5_Administrador(String nome, long contribuinte, byte idade, int matricula, double salario, String setor, double ajudaDeCusto) {
        super(nome, contribuinte, idade, matricula, salario, setor);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "exerc5_Administrador{" + 
                "nome=" + getNome() + 
                ", contribuinte=" + getContribuinte() + 
                ", idade=" + getIdade() + 
                ", matricula=" + getMatricula() + 
                ", salario=" + getSalario() + 
                ", setor=" + getSetor() + 
                ", ajudaDeCusto=" + ajudaDeCusto + 
                ", salarioLiquido=" + calcularSalario() + 
                '}';
    }
}

