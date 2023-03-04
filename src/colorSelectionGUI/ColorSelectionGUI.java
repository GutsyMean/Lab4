package colorSelectionGUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;

public class ColorSelectionGUI extends Application
{

	public static void main(String[] args)
	{
		launch(args);
		
	}
	
	
	private RadioButton rbtSalmon = new RadioButton("Salmon");
	private RadioButton rbtSpringGreen = new RadioButton("Spring Green");
	private RadioButton rbtOrange = new RadioButton("Orange");
	private RadioButton rbtCyan = new RadioButton("Cyan");
	private ToggleGroup colorGroup = new ToggleGroup();
	private CheckBox cbNorth = new CheckBox("North");
	private CheckBox cbSouth = new CheckBox("South");
	private CheckBox cbEast = new CheckBox("East");
	private CheckBox cbWest = new CheckBox("West");
	private Label lblLocation = new Label("Location");
	private Label lblBackground = new Label("Background Colors");
	private Label lblNorth = new Label("North");
	private Label lblSouth = new Label("South");
	private Label lblEast = new Label("East");
	private Label lblWest = new Label("West");
	
	
	
	public void start(Stage primaryStage)
	{
		
	}

}
