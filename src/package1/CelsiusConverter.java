package package1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelsiusConverter extends JFrame {

	private JPanel contentPane;
	private JTextField tempTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusConverter frame = new CelsiusConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CelsiusConverter() {
		setTitle("\u6E29\u5EA6\u8F6C\u6362\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tempTextField = new JTextField();
		tempTextField.setToolTipText("\u8BF7\u8F93\u5165\u6444\u6C0F\u6E29\u5EA6");
		tempTextField.setBounds(23, 25, 66, 21);
		contentPane.add(tempTextField);
		tempTextField.setColumns(10);
		
		JLabel celsiusLabel = new JLabel("\u6444\u6C0F\u5EA6");
		celsiusLabel.setBounds(115, 28, 79, 15);
		contentPane.add(celsiusLabel);
		
		JLabel fahrenheitLabel = new JLabel("\u534E\u6C0F\u6E29\u5EA6");
		fahrenheitLabel.setBounds(115, 69, 93, 15);
		contentPane.add(fahrenheitLabel);
		
		JButton convertButton = new JButton("\u8F6C\u6362");
		convertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int tempFahr =(int)((Double.parseDouble(tempTextField.getText()))
						*1.8 +32);
				fahrenheitLabel.setText("»ªÊÏÎÂ¶ÈÎª£º"+tempFahr);
				
			}
		});
		convertButton.setBounds(10, 65, 93, 23);
		contentPane.add(convertButton);
		

	}
}
