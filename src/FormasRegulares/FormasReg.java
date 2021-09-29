package FormasRegulares;

public class FormasReg {
    protected float lado;
    protected float area;
    protected float perimetro;

    public FormasReg (float LadoForma) {
        this.lado = LadoForma;
    }

    public float getLado(){
        return lado;
    }

    public float getArea(){
        return area;
    }

    public float getPerimetro(){
        return perimetro;
    }
}
