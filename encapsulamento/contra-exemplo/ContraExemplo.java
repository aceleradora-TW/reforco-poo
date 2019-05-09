package encapsulamento.contraxemplo;

import java.util.Scanner;

public class ContraExemplo {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String nome = entrada.nextLine();
    int anoNascimento = entrada.nextInt();
    
    int idade = 2019 - anoNascimento;

    System.out.println(nome + " tem " + idade + " anos.");
  }
}
