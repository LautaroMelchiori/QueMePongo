package QMP;

public class AgregadoDePrenda extends PropuestaModificacion {
  Prenda prenda;
  Guardarropa guardarropa;
  EstadoPropuesta estado = EstadoPropuesta.PENDIENTE;

  public AgregadoDePrenda(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void realizarAceptacion() {
    this.guardarropa.agregarPrenda(this.prenda);
  }

  @Override
  public void realizarDeshecho() {
    // podria validar que este aceptada antes de deshacer pero confio en el adentro
    this.guardarropa.eliminarPrenda(this.prenda);
  }
}
