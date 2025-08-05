package QMP;

public enum AlertaMeteorologica {
  GRANIZO("Evita salir en auto!", "Hay alerta de granizo"),
  TORMENTA("Llevate un paraguas!", "Hay alerta de tormenta"),
  ALERTA_DESCONOCIDA("Hay una alerta meteorologica desconocida!", "Hay una alerta desconocida");

  final String textoAlNotificar;
  final String textoMail;
  AlertaMeteorologica(String textoNotificacion, String textoMail) {
    this.textoAlNotificar = textoNotificacion;
    this.textoMail = textoMail;
  }
}
