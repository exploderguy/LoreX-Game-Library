package org.lorex.xl1.sound;

import paulscode.sound.SoundSystemConfig;

public class SoundClip {
	
	private static String path;
	
	@SuppressWarnings("static-access")
	public SoundClip(String path) {
		
		this.path = path;
		
	}
	
	@SuppressWarnings("static-access")
	public void changeSoundFile(String path) {
		
		this.path = path;
		
	}
	
	public static void playSound() {
		
		SoundManager.mySoundSystem.quickPlay(false, path, false, 0, 0, 0, 
				SoundSystemConfig.ATTENUATION_NONE, 0);
		
	}
		
}
	

