package homework8;

public enum DayOfWeek {
    MONDAY(8),TUESDAY(8),WEDNESDAY(8),THURSDAY(8),FRIDAY(8),
    SATURDAY(0),SUNDAY(0);

    int hours;
    static int allHourOfWeek = MONDAY.hours + TUESDAY.hours + WEDNESDAY.hours + THURSDAY.hours + FRIDAY.hours;

            DayOfWeek(int hours) {
                    this.hours = hours;
            }


    public static void getHour(DayOfWeek day){
        switch(day){
            case MONDAY:
                System.out.println("Осталос работать " + allHourOfWeek + " часов");
                break;
            case TUESDAY:
                System.out.println("Осталос работать " + (allHourOfWeek - MONDAY.hours) + " часа");
                break;
            case WEDNESDAY:
                System.out.println("Осталос работать " + (allHourOfWeek - MONDAY.hours -TUESDAY.hours) +  " часа");
                break;
            case THURSDAY:
                System.out.println("Осталос работать " + (allHourOfWeek - MONDAY.hours - TUESDAY.hours - WEDNESDAY.hours) + " часа");
                break;
            case FRIDAY:
                System.out.println("Осталос работать " + (allHourOfWeek - MONDAY.hours - TUESDAY.hours - WEDNESDAY.hours -THURSDAY.hours) + " часов");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Расслабься, сегодня выходной!");
                break;
            default:
                System.out.println("Некорректно введен день");
            break;
        }
    }
}
