class Ravenclaw extends Hogwarts {
    private int intelligence;

    public Ravenclaw(int nobility, int honor, int courage, int magicPower, int transgressionDistance, int intelligence) {
        super(nobility, honor, courage, magicPower, transgressionDistance);
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void displayDescription() {
        System.out.println("Этот студент Когтеврана обладает благородством = " + getNobility() + ", честь = " + getHonor() + ", храбрость = " + getCourage() + ", магическая сила = " + getMagicPower() + ", расстояние трансгрессии = " + getTransgressionDistance() + ", и интеллектом = " + intelligence);
    }

    public void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.getNobility() + student1.getHonor() + student1.getCourage() + student1.getMagicPower() + student1.getTransgressionDistance() + student1.getIntelligence();
        int score2 = student2.getNobility() + student2.getHonor() + student2.getCourage() + student2.getMagicPower() + student2.getTransgressionDistance() + student2.getIntelligence();
        if (score1 > score2) {
            System.out.println("Студент 1 лучше Студента 2");
        } else if (score1 < score2) {
            System.out.println("Студент 2 лучше Студента 1");
        } else {
            System.out.println("Оба студента одинаково хороши");
        }
    }
}