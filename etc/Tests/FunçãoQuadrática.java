import javax.swing.*;
import java.util.*;
import static java.lang.Math.sqrt;

public class FunçãoQuadrática
{


//teste
/*
    static void GUI()
    {
        String coluna[] = {"se", "no", "de"};   
        JFrame f;
        
            f = new JFrame();
            JTable func= new JTable();
            func.setBounds(30,40,200,300);
        
        System.out.println("worked");        
    
    }
*/

    public static void main(String args[])
    {

        int x1, x2;

        Scanner scan = new Scanner(System.in);
        //a
        System.out.print("valor de a: ");
        double a = scan.nextDouble();
        if(a==0)
        {
            System.out.println("'a' não pode ser zero");
            return;
        }
        //b
        System.out.print("valor de b: ");
        double b = scan.nextDouble();
        //c
        System.out.print("valor de c: ");
        double c = scan.nextDouble();


        //não existe número real como resultado de raiz negativa, então se delta for menor que zero o conjunto solução (x1 e x2) será vazio.
        //delta

        double delta = b*b -4*a*c;
        if(delta<0)
        {
            System.out.println("delta resultou em um número negativo");
            return;
        }


        //bhaskara

        double raizDelta = sqrt(delta);
        double temp1 = a * 2;
        double temp2 = b * -1;

        x1 = (int) ((temp2 + raizDelta) / temp1);
        x2 = (int) ((temp2 - raizDelta) / temp1);


        //construção da parábola
        List<Integer> xvalores = new ArrayList<Integer>();
        List<Double> yvalores = new ArrayList<Double>();
        
        for(int x = -10 ; x<10 ; x++)
        {
            
            xvalores.add(x);
            
            //função quadrática para obter o y
            double y = a*(x*x) + b*x +c;
            
            yvalores.add(y);

        }


        //vértice
        double bb = (double)b;
        double xv = -bb / (a * 2);
        double yv = -delta/(4*a);


        //ponto máximo ou mínimo
        String ponto;
        if(a>0)
        {
            ponto = "mínimo";
        }
        else
        {
            ponto = "máximo";
        }
    System.out.println("x1: "+x1);
    System.out.println("x2: "+x2);
    System.out.println("delta: "+delta);
    System.out.println("xv: "+xv);
    System.out.println("yv: "+yv);
    System.out.println("ponto: "+ponto);
    System.out.println("raiz de delta: "+raizDelta);


    }

}

/*
public class Graficos()
{


}
*/
