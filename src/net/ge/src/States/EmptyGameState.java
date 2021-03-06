package net.ge.src.States;

import net.ge.src.Game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class EmptyGameState implements GameState {

	@Override
	public void Update(float elapsedTime) {
		// Does nothing

	}

	@Override
	public void OnExit() {
		// Does nothing
        System.out.println("Exiting dev state");
	}

	@Override
	public void OnEnter() {
		// Does nothing
		System.out.println("Entering dev state");
	}

	@Override
	public void Render(Graphics g) {
		// Does Nothing

	}

    @Override
    public void HandleInput(KeyEvent e) {
        Game.stateHandler.Pop();
    }

}
