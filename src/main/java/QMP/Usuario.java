package QMP;

import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  Integer edad;
  MotorDeSugerencias motor;
  ServicioMeteorologico servicioMeteorologico;

  Usuario(Integer edad, MotorDeSugerencias motor,ServicioMeteorologico servicioMeteorologico) {
    this.edad = edad;
    this.motor = motor;
    this.servicioMeteorologico = servicioMeteorologico;
  }

  List<Atuendo> generarSugerencias() {
    return this.motor.generarSugerenciasPara(this);
  }

  void addPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  List<Prenda> getPrendas() {
    return this.prendas.stream()
        .filter(p -> p.esAdecuadaPara(servicioMeteorologico.getEstadoClima("Buenos Aires").temperatura))
        .toList();
  }

  Integer getEdad() {
    return this.edad;
  }
}