public class Main {
    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int student1Score = student1.getGryffindorScore();
        int student2Score = student2.getGryffindorScore();

        if (student1Score > student2Score) {
            System.out.println("Студент Грифиндора 1 лучше студента Грифиндора 2.");
        } else if (student1Score < student2Score) {
            System.out.println("Студент Грифиндора 2 лучше студента Грифиндора 1.");
        } else {
            System.out.println("Оба студента Грифиндора одинаковы.");
        }
    }
    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int student1Score = student1.getHufflepuffScore();
        int student2Score = student2.getHufflepuffScore();

        if (student1Score > student2Score) {
            System.out.println("Студент Пуффендуя 1 лучше студента Пуффендуя 2.");
        } else if (student1Score < student2Score) {
            System.out.println("Студент Пуффендуя 2 лучше студента Пуффендуя 1.");
        } else {
            System.out.println("Оба студента Пуффендуя одинаковы.");
        }
    }
    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int student1Score = student1.getRavenclawScore();
        int student2Score = student2.getRavenclawScore();

        if (student1Score > student2Score) {
            System.out.println("Студент Когтеврана 1 лучше студента Когтеврана 2.");
        } else if (student1Score < student2Score) {
            System.out.println("Студент Когтеврана 2 лучше студента Когтеврана 1.");
        } else {
            System.out.println("Оба студента Когтеврана одинаковы.");
        }
    }
    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int student1Score = student1.getSlytherinScore();
        int student2Score = student2.getSlytherinScore();

        if (student1Score > student2Score) {
            System.out.println("Студент Слизерина 1 лучше студента Слизерина 2.");
        } else if (student1Score < student2Score) {
            System.out.println("Студент Слизерина 2 лучше студента Слизерина 1.");
        } else {
            System.out.println("Оба студента Слизерина одинаковы.");
        }
    }

    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor(90, 10, 5, 5, 6);
        Gryffindor ron = new Gryffindor(85, 15, 3, 6, 5);
        Hufflepuff zacharia = new Hufflepuff(87, 20,4,2, 2);
        Hufflepuff cedric = new Hufflepuff(80, 18, 7, 4, 8);
        Ravenclaw padma = new Ravenclaw(78, 15, 10, 11, 25, 17);
        Ravenclaw marcus = new Ravenclaw(70, 11, 7, 14, 15, 21);
        Slytherin draco = new Slytherin(90, 20, 12, 14, 12, 34, 19);
        Slytherin graham = new Slytherin(78, 18, 22, 30, 20, 21, 29);


        System.out.println(hermione.getDescription());
        System.out.println(ron.getDescription());
        compareGryffindorStudents(hermione, ron);
        System.out.println(zacharia.getDescription());
        System.out.println(cedric.getDescription());
        compareHufflepuffStudents(zacharia,cedric);
        System.out.println(padma.getDescription());
        System.out.println(marcus.getDescription());
        compareRavenclawStudents(padma, marcus);
        System.out.println(draco.getDescription());
        System.out.println(graham.getDescription());
        compareSlytherinStudents(draco, graham);
    }
}