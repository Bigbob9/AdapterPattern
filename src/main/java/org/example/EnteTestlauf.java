package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EnteTestlauf {
    public static void main(String[] args) {


        StockEnte duck = new StockEnte();
        WilderTruthahn truthahn = new WilderTruthahn();

        Ente falscheEnte = new TruthahnAdapter(truthahn);
        testeEnte(duck);
        testeEnte(falscheEnte);


        Truthahn falscherTruthahn = new EnteAdapter(duck);
        testeTruthahn(falscherTruthahn);
        testeTruthahn(truthahn);



    }

      static void testeEnte(Ente ente){
      ente.fliegen();
      ente.quaken();
    }

      static void testeTruthahn(Truthahn truthahn){
        truthahn.fliegen();
        truthahn.kollern();
      }



}