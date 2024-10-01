package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for ( int i=0; i < cars.length; i++ )
            cars[i] = drawCar();

        for ( Car car : cars )
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);

        int speed = getRandomSpeed(random);

        Car car;

        if (drawnCarKind == 0) {
            car = new Ford();

            increaseRandomSpeed(car, speed);

            return car;
        } else if (drawnCarKind == 1) {
            car = new Kia();

            increaseRandomSpeed(car, speed);

            return car;
        } else {
            car = new Opel();

            increaseRandomSpeed(car, speed);

            return car;
        }
    }

    private static void increaseRandomSpeed (Car car,int speed) {
        for(int i = 0; i < speed; i++){
            car.increaseSpeed();
        }
    }

    private static int getRandomSpeed (Random random){
        return random.nextInt(20);
    }
}
