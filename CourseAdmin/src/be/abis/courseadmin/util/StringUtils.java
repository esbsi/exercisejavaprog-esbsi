package be.abis.courseadmin.util;

public class StringUtils {

    public static String capitalize(String s){
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        for (int i = 2; i < s.length(); i++){
            if (s.substring(i-2, i).equals(". ")){
                s = s.substring(0, i) + s.substring(i, i+1).toUpperCase() + s.substring(i+1);
            }
        }
        System.out.println(s);
        return s;
    }

}
