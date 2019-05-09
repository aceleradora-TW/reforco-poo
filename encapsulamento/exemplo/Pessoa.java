package encapsulamento.exemplo;

public class Pessoa {
  
  private String nome;
  private int anoNascimento;

  public Pessoa(String nome, int anoNascimento) {
    this.nome = nome;
    this.anoNascimento = anoNascimento;
  }

  public String getNome() {
    return this.nome;
  }

  public int getIdade() {
    return 2019 - this.anoNascimento;
  }
}
