package QMP;

public abstract class Sastre {
  public Atuendo fabricarAtuendo() {
    return new Atuendo(this.fabricarPrendaSuperior(),
        this.fabricarPrendaInferior(),
        this.fabricarCalzado());
  }

  protected abstract Prenda fabricarPrendaSuperior();
  protected abstract Prenda fabricarPrendaInferior();
  protected abstract Prenda fabricarCalzado();
}
