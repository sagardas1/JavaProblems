package Example;

public class Example4 {
    public static void main(String[] args) {
     int i=   Example4.isConsecutive("99100");
    }
    static int isConsecutive(String str)
    {
        // variable to store starting number
        int start;

        // length of the input String
        int length = str.length();

        // find the number till half of the String
        for (int i = 0; i < length / 2; i++)
        {

            // new String containing the starting
            // substring of input String
            String new_str = str.substring(0, i + 1);

            // converting starting substring into number
            int num = Integer.parseInt(new_str);

            // backing up the starting number in start
            start = num;

            // while loop until the new_String is
            // smaller than input String
            while (new_str.length() < length)
            {

                // next number
                num++;

                // concatenate the next number
                new_str = new_str + String.valueOf(num);
            }

            // check if new String becomes equal to
            // input String
            if (new_str.equals(str))
                return start;
        }

        // if String doesn't contains consecutive numbers
        return -1;
    }
}
