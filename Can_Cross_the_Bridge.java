import java.util.Scanner;
public class Pro{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        int res=(z-y)/x;
        System.out.print(res);
        
    }
}