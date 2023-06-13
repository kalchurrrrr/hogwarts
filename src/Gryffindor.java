class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getGryffindorScore() {
        return nobility + honor + bravery;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Благородство: " + nobility + ", честь: " + honor + ", отвага: " + bravery;
    }
}