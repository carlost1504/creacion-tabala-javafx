package UI;

import java.util.UUID;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import model.*;

public class MainWindow extends Stage {
	 
	    private TableView<domicilio> tabal;
	    private TextField pedido;
	    private TextField precio;
	    private TextField direccion;
	    private Button buttomEnter;
	    
	    //data
	    private DomocilioData domiciliios;
	    

	public MainWindow() {
		try {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("MainWindow.fxml"));
			Parent root =loader.load();
			tabal=(TableView) loader.getNamespace().get("tabal");
			pedido=(TextField)loader.getNamespace().get("pedido");
			precio=(TextField)loader.getNamespace().get("precio");
			direccion=(TextField)loader.getNamespace().get("direccion");
			buttomEnter=(Button)loader.getNamespace().get("buttomEnter");
			
			domiciliios=new DomocilioData();
			
			buttomEnter.setOnAction(event->{
				String id = UUID.randomUUID().toString();
				double precioo =Double.parseDouble((precio.getText()));
				String pedidoo= pedido.getText();
				
				
				
			});
			
			Scene scene =new Scene(root,600,400);
			setScene(scene);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
