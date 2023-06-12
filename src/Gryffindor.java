class Gryffindor extends Hogwarts {
    private int bravery;

    public Gryffindor(int nobility, int honor, int courage, int magicPower, int transgressionDistance, int bravery) {
        super(nobility, honor, courage, magicPower, transgressionDistance);
        this.bravery = bravery;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void displayDescription() {
        System.out.println("Этот студент Гриффиндора обладает благородством = " + getNobility() + ", честь = " + getHonor() + ", храбрость = " + getCourage() + ", магическая сила = " + getMagicPower() + ", расстояние трансгессии = " + getTransgressionDistance() + ", и отвага = " + bravery);
    }

    public void compareStudents(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.getNobility() + student1.getHonor() + student1.getCourage() + student1.getMagicPower() + student1.getTransgressionDistance() + student1.getBravery();
        int score2 = student2.getNobility() + student2.getHonor() + student2.getCourage() + student2.getMagicPower() + student2.getTransgressionDistance() + student2.getBravery();
        if (score1 > score2) {
            System.out.println("Студент 1 лучше студента 2");
        } else if (score1 < score2) {
            System.out.println("Студент 2 лучше студента 1");
        } else {
            System.out.println("Оба студента одинаково хороши");
        }
    }
}
