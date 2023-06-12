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

    public void compareMagicPowerAndTransgressionDistance(Hogwarts otherStudent) {
        if (this.magicPower > otherStudent.magicPower) {
            System.out.println("Этот студент обладает большей магической силой");
        } else if (this.magicPower < otherStudent.magicPower) {
            System.out.println("У другого студента магическая сила больше");
        } else {
            System.out.println("Студенты имеют одинаковую магическую силу");
        }

        if (this.transgressionDistance > otherStudent.transgressionDistance) {
            System.out.println("Этот студент имеет большую дальность трансгрессии");
        } else if (this.transgressionDistance < otherStudent.transgressionDistance) {
            System.out.println("Другой студент имеет большую дальность трансгрессии");
        } else {
            System.out.println("Студенты имеют одинаковую дальность трансгрессии");
        }
    }
}
