package singelton;

public class SingeltonMain {

  public static void main(String[] args) {
    Singelton singel = Singelton.getInstance();
    singel.setSomething("singel");
    Singelton ton = new Singelton();
    ton.setSomething("ton");

    System.out.println(Singelton.getCOUNT());
    System.out.println(singel.getSomething());
    System.out.println(ton.getSomething());

  }
}
