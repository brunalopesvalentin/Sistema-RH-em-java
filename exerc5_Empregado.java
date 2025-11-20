package unidade_5;

public class exerc5_Empregado extends exerc5_Pessoa {
    
    int matricula;
    double salario;
    String setor;
    
    public exerc5_Empregado() {
    }

    public exerc5_Empregado(String nome, long contribuinte, byte idade, int matricula, double salario, String setor) {
        super(nome, contribuinte, idade);
        this.matricula = matricula;
        this.salario = salario;
        this.setor = setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double calcularSalario() {
        return salario - salario * 0.11;
    }

    @Override
    public String toString() {
        return "exerc5_Empregado{" + "nome=" + getNome() + ", contribuinte=" + getContribuinte() + ", idade=" + getIdade() + 
                ", matricula=" + matricula + ", salario=" + salario + ", setor=" + setor + ", salarioLiquido=" + calcularSalario() + '}';
    }
}
