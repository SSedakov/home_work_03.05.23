public enum Month {
    /*
    Реализуйте enum Month с перечислением всех месяцев.

    Добавьте в enum Month поле, с названием месяца по-русски, и поле номер месяца. Сделайте соответствующий конструктор.
     */
    JANUARY("Январь",1),
    FEBRUARY("Февраль",2),
    MARCH("Март",3),
    APRIL("Апрель",4),
    MAY("Май",5),
    JUNE("Июнь",6),
    JULY("Июль",7),
    AUGUST("Август",8),
    SEPTEMBER("Сентябрь",9),
    OCTOBER("Октябрь",10),
    NOVEMBER("Ноябрь",11),
    DECEMBER("Декабрь",12);
    String rusName;
    int numberOfMonth;
    Month(String rusName, int numberOfMonth){
        this.rusName = rusName;
        this.numberOfMonth = numberOfMonth;
    }
    public String toString (){
        return rusName + " " + numberOfMonth;
    }
}
