package PicosAparatoInterfeisai;

public class Picos_aparatas implements IPicosAparatas {


    public Picos_aparatas(Produktai produktai) {



    }


    @Override
    public Pica gaminkPica(String pavadinimas, int dydis) {
        Pica pica = null;
        switch (pavadinimas){
            case "Margarita":
                pica = new Margarita (Receptas_Kl, dydis);
                break;
            case "Mexicano":
                pica = new Mexicano (Receptas_Kl, dydis);
                break;
            case "Socioji":
                pica = new Socioji (Receptas_Kl, dydis);
                break;
        }

        return pica;
    }

    @Override
    public void papildykProduktus(Produktai produktai) {



    }
}


