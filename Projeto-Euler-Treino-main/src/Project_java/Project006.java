/*
    The sum of the squares of the first ten natural numbers is,
    
    1^2 + 2^2 + ... + 10^2 = 385

    The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)^2 = 55^2 = 3025
    
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
    3025 - 385 = 2640
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Project006 {
    public static void main(String[] args){
        int sum=0, square=0, i=1;
        while(i<=100){
            square+=i*i;
            i++;
        }
        sum = (100*(100+1))/2;
        sum*=sum;

        System.out.println("Project006: "+(sum-square));
    }
}
