package QMP;

public enum TipoDePrenda {
  ZAPATOS(Categoria.CALZADO),
  ZAPATILLAS(Categoria.CALZADO),
  REMERA(Categoria.PARTE_SUPERIOR),
  CHOMBA(Categoria.PARTE_SUPERIOR),
  CAMISA_DE_MANGAS_CORTAS(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  POLLERA(Categoria.PARTE_INFERIOR),
  COLLAR(Categoria.PARTE_INFERIOR);

  private final Categoria categoria;

  TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }
  public Categoria getCategoria() {
    return this.categoria;
  }
}
