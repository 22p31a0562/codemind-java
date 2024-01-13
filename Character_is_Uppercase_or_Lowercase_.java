import java.util.Scanner;
public class Pro{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if(s>=65 && s<=90)
        {
            System.out.print("uppercase alphabet");
        }
        else if(s>=97 && s<=122)
        {
            System.out.print("lowercase alphabet");
        }
        else
        {
            System.out.print("not an alphabet");
        }
    }
}