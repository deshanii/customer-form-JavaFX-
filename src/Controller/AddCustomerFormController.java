package Controller;

import javafx.event.ActionEvent;
import model.Customer;

import java.awt.*;
import java.util.ArrayList;

public class AddCustomerFormController {

    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;
    public TextField txtContactNumber;

    ArrayList<Customer>customerList = new ArrayList<>();

    public void btnAddOnAction(ActionEvent actionEvent) {

       customerList.add(new Customer(
               txtName.getText(),
               txtAddress.getText(),
               txtSalary.getText(),
               txtContactNumber.getText()));

       customerList.forEach(obj->{
           System.out.println(obj);
       });

    }
}
