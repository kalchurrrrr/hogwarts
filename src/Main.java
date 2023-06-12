public class Main {
    public static void main(String[] args) {
        Gryffindor hermione = new Gryffindor(90, 10, 5, 5, 6);
        Gryffindor ron = new Gryffindor(85, 15, 3, 6, 5);
        Slytherin draco = new Slytherin(95, 5, 7, 8, 9, 6, 10);
        Hufflepuff zachariah = new Hufflepuff(80, 20, 6, 7, 8);

        hermione.compareMagicPowerAndTransgressionDistance(ron);
        draco.compareMagicPowerAndTransgressionDistance(zachariah);
    }
}