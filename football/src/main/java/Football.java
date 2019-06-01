
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        System.out.println("Let's start the game!");
        // kickReturn(); //random number of yards 0-50 where football location on field after kick/punt return
        // System.out.println("Let's start the game!");
        // yardsToGo(); //100 yards field - gameStartLine
        // yardToFirstDown();  //10-yardGain

        int scrimegeLine = 0;

        int toFirstDown = 10;
        //int toGo = 100 - startDrive;
        scrimegeLine = kickReturn();

        //playChoise(); //user select between play types. S-short pass, L-long pass, R - run
        playChoise();
        throwCalc();
    }

    //random number of yards 0-35 where football location on field after kick/punt return
    public static int kickReturn() {
        int startDrive = (int)(Math.random()*((35-0)+1));
        System.out.println("After kick return ball was carried to the "+startDrive + " line");
        return startDrive;
    }

    public static int runPlay() {
        int gainToAdd  = (int)(Math.random()*((15-(-5))+1))+(-5);
        System.out.println("Fullback is gain "+gainToAdd + " yards");
        return gainToAdd;
    }


    public static int longPlay() {
        int gainToAdd  = (int)(Math.random()*((25-10)+1))+10;
        System.out.println("Reciver is going for a long pass to "+gainToAdd + " from line of scrimage");
        return gainToAdd;
    }

    public static int shortPlay() {
        int gainToAdd  = (int)(Math.random()*((14-2)+1))+2;
        System.out.println("Reciver is going for a short pass to "+gainToAdd + " from line of scrimage");
        return gainToAdd;
    }


    //user select between play types. S-short pass, L-long pass, R - run
    public static void playChoise() {
        System.out.println("To start the drive please select the play type");
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the play type. S-short pass, L-long pass, R - run");
        String playChoise = choice.nextLine();  // Read user input
        switch(playChoise) {
            case "s":
                playChoise = "short pass";
                System.out.println("You select: "+ playChoise);
                shortPlay();
                break;
            case "l":
                playChoise = "long pass";
                System.out.println("You select: "+ playChoise);
                longPlay();
                break;
            case "r":
                playChoise = "run play";
                System.out.println("You select: "+ playChoise);
                runPlay();
                break;
            default:
                System.out.println("you didnt select correct");
        }

    }

    public static void throwCalc() {
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please select a throw angle. Type the number between 1 and 5. 5 the max");
        double throwAngle = data.nextDouble();  // Read user input
        System.out.println("Please select throw power. Type the number between 1 and 5. 5 the max");
        double throwPower = data.nextDouble();  // Read user input

    }
}