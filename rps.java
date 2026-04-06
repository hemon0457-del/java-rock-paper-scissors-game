import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        String[] choices={"rock", "paper","scissors"};
        String playerchoice;
        String computerchoice;
        String playagain="yes";
do{
    System.out.print("Enter your move ");
    playerchoice = scanner.nextLine().toLowerCase();
    if(!playerchoice.equals("rock")&&
            !playerchoice.equals("paper")&&
            !playerchoice.equals("scissors")){
        System.out.print("Invalid choice");
    }
    computerchoice=choices[random.nextInt(3)];
    System.out.print("computer choice:"+ computerchoice);
    if(playerchoice.equals(computerchoice)){
        System.out.print("\nIt's a tie");
    }
    else if((playerchoice.equals("rock")&& computerchoice.equals("scissors"))||
            (playerchoice.equals("paper")&& computerchoice.equals("rock"))||
            (playerchoice.equals("scissors")&& computerchoice.equals("paper"))
    ){
        System.out.print("\nYou Win!");
    }
    else{
        System.out.print("\nYou Lost!");
    }
    System.out.print("enter (yes or no)\n");
    playagain=scanner.nextLine();
}
while (playagain.equals("yes"));
        System.out.print("you quit");
        scanner.close();
    }
}