// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var m1 = 78.2;
        var m2 = 82.7;
        var sumMas = m1 + m2;
        System.out.println(sumMas);
        var difMas = m2 - m1;
        System.out.println(difMas);

        var difMas2 = m2 % m1;
        System.out.println(difMas2);

        var ourTotal = 640;
        var kolWorker = ourTotal / 8;
        System.out.println("Всего работников в компании —"+kolWorker+" человек");

        kolWorker = kolWorker + 94;
        ourTotal = kolWorker * 8;
        System.out.println("Если в компании работает "+kolWorker+" человек, то всего "+ourTotal+" часов работы может быть поделено между сотрудниками");

    }
}