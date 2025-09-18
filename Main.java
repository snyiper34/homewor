public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var x = dog + 4;
        var y = cat + 4;
        var g = paper + 4;
        System.out.println(x);
        System.out.println(y);
        System.out.println(g);
        var x1 = x - 3.5;
        var x2 = y - 1.6;
        var x3 = g - 7639;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        var friend = 19;
        var friend1 = friend + 2;
        var friend2 = friend1 / 7;
        System.out.println(friend2);

        var frog = 3.5;
        var frog1 = frog * 10;
        var frog2 = frog1 / 3.5;
        var frog3 = frog2 + 4;
        System.out.println(frog3);

        var oneBox = 78.2;
        var twoBox = 82.7;
        System.out.println(oneBox + twoBox);
        System.out.println(oneBox - twoBox);
        System.out.println(twoBox % oneBox);

        var hour = 640;
        var work = 8;
        var people = hour / work;
        var mostPeople = people + 94;
        var work1 = work * mostPeople;
        System.out.println("Всего работников в компании " + people + " человек");
        System.out.println("Если в компании работает " + mostPeople + " человек то всего " + work1 + " часов работы может быть поделено между сотрудниками");


    }
}