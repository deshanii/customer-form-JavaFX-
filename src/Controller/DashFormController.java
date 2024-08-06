package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashFormController {

    public void btnViewCustomerOnAction(ActionEvent actionEvent){
        try {
            Stage stage = new Stage();
            stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/view_customer_form.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnAddCustomerOnAction(ActionEvent actionEvent){
        try {
            Stage stage = new Stage();
            stage.setScene(new Scene(
                    FXMLLoader.load(getClass().getResource("../View/add_customer_form.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



