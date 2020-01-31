public class isWeekend {

  public static void main(String[] args) {

    String string_date = args[0];
    int int_date = Integer.parseInt(args[1]);
    int position = 0;

    String[] weed_days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    for (int i = 0; i < weed_days.length; i++) {

      if (string_date.equals(weed_days[i])) {

        position = i + 1;

      }

    }

    int_date = (int_date + position) % 7;

    if ((int_date == 6) || (int_date == 7)) {

      System.out.println("WEEKEND!");

    } else {

      System.out.println("not weekend yet...");

    }

  }

}
