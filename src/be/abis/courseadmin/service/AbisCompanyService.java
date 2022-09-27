package be.abis.courseadmin.service;

import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.repository.CompanyRepository;
import be.abis.courseadmin.repository.MemoryListCompanyRepository;
import java.util.ArrayList;
import java.util.List;


public class AbisCompanyService //implements CompanyService
{

    CompanyRepository companyRepository = new MemoryListCompanyRepository();

/*    @Override
    public List<Company> sortAllCompaniesByName(List<Company> companyList) {
        companyList = companyRepository.getCompanies();
        for (Company company : companyList){
//            company.compareTo()
        }
        return null;
    }

 */

}
