package Graphical_User_Interface;

import Graphical_User_Interface.Util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	@FXML
	private Button btTest;
	@FXML
	public void onBtTestAction() {
		Alerts.showAlert("Alerttitle", null, "Hello", AlertType.INFORMATION);
	}
	
}
