package be.abis.courseadmin.repository;

import be.abis.courseadmin.model.Company;

public class MemoryArrayCompanyRepository //implements CompanyRepository
{

    private Company[] companyArray = new Company[5];

    public MemoryArrayCompanyRepository() {
        companyArray[0]=new Company(1, "ABIS");
        companyArray[1]=new Company(2, "Smals");
        companyArray[2]=new Company(3, "IBM");
        companyArray[3]=new Company(4, "TTL");
        companyArray[4]=new Company(5, "CogniTIC");
    }


    public Company[] getCompanyArray() {
        return companyArray;
    }

    public void setCompanyArray(Company[] companyArray) {
        this.companyArray = companyArray;
    }

//    @Override
    public Company findCompany(int id) {
        return companyArray[id-1];
    }

//    @Override
    public Company findCompany(String name){
        Company foundCompany = null;
        for (Company company : companyArray){
            if (company.getName().equalsIgnoreCase(name)){
                foundCompany = company;
            }
        }
        if (foundCompany == null) {
            System.out.println("Company not found.");
        }
        return foundCompany;
    }

//    @Override
    public void addCompany(Company c){}

//    @Override
    public void updateCompany(Company c){}

//    @Override
    public void deleteCompany(int id){}




}
