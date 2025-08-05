package QMP;

import java.util.List;

public class NotificadorDeAlertas implements InteresadoEnAlerta {
  List<Usuario> suscriptoresAlNotificador;
  NotificationService notificador;

  public NotificadorDeAlertas(NotificationService notificador) {
    this.notificador = notificador;
  }

  @Override
  public void publicarAlerta(AlertaMeteorologica alerta) {
    suscriptoresAlNotificador.forEach(sub -> notificador.notify(sub, alerta.textoAlNotificar));
  }
}
