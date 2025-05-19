package QMP;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.validarPrendas(prendaSuperior, prendaInferior, calzado);
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public void validarPrendas(Prenda superior, Prenda inferior, Prenda calzado) {
    this.validarPrenda(superior, Categoria.PARTE_SUPERIOR, "La prenda superior ");
    this.validarPrenda(inferior, Categoria.PARTE_INFERIOR, "La prenda inferior ");
    this.validarPrenda(calzado, Categoria.CALZADO, "El calzado ");
  }

  public void validarPrenda(Prenda unaPrenda, Categoria categoriaEsperada, String parteUniforme) {
    if (unaPrenda.categoria() != categoriaEsperada) {
      throw new RuntimeException(String.format("%s del uniforme es invalida", parteUniforme));
    }
  }
}
