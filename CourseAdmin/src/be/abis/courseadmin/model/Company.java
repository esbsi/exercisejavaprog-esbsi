package be.abis.courseadmin.model;

public class Company {

    private String name;
    private int companyNumber;

    public Company(String name) {
        this.name = name;
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

    public void printInfo(){
        System.out.println(name);
    }

}
