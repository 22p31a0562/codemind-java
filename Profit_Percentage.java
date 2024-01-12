import java.util.Scanner;
public class Pro{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double cp=s.nextDouble();
        double sp=s.nextDouble();
        double prof=sp-cp;
        double p=(prof/cp)*100;
        System.out.printf("%.2f",p);
    }
}