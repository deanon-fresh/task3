package ru.netology.service;


public class CustomService {

    public  static int calculation(int price, int weight) {
        final int SUM2 = price/100 + weight*100;
        return SUM2;
    }
}
