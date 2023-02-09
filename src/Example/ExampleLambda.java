package Example;

import java.util.ArrayList;
import java.util.List;

public class ExampleLambda {

    public static void main(String[] args) {
        try {
            String s = "sagar";
            String s1 = "sagar";
            String s3 = s1;
            s1 = "radhika";
            if (s1 == s3) {
                System.out.println(true);
            }
            if (s1.equals(s)) {
                System.out.println(true);
            }
        }finally {

        }
    }

}
