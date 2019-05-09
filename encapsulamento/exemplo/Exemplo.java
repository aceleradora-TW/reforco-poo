package encapsulamento.exemplo;

import java.util.Scanner;

public class Exemplo {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String nome = entrada.nextLine();
    int anoNascimento = entrada.nextInt();
    
    Pessoa pessoa = new Pessoa(nome, anoNascimento);
    int idade = pessoa.getIdade();

    System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
  }
}
