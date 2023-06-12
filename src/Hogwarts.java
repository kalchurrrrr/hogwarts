public class Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(int nobility, int honor, int courage, int magicPower, int transgressionDistance) {
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}