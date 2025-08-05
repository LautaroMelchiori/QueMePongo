package QMP;

import java.util.Collection;
import java.util.List;

public class Usuario {
  List<Guardarropa> guardarropas;


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

  List<Prenda> getPrendas() {
    return this.guardarropas.stream()
        .flatMap(guardarropa -> guardarropa.getPrendas().stream())
        .filter(p -> p.esAdecuadaPara(servicioMeteorologico.getEstadoClima("Buenos Aires").temperatura))
        .toList();
  }

  Integer getEdad() {
    return this.edad;
  }
}