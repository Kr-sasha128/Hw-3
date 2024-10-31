public class Main {
    public static void main(String[] args) {
        byte bananas = 100;
        System.out.println( "Бананов " + bananas + " кг");
        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");
byte a = 1;
short b = 1;
int c = 1;
int d = a + b + c;
        System.out.println(d);
        int e = 1000000;
        System.out.println("Значение переменной money с типом int равно " + e );
        byte f = 100;
        System.out.println("Значение переменной f с типом byte равно " + f);
        short g = 15555;
        System.out.println("Значение переменной g с типом short равно " + g);
        long h = 10000001;
        System.out.println("Значение переменной h с типом long равно " + h);
        float i = 3.23F;
        System.out.println("Значение переменной i с типом float равно " + i);
        double j = 8.800553535;
        System.out.println("Значение переменной j с типом double равно " + j);

        float k = (float) 27.12;
        System.out.println( k );
        Long l = 987678965549L;
        System.out.println(l);
        double m = 2.786;
        System.out.println( m);
        short n = 569;
        System.out.println(n);
        short o = -159;
        System.out.println(o);
        short p = 27897;
        System.out.println(p);
        byte q = 67;
        System.out.println(q);

        byte lyudmilaPavlovna = 23;
        byte annaSergeevn = 27;
        byte EkaterinaAndreevna = 30;
        short pupilsInThreeClasses = (short) (lyudmilaPavlovna + annaSergeevn + EkaterinaAndreevna);
        System.out.println(pupilsInThreeClasses + " Учеников в 3-х классах");
        short totalSheets = 480;
        int sheetsPerPerson = totalSheets / pupilsInThreeClasses;
        System.out.println( "На каждого ученика рассчитано " + sheetsPerPerson + " листов бумаги");

        byte Performance = 16;
        System.out.println( "За 2 минуты машина произвела " + Performance + " штук бутылок");
        short twentyMinutes = (short) (Performance * 10);
        System.out.println( "За 20 минуты машина произвела " + twentyMinutes + " штук бутылок");
        short day = (short) (Performance * 720);
        System.out.println( "За cутки машина произвела " + day + " штук бутылок");
        int threeDays =  day * 3 ;
        System.out.println( "За 3 cуток машина произвела " + threeDays + " штук бутылок");
        int month = threeDays * 10;
        System.out.println( "За 30 cуток машина произвела " + month + " штук бутылок");

        byte totalCans = 120;
        byte whiteCans = 2;
        byte cansOfBrown = 4;
        byte cansPerClass = (byte) (whiteCans + cansOfBrown);
        byte totalClasses = (byte) (totalCans / cansPerClass );
        short totalWhiteCans = (short) (whiteCans * totalClasses);
        short totalCansOfBrown = (short) (cansOfBrown * totalClasses);
        System.out.println("В школе где " + totalClasses + " классов,нужно " + totalWhiteCans + " банок белой краски и " + totalCansOfBrown + " банок коричневой краски" );

        byte BananasSport = 5;
        short Milk = 200;
        byte iceCream = 2;
        byte EggsRaw = 4;
        short BananasGr = (short) (BananasSport * 80);
        short MilkGr = (short)  (Milk * 105 / 100);
        short IceCreamGr = (short) (iceCream * 100);
        short EggsRawGr = (short) (EggsRaw * 70);
        short totalMassGr = (short) (BananasGr + MilkGr + IceCreamGr + EggsRawGr);
        System.out.println( totalMassGr + " Граммов комбикорма съедают спортсмены" );
       float totalMassKg = (float) totalMassGr / 1000;
        System.out.println( totalMassKg + " Кг комбикорма съедают спортсмены" );
        byte target = 7;
        short light = 250;
        short hard = 500;
            double lightOk = (double)  target / light * 1000;
        System.out.println ((int) lightOk + " дней потребуется ели спортсмен будет скидывать 250 грамм в день " );
            double hardOk = (double) target / hard * 1000;
            System.out.println ( (int) hardOk + " дней потребуется ели спортсмен будет скидывать 500 грамм в день " );
        int twoPrograms = light + hard;
        int averageTwoPrograms = twoPrograms / 2;
        System.out.println( averageTwoPrograms + " столько грамм в день спортсмен будет скидывать если спортсмен будет использовать сочитания двух программ ");
        double average = (double) target / averageTwoPrograms * 1000;
        System.out.println( (int) average + " Дней потребуется если спортсмен будет использовать сочитания двух программ " );
 
        int MashaGets = 67760;
        int DenisGets = 83690;
        int ChristinaGets = 76230;
        float differenceM;
        float differenceD;
        float differenceC;
        byte allPercentages = 100;
        byte Percentages = 10;
        differenceM = MashaGets / (float) allPercentages * Percentages;
        differenceD = DenisGets / (float) allPercentages * Percentages;
        differenceC = ChristinaGets / (float) allPercentages * Percentages;
        int MashaGetsEndBonus = (int) (  MashaGets + differenceM);
        int DenisGetsEndBonus = (int) (DenisGets + differenceD);
        int ChristinaGetsEndBonus = (int) (ChristinaGets + differenceC);
        byte onlyMonths = 12;
        int bonusForTheYearM = (int) differenceM * onlyMonths;
        int bonusForTheYearD = (int) differenceD * onlyMonths;
        int bonusForTheYearC = (int) differenceC * onlyMonths;
        System.out.println ( "Маша теперь получает " + MashaGetsEndBonus + " рублей. Годовой доход вырос на " + bonusForTheYearM + " рублей" );
        System.out.println ( "Денис теперь получает " +  DenisGetsEndBonus + " рублей. Годовой доход вырос на " + bonusForTheYearD + " рублей" );
        System.out.println ( " Кристина теперь получает " +  ChristinaGetsEndBonus + " рублей. Годовой доход вырос на " + bonusForTheYearC + " рублей" );

    }
}