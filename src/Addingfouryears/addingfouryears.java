package Addingfouryears;
import java.time.LocalDate;
import java.util.Calendar;
public class addingfouryears {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate newDate = currentDate.plusYears(4);
		
		System.out.println("current Date:"+currentDate);
		System.out.println("After adding four years in date:"+newDate);


	}

}
