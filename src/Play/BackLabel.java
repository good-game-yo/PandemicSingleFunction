package Play;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Play.MainPanel.Map;

class BackLabel extends JLabel {
	// 뒤로가기 라벨은 많이 쓰이니까 그냥 라벨로 만들었다. 뒤로가기 버튼
	ControlPanel Controlpanel;
	ImageIcon BackIcon = new ImageIcon(Map.class.getResource("../Image/back.png"));// 뒤로가기버튼

	public BackLabel(ControlPanel Controlpanel) {
		this.setText("뒤로");
		this.setIcon(BackIcon);
		this.Controlpanel = Controlpanel;
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Controlpanel.invalidate();
				Controlpanel.removeAll();
				Controlpanel.add(new BasicSelect(Controlpanel));
				Controlpanel.revalidate();
				Controlpanel.repaint();
				Controlpanel.Mainpanel.Controlpanel.setBounds(0, 840, 1920, 240);
			}

			public void mouseReleased(MouseEvent e) {

			}
		});
	}
}