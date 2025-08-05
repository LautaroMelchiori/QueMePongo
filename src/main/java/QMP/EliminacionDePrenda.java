package QMP;

public class EliminacionDePrenda implements PropuestaModificacion {
  Prenda prenda;
  Guardarropa guardarropa;
  EstadoPropuesta estado = EstadoPropuesta.PENDIENTE;

  public EliminacionDePrenda(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  public void aceptar() {
    this.guardarropa.eliminarPrenda(this.prenda);
    this.estado = EstadoPropuesta.ACEPTADA;
  }

  public void deshacer() {
    // podria validar que este aceptada antes de deshacer pero confio en el adentro
    this.guardarropa.agregarPrenda(this.prenda);
    this.estado = EstadoPropuesta.PENDIENTE;
  }

  public void rechazar() {
    this.estado = EstadoPropuesta.RECHAZADA;
  }
}
