import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O CODIGO DO CLIENTE -> ");
        c1.setIdCliente(sc.nextInt());

        System.out.println("DIGITE O NOME DO CLIENTE -> ");
        c1.setNome(sc.next());

        System.out.println("DIGITE O EMAIL DO CLIENTE -> ");
        c1.setEmail(sc.next());

        System.out.println("DIGITE O CPF -> ");
        c1.setCpf(sc.next());

        System.out.println("NUMERO DO CLIENTE -> ");
        c1.setTelefone(sc.next());

        c1.insereCliente();




        System.out.println("""
                
                Deseja alterar um cadastro? S ou N """);
        if(sc.next().equalsIgnoreCase("S")){
            System.out.println("INFORME O ID DO CLIENTE DQUE DESEJA ALTERAR: ");
            c1.setIdCliente(sc.nextInt());
            System.out.println("INFORME O NOVO EMAIL: ");
            c1.setEmail(sc.next());
            System.out.println("Informe o novo telefone: ");
            c1.setTelefone(sc.next());

            //faltar fazer -> c1.alterarCliente();
        }else {
            System.out.println("ENCERRANDO...");
        }

    }
}
