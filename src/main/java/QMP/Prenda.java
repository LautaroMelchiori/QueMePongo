package QMP;

public class Prenda {
  private TipoDePrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario, Color colorSecundario, Trama trama) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public Categoria categoria() {
    return this.tipo.getCategoria();
  }
}
