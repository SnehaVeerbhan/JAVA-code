import java.util.Scanner;
public class mainc 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int cash = sc.nextInt();
        if (cash<10)
        {
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }
            else if(cash>=106-010&&cash<50){
                System.out.println("can buy one thing");
            }
                else{
                System.out.println("can buy both");
            }        
    }
}
