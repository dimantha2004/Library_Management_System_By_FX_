package edu.icet.librarymanagmentsystem.controller.book;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class BookManagementFormController {

    @FXML
    private TableView<?> booktable;

    @FXML
    private TableColumn<?, ?> colauthor;

    @FXML
    private TableColumn<?, ?> colcategory;

    @FXML
    private TableColumn<?, ?> colid;

    @FXML
    private TableColumn<?, ?> colisbn;

    @FXML
    private TableColumn<?, ?> coltitle;

    @FXML
    private JFXTextField txtAuthorField;

    @FXML
    private JFXTextField txtCategoryField;

    @FXML
    private JFXTextField txtIdField;

    @FXML
    private JFXTextField txtIsbnField;

    @FXML
    private JFXTextField txtTitleField;

    @FXML
    void addbookonaction(ActionEvent event) {

    }

    @FXML
    void deletebookonaction(ActionEvent event) {

    }

    @FXML
    void searchbookonaction(ActionEvent event) {

    }

    @FXML
    void updatebookonaction(ActionEvent event) {

    }

}
