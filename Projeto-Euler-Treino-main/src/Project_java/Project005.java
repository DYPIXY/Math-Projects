/*  
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? 
*/
public class Project005 {
    public static void main(String[] args){
        int sub=2;
        int num=0;
        while(true){
            int count=0;
            int i = 1;
            while(i<=20){
                if(sub%i==0){
                    count++;
                }
            i++;
            }
            if (count==20){
                num=sub;
                break;
            }       
            sub+=2;
        }
        System.out.println("Project005: "+num);
    }
}
