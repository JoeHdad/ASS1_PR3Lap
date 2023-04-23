/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CurrencyConverter;
import View.ConversionView;
import View.LoginView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewManager {
    private Stage stage;
    private Scene loginScene;
    private Scene conversionScene;
    
    private LoginView loginView;
    private ConversionView conversionView;
    
    private CurrencyConverter model;
    
    public ViewManager(Stage stage) {
        this.stage = stage;
        this.model = new CurrencyConverter(3.5);
        
        loginView = new LoginView();
        conversionView = new ConversionView();
        
        loginView.getLoginButton().setOnAction(event -> handleLogin());
        conversionView.getConvertButton().setOnAction(event -> handleConversion());
        
        loginScene = new Scene(loginView, 400, 400);
        conversionScene = new Scene(conversionView, 400, 400);
    }
    
    private void handleLogin() {
        // Validate login credentials
        boolean validLogin = true; // For demonstration purposes only
        
        if (validLogin) {
            stage.setScene(conversionScene);
        }
    }
    
    private void handleConversion() {
        String usdString = conversionView.getUsdField().getText();
        
        try {
            double usdAmount = Double.parseDouble(usdString);
            double nisAmount =  model.convertUsdToNis(usdAmount);
        conversionView.getNisLabel().setText(String.format("%.2f", nisAmount));
    } catch (NumberFormatException e) {
        // Handle invalid input
    }
}

public void showLoginView() {
    stage.setScene(loginScene);
    stage.show();
}
}

