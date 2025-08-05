package QMP;

import java.util.List;

public class RecalculadorDeSugerencias implements InteresadoEnAlerta {
  List<Usuario> suscriptoresAlRecalculado;

  @Override
  public void publicarAlerta(AlertaMeteorologica alerta) {
    this.suscriptoresAlRecalculado.forEach(Usuario::actualizarSugerenciaDiaria);
  }
}
