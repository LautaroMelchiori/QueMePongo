package QMP;

import java.util.List;

public class UsuarioRepository {
  List<Usuario> usuarios;
  static public UsuarioRepository instance = new UsuarioRepository();

  List<Usuario> getUsuarios() { return this.usuarios; }
  private UsuarioRepository() {}
}