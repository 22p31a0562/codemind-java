import java.util.Scanner;
public class Pro{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int rev=0;
        while(temp!=0)
        {
            int r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(rev==n)
        {
            System.out.print(2);
        }
        else
        {
            System.out.print(1);
        }
    }
}