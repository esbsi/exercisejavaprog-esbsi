package be.abis.courseadmin.model;

import be.abis.courseadmin.exception.PriceTooHighException;

public abstract class Service {

    public double price = 400.0;

    public abstract double calculatePrice() throws PriceTooHighException;

}
