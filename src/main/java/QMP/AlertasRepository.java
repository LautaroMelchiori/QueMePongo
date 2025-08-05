package QMP;

import java.util.List;

public class AlertasRepository {
  ServicioMeteorologico servicioMeteorologico;
  List<AlertaMeteorologica> alertas;
  List<InteresadoEnAlerta> interesados;

  static AlertasRepository instance = new AlertasRepository(new ServicioMeteorologicoAccuWeather(new AccuWeatherAPI()));

  public void setServicioMeteorologico(ServicioMeteorologico servicio) {
    this.servicioMeteorologico = servicio;
  }

  public void actualizarAlertas(String ciudad) {
    this.alertas = this.servicioMeteorologico.getAlertas(ciudad);
    this.alertas.forEach(alerta -> {
      interesados.forEach(i -> i.publicarAlerta(alerta));
    });
  }

  private AlertasRepository(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }
}