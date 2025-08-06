import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Central de banco online");
        System.out.println("Digite o numero da sua conta: ");
        int numberAcc = scanner.nextInt();

        System.out.println("Digite a sua agencia: ");
        String agencyAcc = scanner.next();

        System.out.println("Digite seu primeiro nome: ");
        String firstName  = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String lastName  = scanner.next();

        float balanceAcc = 239.73F;
        System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque\n",firstName,lastName,agencyAcc,numberAcc,balanceAcc);
    }
}
