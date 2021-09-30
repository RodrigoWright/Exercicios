package FormasIrregulares;

import java.lang.Math;

public class Losango extends FormasIrreg{

    public Losango(float Dzaum, float Dzinho){
        super(Dzaum, Dzinho);
        this.Area = calcularAL();
        this.Perimetro = calcularperiL();
    }

    private float calcularAL(){
        return (ladoA*ladoB)/2;
    }
    
    private float calcularperiL(){
        float lado = (float)Math.pow(ladoA, 2)+(float)Math.pow(ladoB, 2);
        return lado*4;
    }
}
