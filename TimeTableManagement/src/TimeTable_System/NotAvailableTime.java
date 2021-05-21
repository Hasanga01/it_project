package TimeTable_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class NotAvailableTime extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtTime;
	private JTextField txtID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotAvailableTime frame = new NotAvailableTime();
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
	public NotAvailableTime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(221, 160, 221));
		panel.setBounds(38, 28, 1249, 667);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(63, 128, 1063, 396);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Lecturer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(69, 107, 145, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Session ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(69, 180, 145, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Group");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(69, 252, 145, 25);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sub Group");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(69, 327, 145, 25);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Time");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(645, 54, 123, 25);
		panel_1.add(lblNewLabel_1_4);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTime.setBounds(778, 49, 199, 30);
		panel_1.add(txtTime);
		txtTime.setColumns(10);
		
		JComboBox comboBoxLec = new JComboBox();
		comboBoxLec.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "Ms.Nishadi", "Mr.Waruna", "Ms.Nimasha", "Mr.Hemantha", "Ms.Subodani", "Mr.Dineth", "Ms.Himasha"}));
		comboBoxLec.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxLec.setBounds(270, 102, 199, 30);
		panel_1.add(comboBoxLec);
		
		JComboBox comboBoxSid = new JComboBox();
		comboBoxSid.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "Y1S1", "Y1S2", "Y2S1", "Y2S2", "Y3S1", "Y3S2", "Y4S1", "Y4S2"}));
		comboBoxSid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxSid.setBounds(270, 175, 199, 30);
		panel_1.add(comboBoxSid);
		
		JComboBox comboBoxGrp = new JComboBox();
		comboBoxGrp.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14"}));
		comboBoxGrp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxGrp.setBounds(270, 247, 199, 30);
		panel_1.add(comboBoxGrp);
		
		JComboBox comboBoxSGrp = new JComboBox();
		comboBoxSGrp.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "01", "02"}));
		comboBoxSGrp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxSGrp.setBounds(270, 322, 199, 30);
		panel_1.add(comboBoxSGrp);
		
		JLabel lblNewLabel_1_5 = new JLabel("ID");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(69, 54, 145, 25);
		panel_1.add(lblNewLabel_1_5);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtID.setColumns(10);
		txtID.setBounds(270, 49, 199, 30);
		panel_1.add(txtID);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(211, 211, 211));
		panel_1_1.setBounds(63, 535, 1063, 101);
		panel.add(panel_1_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Object ID = txtID.getText();
				Object lectureName = comboBoxLec.getSelectedItem();
				Object session_Id = comboBoxSid.getSelectedItem();
				Object groupNo = comboBoxGrp.getSelectedItem();
				Object sub_Group = comboBoxSGrp.getSelectedItem();
				Object timeT = txtTime.getText();
                

                String msg = "" + lectureName;
                msg += " \n";

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
            
                    
                    String query = "INSERT INTO notavailable_time values('" + ID + "','"+ lectureName + "','" + session_Id + "','" + groupNo + "','" + sub_Group + "','" + timeT + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, msg +"Not Available Time is sucessfully allocated");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				
			}
		});
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(101, 40, 151, 33);
		panel_1_1.add(btnNewButton);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				new TimeTable_System().setVisible(true);
				dispose();
				
				
				
			}
		});
		btnView.setBackground(new Color(255, 255, 0));
		btnView.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnView.setBounds(449, 40, 151, 33);
		panel_1_1.add(btnView);
		
		JButton btnNewButton_1_1 = new JButton("Clear");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					txtID.setText("");
					comboBoxLec.setSelectedItem("--Make a selection--");
					comboBoxSid.setSelectedItem("--Make a selection--");
					comboBoxGrp.setSelectedItem("--Make a selection--");
					comboBoxSGrp.setSelectedItem("--Make a selection--");
					txtTime.setText("");
				
			}
		});
		btnNewButton_1_1.setBackground(new Color(124, 252, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(816, 40, 151, 33);
		panel_1_1.add(btnNewButton_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(211, 211, 211));
		panel_1_1_1.setBounds(63, 16, 1063, 101);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Not Available Time Allocations");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(226, 24, 557, 43);
		panel_1_1_1.add(lblNewLabel);
	}
}
