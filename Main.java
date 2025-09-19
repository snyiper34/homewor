public class Main {
    public static void main(String[] args) {
       int x = 7;
       byte c = 127;
       short v = 32766;
       long b = 10000;
       float n = 3.4f;
       double m = 1.7;
       System.out.println(x);
       System.out.println(c);
       System.out.println(v);
       System.out.println(b);
       System.out.println(n);
       System.out.println(m);

       float number = 27.12f;
       long number2 = 987678965549l;
       double number3 = 2.786;
       short number4 = 569;
       short number5 = -159;
       short number6 = 27897;
       byte number7 = 67;
       System.out.println(number);
       System.out.println(number2);
       System.out.println(number3);
       System.out.println(number4);
       System.out.println(number5);
       System.out.println(number6);
       System.out.println(number7);

       int lp = 23;
       int an = 27;
       int ea = 30;
       int list = 480;
       int list1 = lp + an + ea / list;
       System.out.println("На каждого ученика рассчитано " + list1 + " листов бумаги");

       int workBootle = 16;
       int time = 2;
       int time1 = 20;
       int minute = 60;
       int data = 24;
       int data1 = 3;
       int mother = 30;
       int dat = data * data1;
       int min = time1 / time;
       int day1 = (minute * data) / time;
       int dat3 = (dat * minute) / time;
       int mother1 = data * mother;
       int moth = (mother1 * minute) / time;

       String time20Minutes = "20 минут";
       String timeDay = "сутки";
       String time3Days = "3 дня";
       String timeMonth = "1 месяц";

       System.out.println("За "+ time20Minutes + " машина произвела " + min + " штук бутылок");
       System.out.println("За "+ timeDay + " машина произвела " + day1 + " штук бутылок");
       System.out.println("За " + time3Days + " машина произвела " + dat3 + " штук бутылок");
       System.out.println("За "+ timeMonth + " машина произвела " + moth + " штук бутылок");

       int jar = 120;
       int whitePain = 2;
       int brownPaint = 4;
       int jar1 = whitePain + brownPaint;
       int clas = jar / jar1;
       int white = clas * whitePain;
       int brown = clas * brownPaint;

       System.out.println("В школе, где " + clas + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски" );

       int banan = 80;
       int milk = 105;
       int plombir = 100;
       int egg = 70;
       int banan1 = 5;
       int milk1 = 2;
       int plombir1 = 2;
       int egg1 = 4;
       int banan2 = banan * banan1;
       int milk2 = milk * milk1;
       int plombir2 = plombir * plombir1;
       int egg2 = egg * egg1;
       int gr = banan2 + milk2 + plombir2 + egg2;
       float kg = gr / 1000f;
       System.out.println("Всего грамм " + gr + " Всего килограмм " + kg);

       int sbros = 7;
       int sbrosKg = sbros * 1000;
       int poxyd = 250;
       int poxyd1 = 500;
       int sr = (poxyd1 + poxyd) / 2;
       int tim = sbrosKg / poxyd;
       int tim2 = sbrosKg / poxyd1;
       int tim3 = sbrosKg / sr;
       System.out.println("Если спорстмен трать в день 250 грамм то ему понадобиться " + tim + " дней, если 500 грамм в день то " + tim2 + " дней а в среднем понадобиться " + tim3 + " дней");

       int masha = 67760;
       int denis = 83690;
       int kristina = 76230;
       int god = 12;
       int mashaGod = masha * god;
       int denisGod = denis * god;
       int kristinaGod = kristina * god;

       float proc = 1.1f;
       float masha1 = masha * proc;
       float denis1 = denis * proc;
       float kristina1 = kristina * proc;

       float raznica = (masha1 - masha) * god;
       float raznica1 = (denis1 - denis) * god;
       float raznica2 = (kristina1 - kristina) * god;

       System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + raznica + " рублей");
       System.out.println("Маша теперь получает " + denis1 + " рублей. Годовой доход вырос на " + raznica1 + " рублей");
       System.out.println("Маша теперь получает " + kristina1 + " рублей. Годовой доход вырос на " + raznica2 + " рублей");










    }
}