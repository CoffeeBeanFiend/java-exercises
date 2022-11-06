package exercises.pjohanson.novweek1.weight;

public class WeightMain {
    public static void main(String[] args) {
        Height heightOfSomebody = new Height(181);
        System.out.println(heightOfSomebody.getCentimeters());
        System.out.println(heightOfSomebody.getFeetAndInches());
        System.out.println(heightOfSomebody.getFeetAndInchesAsString());

        System.out.println();

        Height heightOfSomebodyElse = new Height(5, 10);
        System.out.println(heightOfSomebodyElse.getCentimeters());

    }
}
