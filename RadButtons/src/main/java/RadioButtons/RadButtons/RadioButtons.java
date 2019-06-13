package RadioButtons.RadButtons;
import java.awt.*;
import javax.swing.*;

public class RadioButtons {

	public static void main(String[] args) {
		Frame F = new Frame("RadioButtonDemo");
		GridLayout GL = new GridLayout(6,2);
		F.setLayout(GL);
		
		TextField FirstNumField = new TextField(10);
		TextField SecondNumField = new TextField(10);
		TextField ResultNumField = new TextField(10);
		
		JRadioButton addButton = new JRadioButton("Addition",true);
		JRadioButton subButton = new JRadioButton("Subtraction");
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(addButton);
		btnGroup.add(subButton);
		
		Label FirstLbl = new Label("First Number:");
		Label SecondLbl = new Label("Second Number:");
		Label BlankOne = new Label("");
		Label BlankTwo = new Label("");
		Label BlankThree = new Label("");
		Label ResultLbl = new Label("Result:");
		
		Button calcButton = new Button("Calculate...");
		Ehandler E = new Ehandler(FirstNumField, SecondNumField, ResultNumField, addButton, subButton);
		calcButton.addActionListener(E);
		
		F.add(FirstLbl);
		F.add(FirstNumField);
		F.add(SecondLbl);
		F.add(SecondNumField);
		F.add(BlankOne);
		F.add(addButton);
		F.add(BlankTwo);
		F.add(subButton);
		F.add(BlankThree);
		F.add(calcButton);
		F.add(ResultLbl);
		F.add(ResultNumField);
		F.setSize(250,200);
		F.setVisible(true);
	}

}
