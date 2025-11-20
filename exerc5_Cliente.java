package unidade_5;

public class exerc5_Cliente extends exerc5_Pessoa {
    
    String email;
    String telefone;

    public exerc5_Cliente(String cliente_Y, int par, int par1, String clientegmailcom, String _987654321) {
    }

    public exerc5_Cliente(String nome, long contribuinte, byte idade, String email, String telefone) {
        super(nome, contribuinte, idade);
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "exerc5_Cliente{" + "nome=" + getNome() + ", contribuinte=" + getContribuinte() + ", idade=" + getIdade() +
                ", email=" + email + ", telefone=" + telefone + '}';
    }
}
