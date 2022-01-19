package ru.netology.main;

public class Main {
    public static void main(String[] args) {
        int amount = 10000060;
        boolean registered = true;

        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        System.out.println(bonus);
    }
}
