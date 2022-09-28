package be.abis.courseadmin.repository;

import be.abis.courseadmin.exception.CompanyNotFoundException;
import be.abis.courseadmin.model.Company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCompanyRepository implements CompanyRepository{

    private List<Company> companies;

    public FileCompanyRepository() {
        List<Company> companies = getCompanies();
        }

    @Override
    public Company findCompany(int id) throws CompanyNotFoundException {
        List<Company> companies = getCompanies();
        Company foundCompany=null;
        for (Company c:companies){
            if (c.getCompanyNumber()==id){
                foundCompany=c;
            }
        } if (foundCompany==null) throw new CompanyNotFoundException("Company " + id + " can not be found.");
        return foundCompany;
    }


    @Override
    public Company findCompany(String name) throws CompanyNotFoundException {
        List<Company> companies = getCompanies();
        Company foundCompany=null;
        for (Company c:companies){
            if (c.getName().equalsIgnoreCase(name)){
                foundCompany=c;
            }
        } if (foundCompany==null) throw new CompanyNotFoundException("Company " + name + " can not be found.");

        return foundCompany;
    }

    public void addCompany(Company c){
        try (PrintWriter writer = new PrintWriter(new FileWriter("/temp/javacourses/companies.txt", true))) {
            writer.append("\n" + c.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCompany(Company c) throws CompanyNotFoundException {

    }

/*    @Override
    public void updateCompany(Company c) throws CompanyNotFoundException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("/temp/javacourses/companies.txt"))) {
    //        Company compToUpdate = this.findCompany(c.getName());
    //        writer.append(compToUpdate.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CompanyNotFoundException companyNotFoundException) {
            throw new CompanyNotFoundException("Exception: company not found.");
        }
    }
*/

    @Override
    public void deleteCompany(int id) throws CompanyNotFoundException {

        Company companyToDelete = findCompany(id);
        try (PrintWriter writer = new PrintWriter(new FileWriter("/temp/javacourses/companies.txt", true))) {
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Company> getCompanies(){
        List<Company> companies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("/temp/javacourses/companies.txt"))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null){
                ++i;
                companies.add(new Company(i, line));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } return companies;
    }

}
