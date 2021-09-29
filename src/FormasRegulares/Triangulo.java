package FormasRegulares;

import java.lang.Math;

public class Triangulo extends FormasReg {

    public Triangulo (float ladoForma) {
        super(ladoForma);
        this.area = calcularAT(lado);
        this.perimetro = CalcularperiT();
    }

    private float CalcularperiT() {
        return 3*lado;
    }

    private float calcularAT(float ladoForma){
        double Area;
        float base;
        double altura;

        base = ladoForma/2;

        altura = Math.sqrt((double)(ladoForma*ladoForma) - (double)(base*base));

        Area = (base*altura)/2;

        return (float) Area;
    }
}

