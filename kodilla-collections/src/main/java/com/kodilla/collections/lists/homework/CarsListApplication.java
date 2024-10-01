package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car kia = new Kia();

        cars.add(new Ford());
        cars.add(kia);
        cars.add(new Opel());

        for(Car car : cars){
            describeCar(car);
        }

        System.out.println("size: " + cars.size());

        cars.remove(2);
        cars.remove(kia);

        for(Car car : cars){
            describeCar(car);
        }

        System.out.println("size: " + cars.size());
    }
}
