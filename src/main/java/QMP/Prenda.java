package QMP;

public class Prenda {
  private TipoDePrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;
  private Formalidad formalidad;

  public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama, Formalidad formalidad) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.formalidad = formalidad;
  }

  public Categoria categoria() {
    return this.tipo.getCategoria();
  }

  TipoDePrenda getTipo() {
    return this.tipo;
  }

  boolean esFormal() {
    return this.formalidad.equals(Formalidad.FORMAL);
  }
}
