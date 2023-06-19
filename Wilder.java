public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void whoAmI() {
        System.out.println("Je m'appelle " + this.getFirstname() + " et je " + (this.isAware() ? "suis" : "ne suis pas")
                + " aware");
    }
}