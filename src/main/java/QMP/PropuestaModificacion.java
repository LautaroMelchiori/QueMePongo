package QMP;

public abstract class PropuestaModificacion {
  EstadoPropuesta estado;

  void aceptar() {
    this.estado = EstadoPropuesta.ACEPTADA;
    this.realizarAceptacion();
  };

  void deshacer() {
    this.estado = EstadoPropuesta.PENDIENTE;
    this.realizarDeshecho();
  }

  abstract void realizarAceptacion();
  abstract void realizarDeshecho();

  void rechazar() {
    this.estado = EstadoPropuesta.RECHAZADA;
  }
}