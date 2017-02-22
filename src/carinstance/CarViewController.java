/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinstance;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User1
 */
public class CarViewController implements Initializable {

    
    
    @FXML private TextField MakeTextField;
    
  
    @FXML private TextField ModelTextField;
    @FXML private TextField YearTextField;
    @FXML private TextField MilageTextField;
    @FXML private TextField SellTextField;
    @FXML private TextField FeaturesTextField;
    @FXML private Button createCar;
    @FXML private Label errorMessageLabel;
   
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
      public void createCarButtonPushed()
    {  try{
        Car Car1 = new Car(this.MakeTextField.getText(),
                                                    this.ModelTextField.getText(), 
                                                    Integer.parseInt(this.YearTextField.getText()),
                                                    Integer.parseInt(this.MilageTextField.getText()),
                                                    Integer.parseInt(this.SellTextField.getText()),
                                                    
                                                    this.FeaturesTextField.getText());
                                                    //Double.parseDouble(this.hourlyRateTextField.getText()));
        
        System.out.printf("Employee: %s is from the class %s%n", Car1, Car1.getClass());
    }
        catch (IllegalArgumentException e)
    {
        this.errorMessageLabel.setText(e.getMessage());
        this.errorMessageLabel.setVisible(true);
    }
    }//end of createEmployeeButtonPushed
}
