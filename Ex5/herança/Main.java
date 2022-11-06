import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaEsp contaEsp;
        Investimento investimento;
        Scanner scanner = new Scanner(System.in);
        String nome;
        int numero;
        double deposito, saque, limite, taxaManutencao, taxaRendimento;

        System.out.println("Entrando no sistema do banco...");
        System.out.printf("Digite seu nome: ");
        nome = scanner.next();
        conta.setNome(nome);
        System.out.printf("Digite o numero: ");
        numero = scanner.nextInt();
        conta.setNumero(numero);
        System.out.printf("Digite um valor para deposito: ");
        do {
            deposito = scanner.nextDouble();
            if (deposito <= 0) System.out.println("valor invalido!\ndigite um valor valido:"); 
        } while (deposito <= 0);
        conta.depositar(deposito);
        System.out.println(conta.saldo);
        System.out.printf("Digite uma quantidade para saque: ");
        do {
            saque = scanner.nextDouble();
            if(!conta.sacar(saque)) 
                System.out.println("Saque invalido, tente um valor válido");
        } while(!conta.sacar(saque));
        conta.saldo -= saque;
        conta.resumoExtrato();
        System.out.println(" ");
        // conta especial 
        System.out.println("Digite um valor para seu limite:");
        do {
            limite = scanner.nextDouble();
            if(limite <= 0) 
                System.out.println("Limite invalido, tente um valor válido");
        } while(limite <= 0);
        System.out.println("Digite um valor para sua taxa de manutencao:");
        do {
            taxaManutencao = scanner.nextDouble();
            if(taxaManutencao > (conta.saldo + limite) || taxaManutencao <= 0) 
                System.out.println("taxaManutencao invalido, tente um valor válido");
        } while(taxaManutencao > (conta.saldo + limite) || taxaManutencao <= 0);
        contaEsp = new ContaEsp(numero, nome, limite, taxaManutencao);
        setValuesContaEsp(contaEsp, conta);
        System.out.printf("Digite uma quantidade para saque + o seu limite: ");
        do {
            saque = scanner.nextDouble();
            if(!contaEsp.sacar(saque)) 
                System.out.println("Saque invalido, tente um valor válido");
        } while(!contaEsp.sacar(saque));
        contaEsp.saldo -= saque;
        System.out.println("Extrato acontaEsptes da manutencao.");
        contaEsp.resumoExtrato();
        System.out.println("Fazendo a manutencao...");
        contaEsp.fazManutencao();
        contaEsp.resumoExtrato();
        // Investimento
        System.out.println("Digite um valor para sua taxa de rendimento: ");
        do {
            taxaRendimento = scanner.nextDouble();
            if(taxaRendimento <= 0) 
                System.out.println("taxa de Rendimento invalida, tente um valor válido");
        } while(taxaRendimento <= 0);
        investimento = new Investimento(numero, nome, taxaRendimento);
        setValuesInvestiment(investimento,  conta);
        System.out.println("Valores antes da manutencao");
        investimento.resumoExtrato();
        System.out.println("Valores após a manutencao");
        investimento.fazManutencao();
        investimento.resumoExtrato();
    }

    /**
     * passa os valores do objeto pai para os valores do
     * obj filho.
     * @param objeto é o obj com os valores da conta 
     */
    public static void setValuesContaEsp(ContaEsp contaEsp, Conta objeto) {
        contaEsp.saldo = objeto.saldo + contaEsp.limite ;
        contaEsp.nome = objeto.nome;
        contaEsp.numero = objeto.numero;
        return;
    }

    public static void setValuesInvestiment(Investimento investimento, Conta objeto) {
        investimento.saldo = objeto.saldo;
        return;
    }

}