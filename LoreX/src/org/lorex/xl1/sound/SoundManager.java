package org.lorex.xl1.sound;

import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryJavaSound;

public abstract class SoundManager {
	
	public static SoundSystem mySoundSystem;
	private static boolean init = false;
	
	public static void init() {
		
		if(init)
			return;
		
		init = true;
		
		try {
			
			SoundSystemConfig.addLibrary(LibraryJavaSound.class);
			SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
			
		} catch(SoundSystemException e) {
			
			System.err.println("Error linking with the plug-ins.");
			
		}
		
		mySoundSystem = new SoundSystem();
		
	}
	
}
