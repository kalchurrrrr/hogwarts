public class Hogwarts {
    private String name;
    private int age;
    private String gender;
    private String house;
    private Gryffindor gryffindor;
    private Hufflepuff hufflepuff;
    private Ravenclaw ravenclaw;
    private Slytherin slytherin;
    public Hogwarts(String name, int age, String gender, String house, int bravery, int chivalry, int daring, int loyalty, int patience, int intelligence, int ambition, int magicPower, int transgressionDistance) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.house = house;
        this.gryffindor = new Gryffindor(bravery, chivalry, daring);
        this.hufflepuff = new Hufflepuff(loyalty, patience);
        this.ravenclaw = new Ravenclaw(intelligence);
        this.slytherin = new Slytherin(ambition, magicPower, transgressionDistance);
    }

    public void describeStudent() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
        System.out.println("Факультет: " + house);
        switch (house) {
            case "Gryffindor":
                System.out.println("Храбрость: " + gryffindor.getBravery());
                System.out.println("Честь: " + gryffindor.getChivalry());
                System.out.println("Смелость: " + gryffindor.getDaring());
                break;
            case "Hufflepuff":
                System.out.println("Лояльность: " + hufflepuff.getLoyalty());
                System.out.println("Терпение: " + hufflepuff.getPatience());
                break;
            case "Ravenclaw":
                System.out.println("Интеллект: " + ravenclaw.getIntelligence());
                break;
            case "Slytherin":
                System.out.println("Амбиции: " + slytherin.getAmbition());
                System.out.println("Сила магии: " + slytherin.getMagicPower());
                System.out.println("Расстояние трансгрессии: " + slytherin.getTransgressionDistance());
                break;
        }
    }

    public void compareGryffindorStudents(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.gryffindor.getBravery() + student1.gryffindor.getChivalry() + student1.gryffindor.getDaring();
        int sum2 = student2.gryffindor.getBravery() + student2.gryffindor.getChivalry() + student2.gryffindor.getDaring();
        if (sum1 > sum2) {
            System.out.println(student1.name + " лучший Гриффиндорец, чем " + student2.name);
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " лучший Гриффиндорец, чем " + student1.name);
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковые показатели");
        }
    }

    public void compareHufflepuffStudents(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.hufflepuff.getLoyalty() + student1.hufflepuff.getPatience();
        int sum2 = student2.hufflepuff.getLoyalty() + student2.hufflepuff.getPatience();
        if (sum1 > sum2) {
            System.out.println(student1.name + " лучший Пуфендуец, чем " + student2.name);
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " лучший Пуфендуец, чем " + student1.name);
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковые показатели");
        }
    }

    public void compareRavenclawStudents(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.ravenclaw.getIntelligence();
        int sum2 = student2.ravenclaw.getIntelligence();
        if (sum1 > sum2) {
            System.out.println(student1.name + " лучший Когтевранец, чем " + student2.name);
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " лучший Когтевранец, чем " + student1.name);
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковые показатели");
        }
    }

    public void compareSlytherinStudents(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.slytherin.getAmbition() + student1.slytherin.getMagicPower() + student1.slytherin.getTransgressionDistance();
        int sum2 = student2.slytherin.getAmbition() + student2.slytherin.getMagicPower() + student2.slytherin.getTransgressionDistance();
        if (sum1 > sum2) {
            System.out.println(student1.name + " лучший Слизеринец, чем " + student2.name);
        } else if (sum1 < sum2) {
            System.out.println(student2.name + " лучший Слизеринец, чем " + student1.name);
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " одинаковые показатели");
        }
    }

    public void compareMagicPowerAndTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        if (student1.slytherin.getMagicPower() > student2.slytherin.getMagicPower() && student1.slytherin.getTransgressionDistance() > student2.slytherin.getTransgressionDistance()) {
            System.out.println(student1.name + " обладает бОльшей мощностью магии и большим расстоянием трансгрессии, чем " + student2.name);
        } else if (student1.slytherin.getMagicPower() < student2.slytherin.getMagicPower() && student1.slytherin.getTransgressionDistance() < student2.slytherin.getTransgressionDistance()) {
            System.out.println(student2.name + " обладает бОльшей мощностью магии и большим расстоянием трансгрессии, чем " + student1.name);
        } else {
            System.out.println("У " + student1.name + " и " + student2.name + " разные показатели мощности магии и расстояния трансгрессии");
        }
    }
}