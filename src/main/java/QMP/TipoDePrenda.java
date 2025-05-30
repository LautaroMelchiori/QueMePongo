package QMP;

public enum TipoDePrenda {
  ZAPATOS(Categoria.CALZADO, 35),
  ZAPATILLAS(Categoria.CALZADO, 40),
  REMERA(Categoria.PARTE_SUPERIOR, 40),
  CHOMBA(Categoria.PARTE_SUPERIOR, 40),
  CAMISA_DE_MANGAS_CORTAS(Categoria.PARTE_SUPERIOR, 40),
  PANTALON(Categoria.PARTE_INFERIOR, 30),
  POLLERA(Categoria.PARTE_INFERIOR, 40),
  COLLAR(Categoria.PARTE_INFERIOR, 20);

  private final Categoria categoria;
  private final float temperaturaMax;

  TipoDePrenda(Categoria categoria, float temperatura) {
    this.categoria = categoria;
    this.temperaturaMax = temperatura;
  }

  Categoria getCategoria() {
    return this.categoria;
  }

  boolean esAdecuadaPara(float unaTemperatura) {
    return unaTemperatura < this.temperaturaMax;
  }
}
