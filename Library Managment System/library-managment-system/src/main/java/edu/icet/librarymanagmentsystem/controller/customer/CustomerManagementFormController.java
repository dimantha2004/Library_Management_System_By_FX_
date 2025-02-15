package edu.icet.librarymanagmentsystem.controller.customer;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CustomerManagementFormController {
    public JFXTextField txtIdField;
    public JFXTextField txtContactField;
    public JFXTextField txtNameField;
    public TableView customertable;
    public TableColumn colid;
    public TableColumn colname;
    public TableColumn colcontact;
    public TableColumn colmembershipdate;

    public void addcustomeronaction(ActionEvent actionEvent) {
    }

    public void searchcustomeronaction(ActionEvent actionEvent) {
    }

    public void deletecustomeronaction(ActionEvent actionEvent) {
    }

    public void updatecustomeronaction(ActionEvent actionEvent) {
    }
}
