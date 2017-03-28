package org.lorex.xl1.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WASDKeyManager implements KeyListener {
	
	private boolean[] keys;
	private boolean[] customKeys;
	public boolean up, down, left, right;
	
	public WASDKeyManager() {
		
		keys = new boolean[256];
		customKeys = new boolean[256];
		
	}
	
	public void tick() {
		
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		
	}
	
	public boolean getCustomKeyCode(int reference) {
		
		return customKeys[reference];
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		keys[e.getKeyCode()] = true;
		customKeys[e.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		keys[e.getKeyCode()] = false;
		customKeys[e.getKeyCode()] = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		//Useless Method! Good god, Oracle!
		//You take up my class space!
		
	}
	
}
