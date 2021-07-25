package practice1;
interface MusicPlayer {
	 
	    void play();

	    void stop();
	}
	class MP3Player implements MusicPlayer {
	    public void pause() {
	        System.out.println("the MP3 Player is in pause state");
	    } 
	    public void play() {
	        System.out.println("the MP3 Player is playing.");
	    }
	    
	    public void stop() {
	        System.out.println("the MP3 Player is off.");
	    }
	}

	public class Exercise30 {
	    public static void main(String[] args) {
	        MusicPlayer musicPlayer = new MP3Player();

	        musicPlayer.play(); //the MP3 Player is playing.

	        
	    }
	}

