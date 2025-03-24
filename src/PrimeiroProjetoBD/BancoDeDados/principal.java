package PrimeiroProjetoBD.BancoDeDados;

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

            c1.alteraCliente();

        }else {
            System.out.println("ENCERRANDO...");
        }

        System.out.println("Desje excluir um cadastro? S ou N ");
        if (sc.next().equalsIgnoreCase("S")){
            System.out.println("Digite o ID do cliente que deseja excluir: ");
            c1.setIdCliente(sc.nextInt());
            c1.excluirCliente();

        }



        //categoriaaaaaaaaa
        Categoria cat1 = new Categoria();
        System.out.println("Informe o id da categoria: ");
        cat1.setIdCategoria(sc.nextInt());

        System.out.println("Informe a descrição da categoria: ");
        cat1.setDescricao(sc.next());

        cat1.inserirCategoria();

        System.out.println("""
                
                DESEJA ALTERAR A CATEGORIA???????????³???? S ou N
                
                """);
        if(sc.next().equalsIgnoreCase("S")){
            System.out.println("informe o nove Id: ");
            cat1.setIdCategoria(sc.nextInt());

            System.out.println("informe a nova desrição: ");
            cat1.setDescricao(sc.next());

            cat1.alterarCategoria();
        }else{
            System.out.println("encerando....");
        }

        System.out.println("Deseja Excluir alguma categoriaa? S ou N");
        if (sc.next().equalsIgnoreCase("s")){
            System.out.println("informe o id da categoria: ");
            cat1.setIdCategoria(sc.nextInt());
            cat1.excluirCategoria();
        }
    }
}
