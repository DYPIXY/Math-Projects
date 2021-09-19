//import that the older version uses 
//import java.util.*;
public class Project004 {
    /*
    
    //that two methods are from the new version
    //i was just testing how to use, don't be silly, this is a train project
    
    
    public static int digits(int x){
        int sup = 0;
        while(x>0){
        sup = 10*sup + x%10;
        x/=10;
        }
        return sup;
    }
    public static boolean palindrome(int y, int x){
        boolean bol = false;
        if(y-x==0){
            bol=true;
        }
        return bol;
    }
    */
    //new version below
    public static void main(String[] args){
        int biggestPalindrome = 0;
        for(int a=999;a>99;a--){
            for(int b=999;b>=a;b--){
                int x=b*a,y = b*a;
                int interpreter=0;
                while(x>0){
                    interpreter = 10*interpreter + x%10;
                    x/=10;
                }
                if(interpreter-y==0){
                    if(biggestPalindrome<y){
                        biggestPalindrome=y;
                    
                    }
                }
            b--;
            }
        a--;
        }
    System.out.println("Project004: "+biggestPalindrome);
    }
}

//Old version

/*
        
        public static void main(String[] args){
        
        //Find the largest palindrome made from the product of two 3 digit numbers.
        int biggestPalindrome=0; 
        for(int num1=999;num1>99;num1--){
            for(int num2 = 999;num2>99;num2--){
                int comparator= num1 * num2;
                int rawNumber = comparator;
                int length=0;
                //This ~while~ is used to see how many characters the number have
                List<Integer> digits = new ArrayList<Integer>();
                while(rawNumber!=0){
                    rawNumber/=10;
                    length++;
                }
                //this to divide the number in digits
                rawNumber=comparator;
                while(comparator>0){
                    digits.add(comparator%10);
                    comparator/=10 ;
                }
                //this to confirm if is a palindrom (in that case the biggest have 6 digits so i just make my job easy)
                if(length==6){
                    int a = digits.get(0);
                    int b = digits.get(1);
                    int c = digits.get(2);
                    int d = digits.get(3);
                    int e = digits.get(4);
                    int f = digits.get(5);
                    int sub1  = a-f;
                    int sub2 =b-e;
                    int sub3 = c-d; 
                    if(sub1==0 && sub2==0 && sub3==0){
                        int var =rawNumber;
                        if (var>biggestPalindrome)
                        biggestPalindrome=var;
                    }else{
                        continue;
                    }              
                }
            }       
        }
    System.out.println("Projeto004:"+biggestPalindrome);
    }


*/