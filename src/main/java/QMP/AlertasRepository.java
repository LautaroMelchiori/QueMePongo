package QMP;

import java.util.List;

public class AlertasRepository {
  ServicioMeteorologico servicioMeteorologico;
  List<AlertaMeteorologica> alertas;

  static AlertasRepository instance = new AlertasRepository(new ServicioMeteorologicoAccuWeather(new AccuWeatherAPI()));

  public void setServicioMeteorologico(ServicioMeteorologico servicio) {
    this.servicioMeteorologico = servicio;
  }

  public void actualizarAlertas(String ciudad) {
    this.alertas = this.servicioMeteorologico.getAlertas(ciudad);
  }

  private AlertasRepository(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }
}
