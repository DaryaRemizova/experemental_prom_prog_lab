/**
 * Created by Дарья on 16.03.2016.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class experement {

        public static void main(String[] args){
            System.out.println("Results of checking:");
            System.out.println(checkWithRegExp("_@BEST"));
            System.out.println(checkWithRegExp("vovan"));
            System.out.println(checkWithRegExp("vo"));
            System.out.println(checkWithRegExp("Z@OZA"));
        }
        public static boolean checkWithRegExp(String userNameString){
            Pattern p = Pattern.compile("^[az09]{3,15}$");
            Matcher m = p.matcher(userNameString);
            return m.matches();
        }
}
