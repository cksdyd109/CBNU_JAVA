import java.awt.*;
class BorderLayoutTest1 extends Frame
{
	public BorderLayoutTest1(String str)
	{
		super(str);
		setLayout(new BorderLayout());
		add("North",new Button("����"));
		add("West",new Button("����"));
		add("East",new Button("���U"));
		add("Center",new Button("�߾�"));
		add("South",new Button("����"));
		
		setSize(200,200);
		setVisible(true);
	}
}
public class BorderLayoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutTest1("BorderLayout����");
	}

}
