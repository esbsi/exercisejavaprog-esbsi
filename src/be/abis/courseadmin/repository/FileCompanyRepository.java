package be.abis.courseadmin.repository;

import be.abis.courseadmin.exception.CompanyNotFoundException;
import be.abis.courseadmin.model.Company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCompanyRepository implements CompanyRepository{

    public Company findCompany(int id) throws CompanyNotFoundException;
    public Company findCompany(String name) throws CompanyNotFoundException;
    public void addCompany(Company c);
    public void updateCompany(Company c) throws CompanyNotFoundException;
    public void deleteCompany(int id) throws CompanyNotFoundException;

    public List<Company> getCompanies(){
        List<Company> companies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("c:/temp/javacourses/companies.txt"))) {
            int line;
            while ((line = reader.read()) != -1){
                companies.add(new Company(line));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    };

}
