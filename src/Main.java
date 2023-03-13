import java.util.Scanner;
class Income
{
    public static void main(String args[])
    {
        double tax=0, it;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");
        it= sc.nextDouble();
        if(it<=4579.32)
            tax=0;
        else if(it<=38553.01)
            tax=19;
        else if (it>=38553.01)
            tax=25;
        System.out.println("Income tax amount is "+tax);

        }
    }

