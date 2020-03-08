public class nestingNightmare {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int followingNumber = Integer.parseInt(args[1]);

        if (number <= followingNumber) {
            for (int index = number; index <= followingNumber; index++) {
                if (index % 2 == 0) {
                    System.out.print(index + " ");
                }
            }
        } else {
            System.out.println(number + " cannot be greater than " + followingNumber);
        }
    }
}
