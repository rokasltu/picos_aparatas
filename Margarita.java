package PicosAparatoInterfeisai;

public class Margarita extends Pica {


    public Margarita(Receptas receptas, int dydis){
        super(receptas, dydis);

    receptas.setPavadinimas("Margarita");

    }

    Produktai margProduktai = new Produktai(21, 32, 47, 44, 47);



    @Override
    public String getPavadinimas() {
        return "Margarita";
    }
}
