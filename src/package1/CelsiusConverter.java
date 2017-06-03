package package1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

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
		tempTextField.setBounds(23, 25, 66, 21);
		contentPane.add(tempTextField);
		tempTextField.setColumns(10);
		
		JLabel celsiusLabel = new JLabel("Celsius");
		celsiusLabel.setBounds(115, 28, 79, 15);
		contentPane.add(celsiusLabel);
		
		JButton convertButton = new JButton("Convert");
		convertButton.setBounds(10, 65, 93, 23);
		contentPane.add(convertButton);
		
		JLabel fahrenheitLabel = new JLabel("Fahrenheit");
		fahrenheitLabel.setBounds(115, 69, 93, 15);
		contentPane.add(fahrenheitLabel);
	}
}
