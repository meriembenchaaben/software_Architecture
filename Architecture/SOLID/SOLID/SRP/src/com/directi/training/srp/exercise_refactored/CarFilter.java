package com.directi.training.srp.exercise_refractored;

import java.util.Arrays;
import java.util.List;

public class CarFiltre
{
    

    public Car getBestCar(cars)
    {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
