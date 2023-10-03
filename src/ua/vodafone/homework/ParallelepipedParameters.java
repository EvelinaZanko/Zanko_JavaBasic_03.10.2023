package ua.vodafone.homework;

public class ParallelepipedParameters {

    public static void main(String[] args) {

        int length = 9;
        int width = 6;
        int height = 3;
        int volume = length * width * height;
        System.out.println("The volume of a parallelepiped = " + volume);
        int totalLength = (length + width + height) * 4;
        System.out.println("The total length of all faces of a parallelepiped = " + totalLength);

    }
}
