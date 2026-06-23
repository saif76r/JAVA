import java.util.Scanner;

public class evod {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("ODD number");
        }
    }
}

   
