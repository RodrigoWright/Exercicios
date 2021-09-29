package FormasRegulares;

public class Hexagono extends FormasReg {
    public Hexagono(float ladoForma){
        super(ladoForma);
        this.area = calcularAH();
        this.perimetro = calcularperiH();
    }
    
    private float calcularAH(){
        double Area;
        double altura;

        altura = (lado*Math.sqrt(3))/2;
        Area = ((6*lado)*altura)/2;

        return (float)Area;
    }

    private float calcularperiH(){
        return 6*lado;
    }
    
}
