import core.domain.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite seu nome: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Digite número da conta: ");
        conta.setNumero(scanner.nextLong());

        System.out.println("Digite sua Agência: ");
        conta.setAgencia(scanner.nextLong());

        System.out.println("Digite o seu saldo do conta: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá " + conta.getNomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é " +  conta.getAgencia() + " conta " + conta.getNumero()  + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
        scanner.close();

    }
}