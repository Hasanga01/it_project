package TimeTable_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Sessions extends JFrame {

	private JPanel contentPane;
	private JTextField txtSTime;
	private JTextField txtETime;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sessions frame = new Sessions();
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
	public Sessions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(30, 144, 255)));
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 11, 1236, 639);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 255, 255)));
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(29, 123, 1172, 375);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Select Room");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(91, 78, 146, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Start Time");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(615, 78, 146, 25);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("End Time");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(615, 238, 146, 25);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Select Day");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(91, 238, 146, 25);
		panel.add(lblNewLabel_1_3);
		
		txtSTime = new JTextField();
		txtSTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSTime.setBounds(826, 60, 180, 38);
		panel.add(txtSTime);
		txtSTime.setColumns(10);
		
		txtETime = new JTextField();
		txtETime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtETime.setColumns(10);
		txtETime.setBounds(826, 225, 180, 38);
		panel.add(txtETime);
		
		JComboBox comboBoxRoom = new JComboBox();
		comboBoxRoom.setModel(new DefaultComboBoxModel(new String[] {"--Make a Selection--", "301A", "301B", "402A", "402B", "502A", "502B", "604A", "604B"}));
		comboBoxRoom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxRoom.setBounds(247, 60, 218, 39);
		panel.add(comboBoxRoom);
		
		JComboBox comboBoxDay = new JComboBox();
		comboBoxDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxDay.setModel(new DefaultComboBoxModel(new String[] {"--Make a Selection--", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
		comboBoxDay.setBounds(247, 225, 218, 38);
		panel.add(comboBoxDay);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(26, 24, 1175, 83);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Sessions");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(428, 11, 272, 46);
		panel_2.add(lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(240, 248, 255));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(26, 517, 1175, 92);
		panel_1.add(panel_2_1);
		
		JButton btnNewButton = new JButton("Add Session");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Object lecRoom = comboBoxRoom.getSelectedItem();
				Object day = comboBoxDay.getSelectedItem();
				Object stime = txtSTime.getText();
				Object etime = txtETime.getText();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
            
                    
                    String query = "INSERT INTO sessions values(0,'" + lecRoom + "','"+ day + "','" + stime + "','" + etime + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Session sucessfully allocated");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				
				
			}
		});
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(138, 29, 215, 41);
		panel_2_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				comboBoxRoom.setSelectedItem("--Make a Selection--");
				comboBoxDay.setSelectedItem("--Make a Selection--");
				txtSTime.setText("");
				txtETime.setText("");
							
			}
		});
		btnClear.setBackground(new Color(255, 255, 0));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(526, 29, 215, 41);
		panel_2_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Time Table Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				} 
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(950, 29, 215, 41);
		panel_2_1.add(btnExit);
	}
}
