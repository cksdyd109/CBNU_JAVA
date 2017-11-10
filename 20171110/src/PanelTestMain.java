import java.awt.*;

class PanelTest extends Frame
{
	public PanelTest(String str)
	{
		super(str);
		Panel panel1= new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
		setSize(300,300);
		setVisible(true);
	}
}
public class PanelTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelTest("패널 테스트");
	}

}
