Polimorfismo Paramétrico
========================

Parâmetro de tipo.

Parâmetro de entrada:

```java
class StringUtil {
  static String metade(String str) { // parâmetro de entrada
    return str.substr(0, str.length() / 2);
  }

  public static void main(String[] args) {
    metade("233242"); // argumento
  }
}

class X {
  // sobrecarga
  static void metodo(int i) {}
  static void metodo(String s) {}
  static void metodo(String s1, String s2) {}
}

class Y {
  int teste() {}
}

class Z extends Y {
  @Override // sobrescrito
  int teste() {}
}

class Main {
  public static void main(String[] args) {
    X.metodo(3);
    X.metodo("3");
    Y y = new Z();
    y.teste();
  }
}
```

Em Java, C#, e TypeScript é chamado de Generics,
Em C++ é chamado de Templates.

Terceiro tipo de polimorfismo (assumir várias formas):

1. Ad-hoc: polimorfismo por sobrecarga, ex: métodos com o mesmo, mas com parâmetros diferentes.
2. Por subtipagem/sobrescrita, ex.: herança.
3. Paramétrico: pelo parâmetro de tipo.