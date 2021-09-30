package UI;

import FormasRegulares.*;
import FormasIrregulares.*;
import javax.swing.JOptionPane;

public class UI {
    public static void main(String[] args) throws Exception {
        int opc = 0;
        FormasReg[] FReg = new FormasReg[0];
        FormasIrreg[] FIrreg = new FormasIrreg[0];

        do{
            opc = menu();
            switch (opc) {
                case 1:
                    //int opc2 = opc2();
                    //int n = numerodeformas();

                    for(int i = 0; i < numerodeformas(); i++){
                        FormasReg[] temp = new FormasReg[FReg.length + 1];
                        for (int x = 0; x < FReg.length; x++){
                            temp[x] = FReg[x];
                        }
                        switch (opc2()) {
                            case 1:
                                Hexagono h = new Hexagono(getladoFormaReg(i));
                                temp[FReg.length] = h;
                                FReg = temp;
                                break;
                            case 2:
                                Pentagono p = new Pentagono(getladoFormaReg(i));
                                temp[FReg.length] = p;
                                FReg = temp;
                                break;
                            case 3:
                                Quadrado q = new Quadrado(getladoFormaReg(i));
                                temp[FReg.length] = q;
                                FReg = temp;
                                break; 
                            case 4:
                                Triangulo t = new Triangulo(getladoFormaReg(i));
                                temp[FReg.length] = t;
                                FReg = temp;
                                break;                       
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    //int opc3 = opc3();
                    //int n2 = numerodeformas();

                    for (int i = 0; i < numerodeformas(); i++){
                        FormasIrreg[] temp = new FormasIrreg[FIrreg.length + 1];
                        for (int x = 0; x < FIrreg.length; x++){
                            temp[x] = FIrreg[x];
                        }
                        switch (opc3()) {
                            case 1:                                
                                break;
                        
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < FReg.length; i++){
                        JOptionPane.showMessageDialog(null, "Figura " + (i+1) +
                                                    "\n Lado: " + FReg[i].getLado() +
                                                    "\n Area: " + FReg[i].getArea() +
                                                    "\n Perimetro: " + FReg[i].getPerimetro());
                    };
                    break;
            
                default:
                    break;
            }
        }while(opc != 0);
    }

    static int menu(){
        String stropc = JOptionPane.showInputDialog("Escolha uma opção\n" +
                                                    "1 - Inserir Figura Regular\n" +
                                                    "2 - Inserir Figura Irregular\n" +
                                                    "3 - Imprimir Relatório\n" +
                                                    "0 - Saír");        
        int opc = Integer.parseInt(stropc);

        return opc;
    }

    static int opc2(){
        String stropc = JOptionPane.showInputDialog("Qual forma deseja inserir?\n"+
                                                                "1 - Hexagono\n" +
                                                                "2 - Pentagono\n" +
                                                                "3 - Quadrado\n" +
                                                                "4 - Triangulo\n" +
                                                                "0 - Voltar");
        int opc = Integer.parseInt(stropc);

        return opc;
    }

    static int opc3(){
        String stropc = JOptionPane.showInputDialog("Qual forma deseja Inserir?\n" +
                                                    "1 - Losango\n" +
                                                    "2 - Retangulo\n" +
                                                    "3 - Trapezio\n");
        int opc = Integer.parseInt(stropc);

        return opc;
    }

    static float getladoFormaReg(int i){
        String strforma = JOptionPane.showInputDialog("Insira o lado da forma " + (i+1));
        float forma = Float.parseFloat(strforma);
        return forma;
    }

    static int numerodeformas(){
        String strn = JOptionPane.showInputDialog("Quantas formas deseja inserir?");
        int n = Integer.parseInt(strn);
        return n;
    }
}

