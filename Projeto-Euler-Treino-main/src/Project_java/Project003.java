public class Project003 {
    public static void main(String[] args){
        //Initial prime number
        long numTotal = 600851475143L;
        //Functional part
        long nPrime = 2;
        while(numTotal>1){
            if (numTotal%nPrime==0){
                numTotal/=nPrime;
            }else{
            nPrime++;        
            }
        }
        //Out of ~while~
        System.out.println("Project003: "+nPrime);
    }
}