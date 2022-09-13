package be.abis.courseadmin.repository;

import be.abis.courseadmin.model.Company;

public class MemoryArrayCompanyRepository implements CompanyRepository {

    private Company[] companyArray = new Company[5];

    public MemoryArrayCompanyRepository(Company[] companyArray) {
        this.companyArray = companyArray;
    }

    public Company findCompany(int id) {
        Company foundCompany = null;
        for (Company company : companyArray){
            if (company.getCompanyNumber() == id){
                foundCompany = company;
            }
        }
        if (foundCompany == null) {
            System.out.println("Company not found.");
        }
        return foundCompany;
    };

    public Company findCompany(String name){
        Company foundCompany = null;
        for (Company company : companyArray){
            if (company.getName().equals(name)){
                foundCompany = company;
            }
        }
        if (foundCompany == null) {
            System.out.println("Company not found.");
        }
        return foundCompany;
    };

    public void addCompany(Company c){};
    public void updateCompany(Company c){};
    public void deleteCompany(int id){companyArray[id] = null;};




}
