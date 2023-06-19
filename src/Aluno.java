public class Aluno implements Entidade<Integer> {

  private Integer matricula;
  private String nome;

  public Integer getMatricula() {
    return matricula;
  }
  public void setMatricula(Integer matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public Integer getIdentidade() {
    return getMatricula();
  }
  
}
