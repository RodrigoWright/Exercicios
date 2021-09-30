package FormasIrregulares;

public class Retangulo extends FormasIrreg{
    public Retangulo(float FLadoA, float FLadoB){
        super(FLadoA, FLadoB);
        this.Area = calcularAR();
        this.Perimetro = calcularPeriR();
    }

    private float calcularPeriR(){
        return (ladoA+ladoB)*2;
    }

    private float calcularAR(){
        return ladoA*ladoB;
    }
}
