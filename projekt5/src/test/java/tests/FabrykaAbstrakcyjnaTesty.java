package tests;

import org.junit.Test;

import symulatorDzungli.dekorowanieZwierząt.KotyLicznik;
import symulatorDzungli.dekorowanieZwierząt.PtakiLicznik;
import symulatorDzungli.dekorowanieZwierząt.ZwierzetaLicznik;
import symulatorDzungli.fabrykaAbstrakcyjnaZwierząt.*;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class FabrykaAbstrakcyjnaTesty {
    AbstrakcyjnaFabrykaZwierząt zwieFabryka = FabrykaZwierzątZLicznikiem.getInstance();
    AbstrakcyjnaFabrykaKotów kotFabryka = FabrykaKotówZLicznikiem.getInstance();
    AbstrakcyjnaFabrykaPtaków ptakFabryka = FabrykaPtakówZLicznikiem.getInstance();


    @Test
    public void fabrykaZwierzątGoryl() {
        Dźwięki goryl = zwieFabryka.utwórzGoryl();
        assertEquals(goryl.getClass(), ZwierzetaLicznik.class);

    }
    @Test
    public void fabrykaZwierzątKapucynka() {
        Dźwięki kapucynka = zwieFabryka.utwórzKapucynka();
        assertEquals(kapucynka.getClass(), ZwierzetaLicznik.class);
    }
    @Test
    public void fabrykaZwierzątMałpa() {
        Dźwięki małpa = zwieFabryka.utwórzMałpa();
        assertEquals(małpa.getClass(), ZwierzetaLicznik.class);
    }
    @Test
    public void fabrykaZwierzątTygrys() {
        Dźwięki tygrys = kotFabryka.utwórzTygrys();
        assertEquals(tygrys.getClass(), KotyLicznik.class);
    }
    @Test
    public void fabrykaZwierzątLew() {
        Dźwięki lew = kotFabryka.utwórzLew();
        assertEquals(lew.getClass(), KotyLicznik.class);
    }
    @Test
    public void fabrykaZwierzątGepard() {
        Dźwięki gepard = kotFabryka.utwórzGepard();
        assertEquals(gepard.getClass(), KotyLicznik.class);
    }
    @Test
    public void fabrykaZwierzątPantera() {
        Dźwięki pantera = kotFabryka.utwórzPantera();
        assertEquals(pantera.getClass(), KotyLicznik.class);
    }
    @Test
    public void fabrykaZwierzątCzapla() {
        Dźwięki czapla = ptakFabryka.utwórzCzapla();
        assertEquals(czapla.getClass(), PtakiLicznik.class);
    }
    @Test
    public void fabrykaZwierzątPapuga() {
        Dźwięki papuga = ptakFabryka.utwórzPapuga();
        assertEquals(papuga.getClass(), PtakiLicznik.class);
    }
    @Test
    public void fabrykaZwierzątPtak() {
        Dźwięki ptak = ptakFabryka.utwórzPtak();
        assertEquals(ptak.getClass(), PtakiLicznik.class);
    }
    @Test
    public void fabrykaZwierzątSłoń() {
        Dźwięki słoń = zwieFabryka.utwórzSłoń();
        assertEquals(słoń.getClass(), ZwierzetaLicznik.class);
    }
    @Test
    public void fabrykaZwierzątŻyrafa() {
        Dźwięki żyrafa = zwieFabryka.utwórzŻyrafa();
        assertEquals(żyrafa.getClass(), ZwierzetaLicznik.class);
    }

    @Test
    public void sprawdzFabrykaZwierzatSingleton() {
        HashSet <Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            AbstrakcyjnaFabrykaZwierząt singleton = FabrykaZwierzątZLicznikiem.getInstance();
            AbstrakcyjnaFabrykaZwierząt singleton2 = FabrykaZwierzątZLicznikiem.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        assertThat(1, is(singletons.size()));
    }
    /*
    @Test
    public void fabrykaZwierzątGoryl() {
        Dźwięki goryl = zwieFabryka.utwórzGoryl();
        // Czy goryl to zwierze
        assertEquals(goryl.getClass(), ZwierzetaLicznik.class);
    }
        //final Dźwięki kapucynka = zwieFabryka.utwórzKapucynka();
        //final Dźwięki małpa = zwieFabryka.utwórzMałpa();

    }*/
}
