package ru.netology.service;


public class CustomService {
    public static int sum;

    public  static int calculation(int price, int weight) {
        sum = price/100 + weight*100;
        return sum;
    }
}
