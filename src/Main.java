public class Main {
    public static void main(String[] args) {
//        Exerciţiu
//        Creați un sistem informațional mai simplu al unui magazin.
//        În programul Java, trebuie prezentate produsele folosind trei clase:
//        Product, Wine și Chocolate.
//        Clasa Product trebuie folosită pentru prezentarea generală a produselor
//        care nu au un tip special. În program,
//        trebuie modelate și două tipuri speciale de produse, așadar clasa
//        Product trebuie să fie moștenită de două clase care reprezintă grupuri
//        concrete de produse: Chocolate și Wine. Această ierarhie, prezentată grafic,
//        are următorul aspect:
//
//
//
//        Fiecare produs (clasa Product) trebuie să aibă anumite caracteristici:
//
//        numele produsului;
//        codul de bare;
//        prețul de bază;
//        taxa.
//                De asemenea, fiecare produs (clasa Product) trebuie să aibă și
//                o metodă pentru calcularea prețului. Prețul este calculat
//                prin creșterea prețului de bază cu valoarea taxei.
//                Taxa (TVA) pentru fiecare produs este 20%, iar această dată este constantă
//                și nu se va schimba.
//
//                Clasa Chocolate trebuie să aibă o caracteristică personală:
//
//        greutate.
//                Și clasa Wine trebuie să aibă o caracteristică personală:
//
//        volumul sticlei.
//        Produsele din grupul de vin ar trebui să aibă o taxă suplimentară,
//        deoarece fac parte din grupul de băuturi alcoolice și se ridică la 10% din prețul
//        deja crescut cu valoarea TVA. Și aceasta este o dată constantă și nu se va schimba.
//        Din cauza acestei taxe suplimentare, clasa Wine trebuie să aibă propria metodă
//        pentru calcularea prețului, care va introduce în calcul și taxa suplimentară.
//        Acest lucru înseamnă că metoda pentru calcul trebuie redefinită în clasa Wine.
//
//        În toate clasele, trebuie creată metoda pentru prezentarea informațiilor despre
//        obiecte. Metoda trebuie adaptată caracteristicilor clasei, adică trebuie să prezinte
//        toate caracteristicile deținute de clasa dată. De aceea, fiecare clasă trebuie să
//        dețină metoda proprie pentru prezentarea informațiilor, respectiv trebuie redefinită
//        metoda respectivă. Principala variantă a metodei va exista în clasa Product,
//        în timp ce în clasele Wine și Chocolate se va redefini această metodă cu logica
//        care ia în considerare proprietățile caracteristice pentru aceste clase.
//        Astfel de exemple de redefinire a metodelor au fost deja ilustrate în lecția
//        Postulatele OOP, de exemplu, clasa Car și Convertible.
//
//                La final, în clasa principală trebuie creat un obiect al claselor Product
//                , Wine și Chocolate, iar la ieșire trebuie afișate informații despre produse
//                , precum și prețul final definit prin metoda pentru calcularea prețului.
//                Pentru prețul de bază, vom lua o sumă arbitrară.
//
//        De altfel, prețul cu taxa de 20% se calculează prin înmulțirea prețului de bază cu
//        (100 + 20) / 100 = 1.2. Prețul cu taxa de 20% + 10% se calculează înmulțind prețul
//        de bază în felul următor: (120 / 100) * (110 / 100) = 1.2 * 1.1,
//        care este egal cu 1.32. Deci, 20% + 10% este egal cu 32%.



      Chocolate chocolate=new Chocolate("Poiana", 123456789,
              15,12.5);
      System.out.println(chocolate.getInfo());
System.out.println("Chocolate finalPrice " + chocolate.finalPrice() );

  Wine wine= new Wine("Feteasca", 987654321, 26, 0.75);
        System.out.println(wine.getInfo());
        System.out.println("Wine finalPrice " + wine.finalPrice() );




    }
}