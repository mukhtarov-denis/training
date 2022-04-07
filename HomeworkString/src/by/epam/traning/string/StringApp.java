package by.epam.traning.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringApp {
    private static final Integer NULL_VALUE = null;

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
        /* convert String*/
        Integer integerValue = Integer.valueOf("34");
        System.out.println("converted value: " + integerValue);
        try {
            integerValue = Integer.valueOf(stringConcat);
        } catch (NumberFormatException e) {
            System.out.println(String.format("Error value for convert: %s, cause: %s",
                    stringConcat, e.getMessage()));
        }
        int intValue = Integer.parseInt("125");
        System.out.println("Parsed value: " + intValue);
        try {
            intValue = Integer.parseInt(stringConcat);
        } catch (NumberFormatException e) {
            System.out.println(String.format("Error value for convert: %s, cause: %s",
                    stringConcat, e.getMessage()));
        }
        /* Integer to String*/
        System.out.println("+ : " + ("3" + new Integer(3)));
        System.out.println("+ : " + ("3" + NULL_VALUE));
        /* convert int to String*/
        String stringValue = String.valueOf(168);
        System.out.println("String.valueOf: " + stringValue);
        //stringValue = String.valueOf(null);             NullPointerException
        stringValue = Integer.toString(525);
        System.out.println("Integer.toString: " + stringValue);
        // stringValue = Integer.toString(null);          Error compile
        
        char symbol = stringFromCharArray.charAt(3);
        System.out.println("CharAt. Symbol: " + symbol);
        System.out.println(stringValue.indexOf('5'));
        System.out.println(stringValue.contains("25"));   // true if contains in string value
        /* Override String*/
        Human human = new Human();
        System.out.println(human);
        /*String in switch*/
        switch ("4") {
            case "1":
                System.out.println("Switch - 1");
                break;
            case "2":
                System.out.println("Switch - 2");
                break;
            /*
            default:
                System.out.println("Not switched");
                break;
            */
        }
        /*equals String*/
        System.out.println(String.format("Compare literal and String('value') : %b",
                literalString.equals(new String(literalString))));
        String s1 = "string value 1";
        String s2 = "string value 1";
        System.out.println(String.format("Compare literal and literal : %b", s1 == s2));
        String stringByConstructor1 = new String("Java 1.8");
        String stringByConstructor2 = new String("Java 1.8");
        System.out.println(String.format("Compare by reference : %b",
                stringByConstructor1 == stringByConstructor2));
        System.out.println(String.format("Compare by reference after intern method : %b",
                stringByConstructor1.intern() == "Java 1.8"));
        /* StringBuilder and StringBuffer*/
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Java").append(" 1.8");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Java").append(" 1.8");
        System.out.println(String.format("Equals builder and buffer: %b",
                stringBuilder.toString().equals(stringBuffer.toString())));
        /**/
        System.out.println("Done ...");
    }
}