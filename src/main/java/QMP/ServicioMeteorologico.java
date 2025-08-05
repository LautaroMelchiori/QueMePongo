package QMP;

import java.util.List;

public interface ServicioMeteorologico {
  EstadoClima getEstadoClima(String ciudad);
  List<AlertaMeteorologica> getAlertas(String ciudad);

}
