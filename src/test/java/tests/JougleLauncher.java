package tests;

import java.util.Arrays;
import java.util.Scanner;


public class JougleLauncher {

    public static void main(String[] args) {
        int[] myNum = {0,0,0};
        int i = (int) (Math.random()*2);
//        System.out.println(i);
        myNum[i]=1;
        Scanner in = new Scanner(System.in);
        System.out.println("In which joggle is a ball:1,2 or 3?");
        int guess = in.nextInt();
  //      System.out.println(guess);
        int [] myGuess = {0,0,0};
        myGuess[guess-1]=1;

        if (i==(guess-1)){
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }



        System.out.println(Arrays.toString(myNum));
        System.out.println("Your guess: " + Arrays.toString(myGuess));
    }
}
