
public class Bolsa<TIPO> { // Bolsa<Number>

  private final Object[] itens;

  public Bolsa(int tamanho) {
    itens = new Object[tamanho];
  }

  public void adiciona(TIPO s) {
    for (int i = 0; i < itens.length; i++) {
      if (itens[i] == null) {
        itens[i] = s;
        return;
      }
    }
  }

  public TIPO remove() {
    TIPO ret = null;
    for (int i = 0; i < itens.length; i++) {
      if (itens[i] != null) {
        ret = (TIPO) itens[i];
        itens[i] = null;
        break;
      }
    }
    return ret;
  }

  public static <T> Bolsa<T> de(T... itens) {
    Bolsa<T> b = new Bolsa<>(itens.length);
    for (T item : itens) b.adiciona(item);
    return b;
  }
}
