package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controller.Controller;

import model.Member;
import model.SkillCategory;
import model.SkillSet;
import model.Squads;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
/**
 * This is the SquadsSkill view class
 * @author Carol Mcdaid
 *
 */
public class SquadsSkills extends JFrame {
	
	private JPanel contentPane;
	public String date;
	private Controller con;
	private ArrayList newMember;
	private ArrayList newSquad;
	protected JButton btnSeniorTeam;
	protected JButton btnMidiTeam;
	protected JButton btnMiniTeam;
	protected JButton btnallPlayers;
	protected JComboBox cbxPlayers;
	protected JButton btnSkills;
	protected JButton btnPlayerDetails;
	public JLabel lblimage;
	protected JComboBox cbxSkill;
	protected JButton btnSave;
	protected JTextArea txtAreaEditComments;
	protected JComboBox cbxSkillLevel;
	public JTextArea txtAreaPlayerDetails;
	protected JButton btnAddtoSenior;
	public int selectedLevel;
	protected JComboBox cbxSkills;
	public String selectedSkill;
	protected int id;
	protected String currentPlayer;
	private Controller theController;
	public SkillSet tempMember;
	protected JTextArea txtAreaSkills;
	protected String itemChoose;
	private JTextField txtDateAch;
	protected JComboBox cbxSquads;
	protected JLabel lblCat;
	protected JFrame messageframe ;
	protected JButton btndisplay;
	protected JButton btnNewSetSkills;
	
	/**
	 * This constructor passes the controller
	 * @param c controller
	 */
	public SquadsSkills(Controller c) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
			messageframe = new JFrame("JOptionPane showMessageDialog example");
		    
			   //A message is then displayed to say this has been successful
			    JOptionPane.showMessageDialog(messageframe,
			        "Error !! Please close and reload" );
		}
		con=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlSimplyRugby = new JPanel();
		pnlSimplyRugby.setBorder(new TitledBorder(null, "Simply Rugby", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSimplyRugby.setBounds(10, 0, 903, 730);
		contentPane.add(pnlSimplyRugby);
		pnlSimplyRugby.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(451, 5, 1, 1);
		pnlSimplyRugby.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(null, "Players Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel label = new JLabel("");
		label.setBounds(154, 44, 46, 14);
		panel_3.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setTabSize(20);
		textArea.setColumns(10);
		textArea.setBounds(10, 22, 264, 321);
		panel_3.add(textArea);
		date = new SimpleDateFormat("dd-MM-yyyy hh:mm").format(new Date());
		
		JPanel pnlDisplay = new JPanel();
		pnlDisplay.setBorder(new TitledBorder(null, "Player's and Squads", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlDisplay.setBounds(9, 22, 460, 211);
		pnlSimplyRugby.add(pnlDisplay);
		pnlDisplay.setLayout(null);
		
		JPanel pnlTeam = new JPanel();
		pnlTeam.setLayout(null);
		pnlTeam.setBorder(new TitledBorder(null, "Select a Team", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlTeam.setBounds(10, 22, 440, 112);
		pnlDisplay.add(pnlTeam);
		/**
		 * This is were when the senior team button is passed then it will call the getPlayerInfor method to display 
		 * the players in that squad
		 */
		btnSeniorTeam = new JButton("Senior");
		btnSeniorTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clearing the combo box before adding to it.
				cbxSquads.removeAllItems();
				id =0;
				String name ="Senior";
				newSquad = con.getSquadArray();
				Iterator<Squads> anIT = newSquad.iterator();
				
				while(anIT.hasNext())
				{
					//looking for all the players that are in the squad and then sending the id to getPlayerInfo
					//to return the players details and showing in the combo box
					Squads tempSquad=(Squads)anIT.next();
					
					if (name ==tempSquad.getSquadName())
					{
					
						id = tempSquad.getSquadPlayer();
				
						getPlayerInfo(id);
					}
				
				}
			}
		});
		btnSeniorTeam.setBounds(52, 25, 76, 23);
		pnlTeam.add(btnSeniorTeam);
		/**
		 * This is were when the Midi team button is passed then it will call the getPlayerInfor method to display 
		 * the players in that squad
		 */
		btnMidiTeam = new JButton("Midi");
		btnMidiTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clearing the combo box before adding to it.
				cbxSquads.removeAllItems();
				id =0;
				String name ="Midi";
				newSquad = con.getSquadArray();
				Iterator<Squads> anIT = newSquad.iterator();
				
				while(anIT.hasNext())
				{
					//looking for all the players that are in the squad and then sending the id to getPlayerInfo
					//to return the players details and showing in the combo box
					Squads tempSquad=(Squads)anIT.next();
					
					if (name ==tempSquad.getSquadName())
					{
					
					id = tempSquad.getSquadPlayer();
					
					getPlayerInfo(id);
					}
				
				}
			}
		});
		btnMidiTeam.setBounds(175, 25, 76, 23);
		pnlTeam.add(btnMidiTeam);
		/**
		 * This is were when the Miniteam button is passed then it will call the getPlayerInfor method to display 
		 * the players in that squad
		 */
		btnMiniTeam = new JButton("Mini");
		btnMiniTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clearing the combo box before adding to it.
				cbxSquads.removeAllItems();
				id =0;
				String name ="Mini";
				newSquad = con.getSquadArray();
				Iterator<Squads> anIT = newSquad.iterator();
				
				while(anIT.hasNext())
				{
					//looking for all the players that are in the squad and then sending the id to getPlayerInfo
					//to return the players details and showing in the combo box
					Squads tempSquad=(Squads)anIT.next();
					
					if (name ==tempSquad.getSquadName())
					{
					
					id = tempSquad.getSquadPlayer();
					
					getPlayerInfo(id);
					}
				
				}
			}
		});
		btnMiniTeam.setBounds(318, 25, 76, 23);
		pnlTeam.add(btnMiniTeam);
		
		cbxSquads = new JComboBox();
		cbxSquads.setBounds(10, 63, 420, 20);
		pnlTeam.add(cbxSquads);
		
		JPanel pnlSelectPlayer = new JPanel();
		pnlSelectPlayer.setLayout(null);
		pnlSelectPlayer.setBorder(new TitledBorder(null, "Select a Player", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlSelectPlayer.setBounds(10, 141, 195, 59);
		pnlDisplay.add(pnlSelectPlayer);
		/**
		 * This is were when the players skill button is press the combobox is loaded with the skills names
		 */
		/**
		 * This is were when the all players button is pressed the playersID's are displayed in the cbxPlayers combobox
		 */
		btnallPlayers = new JButton("All players");
		btnallPlayers.setBounds(40, 25, 104, 23);
		pnlSelectPlayer.add(btnallPlayers);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "View Player's Skills", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_9.setBounds(215, 141, 200, 59);
		pnlDisplay.add(panel_9);
		panel_9.setLayout(null);
		btnSkills = new JButton("Players Skills");
		btnSkills.setBounds(43, 21, 111, 23);
		panel_9.add(btnSkills);
		
		btnSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// adding all the skils into the combo box
				cbxSkills.addItem("Standard");
				cbxSkills.addItem("Spin");
				cbxSkills.addItem("Pop");
				cbxSkills.addItem("Front");
				cbxSkills.addItem("Rear");
				cbxSkills.addItem("Side");
				cbxSkills.addItem("Scrabble");
				cbxSkills.addItem("Drop");
				cbxSkills.addItem("Punt");
				cbxSkills.addItem("Grubber");
				cbxSkills.addItem("Goal");
			}
		});
		btnallPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clearing the combo box before adding to it.
				cbxPlayers.removeAllItems();
				// this is where all the players id are displayed in the combo box
				// call on the array from the controller
				newMember = con.getMemberArray();
				Iterator<Member> anIT = newMember.iterator();
				
				while(anIT.hasNext())
				{
					//search for all the players and display the playersid's in the combo box
					Member tempMem=(Member)anIT.next();
					
					
					
						cbxPlayers.addItem(tempMem.getID());
						
						
					
				
				}
				
					
					
					
				
				
			}
		});
		
		JPanel pnlSkills = new JPanel();
		pnlSkills.setBounds(433, 237, 460, 218);
		pnlSimplyRugby.add(pnlSkills);
		pnlSkills.setLayout(null);
		pnlSkills.setBorder(new TitledBorder(null, "Skills", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		/**
		 * This is were the cbxSkills Combobox when a skill is chosen the skill is checked for what category it is under.
		 * This is checked in the controller by the getSkillCat method.
		 * Then the lblCat label shows the category of the chosen skill.
		 */
		cbxSkills = new JComboBox();
		cbxSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is where the skills are shown the user will pick a skill and it will be sorted in itemChoose
				itemChoose = (String) cbxSkills.getSelectedItem();
				if (itemChoose == "Standard"|| itemChoose == "Spin"||itemChoose == "Pop")
				{
					con.tempSkillCat = 1;
				}
				if(itemChoose == "Front"|| itemChoose == "Rear"||itemChoose == "Side"||itemChoose == "Scrabble")
				{
					con.tempSkillCat = 2;
				}
				if (itemChoose == "Drop"|| itemChoose == "Punt"||itemChoose == "Grubber"||itemChoose == "Goal")
				{
					con.tempSkillCat = 3;
				}
				//The skill category is searched for in the controller and returned in currentSkillCat and is displayed in the label
				con.getSkillCat();
				lblCat.setText("Skill Category is :- "+con.currentSkillCat);
			}
		});
		cbxSkills.setBounds(47, 93, 109, 20);
		pnlSkills.add(cbxSkills);
		/**
		 * This is were when the display skills button is pressed the displaySKills method is passed the currentID and the itemchoose in cbxSkills combobox.
		 */
		btndisplay = new JButton("Display Skill");
		btndisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//The methos displaySkills is passed the currentID and the itemChoose.
				//It will return theskills details for that player
				displaySkills(con.currentID,itemChoose);
			}
		});
		btndisplay.setBounds(47, 140, 109, 23);
		pnlSkills.add(btndisplay);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Comments ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(192, 11, 258, 192);
		pnlSkills.add(panel_2);
		panel_2.setLayout(null);
		
		txtAreaSkills = new JTextArea();
		txtAreaSkills.setBounds(10, 21, 238, 160);
		panel_2.add(txtAreaSkills);
		txtAreaSkills.setRows(20);
		txtAreaSkills.setColumns(20);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Skill Category", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(10, 29, 179, 53);
		pnlSkills.add(panel_6);
		panel_6.setLayout(null);
		
		lblCat = new JLabel();
		lblCat.setBounds(10, 19, 159, 23);
		panel_6.add(lblCat);
		
		JPanel pnlEditSkills = new JPanel();
		pnlEditSkills.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Edit Player's Skills", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlEditSkills.setBounds(433, 466, 460, 211);
		pnlSimplyRugby.add(pnlEditSkills);
		pnlEditSkills.setLayout(null);
		/**
		 * This is were the skill is selected in edit skills
		 */
		/**
		 * Skill names are added to the cbxSkills combobox
		 */
		/**
		 * When the update skills button is pressed then the comments,the skill level and dateachieved is updated
		 */
		btnSave = new JButton("Update Skills");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is were the skills that have been updated are saved
				int id = con.currentID;
				Member tempMem = con.memberId;
				
				
				
				ArrayList newSkill= con.getSkillArray();
				Iterator<SkillSet> anIT = newSkill.iterator();
				
				while(anIT.hasNext())
				{
					// The skills are updated and sent to the SkillSet Class
					SkillSet tempSkill=(SkillSet)anIT.next();
					if (id == con.currentID)
					{
						if(selectedSkill == tempSkill.getSkill())
						{
							tempSkill.setComments(txtAreaEditComments.getText());
							tempSkill.setskillLevel(selectedLevel);
							tempSkill.setDateAch(txtDateAch.getText());
						}
					}
				}
				/**
				 * a message box is displayed to tell the user the skills have been saved 
				 */
				messageframe = new JFrame("JOptionPane showMessageDialog example");
			    
			   //A message is then displayed to say this has been successful
			    JOptionPane.showMessageDialog(messageframe,
			        "Skills Saved" );
				// the textArea and the textdate are both cleared 
				txtAreaEditComments.setText("");
				txtDateAch.setText("");
				
			}
		});
		btnSave.setBounds(51, 118, 120, 23);
		pnlEditSkills.add(btnSave);
		
		JPanel pnlEditComments = new JPanel();
		pnlEditComments.setLayout(null);
		pnlEditComments.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Add your Comments", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlEditComments.setBounds(242, 11, 208, 94);
		pnlEditSkills.add(pnlEditComments);
		
		txtAreaEditComments = new JTextArea();
		txtAreaEditComments.setRows(10);
		txtAreaEditComments.setColumns(10);
		txtAreaEditComments.setBounds(10, 21, 188, 55);
		pnlEditComments.add(txtAreaEditComments);
		/**
		 * This is were the level is selected of the chosen skill
		 */
		/**
		 * The skill levels are added to the cbxSkillLevel combobox
		 */
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Date Achieved", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(218, 118, 232, 74);
		pnlEditSkills.add(panel);
		panel.setLayout(null);
		
		txtDateAch = new JTextField();
		txtDateAch.setBounds(24, 32, 174, 31);
		panel.add(txtDateAch);
		txtDateAch.setColumns(10);
		/**
		 * This is were a new set of skills is made
		 * 
		 */
		btnNewSetSkills = new JButton("New Player Skills");
		btnNewSetSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This is were a new set of skills is made.
				//this is for players that dont have any skills or have not got a chosen skill
				int id = con.currentID;
				Member tempMem = con.memberId;
				String date;
				String comments;
				int skillCat =0;
				int skill =0;
				
				comments=txtAreaEditComments.getText();
				
				date = txtDateAch.getText();
				
				
				
					if (selectedSkill == "Standard"|| selectedSkill == "Spin"||selectedSkill == "Pop")
					{
						
						skillCat = 1;	
							
						
					}
					if(selectedSkill == "Standard"){
						skill =1;
					}
					if(selectedSkill == "Spin")
					{
						skill =2;
					}
					if(selectedSkill == "Pop")
					{
						skill =3;
					}
					if (selectedSkill == "Front"|| selectedSkill == "Rear"||selectedSkill == "Side"||selectedSkill == "Scrabble")
					{
						
						skillCat = 2;	
							
						
					}
					if(selectedSkill == "Front"){
						skill =4;
					}
					if(selectedSkill == "Rear")
					{
						skill =5;
					}
					if(selectedSkill == "Side")
					{
						skill =6;
					}
					if(selectedSkill == "Scrabble"){
						skill =7;
					}
					if (selectedSkill == "Drop"|| selectedSkill == "Punt"||selectedSkill == "Grubber"||selectedSkill == "Goal")
					{
						
						skillCat = 3;	
							
						
					}
					if(selectedSkill == "Drop")
					{
						skill =8;
					}
					if(selectedSkill == "Punt")
					{
						skill =9;
					}
					if(selectedSkill == "Grubber")
					{
						skill =10;
					}
					if(selectedSkill == "Goal")
					{
						skill =11;
					}
					
					// This is were the new SkillSet is sent to the array.
					SkillSet ns1 = new SkillSet (id,skillCat,skill,selectedSkill,selectedLevel,comments,date);	
					con.newSkill.add(ns1);
				
					  /*
					   * a message box is displayed when the skills have been made successfully
					   */
					messageframe = new JFrame("JOptionPane showMessageDialog example");
				    
				    // A message is displayed when successfull
				    JOptionPane.showMessageDialog(messageframe,
				        "New Skills Saved !!" );
				
				txtAreaEditComments.setText("");
				txtDateAch.setText("");
				
			
			}	
			
		});
		btnNewSetSkills.setBounds(32, 165, 166, 23);
		pnlEditSkills.add(btnNewSetSkills);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Select Skill", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.setBounds(10, 24, 106, 55);
		pnlEditSkills.add(panel_7);
		panel_7.setLayout(null);
		cbxSkill = new JComboBox();
		cbxSkill.setBounds(10, 24, 83, 20);
		panel_7.add(cbxSkill);
		cbxSkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is were the skill  is choosen
				selectedSkill = (String) cbxSkill.getSelectedItem();
			}
		});
		//Skills are sent to the combobox
		cbxSkill.addItem("Standard");
		cbxSkill.addItem("Spin");
		cbxSkill.addItem("Pop");
		cbxSkill.addItem("Front");
		cbxSkill.addItem("Rear");
		cbxSkill.addItem("Side");
		cbxSkill.addItem("Scrabble");
		cbxSkill.addItem("Drop");
		cbxSkill.addItem("Punt");
		cbxSkill.addItem("Grubber");
		cbxSkill.addItem("Goal");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Select Level", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_8.setBounds(120, 24, 112, 55);
		pnlEditSkills.add(panel_8);
		panel_8.setLayout(null);
		cbxSkillLevel = new JComboBox();
		cbxSkillLevel.setBounds(23, 24, 56, 20);
		panel_8.add(cbxSkillLevel);
		cbxSkillLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is were the skill level is chosen
				selectedLevel = (int)cbxSkillLevel.getSelectedItem();
			}
		});
		//Skill levels are sent to the combobox
		cbxSkillLevel.addItem(1);
		cbxSkillLevel.addItem(2);
		cbxSkillLevel.addItem(3);
		cbxSkillLevel.addItem(4);
		cbxSkillLevel.addItem(5);
		
		JPanel pnlPlayer = new JPanel();
		pnlPlayer.setLayout(null);
		pnlPlayer.setBorder(new TitledBorder(null, "Players Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlPlayer.setBounds(9, 237, 414, 482);
		pnlSimplyRugby.add(pnlPlayer);
		
		JLabel label_32 = new JLabel("");
		label_32.setBounds(154, 44, 46, 14);
		pnlPlayer.add(label_32);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Add Player to Squad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 415, 394, 56);
		pnlPlayer.add(panel_1);
		panel_1.setLayout(null);
		
		btnAddtoSenior = new JButton("Add to Senior");
		btnAddtoSenior.setBounds(22, 22, 117, 23);
		panel_1.add(btnAddtoSenior);
		
		JButton btnAddToMidi = new JButton("Add To Midi");
		btnAddToMidi.setBounds(159, 22, 102, 23);
		panel_1.add(btnAddToMidi);
		
		JButton btnAddToMini = new JButton("Add To Mini");
		btnAddToMini.setBounds(276, 22, 108, 23);
		panel_1.add(btnAddToMini);
		
		cbxPlayers = new JComboBox();
		cbxPlayers.setBounds(64, 23, 111, 20);
		pnlPlayer.add(cbxPlayers);
		/**
		 * When the view player button is press the players toString will be displayed in the txtAreaPlayerDetails box.
		 */
		btnPlayerDetails = new JButton("View Player");
		btnPlayerDetails.setBounds(252, 22, 111, 23);
		pnlPlayer.add(btnPlayerDetails);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "View Player", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(10, 51, 394, 366);
		pnlPlayer.add(panel_5);
		panel_5.setLayout(null);
		
		txtAreaPlayerDetails = new JTextArea();
		txtAreaPlayerDetails.setBounds(10, 22, 374, 333);
		panel_5.add(txtAreaPlayerDetails);
		txtAreaPlayerDetails.setTabSize(20);
		txtAreaPlayerDetails.setColumns(10);
		btnPlayerDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAreaPlayerDetails.setText("");
				int id = con.currentID;
				// This is were the players full deatils are displayed in the text area
				Member tempMember = con.getPlayer(id);
				txtAreaPlayerDetails.setText(tempMember.fullDetails());
				
			}
		});
		/**
		 * The players id will be displayed in the cbxPlayers comboxbox when the user selects a id that id becomes the static currentId
		 * which can be used in other methods
		 */
		cbxPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//currentId which is static is given a value of the player chosen by the user
				con.currentID =(Integer)cbxPlayers.getSelectedItem();
			}
		});
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(479, 18, 414, 215);
		pnlSimplyRugby.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel pnlLogo = new JPanel();
		pnlLogo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlLogo.setBounds(10, 11, 394, 193);
		panel_4.add(pnlLogo);
		pnlLogo.setLayout(null);
		ImageIcon image = new ImageIcon(this.getClass().getResource("/icon.jpg"));
		JLabel lblinfo = new JLabel("Welcome ");
		lblinfo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblinfo.setBounds(69, 11, 119, 36);
		pnlLogo.add(lblinfo);
		
		JLabel lblYouAreLogged = new JLabel("You are logged on");
		lblYouAreLogged.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblYouAreLogged.setBounds(51, 47, 137, 19);
		pnlLogo.add(lblYouAreLogged);
		JLabel lblDate = new JLabel(date);
		lblDate.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDate.setBounds(51, 138, 137, 23);
		pnlLogo.add(lblDate);
		
		JLabel lblNewLabel_1 = new JLabel("The date and time is:-");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(39, 113, 143, 14);
		pnlLogo.add(lblNewLabel_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setBounds(209, 11, 175, 171);
		pnlLogo.add(panel_10);
		panel_10.setLayout(null);
		
		lblimage = new JLabel("");
		lblimage.setBounds(10, 11, 166, 150);
		panel_10.add(lblimage);
		lblimage.setIcon(image);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setBounds(433, 678, 460, 41);
		pnlSimplyRugby.add(panel_11);
		panel_11.setLayout(null);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				    Desktop.getDesktop().browse(new URL("http://web.mit.edu/6.005/www/sp14/psets/ps4/java-6-tutorial/components.html").toURI());
				} catch (Exception e) {}
			}
		});
		btnHelp.setBounds(182, 11, 89, 23);
		panel_11.add(btnHelp);
		/**
		 * this is were the player is added to the mini squad and a message box is displayed to show success
		 */
		btnAddToMini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This is were the player is added to the mini squad
				con.addPlayerToMiniSquad();
				
				    
				   
				messageframe = new JFrame("JOptionPane showMessageDialog example");
				    
				  
				    JOptionPane.showMessageDialog(messageframe,
				        "Player Added to Squad !!" );

			}
		});
		/**
		 * this is were the player is added to the midi squad and a message box is displayed to show success
		 */
		btnAddToMidi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is were the player is added to the midi squad
				con.addPlayerToMidiSquad();
				 
				messageframe = new JFrame("JOptionPane showMessageDialog example");
			    
			    
			    JOptionPane.showMessageDialog(messageframe,
			        "Player Added to Squad !!" );
			}
		});
		/**
		 * this is were the player is added to the senior squad and a message box is displayed to show success
		 */
		btnAddtoSenior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//This is were a player is added to the seinor team.
				con.addPlayerToSeniorSquad();
				 
				messageframe = new JFrame("JOptionPane showMessageDialog example");
			    
			    
			    JOptionPane.showMessageDialog(messageframe,
			        "Player Added to Squad !!" );
			}
		});
	}
	/**
	 * This sets the controller up in the view
	 * @param c controller
	 */
	public void setController(Controller c){
		theController = c;
	}
	/**
	 * This method search for the player of a squad within the newMember arraylist once found the details will be displayed in the cbxSquads combobox.
	 * @param id
	 */
	void getPlayerInfo(int id)
	{
		
		newMember = con.getMemberArray();
		Iterator<Member> anIT = newMember.iterator();
		
		while(anIT.hasNext())
		{// This players id for a sqaud is searched for and then is dispayyed in the combox box for the squads
			Member tempPlayer=(Member)anIT.next();
			
			if(id == tempPlayer.getID())
			{
			
			
			
				//cbxPlayers.addItem(id);
				 cbxSquads.addItem(tempPlayer.details());
				
			}
		
		}
		
		
	
		
	
	}
	/**
	 * displaySkills
	 * This method takes in the player id and the itemchosen and then searchs for the players id in the skills array
	 * then will display the details of the skill. 
	 * @param id
	 * @param itemchoose
	 */
		
	private void displaySkills(int id,String itemchoose)
	{
		
		
		ArrayList newSkill= con.getSkillArray();
		Iterator<SkillSet> anIT = newSkill.iterator();
		
		while(anIT.hasNext())
		{// This is were the skills are displayed in the text area for a player.
			SkillSet tempSkill=(SkillSet)anIT.next();
			
			if(id == tempSkill.getPlayerID())
			{
					if(itemChoose == tempSkill.getSkill())
					{
						txtAreaSkills.setText(tempSkill.details());
					}
			
				
			
			}
		}
			
		
	
		
	}
}
