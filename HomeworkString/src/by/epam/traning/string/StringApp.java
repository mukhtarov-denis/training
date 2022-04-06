package by.epam.traning.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringApp {

    public static void main(String[] args) {
        char[] charArray = {'s', 't', 'r', 'i', 'n', 'g'};
        String literalString = "This is String from literal, дальше кириллица";
        String constructorString = new String("String from constructor");
        System.out.println(constructorString);
        byte[] byteArrayDefaultEncoding = literalString.getBytes();
        byte[] byteArrayCp1251Encoding = null;
        try {
            byteArrayCp1251Encoding = literalString.getBytes("cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("equals byte arrays: %b",
            Arrays.equals(byteArrayDefaultEncoding, byteArrayCp1251Encoding)));
        String stringFromCharArray = new String(charArray);
        System.out.println(stringFromCharArray);
        String stringFromByteArray = new String(byteArrayDefaultEncoding);
        System.out.println(stringFromByteArray);
        /* concat String*/
        String stringPlus = "part 1" + null;
        //String stringConcat = "part1".concat(null);  // error NullPointerException
        String stringConcat = "part1".concat("3");
        System.out.println(stringPlus);
        System.out.println(stringConcat);
        
        
        
        
        
        
        
        
        
        
        System.out.println("Done ...");
    }
}