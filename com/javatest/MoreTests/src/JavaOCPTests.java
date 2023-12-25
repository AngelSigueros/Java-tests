import java.lang.*;
import java.lang.System;

public class JavaOCPTests {

    public static void main(String[] args) {
        secondary("We", "are", "software", "developers");
    }

    public static void secondary(String... args) {
        int argsLength = args.length;

        System.out.printf("Arguments: %d %n", argsLength );
        System.out.println(args[0] + " " + args[1] + " " + args[3]);

        System.gc();
        return ;
    }
}