//package src;

public class Project001{
        public static void main(String[] args){
        //Sum of multiples of 3 and 5 below 1000
        int i=0;
                for(int a=0;a<1000;a++){
                if(a%3==0 || a%5==0){
                        i+=a;
                        }
                }
        System.out.println("Project001: "+i);
        }
}