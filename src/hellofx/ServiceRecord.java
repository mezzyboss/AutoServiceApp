package hellofx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ServiceRecord {
    private final StringProperty carModel;
    private final StringProperty serviceDate;
    private final StringProperty serviceDetails;

    public ServiceRecord(String carModel, String serviceDate, String serviceDetails) {
        this.carModel = new SimpleStringProperty(carModel);
        this.serviceDate = new SimpleStringProperty(serviceDate);
        this.serviceDetails = new SimpleStringProperty(serviceDetails);
    }

    public String getCarModel() {
        return carModel.get();
    }

    public void setCarModel(String carModel) {
        this.carModel.set(carModel);
    }

    public StringProperty carModelProperty() {
        return carModel;
    }

    public String getServiceDate() {
        return serviceDate.get();
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate.set(serviceDate);
    }

    public StringProperty serviceDateProperty() {
        return serviceDate;
    }

    public String getServiceDetails() {
        return serviceDetails.get();
    }

    public void setServiceDetails(String serviceDetails) {
        this.serviceDetails.set(serviceDetails);
    }

    public StringProperty serviceDetailsProperty() {
        return serviceDetails;
    }
}

