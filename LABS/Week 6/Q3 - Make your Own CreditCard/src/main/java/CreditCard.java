import java.util.Calendar;

public class CreditCard {

    private int expiryMonth;
    private int expiryYear;
    private int yearNow;
    private int monthNow;
    private String firstName;
    private String lastName;
    private String ccNumber;

    private  Calendar now;

    public CreditCard (int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        now = Calendar.getInstance();
        yearNow =  now.get(Calendar.YEAR);
        monthNow = now.get(Calendar.MONTH) + 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ccNumber = ccNumber;
    }

    public String formatExpiryDate() {
        int year = 0;
        if (expiryYear >= 2000) {
            year = expiryYear -2000;
        }

        return "" + expiryMonth + "/" + year;
    }

    public String formatFullName() {
        return firstName + " " + lastName;
    }

    public String formatCCNumber() {

        String[] numbers = ccNumber.split("");
        String[] final_numbers = new String[4];

        int counter = 0;
        String ccNums = "";
        for (int i = 0; i < ccNumber.length()/4; i++){
            String group_of_4 = "";
            for(int j = 0; j < 4; j++) {
                group_of_4 = group_of_4 + numbers[j+ counter];
            }
            final_numbers[i] = group_of_4;
            counter = counter +4;
        }

        ccNums = "";
        for (int i = 0; i < final_numbers.length - 1; i++) {
            ccNums = ccNums + final_numbers[i] + " ";
        }
        ccNums = ccNums + final_numbers[final_numbers.length -1];

        return ccNums;
    }

    public boolean isValid() {
        boolean isValid = false;

        if (yearNow < expiryYear) {
            isValid = true;
        } else if (yearNow == expiryYear && monthNow < expiryMonth) {
            isValid = true;
        }

        return isValid;
    }

    public String toString(){
        return "Number: " + formatCCNumber() + "\nExpiration date: " + formatExpiryDate() + "\nAccount holder: " + formatFullName() + "\nIs valid: " + isValid();
    }
}
