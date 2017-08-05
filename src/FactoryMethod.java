import java.util.Date;

/**
 * Created by kykysik on 04.08.17.
 */
public class FactoryMethod {
    public static void main(String[] args) {


        Watch watch = new DigitalWatch();
                watch.showTime();
    }
}
    interface Watch{
        void showTime();
    }



    class DigitalWatch implements Watch{
        public void showTime(){
            System.out.println(new Date());
        }

    }

class RomeWatch implements Watch{
    public void showTime(){
        System.out.println("V-IV");
    }

}


