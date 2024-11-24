package hellofx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.HashMap;
import java.util.Map;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // In-memory user database (for demonstration purposes)
    private static final Map<String, String> userDatabase = new HashMap<>();

    static {
        userDatabase.put("user", "password"); // username: user, password: password
        userDatabase.put("admin", "admin123"); // username: admin, password: admin123
    }

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Validate credentials
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            try {
                // Load the main application view
                Parent root = FXMLLoader.load(getClass().getResource("/hellofx/views/main.fxml"));
                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.setScene(new Scene(root));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Show an error message
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password.");
            alert.showAndWait();
        }
    }
}
