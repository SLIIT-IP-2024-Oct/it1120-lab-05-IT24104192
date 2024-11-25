import java.util.Scanner;

public class IT24104192Lab5Q3 {

    
    public static final int ROOM_CHARGE_PER_DAY = 48000;  
    public static final int DISCOUNT_RATE_3_4_DAYS = 10;  
    public static final int DISCOUNT_RATE_5_OR_MORE_DAYS = 20;  

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; 
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date.");
            return; 
        }

        
        int numOfDaysReserved = endDate - startDate + 1;

        
        int discountRate = 0;
        if (numOfDaysReserved >= 3 && numOfDaysReserved <= 4) {
            discountRate = DISCOUNT_RATE_3_4_DAYS;  
        } else if (numOfDaysReserved >= 5) {
            discountRate = DISCOUNT_RATE_5_OR_MORE_DAYS;  
        }

        
        int totalRoomCharge = numOfDaysReserved * ROOM_CHARGE_PER_DAY;

        
        int discountAmount = (totalRoomCharge * discountRate) / 100;

        
        int finalAmount = totalRoomCharge - discountAmount;

        
        System.out.println("Number of days reserved: " + numOfDaysReserved);
        System.out.println("Total amount to be paid: Rs " + finalAmount);

        
        scanner.close();
    }
}
