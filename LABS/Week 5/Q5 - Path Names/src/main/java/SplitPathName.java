import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Arrays;

public class SplitPathName {

    public static String[] splitPath (String s) {
        String [] final_array = new String[4];
        if (s.contains ("/")) {
             String [] components = s.split("/");
             if (s.contains(".")) {
                 String[] format = components[(components.length)-1].split("\\.");
                 final_array[2] = format[0];
                 final_array[3] = "." + format[1];
                 final_array[1] = components[components.length-1];
                 final_array[0] = s.substring(0, s.indexOf(final_array[2]));
             } else {
                 final_array[3] = "";
             }
        } else {
            final_array[0] = "";
            final_array[1] = s;
            if (s.contains(".")) {
                final_array[2] = s.split("\\.")[0];
                final_array[3] = "." + s.split("\\.")[1];
            } else {
                final_array[2] = s;
                final_array[3] = "";
            }
        }


        return  final_array;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("File: " + splitPath(args[i])[1] + " Type: " + splitPath(args[i])[3] + " [" + splitPath(args[i])[0] + "]");
            }
        } else {
            throw new NullPointerException();
        }

    }

}
