package QMP;

public class AgregadoDePrenda implements PropuestaModificacion {
  Prenda prenda;
  Guardarropa guardarropa;
  EstadoPropuesta estado = EstadoPropuesta.PENDIENTE;

  public AgregadoDePrenda(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  public void aceptar() {
    this.guardarropa.agregarPrenda(this.prenda);
    this.estado = EstadoPropuesta.ACEPTADA;
  }

  public void deshacer() {
    // podria validar que este aceptada antes de deshacer pero confio en el adentro
    this.guardarropa.eliminarPrenda(this.prenda);
    this.estado = EstadoPropuesta.PENDIENTE;
  }

  public void rechazar() {
    this.estado = EstadoPropuesta.RECHAZADA;
  }
}
