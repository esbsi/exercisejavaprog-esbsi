package be.abis.courseadmin.service;

import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.repository.CompanyRepository;
import be.abis.courseadmin.repository.FileCompanyRepository;
import be.abis.courseadmin.repository.MemoryListCompanyRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AbisCompanyService implements CompanyService {

    CompanyRepository companyRepository = new MemoryListCompanyRepository();



    @Override
    public List<Company> sortAllCompaniesByName() {
        FileCompanyRepository fileCompanyRepository = new FileCompanyRepository();
        List<Company> companies = fileCompanyRepository.getCompanies();
        Collections.sort(companies);
        return companies;
    }

    @Override
    public List<Company> sortAllCompaniesByNumber() {
        FileCompanyRepository fileCompanyRepository = new FileCompanyRepository();
        List<Company> companies = fileCompanyRepository.getCompanies();
        Collections.sort(companies, new Company.SortAllCompaniesByNumberComparator());
        return companies;
    }


/*        companyList = companyRepository.getCompanies();
        for (int i = 0; i < companyList.size(); ++i){
            Company company = companyList.get(i);
            Company nextCompany = companyList.get(i + 1);
            company.getName().compareTo(nextCompany.getName());
        }
        companyList.sort();
        return null;
 */



}
