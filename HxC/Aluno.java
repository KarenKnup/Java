public class Aluno extends Pessoa {
  private boolean bolsista;
  private int tipo_ingresso;
  private float CR;

  /* public Aluno (boolean bolsista, int tipo, float CR){//construtor --- define os valores iniciais 
    this.bolsista = bolsista;
    this.tipo_ingresso = tipo;
    this.CR = CR;
  } --> deve botar os valores em new Aluno(bool,int,float) */

  public boolean getBolsista(){
    return this.bolsista;
  }

  public void setBolsista(boolean bolsista){
    this.bolsista = bolsista;
  }

  public int getTipoIngresso(){
    return this.tipo_ingresso;
  }

  public void setTipoIngresso(int tipo){
    this.tipo_ingresso = tipo;
  }

  public float getCR (){
    return this.CR;
  }

  public void setCR(float cr){
    this.CR = cr;
  }
  
  public String recuperarSenha(){
    return "Sua senha de Aluno é: " + getSenha();
  }
}