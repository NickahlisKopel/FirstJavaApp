package com.careerdevs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //https://edabit.com/challenge/QaApgtePE6QrCZ64o
        System.out.println(getFirstValue(new int[]{1, 2, 3, 4}));
        //https://edabit.com/challenge/NAQhEoxbofPidLxm9
        System.out.println(addition(4));
        //https://edabit.com/challenge/z6Pxiw289JtaE2ndL
        System.out.println(search(new int[]{1, 2, 3, 4}, 3));
        //https://edabit.com/challenge/2t8JDxF7wLrg7yJ5E
        System.out.println(convert(5));
        //https://edabit.com/challenge/ZuoKAgmH8G2vHtLzi
        System.out.println(giveMeSomething("something"));
        //https://edabit.com/challenge/KWRQP86jxzM9SZmRM
        System.out.println(reverse(false));
        //https://edabit.com/challenge/5LnycSd2xT4uwZCpi
        System.out.println(countWords("It's high noon"));
        //https://edabit.com/challenge/aWzxPLibBLJgn8AbZ
        System.out.println(existsHigher(new int[] {5, 3, 15, 22, 4}, 10));
        //https://edabit.com/challenge/GBKphScsmDi9ek3ra
        System.out.println(getCount("Celebration"));
        //
        //System.out.println(rev(456));
        //https://edabit.com/challenge/9D39q2q9yAFCDM9da
        System.out.println(minutesToSeconds("1:30"));
        //https://edabit.com/challenge/hymPkXdhmDQLe87QT
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}));
        //https://edabit.com/challenge/8Ty2vq2YtcBp6CFc8
        System.out.println(sum(3,2));
        //https://edabit.com/challenge/5gpukjfi5rAH8MvKF
        System.out.println(isSameNum(3,3));
        //https://edabit.com/challenge/eqcCH2WbEXFLDyiQi
        System.out.println(calcAge(2));
        //https://edabit.com/challenge/JAtN6KLtahAkmT3n3
        System.out.println(helloName("Nick"));
        //https://edabit.com/challenge/5gPCp7v7iDWZvb4YQ
        System.out.println(reverse("test"));
        //https://edabit.com/challenge/B4HjZbBh9yuELmjna
        System.out.println(triArea(3,2));
        //https://edabit.com/challenge/KnRj8TSD63JBpzDfi
        System.out.println(divisible(100));
        //https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
        System.out.println(canCapture(new String[]{"A8", "E8"}));
        //


    }
    //01
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }
    //02
    public static int addition(int num) {
        return num + 1;
    }
    //03
    public static int search(int[] arr, int item) {
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(item == arr[i]){
                index = i;
            }
        }
        if(index == 0){
            index = -1;
        }
        return index;
    }
    //04
    public static int convert(int minutes) {
        return minutes * 60;
    }
    //05
    public static String giveMeSomething(String a) {
        String part1 = "something ";
        return part1 + a;
    }
    public static String giveMeSomething2(String a) {

        return "something " + a;
    }
    //06
    public static boolean reverse(boolean b) {
        return !(b);
    }
    //07
    public static int countWords(String s) {
        String[] split = s.split(" ");
        return split.length;
    }
    //08
    public static boolean existsHigher(int[] arr, int n) {
        boolean pass = false;
        for(int i = 0; i < arr.length; i++){
            if(n < arr[i]){
                pass = true;
            }
        }
        return pass;
    }
    //09
    public static int getCount(String str) {
        int vowelsCount = 0;
        String[] arr = str.split("");
        for(int i = 0; i < arr.length; i++){

            if(arr[i].equals("A") || arr[i].equals("E") || arr[i].equals("I") || arr[i].equals("O") || arr[i].equals("U") || arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
    //BONUS 01

    //BONUS 02
    public static int minutesToSeconds(String tm) {
        String[] arr = tm.split(":");
        if (Integer.parseInt(arr[1]) > 60){
            return -1;
        }else{
            int finish = (Integer.parseInt(arr[0]) * 60) + Integer.parseInt(arr[1]);
            return finish;
        }
    }
    //BONUS 03
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];

    }
    //BONUS 04

    //10
    public static int sum(int a, int b) {
        return a + b;
    }
    //11
    public static boolean isSameNum(int x, int y) {
        if (x == y){
            return true;
        }else{
            return false;
        }
    }
    //12
    public static int calcAge(int age) {
        return age * 365;
    }
    //13
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
    //14
    public static String reverse(final String str) {
        String[] rev = str.split("");
        String finish = "";
        for(int i = rev.length - 1; i >= 0; i--){
            finish += rev[i];
        }
        return finish;
    }
    //BONUS 01
    public static int triArea(int base, int height) {
        return ((base * height)/2);
    }
    //BONUS 02
    public static boolean divisible(int num) {
        if (num % 100 == 0){
            return true;
        }else{
            return false;
        }
    }
    //BONUS 03
    public static boolean canCapture(String[] rooks) {
        if(rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)){
            return true;
        }else{
            return false;
        }
    }
}
