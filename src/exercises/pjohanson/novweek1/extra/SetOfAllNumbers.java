package exercises.pjohanson.novweek1.extra;

public class SetOfAllNumbers {
    public static void main(String[] args) {
        // Explore the generator a=6 p=11
        ExponentModIterator expModsOfA6P11 = new ExponentModIterator(6, 11);

        System.out.println("Here are the elements of the generator");

        // Iterate and display the elements of the group one by one
        for (ExponentMod expMod: expModsOfA6P11) {
            System.out.println(expMod);
        }

        System.out.println("Here are 20 more!!");

        // Look at 20 more elements, does it really repeat? Spoilers - it does!!!
        expModsOfA6P11.extendIterator(20);
        for (ExponentMod expMod: expModsOfA6P11) {
            System.out.println(expMod);
        }

        System.out.println("Are there more generators when p = 11 and 2 < a < 11 ?");

        // See which are generators
        for (int a = 2; a <= 10; a++) {
            ExponentModIterator curExpMod = new ExponentModIterator(a, 11);
            String cyclicGroupStatus = (curExpMod.isGenerator() ? "is a generator" : "is NOT a generator");
            System.out.println("a**k mod p (1 <= k <= p - 1) set when a = " + a + " and p = 11 " + cyclicGroupStatus);
        }

        System.out.println();
        System.out.println("Finally, get some sets (was asked in the exercise)");

        System.out.println("a = 7, p = 17");
        System.out.println(new ExponentModIterator(7, 17).getSet());
        System.out.println();
        System.out.println("a = 5, p = 61");
        System.out.println(new ExponentModIterator(5, 61).getSet());
        System.out.println();

        System.out.println();
    }
}
