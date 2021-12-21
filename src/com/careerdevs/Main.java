package com.careerdevs;

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
        String part1 = "something";
        return part1 + " " + a;
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
}
