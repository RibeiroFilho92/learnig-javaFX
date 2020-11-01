package Graphical_User_Interface;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import Model.entities.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ViewController implements Initializable {
	
	@FXML
	private ComboBox<Person> comboboxPerson;
	@FXML
	private Button btAll;
	
	private ObservableList<Person> obsList;
	@FXML
	private void onBtAllAction() {
		for (Person person : comboboxPerson.getItems()) {
			System.out.println(person);
		}
	}
	@FXML
	public void onComboboxPersonAction() {
		
		Person person = comboboxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		List<Person> list = new ArrayList<> ();
		list.add(new Person(1, "Juan", "juan@gmail.com"));
		list.add(new Person(2, "Smith", "smith@gmail.com"));
		list.add(new Person(3, "George", "george@gmail.com"));
		
		obsList = FXCollections.observableArrayList(list);
		comboboxPerson.setItems(obsList);
		
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		
		comboboxPerson.setCellFactory(factory);
		comboboxPerson.setButtonCell(factory.call(null));
	}
	
}
