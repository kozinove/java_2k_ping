import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class animal {

    String Name;
    String type;
    String clases;

   void Elephant()
    {
        animal Elephant = new animal();
        Elephant.Name = "Вова";
        Elephant.type = "Травоядное";
        Elephant.clases = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n", Elephant.Name, Elephant.type, Elephant.clases);

        try {
            File soundFile = new File("elephant.wav"); //Звуковой файл


            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();


            clip.open(ais);

            clip.setFramePosition(0); //устанавливаем указатель на старт
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}

    }

    void Lion()
    {
        animal Lion = new animal();
        Lion.Name = "Гена";
        Lion.type = "Хищник";
        Lion.clases = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n",  Lion.Name,  Lion.type,  Lion.clases);

        try {
            File soundFile = new File("lion.wav");


            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();


            clip.open(ais);

            clip.setFramePosition(0);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}
    }

    void Giraffe()
    {
        animal Giraffe = new animal();
        Giraffe.Name = "Жора";
        Giraffe.type = "Травоядное";
        Giraffe.clases = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n", Giraffe.Name,  Giraffe.type,  Giraffe.clases);

        try {
            File soundFile = new File("giraffe.wav");


            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();


            clip.open(ais);

            clip.setFramePosition(0);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}

    }

    void Tiger()
    {
        animal Tiger= new animal();
        Tiger.Name = "Паша";
        Tiger.type = "Хищник";
        Tiger.clases = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n", Tiger.Name, Tiger.type, Tiger.clases);

        try {
            File soundFile = new File("tiger.wav");


            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();


            clip.open(ais);

            clip.setFramePosition(0);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}
    }


}
