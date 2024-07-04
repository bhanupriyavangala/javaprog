import java.util.Scanner;
class multiple{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        int num1=s.nextInt();
        int num2=s.nextInt();

        int i=num1>num2?num1:num2;
        while(true)
        {
            if(i%num1==0&&i%num2==0){
                System.out.println(i);
                break;
            }
            i++;
        }
      
    }
}