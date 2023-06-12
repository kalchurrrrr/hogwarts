class Hufflepuff extends Hogwarts {
    private int loyalty;

    public Hufflepuff(int nobility, int honor, int courage, int magicPower, int transgressionDistance, int loyalty) {
        super(nobility, honor, courage, magicPower, transgressionDistance);
        this.loyalty = loyalty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void displayDescription() {
        System.out.println("Этот студент Пуфендуя обладает благородством = " + getNobility() + ", честь = " + getHonor() + ", храбрость = " + getCourage() + ", магическая сила = " + getMagicPower() + ", расстояние тренсгрессии = " + getTransgressionDistance() + ", и лояльность = " + loyalty);
    }

    public void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.getNobility() + student1.getHonor() + student1.getCourage() + student1.getMagicPower() + student1.getTransgressionDistance() + student1.getLoyalty();
        int score2 = student2.getNobility() + student2.getHonor() + student2.getCourage() + student2.getMagicPower() + student2.getTransgressionDistance() + student2.getLoyalty();
        if (score1 > score2) {
            System.out.println("Студент 1 лучше студента 2");
        } else if (score1 < score2) {
            System.out.println("Студент 2 лучше студента 1");
        } else {
            System.out.println("Оба студента одинаково хороши");
        }
    }
}
