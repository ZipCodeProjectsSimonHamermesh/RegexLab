/**
 * Created by simonhamermesh on 2/21/16.
 */
public class DataValidator {

    public static boolean isValidUsername(String x){

        return x.matches("[a-z]{3,25}");

        /*if(x.length()>=3 && x.length()<=25){
          char[] stringToChars = x.toCharArray();
            for(char y : stringToChars){
                int charInt = (int) y;
                if(charInt>=97 && charInt<=122){
                    //Intended empty body, do nothing, check next char.
                } else {return false;}
            }
            return true;
        } else {return false;}*/
    }

    public static boolean isValidEnhancedUsername(String x){
        return x.matches("([a-zA-Z])([a-zA-Z0-9_]{2,24})");
    }

    public static boolean isValidIPAddress(String x){
        return x.matches("(((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9])\\.){2})" +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9])");
    }

}
