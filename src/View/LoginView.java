/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
    private TextField usernameField;
    private TextField passwordField;
    private Button loginButton;
    
    public LoginView() {
        Label usernameLabel = new Label("Username:");
        usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        passwordField = new TextField();
        loginButton = new Button("Login");
        
        this.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton);
    }
    
    public TextField getUsernameField() {
        return usernameField;
    }
    
    public TextField getPasswordField() {
        return passwordField;
    }
    
    public Button getLoginButton() {
        return loginButton;
    }
}
