package InterviewJava;

public class CountStep {
    public static void main(String[] args) {

    int num = 8;
    int count = 0;
     while(num>0){
        if(num % 2 == 0){
            num = num /2;
        }else{
            num=num-1;
        }
         count++;
     }
        System.out.println(count);
}}
