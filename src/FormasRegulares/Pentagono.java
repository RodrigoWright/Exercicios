package FormasRegulares;


public class Pentagono extends FormasReg {
    public Pentagono(float ladoForma){
        super(ladoForma);
        this.area = calcularAP();
        this.perimetro = calcularperiP();
    }

    private float calcularperiP(){
        return lado*5;
    }

    private float calcularAP(){
        double Area;
        double altura;

        altura = lado/(2*Math.sqrt(5-(2*Math.sqrt(5))));
        Area = 5*lado*altura/2;

        return (float)Area;
    }
    
}
