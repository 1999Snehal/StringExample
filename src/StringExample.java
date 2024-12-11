
public class StringExample {
    public static void main(String[] args) {

        String str1 = "Snehal";
        String str2 = "Lagad";
        String str3 = new String("Java Code");

        String message = str1 + " " + str2;  //Concatenation

        System.out.println("Concatenation :" +message);

        int length = str1.length();// Length of String
        System.out.println("Length of str1 :" +length);

        String subStringResult = str2.substring(1,4);  //Substring(extract part of string)
        System.out.println("Substring of str2: " + subStringResult);

        //Checks if str1 is equals to str2
        boolean equalsResult = str1.equals(str2);
        System.out.println("str1 equals str2 :" +equalsResult);

        boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase("Snehal");
        System.out.println("str1 equals 'Snehal' (ignoring case):" +equalsIgnoreCaseResult);

        int indexResult = str1.indexOf("l");//finding the index of a character of substring
        System.out.println("Index of 'l' in str1: " + indexResult);


        //changing case
        String upperCaseResult = str3.toUpperCase();
        System.out.println("str3 in uppercase :" +upperCaseResult);




    }
}