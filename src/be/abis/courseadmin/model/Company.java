package be.abis.courseadmin.model;

import be.abis.courseadmin.exception.PriceException;
import be.abis.courseadmin.exception.PriceTooHighException;
import be.abis.courseadmin.exception.PriceTooLowException;

public class Company implements Comparable<Company>{

    private int companyNumber;
    private String name;

    private double priceTooLowExceptionBelowThisSessionPrice;


    public Company(String name) {
        this.name = name;
    }

    public Company(int companyNumber, String name) {
        this.companyNumber = companyNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }



    public void requestPriceOfferForCompanySession (Course c, int numberOfParticipants, Person instructor) throws PriceException {
        CompanySession companySession = new CompanySession(c, numberOfParticipants);
        companySession.setInstructor(instructor);
        try {
            double sessionPrice = companySession.calculatePrice();
            if (sessionPrice < companySession.getInstructor().getCompany().priceTooLowExceptionBelowThisSessionPrice){
                throw new PriceTooLowException("The calculated price seems too low, please add participants or contact us for further information.");
            }
        } catch (PriceTooHighException priceTooHighException){
            System.out.println(priceTooHighException.getMessage());
        } finally {
            System.out.println("Finished calculating price.");
        }
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCompanyNumber() {
        return companyNumber;
    }
    public void setCompanyNumber(int companyNumber) {
        this.companyNumber = companyNumber;
    }

    public double getPriceTooLowExceptionBelowThisSessionPrice() {
        return priceTooLowExceptionBelowThisSessionPrice;
    }

    public void setPriceTooLowExceptionBelowThisSessionPrice(double priceTooLowExceptionBelowThisSessionPrice) {
        this.priceTooLowExceptionBelowThisSessionPrice = priceTooLowExceptionBelowThisSessionPrice;
    }

    @Override
    public int compareTo(Company o) {
        return this.getName().compareTo(o.getName());
    }
}
