package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]quotes = new String[10];
        quotes[0] = "Be yourself; everyone else is already taken.";
        quotes[1] = "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.";
        quotes[2] = "The challenge is in the moment; the time is always now.";
        quotes[3] = "The time is always right to do what is right.";
        quotes[4] = "Winning isn’t everything, but wanting to win is.";
        quotes[5] = "If you’re offered a seat on a rocket ship, don’t ask what seat. Just get on.";
        quotes[6] = "You have within you, right now, everything you need to deal with whatever the world can throw at you.";
        quotes[7] = "Never be limited by other people’s limited imaginations.";
        quotes[8] = "The only impossible journey is the one you never begin.";
        quotes[9] = "Don’t watch the clock; do what it does. Keep going.";

        System.out.print("Select A number from 1-10 to get a quote: ");
        int userNum = scanner.nextInt();
        System.out.println("Your quote is: " + quotes[userNum-1]);

        scanner.close();
    }
}
