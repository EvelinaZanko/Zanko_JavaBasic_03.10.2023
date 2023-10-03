package ua.vodafone.homework;

public class TotalAttackRateForChineseDynasties {
    public static void main(String[] args) {
        printCalculationAttackDynastyMin();
        printCalculationAttackDynastyLi();

    }

    public static void printCalculationAttackDynastyMin() {

        int warriorAttack = 13;
        int archerAttack = 24;
        int riderAttack = 46;
        int numberOfUnits = 860 ;
        int totalAttackDynasty = numberOfUnits * (warriorAttack + archerAttack + riderAttack);
        System.out.println("Total Attack Dynasty Li = " + totalAttackDynasty);

    }

    public static void printCalculationAttackDynastyLi() {

        int warriorAttack = 9;
        int archerAttack = 35;
        int riderAttack = 12;

        int numberOfEnemyUnits = 860;
        double numberOfUnits = numberOfEnemyUnits * 1.5;
        int resultNumberOfUnits = (int) numberOfUnits;

        int totalAttackDynastyMin = resultNumberOfUnits * (warriorAttack + archerAttack + riderAttack);
        System.out.println("Total Attack Dynasty Min = " + totalAttackDynastyMin);
    }
    
}
