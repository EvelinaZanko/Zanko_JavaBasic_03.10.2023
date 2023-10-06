package ua.vodafone.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {


    public static void main(String[] args) {
        int[] wolvesTeam = new int[25];
        int[] tigersTeam = new int[25];

        assignAge(wolvesTeam, tigersTeam);

    }

    public static void assignAge(int[] wolvesTeam, int[] tigersTeam) {

        int minAge = 16;
        int maxAge = 41;

        int oneCount = 0;
        int twoCount = 0;

        int oneSumAge = 0;
        int oneAverageAge = 0;

        int twoSumAge = 0;
        int twoAverageAge = 0;

        System.out.print("Wolves Team: ");

        for (int i = 0; i < wolvesTeam.length; i++) {
            wolvesTeam[i] = ThreadLocalRandom.current().nextInt(minAge, maxAge);
            oneCount++;

            System.out.print("Age member " + oneCount + " = " + wolvesTeam[i] + "; ");

            oneSumAge += wolvesTeam[i];
            oneAverageAge = oneSumAge / oneCount;

        }

        System.out.println(" ");
        System.out.println("Average age of the Wolves Team: " + oneAverageAge);


        System.out.println(" ");
        System.out.print("Tigers Team: ");

        for (int i = 0; i < tigersTeam.length; i++) {

            tigersTeam[i] = ThreadLocalRandom.current().nextInt(minAge, maxAge);
            twoCount++;

            System.out.print("Age member " + twoCount + " = " + tigersTeam[i] + "; ");

            twoSumAge += tigersTeam[i];
            twoAverageAge = twoSumAge / twoCount;
        }

        System.out.println(" ");
        System.out.println("Average age of the Wolves Team: " + twoAverageAge);

    }
}
