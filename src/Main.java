public class Main {
    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor(5, 5, 6, 8, 10, 9);
        Gryffindor ron = new Gryffindor(3, 6, 5, 7, 9, 8);
        hermione.displayDescription();
        ron.displayDescription();
        hermione.compareStudents(hermione, ron);

        Slytherin draco = new Slytherin(4, 7, 5, 9, 8, 10);
        Slytherin zachariah = new Slytherin(3, 6, 5, 8, 9, 8);
        draco.displayDescription();
        zachariah.displayDescription();
        draco.compareStudents(draco, zachariah);

        Hufflepuff cedric = new Hufflepuff(5, 6, 5, 8, 9, 9);
        Hufflepuff justin = new Hufflepuff(4, 5, 6, 7, 8, 7);
        cedric.displayDescription();
        justin.displayDescription();
        cedric.compareStudents(cedric, justin);

        Ravenclaw luna = new Ravenclaw(5, 6, 5, 8, 9, 10);
        Ravenclaw cho = new Ravenclaw(4, 5, 6, 7, 8, 9);
        luna.displayDescription();
        cho.displayDescription();
        luna.compareStudents(luna, cho);
    }
}