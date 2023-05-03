public class Main {
    public static void main(String[] args) {
   /*
   Задание 1
Напишите метод, который принимает Month, а соответствующий возвращает Season
Задание 2
//Реализуйте метод, который распечатает все месяцы строками вида „Месяц 1 – январь”, „Месяц 2 – февраль” ……

    */
        System.out.println(getSeason(Month.MARCH));
        Month[] month = Month.values();
        getMonthValues(month);


    }
    public static Season getSeason (Month month){
        switch (month){
            case DECEMBER:
            case JANUARY :
            case FEBRUARY:return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:return Season.SUMMER;
            default: return Season.AUTUMN;
        }

    }
    public static void getMonthValues(Month[] months){
        for (Month currentMonth:months) {
            System.out.println("******" "Месяц " + currentMonth.numberOfMonth + "-" + currentMonth.name() + "," + "******");
        }


    }
}
