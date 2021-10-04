import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Venezuelano
{
    //duas constante, valores da moeda data 4/10/2021
    final BigDecimal venezuelanoParaReal  = new BigDecimal(0.000000000013000571);
    final BigDecimal realParaVenezuelano  = new BigDecimal(76919698499.23);

    public static void main(String[] args)
    {

        //declarando BigDecimal
        BigDecimal bigReal = new BigDecimal(0);
        BigDecimal num1    = new BigDecimal(0);
        BigDecimal num2    = new BigDecimal(0);


        //Declarando teclado e importando as constantes
        Scanner kb = new Scanner(System.in);
        Venezuelano dinero = new Venezuelano();

        //conversão do dinheiro
        System.out.print("Valor em reais: ");
        double real = kb.nextDouble();
        bigReal = bigReal.valueOf(real);
        num2 = num1.add(dinero.realParaVenezuelano);
        num1 = num2.multiply(bigReal);


        System.out.println
        ("Em notas de:\n[1] 1 milhão \n[2] 200 mil\n[3]\n[4]\n[5]");


        //tamanho das notas e a métrica
        //fonte: https://en.wikipedia.org/wiki/Venezuelan_bol%C3%ADvar
        //espessura da nota é um valor estimado, sem dados oficiais





    System.out.println(num1.toString());
    }
}

