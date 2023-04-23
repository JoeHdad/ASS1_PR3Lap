/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package View;

import Controller.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class CurrencyConverterApp extends Application {
@Override
public void start(Stage primaryStage) throws Exception {
ViewManager viewManager = new ViewManager(primaryStage);
viewManager.showLoginView();
}

public static void main(String[] args) {
    launch(args);
}
}