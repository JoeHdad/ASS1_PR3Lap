/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ConversionView extends VBox {
    private TextField usdField;
    private Button convertButton;
    private Label nisLabel;
    
    public ConversionView() {
        Label usdLabel = new Label("USD:");
        usdField = new TextField();
        convertButton = new Button("Convert");
        Label nisTitleLabel = new Label("NIS:");
        nisLabel = new Label();
        
        this.getChildren().addAll(usdLabel, usdField, convertButton, nisTitleLabel, nisLabel);
    }
    
    public TextField getUsdField() {
        return usdField;
    }
    
    public Button getConvertButton() {
        return convertButton;
    }
    
    public Label getNisLabel() {
        return nisLabel;
    }
}