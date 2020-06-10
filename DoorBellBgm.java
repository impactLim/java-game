package game;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class DoorBellBgm extends Thread{ // http://blog.naver.com/PostView.nhn?blogId=coco9508&logNo=110091132150
    public void LoadBgm() {
        File bgm;
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        
        bgm = new File("C:/Users/USER/Desktop/�����/����� 4���� ����/���/doorbell.wav"); // ���ÿ��� ���� ������ ������ ��
        
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
