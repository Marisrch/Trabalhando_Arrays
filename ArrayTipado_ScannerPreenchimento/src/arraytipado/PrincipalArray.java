package arraytipado;

import java.util.Scanner;

public class PrincipalArray {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        //Informar o tamanho do vetor
        System.out.print("Escolha o tamanho do seu vetor: ");
        int vet = ler.nextInt();

        Pessoa listaPessoas[] = new Pessoa[vet];
        
        //Preencher com dados o vetor
        for (int i = 0; i < listaPessoas.length; i++) {

            ler.nextLine(); //Para consumir a tecla ENTER
            listaPessoas[i] = new Pessoa();

            System.out.printf("\n %d° Pessoa %n \n", i + 1);

            System.out.printf("Informe o nome da %d° pessoa: ", i + 1);
            listaPessoas[i].nome = ler.nextLine();

            System.out.printf("Infome o email da %d° pessoa: ", i + 1);
            listaPessoas[i].email = ler.nextLine();

            System.out.printf("Informe o telefone da %d° pessoa: ", i + 1);
            listaPessoas[i].telefone = ler.nextLine();

            System.out.printf("Informe a idade da %d° pessoa:", i + 1);
            listaPessoas[i].idade = ler.nextInt();
        }
        
        //Mostrar os dados informados
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\n Dados da %d° Pessoa \n", i + 1);
            System.out.println("\t" + listaPessoas[i].nome);
            System.out.println("\t" + listaPessoas[i].email);
            System.out.println("\t" + listaPessoas[i].telefone);
            System.out.println("\t" + listaPessoas[i].idade);
        }

    }
}
