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
	protected List teamDisplay;
	protected List statDisplay;
	protected List myTeam;
	
	PlayerManager players = new PlayerManager();
	
	public void start (){
		players.createPlayers();
	}
	public void init (){
		setLayout(new GridLayout(2,3));
		
		oTeam = new Button("Offense");
		oTeam.addActionListener(this);
		
		dTeam = new Button("Defense");
		dTeam.addActionListener(this);
		
		addTeam = new Button("Add to Team");
		addTeam.addActionListener(this);
		
		teamDisplay = new List();
		statDisplay = new List();
		myTeam = new List();
		
		add(oTeam);
		add(dTeam);
		add(addTeam);
		add(teamDisplay);
		add(statDisplay);
		add(myTeam);
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
		}
		else if (e.getSource() == dTeam){
			teamDisplay.removeAll();
			int x = 0;
			while (x < players.defensivePlayers.length){
				teamDisplay.add(players.defensivePlayers[x++].getName());
			}
		}
		else if (e.getSource() == addTeam){
			
		}
		
	}
	
}
