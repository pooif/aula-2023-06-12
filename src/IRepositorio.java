

public interface IRepositorio<T extends Entidade<K>, K> {

  void guardar(T o);

  T obter(K chave);
  
}



