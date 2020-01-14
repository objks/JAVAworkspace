package yang;

import java.util.Random;
import java.util.Scanner;

public class Montyhall {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        System.out.print("How many runs? >>> ");
        double cases = console.nextInt();
        boolean car = false;
        double successes = 0;
        for(int i=0; i<cases; i++)
        {
            car = run();
            if(car)
            {
                successes++;
            }
        }
        System.out.println(successes/cases*100+"%");		
	}

	private static boolean run() {
		boolean[] doors = new boolean[3];
        Random rand = new Random(); 
        int car_in = rand.nextInt(3);
        doors[car_in] = true;
        //car is at doors[car_is_at]
        int first_guess = rand.nextInt(3);
        //first_guess is the guess
        int revealed_to_be_sheep = reveal_sheep(first_guess, doors);
        //one of the non guess is opened to be a sheep
        int final_guess = final_choice(first_guess,revealed_to_be_sheep);
        if(doors[final_guess]==true)
        {
            return true;
        }
        return false;
	}

	private static int final_choice(int first_guess, int revealed_to_be_sheep) {
		Random rand = new Random(); 
        int final_choice = rand.nextInt(3);
        if(final_choice!=first_guess && final_choice!=revealed_to_be_sheep)
        {
            return final_choice;
        }
        return final_choice(first_guess,revealed_to_be_sheep);
	}

	private static int reveal_sheep(int first_guess, boolean[] doors) {
		Random rand = new Random(); 
        int revealed_to_be_sheep = rand.nextInt(3);
        if(revealed_to_be_sheep!=first_guess && doors[revealed_to_be_sheep]==false)
        {
            return revealed_to_be_sheep;
        }
        return reveal_sheep(first_guess,doors);
	}

}
