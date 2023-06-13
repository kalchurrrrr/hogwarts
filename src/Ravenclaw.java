class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(int magicPower, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getRavenclawScore() {
        return smart + wise + witty + creative;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Ум: " + smart + ", мудрость: " + wise + ", остроумие: " + witty + ", креатив:" + creative;
    }
}
