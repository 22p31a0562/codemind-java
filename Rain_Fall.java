import java.util.Scanner;
public class Pro{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3){
            System.out.print("LIGHT");
        }
        else if(n>=3 && n<7)
        {
            System.out.print("MODERATE");
        }
        else
        {
            System.out.print("HEAVY");
        }
    }
}