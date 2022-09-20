package be.abis.courseadmin.test;

import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.repository.CompanyRepository;
import be.abis.courseadmin.repository.MemoryArrayCompanyRepository;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MemoryArrayCompanyRepositoryTest {



    MemoryArrayCompanyRepository companyRepository = new MemoryArrayCompanyRepository();
    Company[] companies = companyRepository.getCompanyArray();

    Company ttl = companies[3];
    Company ibm = companies[2];

    @Test
    void findCompany() {
        assertEquals (ttl, companyRepository.findCompany(4));
    }

    @Test
    void testFindCompany() {
        assertEquals (ibm, companyRepository.findCompany("ibm"));
    }

    @Test
    void companiesLengthShouldBeFive() {
        assertEquals (5, companies.length);
    }



}