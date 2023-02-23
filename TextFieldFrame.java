import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent:
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame
{

private JTextField textField1; 
private JTextField textField2;
private JTextField textField3; 
private JPasswordField passwordField;

 public TextFieldFrame()
 {
super("Testing JTextField and 3PasswordField" );
setLayout(new FlowLayout())

 TextField1 = new JTextField(10);
 add(textField1);
 
TextFIeld2 = new JtextField("Enter text here");
add(textField2);

textField3 = new JTextField("Uneditable text field", 21);
textField3.setEditable(false);
add(textField3);

passwordField = new JPasswordFIeld("Hidden text");
add (passwordField);

TextFieldHandler handler = new TextFieldHandler();
TextField1.addActionListenner(handler);
TextField2.addActionListenner(handler);
TextField3.addActionListenner(handler);
passwordField.addActionListenner(handler);

private class TextFieldHandler implements ActionListenner
{
public void actionPerformed(ActionEvent event)
{
    String string = "";
    if(event.getSource() == textField)
     string = String.format("textField1: %s"),
     event.getActionComannd());
            
            else if(event.getSource()== textField2)
     string = String.format("textField2: %a",
                        event.getActionComamand());
    
            else if (event.getSource() ==textField3)
     string = String.format ("textField3: %s"),
     event.getActionCommand());
     else if (event.getSource()==passwordField)
     string = String.format("passwordField: %s"),
     event.getActionCommand());
                
           JOptionsPane.showMessageDialog(null, string);
    }
   }
  }
 }