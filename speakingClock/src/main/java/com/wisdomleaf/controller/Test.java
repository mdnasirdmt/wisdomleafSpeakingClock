//package com.wisdomleaf.controller;
//
//public class Test {
//    public static void main(String[] args) {
//        int con= 12;
//        System.out.println(convertToWords(con));
//    }
//
//    private static String convertToWords(int number) {
//        // Implement the logic to convert the number to words
//        // You can use a lookup table, switch-case statements, or any other approach
//
//        // Example implementation for hours 1-12 and minutes 0-59:
//        String[] hours = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
//                "eleven", "twelve"};
//        String[] minutes = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
//                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
//                "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five", "twenty-six",
//                "twenty-seven", "twenty-eight", "twenty-nine", "thirty", "thirty-one", "thirty-two", "thirty-three",
//                "thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
//                "forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven",
//                "forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four",
//                "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine"};
//
//        // Adjust the logic based on your specific requirements and number-to-word mapping
//
//        if (number >= 1 && number <= 12) {
//            return hours[number];
//        } else if (number >= 0 && number <= 59) {
//            return minutes[number];
//        } else {
//            throw new IllegalArgumentException("Invalid number: " + number);
//        }
//    }
//}
