package PicosAparatoInterfeisai;

public class Socioji extends Pica {



    public Socioji(Receptas receptas, int dydis){
        super(receptas, dydis);

        receptas.setPavadinimas("Socioji");

    }

    Produktai socProduktai = new Produktai(44, 32, 77, 99, 55);


    @Override
    public String getPavadinimas() {
        return "Margarita";
    }
}
