
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
        playChoise();
        throwCalc();
    }

    //random number of yards 0-35 where football location on field after kick/punt return
    public static int kickReturn() {
        int startDrive = (int) (Math.random() * ((35 - 0) + 1));
        System.out.println("After kick return ball was carried to the " + startDrive + " line");
        return startDrive;
    }
    //random number for run play between -5 and  15 yards
    public static int runPlay() {
        int gainToAdd = (int) (Math.random() * ((15 - (-5)) + 1)) + (-5);
        System.out.println("Fullback is gain " + gainToAdd + " yards");
        return gainToAdd;
    }

    //random number for long pass from 10 to 30 yards
    public static int longPlay() {
        int gainToAdd = (int) (Math.random() * ((30 - 10) + 1)) + 10;
        System.out.println("Reciver is going for a long pass to " + gainToAdd + " from line of scrimage");
        return gainToAdd;
    }

    //random number for short pass from 2 to 12 yards
    public static int shortPlay() {
        int gainToAdd = (int) (Math.random() * ((12 - 2) + 1)) + 2;
        System.out.println("Reciver is going for a short pass to " + gainToAdd + " from line of scrimage");
        return gainToAdd;
    }


    //user select between play types. S-short pass, L-long pass, R - run
    public static void playChoise() {
        System.out.println("To start the drive please select the play type");
        Scanner choice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the play type. S-short pass, L-long pass, R - run");
        String playChoise = choice.nextLine();  // Read user input
        switch (playChoise) {
            case "s":
                playChoise = "short pass";
                System.out.println("You select: " + playChoise);
                shortPlay();
                break;
            case "l":
                playChoise = "long pass";
                System.out.println("You select: " + playChoise);
                longPlay();
                break;
            case "r":
                playChoise = "run play";
                System.out.println("You select: " + playChoise);
                runPlay();
                break;
            default:
                System.out.println("you didnt select correct");
        }

    }

    // calculate the throw distance based on speed and angle
    public static double throwCalc() {
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        /*System.out.println("Please select a throw angle.");
        double throwAngle = data.nextDouble();  // Read user input*/
        System.out.println("Please select throw speed.");
        double throwSpeed = data.nextDouble();  // Read user input
        double calcDistance = throwSpeed * throwSpeed*calcAngle()/2;
        double throwDistance=Math.round(calcDistance);
        System.out.println("Football throw distance reach "+throwDistance+ " yards");
        return throwDistance;
    }

    // calculate the selected angle to the number for sin2a
    public static double calcAngle(){
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please select a throw angle.");
        double throwAngleinDegrees = data.nextDouble();  // Read user input
        double throwAngleinRadians = Math.toRadians(throwAngleinDegrees);
        //System.out.println("Math.sin(" + throwAngleinDegrees + ")=" + Math.sin(throwAngleinRadians));
        //System.out.println("Math.sin(" + throwAngleinDegrees + ")=" + Math.cos(throwAngleinRadians));
        double throwAngle=2*Math.cos(throwAngleinRadians)*Math.sin(throwAngleinRadians);
        //System.out.println("sin2a="+throwAngle);
        return throwAngle;
    }

    // convert speed in number between 0 and 10
    public static double convertSpeed() {
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please select throw speed. Enter a number between 0 and 10");
        double speedNumbers = data.nextDouble();  // Read user input
        double speedForFormula = speedNumbers/2;
        System.out.println("Speed for formula is "+speedForFormula+ " yards");
        return speedForFormula;
    }
}