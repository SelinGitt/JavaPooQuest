public class Classroom {

    public static void main(final String[] args) {
        Wilder wilder1 = new Wilder("Benjamin", true);
        Wilder wilder2 = new Wilder("Alexandre", false);

        wilder1.whoAmI();
        wilder2.whoAmI();
    }
}
