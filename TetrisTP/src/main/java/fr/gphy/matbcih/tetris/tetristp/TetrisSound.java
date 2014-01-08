package fr.gphy.matbcih.tetris.tetristp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author ebouihol
 */
class TetrisSound {
		private AudioClip soundTrack = null;
		private AudioClip destroyRowSounds[] = new AudioClip[4];
		private AudioClip gameOverSound = null;
		private AudioClip getClip(String name) throws MalformedURLException {
                    URL soundFileUrl=null;
                   // soundFileUrl = new URL(Tetris.getCodeBase(), name);
			try {
				AudioClip clip = getAudioClip(soundFileUrl);
				return clip;
			} catch(NullPointerException npe) { 
				System.err.println("exception " + npe); 
				return null; 
			}
		}
		public TetrisSound() {
			//load sound files
			try {
				soundTrack          = getClip("theme.au");
				destroyRowSounds[0] = getClip("quiteImpressive.au");
				destroyRowSounds[1] = getClip("smashing.au");
				destroyRowSounds[2] = getClip("yeahbaby.au");
				destroyRowSounds[3] = getClip("great.au");
				gameOverSound       = getClip("groovy.au");
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		public void playSoundtrack() {
			if(soundTrack == null)
				return;
			soundTrack.loop();
		}
		public void playDestroyRows(int rows) {
			int soundid = rows - 1;
			if(0 > soundid || soundid >= destroyRowSounds.length || destroyRowSounds[soundid] == null)
				return;
			destroyRowSounds[soundid].play();
		}
		public void playGameOverSound() {
			if(gameOverSound == null)
				return;
			gameOverSound.play();
		}
		public void stopSoundtrack() {
			if(soundTrack == null)
				return;
			soundTrack.stop();
		}

    private AudioClip getAudioClip(URL soundFileUrl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	} // end class TetrisSound
	