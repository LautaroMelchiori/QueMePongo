package QMP;

import static java.util.stream.Collectors.toList;

import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class MotorDeSugerencias {
  abstract boolean esPrendaValidaPara(Usuario unUsuario, Prenda prenda);

  List<Atuendo> generarSugerenciasPara(Usuario unUsuario) {
    Map<Categoria, List<Prenda>> prendas = this.armarMapaDePrendasPorCategoria(unUsuario);

    return Lists
        .cartesianProduct(prendas.get(Categoria.PARTE_SUPERIOR),
            prendas.get(Categoria.PARTE_INFERIOR),
            prendas.get(Categoria.CALZADO))
        .stream()
        .map((list) -> new Atuendo(list.getFirst(), list.get(1), list.get(2)))
        .collect(toList());
  }

  Atuendo generarUnaSugerenciaPara(Usuario unUsuario) {
    Map<Categoria, List<Prenda>> prendas = this.armarMapaDePrendasPorCategoria(unUsuario);

    return new Atuendo(
        this.getRandomPrenda(prendas.get(Categoria.PARTE_SUPERIOR)),
        this.getRandomPrenda(prendas.get(Categoria.PARTE_INFERIOR)),
        this.getRandomPrenda(prendas.get(Categoria.CALZADO))
    );
  }

  Map<Categoria, List<Prenda>> armarMapaDePrendasPorCategoria(Usuario usuario) {
    Map<Categoria, List<Prenda>> prendas = new HashMap<>();

    List<Prenda> prendasSuperiores = this.prendasValidasPorCategoria(usuario, Categoria.PARTE_SUPERIOR);
    List<Prenda> prendasInferiores = this.prendasValidasPorCategoria(usuario, Categoria.PARTE_INFERIOR);;
    List<Prenda> calzados = this.prendasValidasPorCategoria(usuario, Categoria.CALZADO);;

    prendas.put(Categoria.PARTE_SUPERIOR, prendasSuperiores);
    prendas.put(Categoria.PARTE_INFERIOR, prendasInferiores);
    prendas.put(Categoria.CALZADO, calzados);

    return prendas;
  }

  public List<Prenda> prendasValidasPorCategoria(Usuario unUsuario, Categoria unaCategoria) {
    return unUsuario.getPrendas()
        .stream()
        .filter(p -> p.categoria().equals(unaCategoria) && esPrendaValidaPara(unUsuario, p))
        .toList();
  }

  public Prenda getRandomPrenda(List<Prenda> list) {
    if (list == null || list.isEmpty()) {
      return null;
    }

    Random random = new Random();
    int randomIndex = random.nextInt(list.size());
    return list.get(randomIndex);
  }
}
