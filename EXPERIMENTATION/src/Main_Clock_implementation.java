import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class NumberDisplay {
    private final int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    public void setValue(int replacementValue) {
        if ( (replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }

    public void increment () throws InterruptedException {
        value = (value + 1) % limit;
        TimeUnit.SECONDS.sleep(1);
    }


    public String getDisplayValue() {
        if (value < 10) {
            return "0" +  value;
        } else {
            return "" + value;
        }
    }

    public int getValue () {
        return value;
    }

}

class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay () {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay (int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }


    public String getTime () {
        return  displayString;
    }

    public void setTime (int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
    }

    public void timerTick() throws InterruptedException {
        minutes.increment();
        if (minutes.getValue() == 0 ) {
            hours.increment();
        }
        updateDisplay();
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }


}


public class Main_Clock_implementation {
    public static void main(String[] args) throws InterruptedException {


        ClockDisplay clock = new ClockDisplay(getCurrentTimeUsingCalendar()[0], getCurrentTimeUsingCalendar()[1]);
        while (true) {
            System.out.println( clock.getTime());
            clock.timerTick();
        }


    }

    public static int[] getCurrentTimeUsingCalendar() {

        Calendar cal = Calendar.getInstance();

        Date date=cal.getTime();

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        String formattedDate=dateFormat.format(date);
        String[] time = formattedDate.split(":");
        int[] time_final = {Integer.parseInt(time[0]), Integer.parseInt(time[1])};


        return time_final;
        }
}

