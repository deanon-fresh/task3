package ru.netology.service;
public class CustomService {
final static double TAX_FOR_PRICE = 0.01;
final static int TAX_FOR_WEIGHT = 100;

    public  static int calculation(int price, int weight) {
        int sum = (int) (price*TAX_FOR_PRICE + weight*TAX_FOR_WEIGHT);
        return sum;
    }
}
