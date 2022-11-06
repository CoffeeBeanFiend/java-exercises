package exercises.pjohanson.novweek1.height;

public class HeightMain {
    public static void main(String[] args) {
        System.out.println("Height of somebody");
        Height heightOfSomebody = new Height(181);
        System.out.println(heightOfSomebody.getCentimeters());
        System.out.println(heightOfSomebody.getCentimetersAsString());
        System.out.println(heightOfSomebody.getFeetAndInches());
        System.out.println(heightOfSomebody.getFeetAndInchesAsString());

        System.out.println();

        System.out.println("Height of somebody else");
        Height heightOfSomebodyElse = new Height(5, 0);
        System.out.println(heightOfSomebodyElse.getFeetAndInches());
        System.out.println(heightOfSomebodyElse.getFeetAndInchesAsString());
        System.out.println(heightOfSomebodyElse.getCentimeters());
        System.out.println(heightOfSomebodyElse.getCentimetersAsString());
    }
}
