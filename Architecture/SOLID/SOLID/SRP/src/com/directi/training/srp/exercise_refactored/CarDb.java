package com.directi.training.srp.exercise_refractored;

import java.util.Arrays;
import java.util.List;

public class CarDb
{
    private  List<Car> _carsDb = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    public  List<Car> findAll()
	{
		return this._carsDb ;
	}
	
	public Car findById(final String carId)
	{
		for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
	}
}
