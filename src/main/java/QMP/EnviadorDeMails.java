package QMP;

import java.util.List;

public class EnviadorDeMails implements InteresadoEnAlerta {
  MailSender servicioCorreo;
  List<Usuario> suscriptores;

  public EnviadorDeMails(MailSender servicioCorreo) {
    this.servicioCorreo = servicioCorreo;
  }

  @Override
  public void publicarAlerta(AlertaMeteorologica alerta) {
   this.suscriptores.forEach(sub -> servicioCorreo.send(sub.mail, alerta.textoMail));
  }
}
