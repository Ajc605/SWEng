package sample;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.time.Duration;

//	Sound newSound = new Sound("../resources/example.mp3");
//	newSound.play();

public class Sound{
	MediaPlayer mediaPlayer;

	public Sound(String path){
		mediaPlayer = new MediaPlayer(new Media(new File(path).toURI().toString()));
		this.mediaPlayer.setOnEndOfMedia(() -> this.mediaPlayer.stop());
	}

	public void play(){
		this.mediaPlayer.stop();
		this.mediaPlayer.play();
	}

	//public void loop(){
	//	this.mediaPlayer.stop();
	//	mediaPlayer.setOnEndOfMedia(new Runnable() {
	//		public void run(){
	//			mediaPlayer.seek(Duration.ZERO);
	//		}
	//	});
	//	this.mediaPlayer.play();
	//}

}