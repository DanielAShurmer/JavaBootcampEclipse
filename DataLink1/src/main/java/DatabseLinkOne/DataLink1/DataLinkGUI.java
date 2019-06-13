package DatabseLinkOne.DataLink1;
import java.awt.*;

public class DataLinkGUI {

	public static void main(String[] args) {
		Frame F = new Frame("Add To Database");
		GridLayout GL = new GridLayout(4,2);
		F.setLayout(GL);
		
		TextField FirstInput = new TextField(10);
		TextField SecondInput = new TextField(10);
		TextField ThirdInput = new TextField(10);
		
		Label FirstLbl = new Label("RegNo:");
		Label SecondLbl = new Label("Name:");
		Label ThirdLbl = new Label("Marks:");
		Label BlankLbl = new Label("");
		
		GUILinkEHandler EHandl = new GUILinkEHandler(FirstInput, SecondInput, ThirdInput);
		Button addButton = new Button("Add To Database");
		addButton.addActionListener(EHandl);

		F.add(FirstLbl);
		F.add(FirstInput);
		F.add(SecondLbl);
		F.add(SecondInput);
		F.add(ThirdLbl);
		F.add(ThirdInput);
		F.add(BlankLbl);
		F.add(addButton);
		
		F.setSize(250,130);
		F.setVisible(true);
	}

}
