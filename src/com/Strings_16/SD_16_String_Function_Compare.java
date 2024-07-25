package com.Strings_16;

public class SD_16_String_Function_Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("tony");

//        if(s1 == s2){
//            System.out.println("Strings are equals");
//        } else{                                            // Strings are equals because the objects are same
//            System.out.println("Strigs are not equal");
//        }
//
//        if(s1 == s3){
//            System.out.println("Strings are equals");
//        } else{                                            // Strings are not equal because in this they both are different strings because new tony is a different because we declared as a new string in new String function
//            System.out.println("Strigs are not equal");
//        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else{                                             // Strings are not equal because we declared as s1 and s3 are equals
            System.out.println("Strings are not equal");
        }
    }
}
