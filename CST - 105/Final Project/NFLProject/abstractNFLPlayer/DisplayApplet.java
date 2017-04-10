package abstractNFLPlayer;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayApplet extends JApplet implements ActionListener{

	/**
	 *  @author - MichaelWeaver
	 */
	private static final long serialVersionUID = 1L;
	
	protected Label buttonExplanation;
	protected Button oTeam;
	protected Button dTeam;
	protected Button addTeam;
	protected Button removeTeam;
	protected Button displayStats;
	protected List teamDisplay;
	protected List statDisplay;
	protected List myTeam;
	protected String currentType;
	
	PlayerManager players = new PlayerManager();
	
	public void start (){
		players.createPlayers();
	}
	public void init (){
		setLayout(new GridLayout(2,4));
		
		oTeam = new Button("Offense");
		oTeam.addActionListener(this);
		
		dTeam = new Button("Defense");
		dTeam.addActionListener(this);
		
		addTeam = new Button("Add to Team");
		addTeam.addActionListener(this);
		
		removeTeam = new Button("Remove from team.");
		removeTeam.addActionListener(this); 
		
		displayStats = new Button("Display Stats.");
		displayStats.addActionListener(this); 
		
		teamDisplay = new List();
		statDisplay = new List();
		myTeam = new List();
		
		add(oTeam);
		add(dTeam);
		add(addTeam);
		add(displayStats);
		add(teamDisplay);
		add(statDisplay);
		add(myTeam);
		add(removeTeam);
	}
	public void paint (Graphics g){
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oTeam){
			teamDisplay.removeAll();
			int x = 0;
			while (x < players.offensivePlayers.length){
				teamDisplay.add(players.offensivePlayers[x++].getName());
			}
			currentType = "offensive";
		}
		else if (e.getSource() == dTeam){
			teamDisplay.removeAll();
			int x = 0;
			while (x < players.defensivePlayers.length){
				teamDisplay.add(players.defensivePlayers[x++].getName());
			}
			currentType = "defensive";
		}
		else if (e.getSource() == addTeam){
			myTeam.add(teamDisplay.getSelectedItem());
		}
		else if (e.getSource() == removeTeam){
			myTeam.remove(myTeam.getSelectedItem());
		}
		else if (e.getSource() == displayStats){
			statDisplay.removeAll();
			int x = teamDisplay.getSelectedIndex();
			if (currentType.equals("offensive")){
				statDisplay.add("Position: " + players.offensivePlayers[x].getPosition());
				statDisplay.add("Games Played: " + players.offensivePlayers[x].getGames());
				statDisplay.add("Years Played: " + players.offensivePlayers[x].getYears());
			
				statDisplay.add("Total Yards: " + players.offensivePlayers[x].getTotal());
			
				statDisplay.add("Rushing: " + players.offensivePlayers[x].getRushing());
				statDisplay.add("Passing: " + players.offensivePlayers[x].getPassing());
				statDisplay.add("Recieving: " + players.offensivePlayers[x].getRecieving());
				statDisplay.add("Kicking: " + players.offensivePlayers[x].getKicking());
			
				statDisplay.add("Interceptions: " + players.offensivePlayers[x].getThrown());
				statDisplay.add("Field Goals: " + players.offensivePlayers[x].getGoals());
				statDisplay.add("Kick Returns: " + players.offensivePlayers[x].getReturns());
				statDisplay.add("Punts: " + players.offensivePlayers[x].getPunts());
			
				statDisplay.add("Sacks: " + players.offensivePlayers[x].getSacks());
				statDisplay.add("Touchdowns: " + players.offensivePlayers[x].getTouchDowns());
				statDisplay.add("Times Tackled: " + players.offensivePlayers[x].getTimesTackled());
				statDisplay.add("Fumbles: " + players.offensivePlayers[x].getFumbles());
			}
			else if (currentType.equals("defensive")){
				statDisplay.add("Position: " + players.defensivePlayers[x].getPosition());
				statDisplay.add("Games Played: " + players.defensivePlayers[x].getGames());
				statDisplay.add("Years Played: " + players.defensivePlayers[x].getYears());
				
				statDisplay.add("Tackles: " + players.defensivePlayers[x].getTackles());
				statDisplay.add("Assists: " + players.defensivePlayers[x].getTackleAssists());
				statDisplay.add("Interceptions: " + players.defensivePlayers[x].getInterceptions());
			}
		}
	}
	
}
