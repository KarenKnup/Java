class Main {
  public static void main(String[] args) {
    Servidor serv = new Servidor();
    serv.setSenha("123456");
    System.out.println(serv.recuperarSenha());

    Aluno al = new Aluno();
    al.setSenha("ttttttt");
    System.out.println(al.recuperarSenha());
  }
}