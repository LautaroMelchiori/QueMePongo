package QMP;

import java.util.Collection;
import java.util.List;

public class Usuario {
  List<Guardarropa> guardarropas;
  Integer edad;
  String mail;
  MotorDeSugerencias motor;
  ServicioMeteorologico servicioMeteorologico;
  Atuendo sugerenciaDiaria;

  Usuario(Integer edad, String mail, MotorDeSugerencias motor,ServicioMeteorologico servicioMeteorologico) {
    this.edad = edad;
    this.mail = mail;
    this.motor = motor;
    this.servicioMeteorologico = servicioMeteorologico;
  }

  void actualizarSugerenciaDiaria() {
    this.sugerenciaDiaria = this.generarSugerencias().getFirst();
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