import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

class App {
  public static void main(String[] args) {
    List nomes = new ArrayList();

    Optional<String> n = Optional.of("fsdfs");
    
    nomes.add("Josue");
    nomes.add("Fernando");
    nomes.add("Flavia");
    nomes.add("Nicolas");
    nomes.add(true);
    nomes.add(2321);
    nomes.add(new Date());
    nomes.add(new ArrayList<>());

    System.out.println(nomes);

    // inferência de tipo não é tipagem dinâmica
    var q = "Josué";
    // q = 23123;

    List<Integer> idades = new ArrayList<>();
    idades.add(12);

    // Bolsa (Bag) -> Estrutura de Dados
    // ADT: Abstract Data Type - tipo de dado abstrato

    Bolsa<String> b1 = new Bolsa<>(3);
    b1.adiciona("Nicolas");
    b1.adiciona("Fernando");
    b1.adiciona("Ana Flavia");
    b1.adiciona("Josue");

    System.out.println(b1.remove());

    String o = b1.remove();

    Bolsa<Integer> b2 = new Bolsa(2);
    b2.adiciona(1231);
    b2.adiciona(1231343);
    // b2.adiciona(1231343.3);
    b2.adiciona(123);
    // b2.adiciona("dsfsa");

    Bolsa b3 = new Bolsa(5);
    b3.adiciona(new Bolsa(3));

    Bolsa<Bolsa<Bolsa<Double>>> bolsaDeBolsas = new Bolsa<>(3);

    Bolsa<Integer> inteiros = Bolsa.de(320, 23984, 234);

    // Padrão Repositório (guarda entidade, tem identidade)

    IRepositorio<Aluno, Integer> repo = new RepoAluno();

    Aluno a1 = new Aluno();
    a1.setMatricula(123);
    a1.setNome("Nicolas");

    repo.guardar(a1);

    System.out.println(repo.obter(123).getNome()); // Nicolas

  }
}