package FormasIrregulares;

public class FormasIrreg {
    float ladoA;
    float ladoB;
    float Area;
    float Perimetro;

    public FormasIrreg(float FLadoA, float FLadoB){
        this.ladoA = FLadoA;
        this.ladoB = FLadoB;
    }

    public float getladoA(){
        return ladoA;
    }

    public float getladoB(){
        return ladoB;
    }

    public float getArea(){
        return Area;
    }

    public float getPerimetro(){
        return Perimetro;
    }
    
}
