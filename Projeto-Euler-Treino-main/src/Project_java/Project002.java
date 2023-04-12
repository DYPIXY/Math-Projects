public class Project002 {
    public static void main(String[] args){
    //Fibonacci sequence  
        int a=1,b=0,c=0,sum=0;
        while(c<=4000000){
            if(c%2==0){
                sum+=c;
            }
            c=a+b;
            b=a;
            a=c;
        }
        System.out.println("Project002: "+sum);
    }
}
