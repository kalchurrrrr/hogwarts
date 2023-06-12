class Slytherin extends Hogwarts {
    private int cunning;

    public Slytherin(int nobility, int honor, int courage, int magicPower, int transgressionDistance, int cunning) {
        super(nobility, honor, courage, magicPower, transgressionDistance);
        this.cunning = cunning;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void displayDescription() {
        System.out.println("Этот студент Слизерина обладает благородством = " + getNobility() + ", честь = " + getHonor() + ", храбрость = " + getCourage() + ", магическая сила = " + getMagicPower() + ", расстояние трансгрессии = " + getTransgressionDistance() + ", и хитрость = " + cunning);
    }

    public void compareStudents(Slytherin student1, Slytherin student2) {
        int score1 = student1.getNobility() + student1.getHonor() + student1.getCourage() + student1.getMagicPower() + student1.getTransgressionDistance() + student1.getCunning();
        int score2 = student2.getNobility() + student2.getHonor() + student2.getCourage() + student2.getMagicPower() + student2.getTransgressionDistance() + student2.getCunning();
        if (score1 > score2) {
            System.out.println("Студент 1 лучше Студента 2");
        } else if (score1 < score2) {
            System.out.println("Студент 2 лучше Студента 1");
        } else {
            System.out.println("Оба студента одинаково хороши");
        }
    }
}