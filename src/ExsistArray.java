import java.util.Scanner;
public class ExsistArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] numbers = {8, 12, 17, 24, 34};
        System.out.println("Guess my lucky number");
        int guessNum = input.nextInt();
        for (int i=0; i<numbers.length; i++){
        if (guessNum == numbers [i]) {
            System.out.println("You have found my number");}
        else {
            System.out.println("oh no you have not found my number");}
        }
        }
    }

