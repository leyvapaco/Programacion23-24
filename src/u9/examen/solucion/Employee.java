package u9.examen.solucion;

public class Employee {
    private final Integer employeeNumber;
    private final String lastName;
    private final String firstName;
    private final String extension;
    private final String email;
    private String officeCode;
    private final Integer reportsTo;
    private final String jobTittle;

    public Employee(Integer employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, Integer reportsTo, String jobTittle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTittle = jobTittle;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getExtension() {
        return extension;
    }

    public String getEmail() {
        return email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public Integer getReportsTo() {
        return reportsTo;
    }

    public String getJobTittle() {
        return jobTittle;
    }
    
    public void setOfficeCode(String officeCode) {
       this.officeCode=officeCode;
    }

}
