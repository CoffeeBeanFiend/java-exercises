package exercises.pjohanson.novweek1.height;

import java.util.ArrayList;

public class Height {
    protected int heightMicrometers;

    public final int MICROMETERS_IN_CENTIMETER = 10000;
    public final int MICROMETERS_IN_INCH = 25400;
    public final int MICROMETERS_IN_FOOT = 304800;

    public Height(int heightInCentimeters) {
        this.heightMicrometers = heightInCentimeters * MICROMETERS_IN_CENTIMETER;
    }

    public Height(int feet, int inches) {
        this.heightMicrometers = feet * MICROMETERS_IN_FOOT + inches * MICROMETERS_IN_INCH;
    }

    public int getCentimeters() {
        return heightMicrometers / MICROMETERS_IN_CENTIMETER;
    }

    public String getCentimetersAsString() {
        return getCentimeters() + "cm";
    }

    public ArrayList<Integer> getFeetAndInches() {
        int inchesInMicrometers = heightMicrometers % MICROMETERS_IN_FOOT;
        int feet = (heightMicrometers - inchesInMicrometers) / MICROMETERS_IN_FOOT;
        int inches = inchesInMicrometers / MICROMETERS_IN_INCH;
        ArrayList<Integer> feetAndInches = new ArrayList<>();
        feetAndInches.add(feet);
        feetAndInches.add(inches);
        return feetAndInches;
    }

    public String getFeetAndInchesAsString() {
        ArrayList<Integer> feetAndInches = getFeetAndInches();
        int feet = feetAndInches.get(0);
        int inches = feetAndInches.get(1);
        return feet + " foot " + (inches > 0 ? inches : "flat");
    }
}
