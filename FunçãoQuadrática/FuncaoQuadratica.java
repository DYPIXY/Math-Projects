import static java.lang.Math.sqrt;
import java.util.*;

public class FuncaoQuadratica {
    static Map<Integer,Double> points;

    public static void main(String[] args) {
        double x1, x2;
        Scanner scan = new Scanner(System.in);
        //a
        System.out.print("valor de a: ");
        double a = scan.nextDouble();
        if(a==0) {
            System.out.println("'a' não pode ser zero");
            scan.close();
            return;
        }
        //b
        System.out.print("valor de b: ");
        double b = scan.nextDouble();
        //c
        System.out.print("valor de c: ");
        double c = scan.nextDouble();

        scan.close();
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

        x1 = ((temp2 - raizDelta) / temp1);
        x2 = ((temp2 + raizDelta) / temp1);
    
        //vértice
        double bb = (double)b;
        double xv = -bb / (a * 2);
        double yv = -delta/(4*a);

        //ponto máximo ou mínimo
        String ponto;
        if(a>0) {
            ponto = "mínimo";
        }
        else {
            ponto = "máximo";
        }
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
        System.out.println("xv: "+xv);
        System.out.println("yv: "+yv);
        System.out.println("ponto: "+ponto);
        System.out.println("delta: "+delta);
        System.out.println("raiz de delta: "+raizDelta);

        //adicionei essa parte 2 anos depois, lol
        Graph graph = new Graph();
        graph.main(args);;
    }
}

