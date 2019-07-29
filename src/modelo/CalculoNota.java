package modelo;

import entidad.Constant;

public class CalculoNota {
    private double notaSeg;
    private double notaParc;
    private double notaFinal;
    Constant cnst = new Constant();

    public double getNotaSeg() {
        return notaSeg;
    }

    public void setNotaSeg(double notaSeg) {
        this.notaSeg = notaSeg;
    }

    public double getNotaParc() {
        return notaParc;
    }

    public void setNotaParc(double notaParc) {
        this.notaParc = notaParc;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double calculo() {
        double promedio;
        promedio = ((notaFinal * cnst.notaFin) + (notaParc * cnst.notaPar) + (notaSeg * cnst.notaSeg)) / 3;
        return promedio;

    }
}