public class swich {
    public static void main(String[] args) {
        int day=1;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wensday");
                break;
            default:
                System.out.println("try again");
        }

        do{
            System.out.println(day);
            day++;
        }while(day<5);
    }
}
