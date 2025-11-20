package unidade_5;

public class exerc5_Pessoa {
    
    String nome;
    long contribuinte;
    byte idade;
    
    public exerc5_Pessoa() {
    }

    public exerc5_Pessoa(String nome, long contribuinte, byte idade) {
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(long contribuinte) {
        this.contribuinte = contribuinte;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

}
