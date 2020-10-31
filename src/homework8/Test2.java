package homework8;

public class Test2 {
    public static void main(String[] args) {
   Instrument [] instruments = {new Drum(20),new Trumpet(8),new Guitar(5)};

   for(Instrument s:instruments){
       s.play();
   }
    }
}
