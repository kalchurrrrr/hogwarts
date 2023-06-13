class Hogwarts {
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getDescription() {
        return "Магическая сила: " + magicPower + ", Расстояние трансгрессии: " + transgressionDistance;
    }
}