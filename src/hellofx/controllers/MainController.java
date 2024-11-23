package hellofx.controllers;

import hellofx.ServiceRecord;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TableView<ServiceRecord> table;
    @FXML
    private TableColumn<ServiceRecord, String> carModelColumn;
    @FXML
    private TableColumn<ServiceRecord, String> serviceDateColumn;
    @FXML
    private TableColumn<ServiceRecord, String> serviceDetailsColumn;
    @FXML
    private TextField carModelInput;
    @FXML
    private TextField serviceDateInput;
    @FXML
    private TextField serviceDetailsInput;

    @FXML
    private void initialize() {
        carModelColumn.setCellValueFactory(cellData -> cellData.getValue().carModelProperty());
        serviceDateColumn.setCellValueFactory(cellData -> cellData.getValue().serviceDateProperty());
        serviceDetailsColumn.setCellValueFactory(cellData -> cellData.getValue().serviceDetailsProperty());
    }

    @FXML
    private void addRecord() {
        ServiceRecord record = new ServiceRecord(carModelInput.getText(), serviceDateInput.getText(), serviceDetailsInput.getText());
        table.getItems().add(record);
        carModelInput.clear();
        serviceDateInput.clear();
        serviceDetailsInput.clear();
    }
}
