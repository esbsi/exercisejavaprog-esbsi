package be.abis.courseadmin.service;

import be.abis.courseadmin.model.Company;
import java.util.ArrayList;

public interface CompanyService {

    ArrayList<Company> sortAllCompaniesByName(ArrayList<Company> companyList);


}
