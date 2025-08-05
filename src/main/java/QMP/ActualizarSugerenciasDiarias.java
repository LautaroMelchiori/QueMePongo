package QMP;

import java.util.List;

public class ActualizarSugerenciasDiarias {
  static List<Usuario> usuarios;

  public static void main(String[] args) {
    usuarios.forEach(Usuario::actualizarSugerenciaDiaria);
  }
}
