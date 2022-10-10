import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.util.*;
import static java.lang.Math.sqrt;

public class FunçãoQuadrática extends JComponent {
    static void Panel(double a, b ,c) {

        int width  = this.getWidth()/2;
        int Height = this.getHeight()/2;

        Graphics2D g1 = (Graphics2D) g;
        g1.setStroke(new BasicStroke(2));
        g1.setColor(Color.black);
        g1.drawLine(0,h,w*2,h);
        g1.drawLine(w,0,w,h*2); 
        g1.drawString("0", w - 7, h + 13);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.red);


        JFrame frame = new JFrame(double a b c);
        frame.setSize(800, 600);
        frame.setTitle("Gráfico da função [ "+a, b, c +" ]");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  
        FunçãoQuadrática draw = new FunçãoQuadrática();
        frame.add(draw);
        frame.setVisible(true);

        System.out.println("worked");
    }


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
        Polygon p1 = new Polygon();
        
        for(int x = -10 ; x<=10 ; x++)
        {
            //função quadrática para obter o y
            double y = a*(x*x) + b*x + c;
            p1.addPoint(w + x, h - y);
        
        }
        g2.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints); 
    
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
        System.out.println("delta: "+delta);
        System.out.println("xv: "+xv);
        System.out.println("yv: "+yv);
        System.out.println("ponto: "+ponto);
        System.out.println("raiz de delta: "+raizDelta);

        Panel(a, b ,c);
    }

}

