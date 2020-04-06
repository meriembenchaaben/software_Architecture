package com.directi.training.srp.exercise_refractored;

import java.util.Arrays;
import java.util.List;

public class CarFormatter
{
    

    public String getCarsNames(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars.findAll()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
