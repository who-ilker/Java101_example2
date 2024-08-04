import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        int num, output = 1;

        System.out.print("Enter a number: ");
        num = inp.nextInt();

        System.out.print("Powers of four up to the number you entered: ");
        for(int i = 1; i <= num; i *= 4){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.print("Powers of five up to the number you entered: ");
        for(int i = 1; i <= num; i *= 5){
            System.out.print(i+" ");
        }


    }
}