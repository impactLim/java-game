package game;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class EventBgm extends Thread{
    public void LoadBgm() {
        File bgm;
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:/Users/USER/Desktop/팀노바/팀노바 4주차 과제/브금/eventBgm.wav"); // 사용시에는 개별 폴더로 변경할 것
        
        Clip clip;
        
        try {
               stream = AudioSystem.getAudioInputStream(bgm);
               format = stream.getFormat();
               info = new DataLine.Info(Clip.class, format);
               clip = (Clip)AudioSystem.getLine(info);
               clip.open(stream);
               clip.start();
               
        } catch (Exception e) {

        }
        
    }

}
