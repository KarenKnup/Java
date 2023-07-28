public class Pessoa {
  private String nome;
  private int mat;
  private String dt_ingresso;
  private String senha;

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setMatricula(int mat){
    this.mat = mat;
  }

  public int getMatricula(){
    return this.mat;
  }

  public void setData(String data){
    this.dt_ingresso = data;
  }

  public String getData(){
    return this.dt_ingresso;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

  public String getSenha(){
    return this.senha;
  }

  public String recuperarSenha(){
    return "Sua senha é: " + this.senha;
  }
}