package QMP;

public class PrendaBuilder {
  private final TipoDePrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama = Trama.LISA;

  public PrendaBuilder(TipoDePrenda tipo) {
    this.tipo = tipo;
  }

  public PrendaBuilder conMaterial(Material material) {
    this.material = material;
    return this;
  }

  public PrendaBuilder conColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
    return this;
  }

  public PrendaBuilder conColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
    return this;
  }

  public PrendaBuilder conTrama(Trama trama) {
    this.trama = trama;
    return this;
  }

  public void validar() {
    if (this.tipo == null || this.material == null || this.colorPrimario == null) {
      throw new PrendaInvalida("Faltan datos para la prenda");
    }
  }

  public Prenda armarPrneda() {
    this.validar();
    return new Prenda(tipo, material, colorPrimario, colorSecundario, trama);
  }
}
