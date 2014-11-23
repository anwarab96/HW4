package Enum;

public class ApplyEnum {
	Month month;
	public ApplyEnum(Month month){
		this.month = month;
	}
	public void whichMonthItIs(){
		switch(month){
		case JANUARY:
			System.out.println("First month of the year");
			break;
		case MARCH: 
		System.out.println("This is the third month of the year");
		break;
		
		case NOVEMBER:
			System.out.println("This month is the happiest month for me");
			break;
		case APRIL:
			System.out.println("Don't make people fool in the month of April");
			break;
			default:
				System.out.println("Woops! wrong month, try again");
		}
	
	}

}
