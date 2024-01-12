import java.util.Scanner;
public class Pro{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int se=s.nextInt();
        int b=s.nextInt();
        int r=2*t*se*b*512;
        System.out.print(r/1024+" "+"KB");
    }
}