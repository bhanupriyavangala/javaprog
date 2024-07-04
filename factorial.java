import java. util.Scanner;
class factorial{

    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(1+",");
        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.println(i+",");
            }
        }
        System.out.println(num);
    }  
} 