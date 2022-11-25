public class Investimento extends Conta{
    protected double taxaRendimento;
    
    public void fazManutencao() {
        this.saldo += (this.saldo * this.taxaRendimento);
    }
    public void resumoExtrato() {
        System.out.println("Nome: " + this.nome + "\nSaldo: " + this.saldo +  "\nTaxa Rendimento: " + (this.taxaRendimento * 100)+"%");
    }
    public Investimento(int numero, String nome, double taxaRendimento) {
        this.numero = numero;
        this.nome = nome;
        this.taxaRendimento = taxaRendimento;
    }
}