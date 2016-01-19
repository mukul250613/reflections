import java.awt.*;
import java.awt.event.*;
class first extends Frame implements ActionListener{
TextField tf;
first(){
Button b1=new Button("click");
b1.setBounds(150,150,80,40);
add(b1);
tf=new TextField();
tf.setBounds(75,75,180,40);
add(tf);
b1.addActionListener(this);
setSize(500,500);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
tf.setText("Hello");
}
public static void main(String...args){
first f=new first();
}
}
