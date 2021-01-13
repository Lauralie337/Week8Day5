package com.company;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    // step 3: create the kb class
    // step 3: define userName so that it can be executed
    Scanner kb = new Scanner(System.in); //thank you Josh, kb was a good scanner name idea ;)
    String userName = "";

    // step 4: define response so that it can be executed
    // step 5: default keepGoing to either true/false, it honestly doesn't matter, it just needs to be defined
    String response = "";
    boolean keepGoing = true;


    // step 1: verify your environment, settings, and ability to run a project on the command line.
    System.out.println("Hello World");

    // step 2: print the valid characters for input
    AsciiChars.printNumbers();
    AsciiChars.printUpperCase();
    AsciiChars.printLowerCase();

    // step 3: Ask the user their name and then respond with their name (create your scanner)
    System.out.println("What is your name?");
    System.out.print("Name: ");
    userName = kb.nextLine();   //object (I think) that represents the users name
    System.out.println("Hello, " + userName);

    // step 4: Ask the user if they want to continue to interactive portion
    System.out.println("Do you want to continue to the interactive portion?");
    System.out.print("Y or N: ");
    response = kb.nextLine();   //object (I think) that represents the users response

    // step 5: Determine what the users answer will do, in this case, only Y can trigger our true boolean
    if ((response.equalsIgnoreCase("y")) || response.equalsIgnoreCase("yes"))
        keepGoing = true;
    else
        keepGoing = false;
    // step 5: and then provide a response based on that answer
    if (keepGoing==true)
        System.out.println("Then let's keep going!!");
    else
        System.out.println("Take it easy! I hope to see you later.");


    // step 6: ask the user several questions
        // Pet Name
        System.out.println("What is the name of your favorite pet");
        System.out.print("Pet's name: ");
        String petName = "";
        petName = kb.nextLine();

        // Pet Age
        System.out.println("How old is " + petName + " now?");
        System.out.print("Their age: ");
        Integer petAge = 0;
        petAge = kb.nextInt();

        // Lucky Number
        boolean luckyNumberA = false;
        String luckyNumberQ = "";
        Integer luckyNumber = 0;





//        if((luckyNumberQ.equalsIgnoreCase("y")))
//            luckyNumberA = true;
//        else luckyNumberA = false;
        luckyNumberQ = kb.nextLine();
        System.out.println("Do you have a lucky number?");
        System.out.print("Y or N: ");
        luckyNumberQ = kb.nextLine();
        if((luckyNumberQ.equalsIgnoreCase("y")) || luckyNumberQ.equalsIgnoreCase("yes"))
            luckyNumberA = true;
        else luckyNumberA = false;

        // Yes - lucky number
        if (luckyNumberA == true) {
            System.out.println("Lucky numbers are like guiding stars!! What is yours?");
            System.out.print("Your number: ");
            luckyNumber = kb.nextInt();
            response = kb.nextLine();
            System.out.println("Ahh, lucky number " + luckyNumber + ", good choice.");
        } else {
            System.out.println("Superstition isn't my thing either, I'll make a number for you!");
        }


        //QB Number
        boolean favoriteQbA = false;
        String favoriteQbQ = "";
        String favoriteQbName = "";
        Integer jerseyNumber = 0;

                // Y or N on if they have a favorite QB
                System.out.println("Do you have a favorite quarterback?");
                System.out.print("Y or N: ");
                favoriteQbQ = kb.nextLine();
                if((favoriteQbQ.equalsIgnoreCase("y")) || favoriteQbQ.equalsIgnoreCase("yes"))
                    favoriteQbA = true;
                else favoriteQbA = false;

                // If they do, then let's get the jersey number
                if (favoriteQbA == true) {
                    System.out.println("That's awesome. What is their name?");
                    favoriteQbName = kb.nextLine();
                    System.out.println("Got it. So, what is " + favoriteQbName + "'s jersey number??");
                    System.out.print("Enter " + favoriteQbName + "'s jersey number: ");
                    jerseyNumber = kb.nextInt();
                    System.out.println(jerseyNumber + " is a great number.");
                }
                // If not, then we will just create a number for them instead
                else {
                    System.out.println("That's okay, I'll use this opportunity to create a number for you instead.");
                }

        // two-digit model year of car
        Integer carYear = 0;
        System.out.println("What is the model year of your car?");
        System.out.println("(For instance, a 19 model would be for 2019, while an 85 is from 1985)");
        System.out.print("Two-digit model year: ");
        carYear = kb.nextInt();

        // Name of favorite actor
        String actorName = "";
        actorName = kb.nextLine();
        System.out.println("What is the first name of your favorite actor");
        System.out.print("Actor's first name: ");
        actorName = kb.nextLine();
        System.out.println("Me too! " + actorName + " was awesome in their most recent flick.");

        // Random Number
        Integer selectedNumber = 0;
        System.out.println("Lastly, enter a random number between 1 and 50 to finish up!!");
        System.out.print("Random number between 1 and 50: ");
        selectedNumber = kb.nextInt();
        response = kb.nextLine();
        System.out.println("Okie doke, " + selectedNumber + " it is!");

//    // Step 6: Generating Outputs
//        // Step A: Create 3 random integers
        Random rng1 = new Random();
        //1st random class
        int upperbound1 = 25;
        //generate # 1 to 24 && != 25
        int int_random1 = rng1.nextInt(upperbound1);

        Random rng2 = new Random();
        //2nd random class
        int upperbound2 = 25;
        //generate # 1 to 24 && != 25
        int int_random2 = rng2.nextInt(upperbound2);

        Random rng3 = new Random();
        //3rd random class
        int upperbound3 = 25;
        //generate # 1 to 4
        int int_random3 = rng3.nextInt(upperbound3);

        System.out.println("Three numbers have been chosen at random and are " + int_random1 + " as the 1st, " + int_random2 + " as the 2nd, " + int_random3 + " as the 3rd.");
//
//        // Step B: Create a magic ball number
            int magicBallFeeder = Math.random() > 0.5 ? jerseyNumber : selectedNumber;
            int magicBall = (int) Math.floor(Math.random() * magicBallFeeder + 1);
//            //otherwise I could make a math.random and then if/else based on the result
//            //i.e. if > .5 use jerseyNumber else use selected or luckyNumber
        //This magic ball idea turned out to be so very close to the actual answer. Massive sigh of relief. Thank you Yusuf for helping me setup those rng classes!!!!
//
//        // Step C: Generate the non-magic numbers

                //Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
                int petNameNumber = petName.charAt(2);
//                lottoNumberArray.add(petNameNumber);

                //Use the two digit model year of their car and add their lucky number to it.
                int luckyNumberAndCarYear = luckyNumber + carYear;
//                lottoNumberArray.add(luckyNumberAndCarYear);

                //Use the random number between 1 and 50, subtracting one of the generated random numbers.
                int moddedRandom = selectedNumber - (Math.random() < .5 ? int_random1 : int_random2);
//                lottoNumberArray.add(moddedRandom);

                //Convert the first letter of their favorite actor/actress to an integer and use that value.
                int actorNameFirstInteger = actorName.charAt(0);
//                lottoNumberArray.add(actorNameFirstInteger);

                //Convert the last letter of their favorite actor/actress to an integer and use that value.
                int actorNameLastInteger = actorName.charAt(actorName.length() - 1);
//                lottoNumberArray.add(actorNameLastInteger);

                //  These, I believe, are optional. The instructions in the .MD stated we only needed 5 random numbers, not that we /had/ to use more.
                //  Unfortunately, I wasn't sure how to pull them randomly out of lottoNumberArray versus just listing the first 5 indexes over and over >:[
        //Okay, refactor for HashSet soon
        //Done?
                //Use the value 42.
                int theAnswer = 42;
//                lottoNumberArray.add(theAnswer);

                //Use the age of their favorite pet + their car model year.
                 int petAgeCarYear = petAge + carYear;
//                 lottoNumberArray.add(petAgeCarYear);

                //Favorite quarterback number + age of pet + lucky number.
                int jerseyNumberPetAgeLuckyNumber = jerseyNumber + petAge + luckyNumber;
//                lottoNumberArray.add(jerseyNumberPetAgeLuckyNumber);

                //Store the numbers in an array so we can draw them lotto style
//                ArrayList<Integer> lottoNumberArray = new ArrayList<>();
                int [] lottoNumberArray = new int[] {
                        petNameNumber, luckyNumberAndCarYear, moddedRandom, actorNameFirstInteger, actorNameLastInteger, theAnswer, petAgeCarYear, jerseyNumberPetAgeLuckyNumber
                };


                //Check to make sure all values actually print/read/flow/etc.

                //Once all the numbers have been calculated, print them out in this form:
                //Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
        System.out.println("Drumroll...");
//        System.out.println("Your lottery numbers are: ");
//        for (int yourNumbers : lottoNumberArray) {
//            System.out.print(yourNumbers + ", ");
//        };
//        System.out.println();

//                //Time to adjust the numbers to be under 75
                int[] adjustedLottoNumberArray = adjustNumbers(lottoNumberArray);
//
//                //Print new numbers
//                for (int yourNumbersAdjusted : adjustedLottoNumberArray) {
//                    System.out.print(yourNumbersAdjusted + ", ");
//                };
//                System.out.println();

                //Creating the HashSet
                Random randomizedIndex = new Random();
                Set<Integer> chosenIndex = new LinkedHashSet<Integer>();
                while (chosenIndex.size() < 5) {
                    chosenIndex.add(randomizedIndex.nextInt(8));
                }

//        System.out.println("Chosen number sources: " + chosenIndex);
        System.out.print("\nYour lottery Numbers: ");
        for ( int out : chosenIndex ) {
            System.out.print(lottoNumberArray[out] + ", ");
        }
        System.out.println("Magic ball: " + magicBall);
    }


        public static int[] adjustNumbers(int [] lotteryNumbers) {
            int maxLotteryNumber = 75;

            for (int i =0; i < lotteryNumbers.length; i++) {
                while (lotteryNumbers[i] > maxLotteryNumber) {
                    lotteryNumbers[i] -= maxLotteryNumber;
                }
                while (lotteryNumbers[i] < 1) {
                    lotteryNumbers[i] += maxLotteryNumber;
                }
                for (int x=0; x < lotteryNumbers.length; x++) {
                    if (i != x) {
                        if (lotteryNumbers[i] == lotteryNumbers[x]){
                            lotteryNumbers[x] += 1;
                        }
                    }
                }
            }
            return lotteryNumbers;

        }


/*        https://www.javatpoint.com/java-char-to-int
        char aChar = 'a';
        int ascii = aChar;              // auto cast char to int
        System.out.println(ascii);
        // 97
        https://mkyong.com/java/how-to-convert-character-to-ascii-in-java/
*/

    }

