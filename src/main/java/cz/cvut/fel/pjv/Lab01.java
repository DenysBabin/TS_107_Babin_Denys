package cz.cvut.fel.pjv;

public class Lab01 {

   public double plus(double param1, double param2) {
      return param1 + param2;
   }

   public double minus(double param1, double param2) {
      return param1 - param2;
   }

   public double multiplication(double param1, double param2) {
      return param1 * param2;
   }

   public double division(double param1, double param2) throws Exception {
      if (param2 == 0) {
         throw new Exception("Pokus o deleni nulou");
      } else {
         return param1 / param2;
      }


   }
}