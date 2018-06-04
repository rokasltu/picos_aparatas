package PicosAparatoInterfeisai;

public class Produktai {

    private double suris;
    private double padas;
    private double padazas;
    private double desra;
    private double pomidorai;

    public Produktai(double suris, double padas, double padazas, double desra, double pomidorai) {
        this.suris = suris;
        this.padas = padas;
        this.padazas = padazas;
        this.desra = desra;
        this.pomidorai = pomidorai;
    }

    public double getSuris() {
        return suris;
    }

    public void setSuris(double suris) {
        this.suris = suris;
    }

    public double getPadas() {
        return padas;
    }

    public void setPadas(double padas) {
        this.padas = padas;
    }

    public double getPadazas() {
        return padazas;
    }

    public void setPadazas(double padazas) {
        this.padazas = padazas;
    }

    public double getDesra() {
        return desra;
    }

    public void setDesra(double desra) {
        this.desra = desra;
    }

    public double getPomidorai() {
        return pomidorai;
    }

    public void setPomidorai(double pomidorai) {
        this.pomidorai = pomidorai;
    }
}

