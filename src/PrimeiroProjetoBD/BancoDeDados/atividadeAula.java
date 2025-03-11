package PrimeiroProjetoBD.BancoDeDados;

import java.util.Scanner;

public class atividadeAula {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        Cliente cli = new Cliente();
        
        //a
        System.out.println("DIGITE O CODIGO DO CLIENTE -> ");
        cli.setIdCliente(entrada.nextInt());
        System.out.println("DIGITE O NOME DO CLIENTE -> ");
        cli.setNome(entrada.next());
        System.out.println("DIGITE O EMAIL DO CLIENTE -> ");
        cli.setEmail(entrada.next());
        System.out.println("DIGITE O CPF -> ");
        cli.setCpf(entrada.next());
        System.out.println("NUMERO DO CLIENTE -> ");
        cli.setTelefone(entrada.next());

        cli.insereCliente();
        
        //b
        System.out.println("""
                
                ***Deseja alterar o cadastro de algum cliente? (S/N) ***  
                """);
        if(entrada.next().equalsIgnoreCase("S")){
            System.out.println("INFORME O ID DO CLIENTE QUE DESEJA ALTERAR: ");
            cli.setIdCliente(entrada.nextInt());
            System.out.println("INFORME O NOVO EMAIL: ");
            cli.setEmail(entrada.next());
            System.out.println("Informe o novo telefone: ");
            cli.setTelefone(entrada.next());

            cli.alteraCliente();
        }

        //c
        System.out.println("""
                
                ***Deseja Excluir o cadastro de algum cliente? (S/N) ***  
                """);
        if (entrada.next().equalsIgnoreCase("S")){
            System.out.println("Informe o ID do cliente que deseja excluir: ");
            cli.setIdCliente(entrada.nextInt());
            cli.excluirCliente();
        }
    }
}
