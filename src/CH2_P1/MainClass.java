
package CH2_P1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainClass extends Application{

    private Label lableTitle, lableError;
    private TextField textFieldLoginName;
    private PasswordField passwordField;
    private Button buttonSubmit, buttonCancel;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        lableTitle = new Label("login info");
        textFieldLoginName = new TextField();
        textFieldLoginName.setPromptText("Login Name");
        passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        lableError = new Label("initial text");             
        
        VBox vbox1 = new VBox(10, lableTitle, textFieldLoginName,
        passwordField ,lableError );
        vbox1.setAlignment(Pos.CENTER);
        
        buttonSubmit = new Button("Submit");
        buttonCancel = new Button("Cancel");
        buttonSubmit.setOnAction(new myEventHandler());
        buttonCancel.setOnAction(new myEventHandler());
        
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(buttonSubmit, buttonCancel);
        hbox1.setSpacing(20);
        hbox1.setAlignment(Pos.CENTER);
        
        VBox vbox2 = new VBox(10, vbox1, hbox1);
        vbox2.setAlignment(Pos.CENTER);
        
        FlowPane flowpane = new FlowPane(vbox2); // flowpane be the root//
        flowpane.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(flowpane , 400, 300);
        scene.getStylesheets().add("file:src/CH2_P1/styles.css");
        primaryStage.setScene(scene);
        
        
        primaryStage.setTitle("Login Page");
        primaryStage.show();
        
    }
    public static void main(String[]args){
        launch(args);
    }
    
    private class myEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonSubmit){
                if(textFieldLoginName.getText().equals("joe") && 
                       passwordField.getText().equals("1234"))
                    lableError.setText("Valid User");
                else
                    lableError.setText("Invalid User");
            }
            else if(event.getSource()== buttonCancel){
                textFieldLoginName.setText("");
                passwordField.setText("");
            }
                    
            
        }
    
    }
    
}
