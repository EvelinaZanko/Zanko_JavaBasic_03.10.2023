package ua.vodafone.homework;

public class UnluckyNumbers {
    public static void main(String[] args) {

        for (int index = 0; index < 101; index++) {
            String shuttleName = Integer.toString(index);
            if (shuttleName.contains("4")) {
                continue;
            } else if (shuttleName.contains("9")) {
                continue;
            }else{
                System.out.println("shuttleName" + shuttleName);
            }
        }
    }
}
