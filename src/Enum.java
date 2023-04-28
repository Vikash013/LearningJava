public class Enum {

    public static void main(String[] args) {

        EnumDaysOfTheWeek day =EnumDaysOfTheWeek.THURSDAY;

        if (day == EnumDaysOfTheWeek.THURSDAY) {
            System.out.println("It's nearly Friday!");
        }

        for (EnumDaysOfTheWeek myDay : EnumDaysOfTheWeek.values()){
            System.out.println(myDay);
        }

    }

}
