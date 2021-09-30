package FormasIrregulares;

public class Trapezio extends FormasIrreg{

    float altura;

    public Trapezio(float FLadoA, float FLadoB, float Altura){
        super(FLadoA, FLadoB);
        this.altura = Altura;
        this.Area = calcularAT();
        this.Perimetro = calcularPeriT();
    }

    private float calcularAT(){
        return ((ladoA+ladoB)*altura)/2;
    }

    private float calcularPeriT(){ //tenho que pensar sobre como fazer isso aidna.
        return 0;
    }
    
}
