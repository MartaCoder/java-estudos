import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta!");
        int conta = sc.nextInt(); //Obter pela Scanner os valores digitados no terminal

        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine(); //Obter pela Scanner os valores digitados no terminal

        System.out.println("Por favor, digite o seu Nome!");
        String nome = sc.nextLine(); //Obter pela Scanner os valores digitados no terminal

        System.out.println("Por favor, digite seu Saldo!");
        double saldo = sc.nextDouble(); //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ conta + " e seu saldo " + saldo + " já está disponível para saque");

    sc.close();
    }
}
