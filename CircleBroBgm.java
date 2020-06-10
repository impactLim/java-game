package game;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class CircleBroBgm extends Thread{
    public void LoadBgm() {
        File bgm;
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:/Users/USER/Desktop/�����/����� 4���� ����/���/CircleBroBgm.wav"); // ���ÿ��� ���� ������ ������ ��
        
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