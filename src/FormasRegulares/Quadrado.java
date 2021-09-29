package FormasRegulares;

import java.lang.Math;

public class Quadrado extends FormasReg{
    public Quadrado(float ladoForma){
        super(ladoForma);
        this.area = calcularAQ(lado);
        this.perimetro = calcularperiQ();
    }

    private float calcularperiQ(){
        return 4*lado;
    }

    private float calcularAQ(float ladoForma){
        float Area = (float)Math.pow(ladoForma, 2);

        return Area;
    }
}
