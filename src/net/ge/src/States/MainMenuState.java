package net.ge.src.States;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import net.ge.src.Game;

public class MainMenuState implements GameState, KeyListener {

	
	
	
	@Override
	public void Update(float elapsedTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Render(Graphics g) {
		// TODO Auto-generated method stub
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
	}

	@Override
	public void OnExit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void OnEnter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
