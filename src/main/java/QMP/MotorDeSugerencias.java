package QMP;

import java.util.List;
import java.util.Random;

public class MotorDeSugerencias {
  List<Prenda> prendasSuperiores;
  List<Prenda> prendasInferiores;
  List<Prenda> calzados;

  MotorDeSugerencias(List<Prenda> prendas) {
    this.prendasSuperiores = prendas.stream().filter(p -> p.categoria().equals(Categoria.PARTE_SUPERIOR)).toList();
    this.prendasInferiores = prendas.stream().filter(p -> p.categoria().equals(Categoria.PARTE_INFERIOR)).toList();
    this.calzados = prendas.stream().filter(p -> p.categoria().equals(Categoria.CALZADO)).toList();
  }

  Atuendo generarSugerencia() {
    return new Atuendo(
      getRandom(prendasSuperiores),
      getRandom(prendasInferiores),
      getRandom(calzados)
    );
  }

  public <T> T getRandom(List<T> list) {
    if (list == null || list.isEmpty()) {
      return null;
    }

    Random random = new Random();
    int randomIndex = random.nextInt(list.size());
    return list.get(randomIndex);
  }
}
