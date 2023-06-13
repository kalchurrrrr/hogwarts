class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getSlytherinScore() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Хитрость: " + cunning + ", решительность: " + determination + ", амбициозность: " + ambition + ", находчивость:" + resourcefulness + ", жажда власти:" + thirstForPower;
    }
}