package QMP;

public class SastreSanJuan extends Sastre {
  @Override
  public Prenda fabricarPrendaSuperior() {
    return new PrendaBuilder(TipoDePrenda.CHOMBA)
        .conMaterial(Material.PIQUE)
        .conColorPrimario(new Color(0,255,0))
        .armarPrenda();
  }

  @Override
  public Prenda fabricarPrendaInferior() {
    return new PrendaBuilder(TipoDePrenda.PANTALON)
        .conMaterial(Material.ACETATO)
        .conColorPrimario(new Color(50,50,50))
        .armarPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    return new PrendaBuilder(TipoDePrenda.ZAPATILLAS)
        .conMaterial(Material.CUERO)
        .conColorPrimario(new Color(255,255,255))
        .armarPrenda();
  }
}
