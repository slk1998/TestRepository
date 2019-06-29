package application;

import java.awt.Button;
import java.awt.Desktop.Action;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;



public class mycontroller implements Initializable {
	
	private Button mybutton;
	
	private TextField myfield;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 自动生成的方法存根
		
	}
	public void showsystermtime(ActionEvent event) {
		System.out.println("Butten used");
		//Data nowData=new Data(null, 0);
		//DateFormat df=new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
	    String datatimeString="80";
	    myfield.setText(datatimeString);
	}
}
