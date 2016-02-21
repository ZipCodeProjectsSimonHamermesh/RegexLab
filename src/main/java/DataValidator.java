/**
 * Created by simonhamermesh on 2/21/16.
 */
public class DataValidator {

    public static boolean isValidUsername(String x){

        if(x.matches("[a-z]{3,25}")){return true;}else{return false;}

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
        return false;
    }

    public static boolean isValidIPAddress(String x){
        return false;
    }

}
