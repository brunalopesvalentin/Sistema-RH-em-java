package unidade_5;

public class exerc1_testeSoma {
    public static void main(String[] args) {
        
    exerc1_Soma soma = new exerc1_Soma(); // cria instância da classe Soma
// Declara várias variáveis
    byte b = 20; //int
    short s = 99; // int
    int i = 1000; //int
    long l = 1234L; // int
    float f = 3.1416f; //double
    double d = 2000; //double
    
// Chama vários métodos da classe Soma
    System.out.println(soma.doisValores(b,s)); //public int doisValores(int a,int b) { // soma dois inteiros
    System.out.println(soma.doisValores(i,s)); //public int doisValores(int a,int b) { // soma dois inteiros
    System.out.println(soma.doisValores(i,i)); //public int doisValores(int a,int b) { // soma dois inteiros
    System.out.println(soma.doisValores(l,b)); //public int doisValores(int a,int b) { // soma dois inteiros
    System.out.println(soma.doisValores(f,s)); //public double doisValores(double a,int b) { // soma um double e um inteiro
    System.out.println(soma.doisValores(d,b)); //public double doisValores(double a,int b) { // soma um double e um inteiro
    System.out.println(soma.doisValores(b,d)); //public double doisValores(double a,int b) { // soma um double e um inteiro
    System.out.println(soma.doisValores(i,l)); //public int doisValores(int a,int b) { // soma dois inteiros
    System.out.println(soma.doisValores(l,l)); //public int doisValores(int a,int b) { // soma dois inteiros
    System.out.println(soma.doisValores(d,f)); //public double doisValores(double a,double b) { // soma dois doubles
}
}

