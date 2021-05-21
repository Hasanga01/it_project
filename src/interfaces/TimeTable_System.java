package TimeTable_System;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TimeTable_System extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField_Time;
	private JTable table;

	
	Connection sqlConn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	int q, i, id, deleteItem;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeTable_System frame = new TimeTable_System();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*public void upDateDB() 
	{
		try {
			sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
			
			String sql = "select * from time_table";
            
            pst = connection.prepareStatement(sql);
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            
            DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
            RecordTable.setRowCount(0);
			
            while(rs.next()) {
            	Vector columnData = new Vector();
            	
            	for (i = 1; i <= q; i++)
            	{
            		columnData.add(rs.getString("ID"));
            		columnData.add(rs.getString("Lecturer"));
            		columnData.add(rs.getString("Session_Id"));
            		columnData.add(rs.getString("Group"));
            		columnData.add(rs.getString("Sub_Group"));
            		columnData.add(rs.getString("Time"));
            	}
            	RecordTable.addRow(columnData);
            }	
        } 
		catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
	}*/
	
	
	
	Connection connection;
	private JTextField txtID;
	/**
	 * Create the frame.
	 */
	public TimeTable_System() {
		
		try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 128)));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(10, 10, 1335, 673);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(10, 22, 1295, 80);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Manage Not Available Time");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(320, 11, 622, 45);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new NotAvailableTime().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_3.setBackground(new Color(186, 85, 211));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(10, 11, 106, 35);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Sessions");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Sessions().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(1124, 21, 147, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(34, 113, 460, 409);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		
		JLabel lblNewLabel_1 = new JLabel("Session ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(43, 168, 108, 25);
		panel_1_1.add(lblNewLabel_1);
		
		textField_Time = new JTextField();
		textField_Time.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_Time.setBounds(219, 360, 196, 31);
		panel_1_1.add(textField_Time);
		textField_Time.setColumns(10);
		
		JComboBox comboBox_Sid = new JComboBox();
		comboBox_Sid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_Sid.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "Y1S1", "Y1S2", "Y2S1", "Y2S2", "Y3S1", "Y3S2", "Y4S1", "Y4S2"}));
		comboBox_Sid.setBounds(219, 162, 196, 31);
		panel_1_1.add(comboBox_Sid);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lecturer");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(43, 100, 108, 25);
		panel_1_1.add(lblNewLabel_1_1);
		
		JComboBox comboBox_Lec = new JComboBox();
		comboBox_Lec.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_Lec.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "Ms.Nishadi", "Mr.Waruna", "Ms.Nimasha", "Mr.Hemantha", "Ms.Subodani", "Mr.Dineth", "Ms.Himasha"}));
		comboBox_Lec.setBounds(219, 94, 196, 31);
		panel_1_1.add(comboBox_Lec);
		
		JLabel lblNewLabel_1_2 = new JLabel("Group");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(43, 234, 108, 25);
		panel_1_1.add(lblNewLabel_1_2);
		
		JComboBox comboBox_Grp = new JComboBox();
		comboBox_Grp.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14"}));
		comboBox_Grp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_Grp.setBounds(219, 228, 196, 31);
		panel_1_1.add(comboBox_Grp);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sub Group");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(43, 301, 108, 25);
		panel_1_1.add(lblNewLabel_1_3);
		
		JComboBox comboBox_SGrp = new JComboBox();
		comboBox_SGrp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_SGrp.setModel(new DefaultComboBoxModel(new String[] {"--Make a selection--", "01", "02"}));
		comboBox_SGrp.setBounds(219, 295, 196, 31);
		panel_1_1.add(comboBox_SGrp);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Time");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(43, 366, 108, 25);
		panel_1_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(43, 31, 108, 25);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtID.setColumns(10);
		txtID.setBounds(219, 28, 196, 31);
		panel_1_1.add(txtID);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(Color.BLACK);
		panel_1_1_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1.setBounds(504, 113, 821, 414);
		panel.add(panel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 714, 393);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				DefaultTableModel RecordTable = (DefaultTableModel)table.getModel();
	            int SelectedRows = table.getSelectedRow();	
				
	            txtID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
	            comboBox_Lec.setSelectedItem(RecordTable.getValueAt(SelectedRows, 1).toString());
	            comboBox_Sid.setSelectedItem(RecordTable.getValueAt(SelectedRows, 2).toString());
	            comboBox_Grp.setSelectedItem(RecordTable.getValueAt(SelectedRows, 3).toString());
	            comboBox_SGrp.setSelectedItem(RecordTable.getValueAt(SelectedRows, 4).toString());
	            textField_Time.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
				
				
	            
				
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Lecturer", "Session ID", "Group", "Sub Group", "Time"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setForeground(Color.BLACK);
		panel_1_1_1_1.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 128)));
		panel_1_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1_1.setBounds(10, 533, 1275, 132);
		panel.add(panel_1_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
		        
		            String sql = "delete from notavailable_time where ID = ?";
		            PreparedStatement pstmt = connection.prepareStatement(sql);
		            pstmt.setInt(1, Integer.parseInt(txtID.getText()));
		            pstmt.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Record deleted successfully");
		            
		            txtID.setText("");
					comboBox_Lec.setSelectedItem("--Make a selection--");
					comboBox_Sid.setSelectedItem("--Make a selection--");
					comboBox_Grp.setSelectedItem("--Make a selection--");
					comboBox_SGrp.setSelectedItem("--Make a selection--");
					textField_Time.setText("");
		            
		            connection.close();
				
				
				} catch (Exception exception) {
		            exception.printStackTrace();
		        }
				
				
				
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() ==-1) {
					if(table.getRowCount()==0) {
						
						JOptionPane.showMessageDialog(null, "No data to delete","Time Table Management System",JOptionPane.OK_OPTION);
					
					}else {
						
						JOptionPane.showMessageDialog(null, "Select a row to delete","Time Table Management System",JOptionPane.OK_OPTION);
						
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
		
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(171, 80, 151, 41);
		panel_1_1_1_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtID.setText("");
				comboBox_Lec.setSelectedItem("--Make a selection--");
				comboBox_Sid.setSelectedItem("--Make a selection--");
				comboBox_Grp.setSelectedItem("--Make a selection--");
				comboBox_SGrp.setSelectedItem("--Make a selection--");
				textField_Time.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setBounds(332, 80, 151, 41);
		panel_1_1_1_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Exit");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Time Table Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				} 
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2_1.setBounds(1088, 31, 151, 41);
		panel_1_1_1_1.add(btnNewButton_2_1);
		
		JButton btnLoadTable = new JButton("Load Data");
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String query="select * from notavailable_time";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
					rs.close();
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnLoadTable.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLoadTable.setBackground(Color.YELLOW);
		btnLoadTable.setBounds(927, 31, 151, 41);
		panel_1_1_1_1.add(btnLoadTable);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
		        
		            String sql = "select * from notavailable_time where ID = ?";
		            PreparedStatement pstmt = connection.prepareStatement(sql);
		            pstmt.setInt(1,Integer.parseInt(txtID.getText()));
		            
		            ResultSet rs = pstmt.executeQuery();
		            if(rs.next())
		            {
		       
		            	comboBox_Lec.setSelectedItem(rs.getString("Lecturer"));
		            	comboBox_Sid.setSelectedItem(rs.getString("Session_Id"));
		            	comboBox_Grp.setSelectedItem(rs.getString("Group"));
		            	comboBox_SGrp.setSelectedItem(rs.getString("Sub_Group"));
		            	textField_Time.setText(rs.getString("Time"));
		            }
		            else
		            {
		            	JOptionPane.showMessageDialog(null, "Record not found");
		            }
		            connection.close();
				
				} catch (Exception exception) {
		            exception.printStackTrace();
		        }
				
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearch.setBackground(new Color(128, 128, 128));
		btnSearch.setBounds(171, 11, 151, 41);
		panel_1_1_1_1.add(btnSearch);
		
		JButton btnNewButton_2_2 = new JButton("Update");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
					
					String value1 = txtID.getText().toString();
					String value2 = comboBox_Lec.getSelectedItem().toString();
					String value3 = comboBox_Sid.getSelectedItem().toString();
					String value4 = comboBox_Grp.getSelectedItem().toString();
					String value5 = comboBox_SGrp.getSelectedItem().toString();
					String value6 = textField_Time.getText();
					
					String query = "UPDATE notavailable_time SET ID ='"+value1+"', Lecturer ='"+value2+"', Session_Id ='"+value3+"', Group = '"+value4+"', Sub_Group ='"+value5+"', Time = '"+value6+"'";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Updated");
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
				
				
				
				
				
				
				
				
				
				
				/*try {
					Class.forName("com.mysql.jdbc.Driver");
		            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost/time_table", "root", "Thakshila+5");
		        
		            String sql = " update notavailable_time set Lecturer = ?, Session_Id = ?, Group = ?, Sub_Group = ?, Time = ? where ID = ? ";
		            
		            pst = connection.prepareStatement(sql);
		            
		            
		            pst.setString(1, comboBox_Lec.getSelectedItem().toString());
		            pst.setString(2, comboBox_Sid.getSelectedItem().toString());
		            pst.setString(3, comboBox_Grp.getSelectedItem().toString()); 
		            pst.setString(4, comboBox_SGrp.getSelectedItem().toString());
		            pst.setString(5, textField_Time.getText());
		            pst.setInt(6, Integer.parseInt(txtID.getText().toString()));
		            
		            pst.executeUpdate();
		            
		            //Show a successful message
		            JOptionPane.showMessageDialog(null, "Record Updated Successfully");
		            
		            //upDateDB();
		            //connection.close();
				
				
				} catch (Exception exception) {
		         	JOptionPane.showMessageDialog(null, exception);
		            exception.printStackTrace();
		        }*/
			}
		});
		btnNewButton_2_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_2.setBackground(new Color(65, 105, 225));
		btnNewButton_2_2.setBounds(10, 80, 151, 41);
		panel_1_1_1_1.add(btnNewButton_2_2);
	}
}
