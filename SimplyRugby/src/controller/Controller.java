package controller;


import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.JuniorMember;
import model.Member;
import model.Player;
import model.SkillCategory;
import model.SkillSet;

import model.Squads;



import view.SquadsSkills;
/**
 * This is the Controller
 * @author Carol Mcdaid
 *The Controller holds all the arraylists
 *
 */


public class Controller {
	public static int currentID;
	public ArrayList<Member> newMember = new ArrayList<Member>();
	protected ArrayList<Squads> newSquad = new ArrayList<Squads>();
	public ArrayList<SkillCategory> newSkillCat = new ArrayList<SkillCategory>();
	public ArrayList<SkillSet> newSkill = new ArrayList<SkillSet>();
	
	public String playerDetails;

	public static Member memberId;
	public static SkillSet playerSkillId;
	public String currentPlayer;
	public String currentSquad;
	public SquadsSkills newframe;
	public int tempSkillCat;
	public String currentSkillCat;
	

	/**
	 * This Construtor calls the method showSquads();
	 */
	public Controller(){
		
		
		showSquads();
		
		
	}
	/**
	 * ShowSquads opens the GUI for the programme
	 * it also calls the method that creates users
	 */
	public void showSquads(){		
		SquadsSkills newframe = new SquadsSkills(this); 
		
		newframe.setVisible(true);	
		newframe.setController(this);
		newframe.setVisible(true);	
		
		
		createSomeUsers();
		
		
		
	}
	
	/**
	 * CreateSomeUsers
	 * this method creates users for the arraylists
	 */
	
	private void createSomeUsers(){
		Player p1 = new Player("Sean","Black","1 Street Road","GK457LP","01526365894","07545176126","18/12/1998","Fullback","Jane Black","01592545856","Dr Smith","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p1);
		Player p2 = new Player("John","Lawson","14 Green Road","GK438KL","01526264585","07653849218","10/10/1995","Wing","Sarah Lawson","01592758379","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","Asthma");
		newMember.add(p2);
		Player p3 = new Player("John","lane","35 Scott Court","GK36KP","01526235689","07983462718","06/06/1997","Centre","Jand Lane","01592546578","Dr Smith","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p3);
		Player p4 = new Player("Derek"," Green","12 Rose Lane","GK58LP","01526457589","07987654324","01/04/1996","Fly Half","Daine Green","01592556677","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p4);
		Player p5 = new Player("Larry","Reed","31 Rose Lane","GK58LP","01526465721","07987612345","30/06/1996","Scrum Half","Claire Reed","01592557744","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p5);
		Player p6 = new Player("Steven","Cooper","2 Scott Court","GK438KL","01526123456","07234576543","31/12/1998","Hooker","Jane Cooper","01592541122","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p6);
		Player p7 = new Player("Scott","Jones","10 Red Road","GK45LP","01526456789","07123458463","01/01/1995","Prop","Lisa Jones","01592545658","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p7);
		Player p8= new Player("Louis","Miller","1 Yellow Street","GK46JP","01526789123","07236548907","28/05/1994","2nd row","Laura Miller","01592567487","Dr Smith","Cos lane surgery", "GK75NL","01592752100","Asthma");
		newMember.add(p8);
		Player p9 = new Player("Harry","Page","31 Rose Lane","GK58LP","01526465721","07987612345","30/06/1996","Back Row","Claire Page","01526465721","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p9);
		Player p10 = new Player("Dan","Hall","2 Scott Court","GK438KL","01526123456","07234576543","31/12/1992","Back Row","Betty Hall","01526123456","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p10);
		Player p11 = new Player("Scott","Smith","10 Red Road","GK45LP","01526456789","07123458463","01/01/1990","Back Row","Samantha SMith","0159257843","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None");
		newMember.add(p11);
		Player p12 = new Player("Liam","Scott","1 Yellow Street","GK46JP","01526789123","07236548907","28/05/1999","2nd row","Jane Scott","01592593847","Dr Smith","Cos lane surgery", "GK75NL","01592752100","Asthma");
		newMember.add(p12);
		
		JuniorMember j1 = new JuniorMember("Aaron","Mcdaid","20 Street Road","GK457LP","01592758903","18/12/2004","Fullback","Dr Smith","Cos lane surgery", "GK75NL","01592752100","None","Carol Mcdaid","Same address","Mum","07896487932","Roy Mcdaid","Dad","Same Address","07845463722");
		newMember.add(j1);
		JuniorMember j2 = new JuniorMember("John","Lawson","100 Green Road","GK438KL","01592789403","10/10/2005","Wing","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","Asthma","Jane Lawson","Same address","Mum","07897843762","James Lawson","Dad","Same Address","07345674832");
		newMember.add(j2);
		JuniorMember j3 = new JuniorMember("Bruce","Wayne","67 Scott Court","GK36KP","01592635689","06/06/2004","Centre","Dr Smith","Cos lane surgery", "GK75NL","01592752100","None","Joe Wayne","Same address","Mum","0789567382","Scott Wayne","Dad","Same Address","07456389452");
		newMember.add(j3);
		JuniorMember j4 = new JuniorMember("Clark","Kent","1 Rose Lane","GK58LP","01592645759","01/04/2003","Fly Half","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None","Lara Kent","34 Scott Court","Aunt","0784932062","David Kent","Dad","Same address","07453487549");
		newMember.add(j4);
		JuniorMember j5 = new JuniorMember("Craig","Reed","3 Rose Lane","GK58LP","01592675721","30/06/2003","Scrum Half","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Betty Reed","Same address","Mum","07896490232","Scott Reed","Dad","Same address","0794638293");
		newMember.add(j5);
		JuniorMember j6 = new JuniorMember("Steven","Barns","22 Scott Court","GK438KL","01592723456","31/12/2004","Hooker","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Jane Barns","Same address","Mum","07864928362","Ken Barns","Dad","Same Address","07925384618");
		newMember.add(j6);
		JuniorMember j7 = new JuniorMember("James","Smith","102 Red Road","GK45LP","01592656789","01/01/2003","Prop","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Jane Smith","Same address","Mum","07896453762","John Smith","Dad","Same Address","077449933827");
		newMember.add(j7);
		JuniorMember j8= new JuniorMember("Nathan","Thomas","112 Yellow Street","GK46JP","01592789123","28/05/2003","2nd row","Dr Smith","Cos lane surgery", "GK75NL","01592752100","Asthma","Sarah Thomas","Same address","Mum","07896453762","Stuart Thomas","Dad","Same Address","077552314483");
		newMember.add(j8);
		JuniorMember j9 = new JuniorMember("Kieffer","Moore","13 Rose Lane","GK58LP","01592665721","30/06/2005","Back Row","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None","Carol Moore","Same address","Mum","07783942762","Michael Moore","Dad","Same address","07964738234");
		newMember.add(j9);
		JuniorMember j10 = new JuniorMember("Dan","Stocks","24 Scott Court","GK438KL","01592612356","31/12/2004","Back Row","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Jane Stocks","Same address","Mum","07638293762","Scott Stocks","Dad","Same Address","07964532834");
		newMember.add(j10);
		JuniorMember j11 = new JuniorMember("Tom","Eastmen","12 Red Road","GK45LP","01592645678","01/01/2003","Back Row","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None","Jean Eastmen","Same address","Mum","07896453762","Ken Eastmen","Dad","Same Address","07845361070");
		newMember.add(j11);
		
		
		JuniorMember j12 = new JuniorMember("Ben","Reeves","19 Yellow Street","GK46JP","01592678913","28/05/2008","2nd row","Dr Smith","Cos lane surgery", "GK75NL","01592752100","Asthma","Gillian Reeves","Same address","Mum","07788463762","Gordon Reeves","Dad","Same Address","07734488221");
		newMember.add(j12);
		JuniorMember j13 = new JuniorMember("Aaron","Mcdaid","20 Street Road","GK457LP","01592758903","18/12/2008","Fullback","Dr Smith","Cos lane surgery", "GK75NL","01592752100","None","Carol Mcdaid","Same address","Mum","07896487932","Roy Mcdaid","Dad","Same Address","07845463722");
		newMember.add(j13);
		JuniorMember j14 = new JuniorMember("John","Lawson","100 Green Road","GK438KL","01592789403","10/10/2009","Wing","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","Asthma","Jane Lawson","Same address","Mum","07897843762","James Lawson","Dad","Same Address","07345674832");
		newMember.add(j14);
		JuniorMember j15 = new JuniorMember("Bruce","Wayne","67 Scott Court","GK36KP","01592635689","06/06/2009","Centre","Dr Smith","Cos lane surgery", "GK75NL","01592752100","None","Joe Wayne","Same address","Mum","0789567382","Scott Wayne","Dad","Same Address","07456389452");
		newMember.add(j15);
		JuniorMember j16 = new JuniorMember("Clark","Kent","1 Rose Lane","GK58LP","01592645759","01/04/2009","Fly Half","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None","Lara Kent","34 Scott Court","Aunt","0784932062","David Kent","Dad","Same address","07453487549");
		newMember.add(j16);
		JuniorMember j17= new JuniorMember("Craig","Reed","3 Rose Lane","GK58LP","01592675721","30/06/2007","Scrum Half","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Betty Reed","Same address","Mum","07896490232","Scott Reed","Dad","Same address","0794638293");
		newMember.add(j17);
		JuniorMember j18 = new JuniorMember("Steven","Barns","22 Scott Court","GK438KL","01592723456","31/12/2007","Hooker","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Jane Barns","Same address","Mum","07864928362","Ken Barns","Dad","Same Address","07925384618");
		newMember.add(j18);
		JuniorMember j19 = new JuniorMember("James","Smith","102 Red Road","GK45LP","01592656789","01/01/2007","Prop","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Jane Smith","Same address","Mum","07896453762","John Smith","Dad","Same Address","077449933827");
		newMember.add(j19);
		JuniorMember j20 = new JuniorMember("Nathan","Thomas","112 Yellow Street","GK46JP","01592789123","28/05/2007","2nd row","Dr Smith","Cos lane surgery", "GK75NL","01592752100","Asthma","Sarah Thomas","Same address","Mum","07896453762","Stuart Thomas","Dad","Same Address","077552314483");
		newMember.add(j20);
		JuniorMember j21 = new JuniorMember("Kieffer","Moore","13 Rose Lane","GK58LP","01592665721","30/06/2008","Back Row","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None","Carol Moore","Same address","Mum","07783942762","Michael Moore","Dad","Same address","07964738234");
		newMember.add(j21);
		JuniorMember j22 = new JuniorMember("Dan","Stocks","24 Scott Court","GK438KL","01592612356","31/12/2008","Back Row","Dr Dee","Cos lane surgery", "GK75NL","01592752100","None","Jane Stocks","Same address","Mum","07638293762","Scott Stocks","Dad","Same Address","07964532834");
		newMember.add(j22);
		JuniorMember j23 = new JuniorMember("Tom","Eastmen","12 Red Road","GK45LP","01592645678","01/01/2007","Back Row","Dr Cooper","Cos lane surgery", "GK75NL","01592752100","None","Jean Eastmen","Same address","Mum","07896453762","Ken Eastmen","Dad","Same Address","07845361070");
		newMember.add(j22);
		JuniorMember j24 = new JuniorMember("Ben","Reeves","19 Yellow Street","GK46JP","01592678913","28/05/2009","2nd row","Dr Smith","Cos lane surgery", "GK75NL","01592752100","Asthma","Gillian Reeves","Same address","Mum","07788463762","Gordon Reeves","Dad","Same Address","07734488221");
		newMember.add(j24);
		
		Squads s1 = new Squads(1,1000,"Senior");
		newSquad.add(s1);
		Squads s2 = new Squads(1,1001,"Senior");
		newSquad.add(s2);
		Squads s3 = new Squads(1,1002,"Senior");
		newSquad.add(s3);
		Squads s4 = new Squads(1,1003,"Senior");
		newSquad.add(s4);
		

		Squads s11 = new Squads(2,1014,"Midi");
		newSquad.add(s11);
		Squads s12 = new Squads(2,1013,"Midi");
		newSquad.add(s12);
		
		
		Squads s21 = new Squads(3,1025,"Mini");
		newSquad.add(s21);
		Squads s22 = new Squads(3,1026,"Mini");
		newSquad.add(s22);
		Squads s23 = new Squads(3,1027,"Mini");
		newSquad.add(s23);
		
		SkillCategory sc1 = new SkillCategory(1,"Passing");		
		SkillCategory sc2 = new SkillCategory(2,"Tackling");
		SkillCategory sc3 = new SkillCategory(3,"Kicking");
	
		newSkillCat.add(sc1);
		newSkillCat.add(sc2);
		newSkillCat.add(sc3);
		SkillSet c1 = new SkillSet(1000,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c2 = new SkillSet(1000,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c3 = new SkillSet(1000,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c4 = new SkillSet(1000,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c5 = new SkillSet(1000,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c6 = new SkillSet(1000,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c7 = new SkillSet(1000,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c8 = new SkillSet(1000,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c9 = new SkillSet (1000,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c10 = new SkillSet(1000,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c11 = new SkillSet (1000,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c12 = new SkillSet(1001,1,1,"Standard",4,"Very good","18/04/2018");
		SkillSet c13 = new SkillSet(1001,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c14 = new SkillSet (1001,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c15 = new SkillSet (1001,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c16= new SkillSet (1001,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c17 = new SkillSet(1001,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c18 = new SkillSet(1001,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c19 = new SkillSet (1001,3,8,"Drop",3,"Good","18/04/2018");		
		SkillSet c20 = new SkillSet(1001,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c21= new SkillSet(1001,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet  c22 = new SkillSet(1001,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c23 = new SkillSet(1003,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c24 = new SkillSet(1003,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c25 = new SkillSet(1003,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c26 = new SkillSet(1003,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c27 = new SkillSet(1003,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c28 = new SkillSet(1003,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c29 = new SkillSet(1003,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c30 = new SkillSet(1003,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c31 = new SkillSet (1003,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c32 = new SkillSet(1003,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c33 = new SkillSet (1003,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c34 = new SkillSet(1004,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c35 = new SkillSet(1004,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c36 = new SkillSet(1004,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c37 = new SkillSet(1004,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c38 = new SkillSet(1004,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c39 = new SkillSet(1004,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c40 = new SkillSet(1004,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c41 = new SkillSet(1004,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c42 = new SkillSet (1004,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c43 = new SkillSet(1004,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c44 = new SkillSet (1004,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c45 = new SkillSet(1010,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c46 = new SkillSet(1010,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c47 = new SkillSet(1010,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c48 = new SkillSet(1010,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c49 = new SkillSet(1010,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c50 = new SkillSet(1010,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c51 = new SkillSet(1010,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c52 = new SkillSet(1010,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c53 = new SkillSet (1010,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c54 = new SkillSet(1010,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c55 = new SkillSet (1010,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c56 = new SkillSet(1005,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c57 = new SkillSet(1005,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c58 = new SkillSet(1005,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c59 = new SkillSet(1005,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c60 = new SkillSet(1005,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c61 = new SkillSet(1005,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c62 = new SkillSet(1005,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c63 = new SkillSet(1005,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c64 = new SkillSet (1005,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c65 = new SkillSet(1005,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c66 = new SkillSet (1005,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c67= new SkillSet(1006,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c68 = new SkillSet(1006,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c69 = new SkillSet(1006,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c70 = new SkillSet(1006,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c71 = new SkillSet(1006,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c72 = new SkillSet(1006,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c73 = new SkillSet(1006,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c74 = new SkillSet(1006,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c75 = new SkillSet (1006,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c76 = new SkillSet(1006,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c77 = new SkillSet (1006,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c78= new SkillSet(1007,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c79 = new SkillSet(1007,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c80 = new SkillSet(1007,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c81 = new SkillSet(1007,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c82 = new SkillSet(1007,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c83 = new SkillSet(1007,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c84 = new SkillSet(1007,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c85 = new SkillSet(1007,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c86 = new SkillSet (1007,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c87 = new SkillSet(1007,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c88 = new SkillSet (1007,3,11,"Goal",3,"Good","18/04/2018");
		SkillSet c89= new SkillSet(1008,1,1,"Standard",4,"Very good","18/04/2018");		
		SkillSet c90 = new SkillSet(1008,1,2,"Spin",3,"Good","18/04/2018");
		SkillSet c91 = new SkillSet(1008,1,3,"Pop",3,"Good","18/04/2018");
		SkillSet c92 = new SkillSet(1008,2,4,"Front",3,"Good","18/04/2018");
		SkillSet c93 = new SkillSet(1008,2,5,"Rear",3,"Good","18/04/2018");
		SkillSet c94 = new SkillSet(1008,2,6,"Side",3,"Good","18/04/2018");
		SkillSet c95 = new SkillSet(1008,2,7,"Scrabble",3,"Good","18/04/2018");
		SkillSet c96 = new SkillSet(1008,3,8,"Drop",3,"Good","18/04/2018");
		SkillSet c97 = new SkillSet (1008,3,9,"Punt",3,"Good","18/04/2018");
		SkillSet c98 = new SkillSet(1008,3,10,"Grubber",3,"Good","18/04/2018");
		SkillSet c99 = new SkillSet (1008,3,11,"Goal",3,"Good","18/04/2018");

		newSkill.add(c1);
		newSkill.add(c2);
		newSkill.add(c3);
		newSkill.add(c4);
		newSkill.add(c5);
		newSkill.add(c6);
		newSkill.add(c7);
		newSkill.add(c8);
		newSkill.add(c9);
		newSkill.add(c10);
		newSkill.add(c11);
		newSkill.add(c12);
		newSkill.add(c13);
		newSkill.add(c14);
		newSkill.add(c15);
		newSkill.add(c16);
		newSkill.add(c17);
		newSkill.add(c18);
		newSkill.add(c19);
		newSkill.add(c20);
		newSkill.add(c21);
		newSkill.add(c22);
		newSkill.add(c23);
		newSkill.add(c24);
		newSkill.add(c25);
		newSkill.add(c26);
		newSkill.add(c27);
		newSkill.add(c28);
		newSkill.add(c29);
		newSkill.add(c30);
		newSkill.add(c31);
		newSkill.add(c32);
		newSkill.add(c33);
		newSkill.add(c34);
		newSkill.add(c35);
		newSkill.add(c36);
		newSkill.add(c37);
		newSkill.add(c38);
		newSkill.add(c39);
		newSkill.add(c40);
		newSkill.add(c41);
		newSkill.add(c42);
		newSkill.add(c43);
		newSkill.add(c44);
		newSkill.add(c45);
		newSkill.add(c46);
		newSkill.add(c47);
		newSkill.add(c48);
		newSkill.add(c49);
		newSkill.add(c50);
		newSkill.add(c51);
		newSkill.add(c52);
		newSkill.add(c53);
		newSkill.add(c54);
		newSkill.add(c55);
		newSkill.add(c56);
		newSkill.add(c57);
		newSkill.add(c58);
		newSkill.add(c59);
		newSkill.add(c60);
		newSkill.add(c61);
		newSkill.add(c62);
		newSkill.add(c63);
		newSkill.add(c64);
		newSkill.add(c65);
		newSkill.add(c66);
		newSkill.add(c67);
		newSkill.add(c68);
		newSkill.add(c69);
		newSkill.add(c70);
		newSkill.add(c71);
		newSkill.add(c72);
		newSkill.add(c73);
		newSkill.add(c74);
		newSkill.add(c75);
		newSkill.add(c76);
		newSkill.add(c77);
		newSkill.add(c78);
		newSkill.add(c79);
		newSkill.add(c80);
		newSkill.add(c81);
		newSkill.add(c82);
		newSkill.add(c83);
		newSkill.add(c84);
		newSkill.add(c85);
		newSkill.add(c86);
		newSkill.add(c87);
		newSkill.add(c88);
		newSkill.add(c89);
		newSkill.add(c90);
		newSkill.add(c91);
		newSkill.add(c92);
		newSkill.add(c93);
		newSkill.add(c94);
		newSkill.add(c95);
		newSkill.add(c96);
		newSkill.add(c97);
		newSkill.add(c98);
		newSkill.add(c99);
		
		
	}
	
	/**
	 * getSkillCat
	 * This method returns the name of the category of the chosen skill
	 */
	public void getSkillCat()
	{
		
		Iterator<SkillCategory> anIT = newSkillCat.iterator();
		
		while(anIT.hasNext())
		{
			SkillCategory cat=(SkillCategory)anIT.next();
			if(tempSkillCat == cat.getID())
			{
				
				currentSkillCat = cat.getCategory();
			}

			
			
		}
	}
	/**
	 * addPlayerToSeniorSquad
	 * This method adds a player to the Senior Squad
	 */
	public void addPlayerToSeniorSquad()
	{
		Squads tempPlayer = new Squads(1,currentID,"Senior");
		newSquad.add(tempPlayer);
	}
	/**
	 * addPlayerToMidiSquad
	 * This method adds a player to the Midi Squad
	 */
	
	public void addPlayerToMidiSquad()
	{
		Squads tempPlayer = new Squads(2,currentID,"Midi");
		newSquad.add(tempPlayer);
	}
	/**
	 * addPlayerToMiniSquad
	 * This method adds a player to the Mini squad
	 */
	public void addPlayerToMiniSquad()
	{
		Squads tempPlayer = new Squads(3,currentID,"Mini");
		newSquad.add(tempPlayer);
	}
	/**
	 * getSkillArray
	 * This method returns the array holding the skills
	 * @return newSkill
	 */
	public ArrayList getSkillArray()
	{
		
	
		return newSkill;
	}
	/**
	 * getSkillCatArray
	 * This method returns the array holding the skill categorys
	 * @return newSkillCat
	 */
	public ArrayList getSkillCatArray()
	{
		return newSkillCat;
	}
	/**
	 * getSquadArray
	 * This method returns the array holding the squads
	 * @return newSquad
	 */
	public ArrayList getSquadArray()
	{
	
		return newSquad;
	}
	/**
	 * getMemberArray
	 * This method returns the array holding the players
	 * @return newMember
	 */
	public ArrayList getMemberArray()
	{
	
		return newMember;
	}
	
	
	/**
	 * getPlayer(id)
	 * This method returns the member that has the member id that is passed to the method. 
	 * it returns the location of that player within the array
	 * @param id playerID
	 * @return memberid member memberID
	 */

	public Member getPlayer(int id)
	{
	
			// Member memberID
			memberId = null;
			
			
			Iterator<Member> anIT = newMember.iterator();
			
			while(anIT.hasNext())
			{
				//if the member is from the place in memory is stored in memberId which I made a static variable
				Member tempMem = anIT.next();
				if(tempMem.getID() == id)
				{
					memberId = tempMem;
					break;
				}
				
			}
				
			
			return memberId;
		
		
	
	
	}
	/**
	 * getPlayerSkill(id)
	 * This method passes the players id to the method and the method them looks for that player within the skill array. 
	 * It will return the location of that player with in the array.
	 * 
	 * @param id	PlayersId
	 * @return playerSkillId PlayersSkillID
	 */
	public SkillSet getPlayerSkill(int id)
	{
	
		//skillSet playerSkillId 
		playerSkillId = null;
		SkillCategory skillCat = null;
			ArrayList newSkill = getSkillArray();
			
			Iterator<SkillSet> anIT = newSkill.iterator();
			// if the SkillSet is from the place in memory is stored in playerSkillId  which I made a static variable
			while(anIT.hasNext())
			{
				SkillSet tempSkill = anIT.next();
				if(tempSkill.getPlayerID() == id)
				{
					playerSkillId = tempSkill;
					break;
				}
				
			}
				
			
			return playerSkillId;
		
		
	
	
	}
		
	
}
