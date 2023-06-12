class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHufflepuffScore() {
        return hardworking + loyal + honest;
    }
}