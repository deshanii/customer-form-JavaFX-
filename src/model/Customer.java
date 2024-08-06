package model;

public class Customer {
    private String name;
    private String address;
    private String salary;
    private String contactNumber;

    public Customer() {
    }

    public Customer(String name, String address, String salary, String contactNumber1) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.contactNumber = contactNumber;
        this.contactNumber = contactNumber1;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}
