import java.util.Random;

public class SeaBattle {
    public static void main(String[] args) {
        dotCom dot = new dotCom();
        int rand = (int)Math.random()*5;
        int[] ship = {rand,rand+1,rand+2};
        dot.setComLocation(ship);
        String guess = "1";
        String result = dot.chekHit(guess);
        System.out.print(result);
    }
}

class dotCom{
    private int[] comLocation;
    private int numberHits;

    public void setComLocation(int[] x){
        comLocation = x;
    }
    public String chekHit(String hits){
        String result = "Мимо";
        int c = Integer.parseInt(hits);
        for (int sell : comLocation){
            if (sell == c){
                result = "Попал";
                numberHits++;
                break;
            }
        }
        if (numberHits==comLocation.length){
            result = "Потопил";
        }

        return result;
    }
}
