package be.abis.courseadmin.repository;

import be.abis.courseadmin.model.Company;

public class MemoryArrayCompanyRepository implements CompanyRepository {

    private Company[] companyArray = new Company[5];

    public MemoryArrayCompanyRepository() {
        companyArray[0]=new Company("ABIS", 1);
        companyArray[1]=new Company("Smals", 2);
        companyArray[2]=new Company("IBM", 3);
        companyArray[3]=new Company("TTL", 4);
        companyArray[4]=new Company("CogniTIC", 5);
    }


    public Company[] getCompanyArray() {
        return companyArray;
    }

    public void setCompanyArray(Company[] companyArray) {
        this.companyArray = companyArray;
    }

    @Override
    public Company findCompany(int id) {
        return companyArray[id-1];
    }

    @Override
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

    @Override
    public void addCompany(Company c){}

    @Override
    public void updateCompany(Company c){}

    @Override
    public void deleteCompany(int id){}




}
