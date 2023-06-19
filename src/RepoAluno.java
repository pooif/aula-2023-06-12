import java.util.HashMap;
import java.util.Map;

public class RepoAluno 
  implements IRepositorio<Aluno, Integer> {

  private Map<Integer, Aluno> mapa = new HashMap<>();

  @Override
  public void guardar(Aluno o) {
    mapa.put(o.getIdentidade(), o);
  }

  @Override
  public Aluno obter(Integer chave) {
    return mapa.get(chave);
  }

}