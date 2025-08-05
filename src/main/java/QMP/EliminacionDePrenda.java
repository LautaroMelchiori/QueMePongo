package QMP;

public class EliminacionDePrenda extends PropuestaModificacion {
  Prenda prenda;
  Guardarropa guardarropa;
  EstadoPropuesta estado = EstadoPropuesta.PENDIENTE;

  public EliminacionDePrenda(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void realizarAceptacion() {
    this.guardarropa.eliminarPrenda(this.prenda);
  }

  @Override
  public void realizarDeshecho() {
    // podria validar que este aceptada antes de deshacer pero confio en el adentro
    this.guardarropa.agregarPrenda(this.prenda);
  }
}
