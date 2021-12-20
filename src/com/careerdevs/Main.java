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

    }

    public static int getFirstValue(int[] arr) {
        return arr[0];
    }
    public static int addition(int num) {
        return num + 1;
    }
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
    public static int convert(int minutes) {
        return minutes * 60;
    }
    public static String giveMeSomething(String a) {
        String part1 = "something";
        return part1 + " " + a;
    }
}
