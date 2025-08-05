package QMP;

public class ActualizarAlertas {
  public static void main(String[] args) {
    AlertasRepository.instance.actualizarAlertas(args[0]);
  }
}
