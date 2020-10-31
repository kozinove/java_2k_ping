import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class animal {

    String Name;
    String type;
    String classes;

    void Elephant()
    {
        animal Elephant = new animal();
        Elephant.Name = "Вова";
        Elephant.type = "Травоядное";
        Elephant.classes = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n\n", Elephant.Name, Elephant.type, Elephant.classes);

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
        } catch (InterruptedException ignored) {}
    }

    void Lion()
    {
        animal Lion = new animal();
        Lion.Name = "Гена";
        Lion.type = "Хищник";
        Lion.classes = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n\n",  Lion.Name,  Lion.type,  Lion.classes);

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
        } catch (InterruptedException ignored) {}
    }

    void Giraffe()
    {
        animal Giraffe = new animal();
        Giraffe.Name = "Жора";
        Giraffe.type = "Травоядное";
        Giraffe.classes = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n\n", Giraffe.Name,  Giraffe.type,  Giraffe.classes);

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
        } catch (InterruptedException ignored) {}

    }

    void Tiger()
    {
        animal Tiger = new animal();
        Tiger.Name = "Паша";
        Tiger.type = "Хищник";
        Tiger.classes = "Млекопитающие";

        System.out.printf(" Name: %s\n type: %s\n class: %s\n\n", Tiger.Name, Tiger.type, Tiger.classes);

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
        } catch (InterruptedException ignored) {}
    }


}
