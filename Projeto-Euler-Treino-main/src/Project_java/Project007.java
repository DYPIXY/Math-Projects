/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/
public class Project007 {
    public static void main(String[] args){
        int prime = 2, count = 1;  
        int result =0;
        while(count<=10001){
            if(prime%2==0){
                prime++;
                continue;
            }
            int countPrime=0;
            for(int i=prime;i>=1;i--){
                if(prime%i==0){
                    countPrime++;
                }
            }
            if(countPrime==2){
                count++;
                if(count==10001){
                    result=prime;
                }
            }
            prime++;
        }
    System.out.println("Project007: "+result);
    }
}
