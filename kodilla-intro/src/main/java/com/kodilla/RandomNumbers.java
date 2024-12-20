package com.kodilla;

import java.util.Arrays;

public class RandomNumbers {
    int[] numbers;
    int size;

    public RandomNumbers (){
        this.numbers = new int[500];
        this.size = 0;
    }

    public static void main (String[] args){
        RandomNumbers randomNumbers = new RandomNumbers();

        randomNumbers.getNumbers();

        System.out.println("array of numbers: " + Arrays.toString(randomNumbers.numbers));

        System.out.println("smallest number:" + randomNumbers.checkSmallestNumber(randomNumbers.numbers));

        System.out.println("biggest number:" + randomNumbers.checkBiggestNumber(randomNumbers.numbers));
    }

    public void getNumbers() {
        int sum = 0;

        for(this.size = 0; sum < 5000; this.size++){
            int value = (int)(Math.random() * 31);
            sum += value;
            this.numbers[this.size] = value;
        }

        System.out.println("sum: " + sum + ", size: " + this.size);
    }

    public int checkSmallestNumber(int[] numbers){
        int smallestNumber = numbers[0];

        for(int i = 0; i < this.size - 1; i++) {
            if(numbers[i] < smallestNumber){
                smallestNumber = numbers[i];
            }
        }

        return smallestNumber;
    }

    public int checkBiggestNumber(int[] numbers){
        int biggestNumber = numbers[0];

        for(int i = 0; i < this.size - 1; i++) {
            if(numbers[i] > biggestNumber){
                biggestNumber = numbers[i];
            }
        }

        return biggestNumber;
    }
}
