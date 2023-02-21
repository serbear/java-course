/*
Practice 1
Ex 5. Playing Cat
*/
public class PlayingCat {
    public static boolean isCatPlaying (boolean isSummer, int temperature) {
        int upperTemperature = isSummer ? 45 : 35;
        return temperature >= 25 && temperature <= upperTemperature;
    }

}
