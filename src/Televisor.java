public class Televisor {

    boolean tvOn;

    Televisor(boolean tvOn){
        this.tvOn = tvOn;
    }

    void turnON(){
        tvOn = true;
    }

    void turnOff(){
        tvOn = false;
    }

    void showStatus(){
        String info = " TV Turn on status is " + tvOn;
        System.out.println(info);
    }

}
