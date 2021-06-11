package symulatorDzungli;

import symulatorDzungli.dekorowanieZwierząt.ZwierzetaLicznik;
import symulatorDzungli.dekorowanieZwierząt.KotyLicznik;
import symulatorDzungli.dekorowanieZwierząt.PtakiLicznik;
import symulatorDzungli.fabrykaAbstrakcyjnaZwierząt.*;
import symulatorDzungli.kompozytOrazIterator.Stado;
import symulatorDzungli.obserwator.Podróżniczy;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

import java.util.Scanner;


public class SymulatorZoo {
    public static void main(String[] args) {
        SymulatorZoo symulator = new SymulatorZoo();
        // Abstrakcyjna Fabryka
        final AbstrakcyjnaFabrykaZwierząt zwieFabryka = FabrykaZwierzątZLicznikiem.getInstance();
        final AbstrakcyjnaFabrykaKotów kotFabryka = FabrykaKotówZLicznikiem.getInstance();
        final AbstrakcyjnaFabrykaPtaków ptakFabryka = FabrykaPtakówZLicznikiem.getInstance();


        symulator.uruchom(zwieFabryka, kotFabryka, ptakFabryka);
    }
    void uruchom(AbstrakcyjnaFabrykaZwierząt zwieFabryka,
                 AbstrakcyjnaFabrykaKotów kotFabryka,
                 AbstrakcyjnaFabrykaPtaków ptakFabryka)
    {
        // Fabryka abstrakcyjna, która używa wzorca Dekorator
        // aleja 1
        Dźwięki goryl = zwieFabryka.utwórzGoryl();
        Dźwięki kapucynka = zwieFabryka.utwórzKapucynka();
        Dźwięki kapucynkaDwa = zwieFabryka.utwórzKapucynka();
        Dźwięki kapucynkaTrzy = zwieFabryka.utwórzKapucynka();
        Dźwięki małpa = zwieFabryka.utwórzMałpa();
        Dźwięki małpaDwa = zwieFabryka.utwórzMałpa();

        // aleja 2
        Dźwięki lew = kotFabryka.utwórzLew();
        Dźwięki lewDwa = kotFabryka.utwórzLew();
        Dźwięki tygrys = kotFabryka.utwórzTygrys();
        Dźwięki tygrysDwa = kotFabryka.utwórzTygrys();
        Dźwięki tygrysTrzy = kotFabryka.utwórzTygrys();
        Dźwięki tygrysCztery = kotFabryka.utwórzTygrys();
        Dźwięki pantera = kotFabryka.utwórzPantera();
        Dźwięki gepard = kotFabryka.utwórzGepard();

        // aleja 3
        Dźwięki czapla = ptakFabryka.utwórzCzapla();
        Dźwięki czaplaDwa = ptakFabryka.utwórzCzapla();
        Dźwięki papuga = ptakFabryka.utwórzPapuga();
        Dźwięki ptak = ptakFabryka.utwórzPtak();

        // aleja 1
        Dźwięki słoń = zwieFabryka.utwórzSłoń();
        Dźwięki żyrafa = zwieFabryka.utwórzŻyrafa();

        // Fabryka abstrakcyjna, która używa wzorca Dekorator oraz wzorzec adapter

        Scanner scanner = new Scanner(System.in);
        int wybór;


        // Wzorzec Kompozyt wraz z Iterratorem
        Stado stadoGoryli = new Stado();
        stadoGoryli.dodaj(goryl);
        Stado stadoKapucynek = new Stado();
        stadoKapucynek.dodaj(kapucynka);
        stadoKapucynek.dodaj(kapucynkaDwa);
        stadoKapucynek.dodaj(kapucynkaTrzy);
        Stado stadoMałp = new Stado();
        stadoMałp.dodaj(małpa);
        stadoMałp.dodaj(małpaDwa);
        Stado aleja1 = new Stado();
        aleja1.dodaj(stadoGoryli);
        aleja1.dodaj(stadoKapucynek);
        aleja1.dodaj(stadoMałp);
        Stado stadoSłoni = new Stado();
        stadoSłoni.dodaj(słoń);
        Stado stadoŻyraf = new Stado();
        stadoŻyraf.dodaj(żyrafa);
        aleja1.dodaj(stadoSłoni);
        aleja1.dodaj(stadoŻyraf);


        Stado stadoTygrysów = new Stado();
        stadoTygrysów.dodaj(tygrys);
        stadoTygrysów.dodaj(tygrysDwa);
        stadoTygrysów.dodaj(tygrysTrzy);
        stadoTygrysów.dodaj(tygrysCztery);
        Stado stadoGepardów = new Stado();
        stadoGepardów.dodaj(gepard);
        Stado stadoLwów = new Stado();
        stadoLwów.dodaj(lew);
        stadoLwów.dodaj(lewDwa);
        Stado stadoPanter = new Stado();
        stadoPanter.dodaj(pantera);
        Stado aleja2 = new Stado();
        aleja2.dodaj(stadoTygrysów);
        aleja2.dodaj(stadoGepardów);
        aleja2.dodaj(stadoLwów);
        aleja2.dodaj(stadoPanter);

        Stado stadoCzapli = new Stado();
        stadoCzapli.dodaj(czapla);
        stadoCzapli.dodaj(czaplaDwa);
        Stado stadoPapug = new Stado();
        stadoPapug.dodaj(papuga);
        Stado stadoPtaków = new Stado();
        stadoPtaków.dodaj(ptak);
        Stado aleja3 = new Stado();
        aleja3.dodaj(stadoCzapli);
        aleja3.dodaj(stadoPapug);
        aleja3.dodaj(stadoPtaków);



        // Obserwator
        Podróżniczy podroznik = new Podróżniczy();
        aleja1.zarejestrujObserwatora(podroznik);
        aleja2.zarejestrujObserwatora(podroznik);
        aleja3.zarejestrujObserwatora(podroznik);


        // Interfejs

        do {
            System.out.println("\nWitaj w Zoo!");
            System.out.println("Po której alejce chcesz się przejść?");
            System.out.println("1. Aleja różnych zwierząt");
            System.out.println("2. Aleja kotów");
            System.out.println("3. Aleja ptaków");
            System.out.println("4. Już mam dość");
            wybór = scanner.nextInt();

            if (wybór == 1) {
                System.out.println("\nTo jest aleja 1!\n");
                uruchom(aleja1);
                System.out.println("Zwiedziłeś: " + ZwierzetaLicznik.pobierzLiczbaZwierząt() + " razy zwierzęta!");
            }else if(wybór==2) {
                System.out.println("\nTo jest aleja 2!\n");
                uruchom(aleja2);
                System.out.println("Zwiedziłeś: " + KotyLicznik.pobierzLiczbaKotów() + " razy koty!");
            }else if(wybór==3) {
                System.out.println("\nTo jest aleja 3!\n");
                uruchom(aleja3);
                System.out.println("Zwiedziłeś: " + PtakiLicznik.pobierzLiczbaPtaków() + " razy ptaki!");
            }else if(wybór==4){
                System.out.println("\nZatem koniec podróży!");
                System.out.println("Do zobaczenia następnym razem");
            }else {
                System.out.println("\nNiema takiej opcji.\n");
            }
        } while(wybór !=4);


    }
    void uruchom(Dźwięki zwierze) {
        zwierze.dzwieki();
    }
}
