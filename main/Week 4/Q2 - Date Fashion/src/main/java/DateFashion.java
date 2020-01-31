public class DateFashion {

  public static int dateFashion(int you, int date) {

    int value = 0;

    if (you >= 8 || date >= 8) {

      if (you > 2 && date > 2){

        value = 2;

      } else {

        value = 0;

      }

    } else if ((you > 2 && you < 8) && (date > 2 && date < 8)){

      value = 1;

    }



    return  value;
  }

  public static void main(String[] args) {

    int you, date, value;

    you = Integer.parseInt(args[0]);
    date = Integer.parseInt(args [1]);

    value = dateFashion(you, date);

    System.out.println(value);
  }

}
