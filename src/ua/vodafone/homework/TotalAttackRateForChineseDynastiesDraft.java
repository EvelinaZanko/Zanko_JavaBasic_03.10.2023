package ua.vodafone.homework;

public class TotalAttackRateForChineseDynastiesDraft {

    public static void main(String[] args) {

        int warriorAttackLi = 13;
        int archerAttackLi = 24;
        int riderAttackLi = 46;

        int numberOfUnitsLi = 860;
        int totalAttackDynastyLi = numberOfUnitsLi * (warriorAttackLi + archerAttackLi + riderAttackLi);
        System.out.println("Total Attack Dynasty Li = " + totalAttackDynastyLi);

        int warriorAttackMin = 9;
        int archerAttackMin = 35;
        int riderAttackMin = 12;

        double numberOfUnitsMin = numberOfUnitsLi * 1.5;
        int result;

        result = (int) numberOfUnitsMin;

        int totalAttackDynastyMin = result * (warriorAttackMin + archerAttackMin + riderAttackMin);
        System.out.println("Total Attack Dynasty Min = " + totalAttackDynastyMin);
    }
}