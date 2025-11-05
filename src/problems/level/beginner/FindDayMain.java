package problems.level.beginner;
import java.time.LocalDate;
import java.util.Scanner;

class FindDay {
	
    public static String findDay(int month, int day, int year) {
       LocalDate date= LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

}

public class FindDayMain {
    public static void main(String[] args){
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter month: ");
        int month = sc.nextInt();
        
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        
   	    System.out.println("Enter year: ");
        int year = sc.nextInt();
        
        String res = FindDay.findDay(month, day, year);
        
        System.out.println(res);
        
        sc.close();
   }
    
}
