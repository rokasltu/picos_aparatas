package PicosAparatoInterfeisai;

public class Mexicano extends Pica {

    public Mexicano(Receptas receptas, int dydis){
        super(receptas, dydis);

        receptas.setPavadinimas("Mexicano");

    }

    Produktai mexProduktai = new Produktai(21, 32, 97, 84, 87);


    @Override
    public String getPavadinimas() {
        return "Mexicano";
    }
}
