package Controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class ViewCustomerFormController{

    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableView tblCustomer;
    public TableColumn colContactNumber;


    public void btnReloadOnAction(ActionEvent actionEvent) {

       colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colContactNumber.setCellValueFactory(new PropertyValueFactory<>("contactNumber1"));



        ObservableList<Customer> customersList = FXCollections.observableArrayList();

        customersList.add(new Customer("Saman","Gampaha","1000","0775513196"));
        customersList.add(new Customer("Saman","Gampaha","1000","0775513196"));
        customersList.add(new Customer("Saman","Gampaha","1000","0775513196"));
        customersList.add(new Customer("Saman","Gampaha","1000","0775513196"));

        tblCustomer.setItems(customersList);


    }

}
