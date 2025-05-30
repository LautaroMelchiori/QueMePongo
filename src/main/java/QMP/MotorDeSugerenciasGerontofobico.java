package QMP;

public class MotorDeSugerenciasGerontofobico extends MotorDeSugerencias{
  @Override
  boolean esPrendaValidaPara(Usuario usuario, Prenda prenda) {
    if (usuario.getEdad() > 55) {
      return prenda.esFormal();
    }
    return true;
  }
}
