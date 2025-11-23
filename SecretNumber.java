import java.util.*;
class SecretNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int secretNumber = 24;
        int guess;
        int count=0;
        do{
            System.out.println("Enter your guess between 20 and 30:");
            guess = sc.nextInt();
            if(guess==secretNumber){
                System.out.println("Congratulations! You guessed the secret number.");
                break;
            }else{
                System.out.println("Wrong guess. Try again.");
            }  
            count++;  
        }while(guess != secretNumber);
        System.out.println("Total attempts: " + count);
    }
}