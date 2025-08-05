package QMP;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
  AccuWeatherAPI api;

  ServicioMeteorologicoAccuWeather(AccuWeatherAPI api) {
    this.api = api;
  }

  public EstadoClima getEstadoClima(String ciudad) {
    Map<String, Object> resultadoAccuWeather = this.api.getWeather(ciudad).getFirst();

    EstadoClima estadoClima = new EstadoClima();

    Map<String, Object> temperaturaAccuWeather = (Map<String, Object>) resultadoAccuWeather.get("Temperatura");

    estadoClima.temperatura = (float) temperaturaAccuWeather.get("Value");
    estadoClima.humedad = (float) resultadoAccuWeather.get("PrecipitationProbability") > 0.8 ?
        Humedad.LLUVIOSO : Humedad.SECO;

    return estadoClima;
  }

  public List<AlertaMeteorologica> getAlertas(String ciudad) {
    Map<String, List<String>> alertas = api.getAlerts("Buenos Aires");
    return alertas.get("CurrentAlerts").stream().map(alerta -> switch (alerta) {
      case "STORM" -> AlertaMeteorologica.TORMENTA;
      case "HAIL" -> AlertaMeteorologica.GRANIZO;
      default -> AlertaMeteorologica.ALERTA_DESCONOCIDA;
    }).toList();
  }
}
