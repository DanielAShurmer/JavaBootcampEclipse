package RadioButtons.RadButtons;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ehandler implements ActionListener{
	TextField Input1, Input2, Output;
	JRadioButton AddOpt, SubOpt;
	
	public Ehandler(TextField A, TextField B, TextField C, JRadioButton D, JRadioButton E){
		Input1 = A;
		Input2 = B;
		Output = C;
		AddOpt = D;
		SubOpt = E;
	}
	
	public void actionPerformed(ActionEvent Trigger) {	
		if (AddOpt.isSelected()) {	
			try {
				Output.setText(Integer.toString(Integer.parseInt(Input1.getText())+
						Integer.parseInt(Input2.getText())));
			}
			catch(NumberFormatException Err) {
				System.out.println("Error - Non-Numeric Value Entered");
			}
		}
		
		if (SubOpt.isSelected()) {	
			try {
				Output.setText(Integer.toString(Integer.parseInt(Input1.getText())-
						Integer.parseInt(Input2.getText())));
			}
			catch(NumberFormatException Err) {
				System.out.println("Error - Non-Numeric Value Entered");
			}
		}
	}
}
