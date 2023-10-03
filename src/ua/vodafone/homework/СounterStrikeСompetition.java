package ua.vodafone.homework;

import java.util.Scanner;

public class СounterStrikeСompetition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First team name: ");
        String firstTeamName = scanner.nextLine();
        System.out.println("Amount of frags for the first team: ");
        int memberOneFirstTeam = scanner.nextInt();
        int memberTwoFirstTeam = scanner.nextInt();
        int memberThreeFirstTeam = scanner.nextInt();
        int memberFourFirstTeam = scanner.nextInt();
        int memberFiveFirstTeam = scanner.nextInt();

        System.out.println("Second team name: ");
        String tmp = scanner.nextLine();
        String secondTeamName = scanner.nextLine();
        System.out.println("Amount of frags for the second team: ");
        int memberOneSecondTeam = scanner.nextInt();
        int memberTwoSecondTeam = scanner.nextInt();
        int memberThreeSecondTeam = scanner.nextInt();
        int memberFourSecondTeam = scanner.nextInt();
        int memberFiveSecondTeam = scanner.nextInt();

        int totalFragsOfFirstTeam = memberOneFirstTeam + memberTwoFirstTeam + memberThreeFirstTeam + memberFourFirstTeam + memberFiveFirstTeam;
        int totalFragsOfSecondTeam = memberOneSecondTeam + memberTwoSecondTeam + memberThreeSecondTeam + memberFourSecondTeam + memberFiveSecondTeam;

        if (totalFragsOfFirstTeam > totalFragsOfSecondTeam) {
            System.out.println("Team " + firstTeamName + " won. Scored " + totalFragsOfFirstTeam + " points.");
        } else {
            System.out.println("Team " + secondTeamName + " won. Scored " +  totalFragsOfSecondTeam + " points.");
        }

    }

}
