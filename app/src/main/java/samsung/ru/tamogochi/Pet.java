package samsung.ru.tamogochi;


/**
 * Created by samsung on 19.02.2016.
 */
public class Pet {
    private static int play= 0;
    boolean live=true;
    private static int feed=0;
    private static int hygiene=0;
   // int play=100;

    void Death(){
        live=false;
    }
    static void feeding(){
        if(feed<100){
            feed++;
            if(feed>100){
                feed=100;
            }
        }
    }
    static void hygiening() {
        if (hygiene < 100) {
            hygiene++;
            if (hygiene > 100) {
                hygiene = 100;
            }

        }
    }
    static void playing(){
        if (play < 100) {
            play++;
            if (play > 100) {
                play = 100;
            }

        }
    }
    static String stats(){
        return "Feed: "+feed+"\n"+"Hygiene: "+hygiene+"\n"+"Play: "+play+"\n";
    }
}
