package QMP;

public abstract class Sastre {
  public Uniforme fabricarUniforme() {
    return new Uniforme(this.fabricarPrendaSuperior(),
        this.fabricarPrendaInferior(),
        this.fabricarCalzado());
  }

  protected abstract Prenda fabricarPrendaSuperior();
  protected abstract Prenda fabricarPrendaInferior();
  protected abstract Prenda fabricarCalzado();
}
