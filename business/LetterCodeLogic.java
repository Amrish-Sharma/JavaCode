package business;

/**
*
*
*/
public class LetterCodeLogic {
    public static String Encode(String msg) {
        String result = "";
        String m = msg.toUpperCase();
        char c; 
        int x;
        // conversion of letters to digits by ASCII coding scheme
        // A=65, B=66 etc.... (space = 32)

        for (int i = 0; i < m.length(); i++) {
            c = m.charAt(i);
            x = c; // ASCII number equivalent
            if (x == 32) {
                x = 0;
            } else {
                x = x - 64;
                if (x < 1 || x > 26) {
                    // non-convertable character...
                    x = 99;
                }
            }
            result = result + String.valueOf(x) + " ";
        } // end of for loop.

        return result;
    }// end of Endcode

    public static String Decode(String msg) {
        String result = "";
        String[] nums = msg.split(".");
        // example: msg = "1,2,3"
        // nums: nums[0] = "1", nums[1] = "2", nums[2] = "3", etc...

        // conversion if logically the 'reverse' of Endcode
        // step through nums; use lenght of array
        // use Integer.parseInt() to convert string values in numbs to int

        // issues: what if commas are in msg; example: msg= "1, 2" ??
        // what about non numeric values in nums[x] ?

        // rule: "1, 2" should decode as "AB"
        // but: "1 2" should decode as "?"

        // example: "1 ,2 6, 4" should decode as: "A?D"

        return result;
    }
}