public class Main {
  public static void main(String[] args) {

    // winter, spring, summer, autumn
    // warm jacket, T-shirt, swimming suite, rain coat

    double temp = -15.0;

    if (temp < 5) {
      System.out.println("Wear super warm clothes!");
    }
    else if (temperature >= 5 && temperature < 15) {
      System.out.println("Wear warm clothes!");
    }
    else if (temperature >= 15 && temperature < 30) {
      System.out.println("Wear a normal clothes!");
    }
    else if (temperature >= 30) {
      System.out.println("Wear a cooling clothes!");
    }
    else {
      System.out.println("I do not recognize this season");
    }
    }


}
// till +5 wear super warm
// +5 till 15 warm
//+15 to 30 normal
//+30+ cooling
