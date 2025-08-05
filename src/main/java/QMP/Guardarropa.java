package QMP;

import java.util.List;

public class Guardarropa {
  List<Prenda> prendas;
  List<PropuestaModificacion> propuestas;

  List<PropuestaModificacion> getPropuestas() {
    return propuestas;
  }

  void agregarPropuesta(PropuestaModificacion propuesta) {
    this.propuestas.add(propuesta);
  }

  void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  void eliminarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  List<Prenda> getPrendas() {
    return prendas;
  }
}
