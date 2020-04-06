package com.directi.training.srp.exercise_refractored;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
   private  CarFormatter carFormatter;
   private CarFilter carFiltter; 
   public String getCarsNamesFromDb()
    {
		List<Car> cars = CarDb.findAll();
		return carFormatter.getCarsNames(cars) ;
	}
	public Car getBestCarFromDb()
	{
		List<Car> cars = CarDb.findAll();
		return CarFilter.getBestCar (cars);
	}
}
