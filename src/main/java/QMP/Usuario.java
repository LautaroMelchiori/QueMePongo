package QMP;

import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  Integer edad;
  MotorDeSugerencias motor;

  Usuario(Integer edad, MotorDeSugerencias motor) {
    this.edad = edad;
    this.motor = motor;
  }

  List<Atuendo> generarSugerencias() {
    return this.motor.generarSugerenciasPara(this);
  }

  void addPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  List<Prenda> getPrendas() {
    return this.prendas;
  }

  Integer getEdad() {
    return this.edad;
  }
}