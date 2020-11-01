package Graphical_User_Interface;

import java.util.Locale;

import Graphical_User_Interface.Util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	@FXML
	private TextField txtNumberOne;
	@FXML
	private TextField txtNumberTwo;
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	@FXML
	public void onBtSumAction() {
		try {
		Locale.setDefault(Locale.US);
		double nomberOne = Double.parseDouble(txtNumberOne.getText());
		double nomberTwo = Double.parseDouble(txtNumberTwo.getText());
		double sum = nomberOne + nomberTwo;
		labelResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}
	
}
