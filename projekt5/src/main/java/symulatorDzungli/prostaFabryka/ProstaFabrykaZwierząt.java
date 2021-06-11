package symulatorDzungli.prostaFabryka;

import symulatorDzungli.dekorowanieZwierząt.ZwierzetaLicznik;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;
import symulatorDzungli.rodzajeZwierząt.aleja1.*;


public class ProstaFabrykaZwierząt {
    private static ProstaFabrykaZwierząt instance;

    private ProstaFabrykaZwierząt() {
    }

    public static ProstaFabrykaZwierząt getInstance() {
        if (instance == null) {
            synchronized (ProstaFabrykaZwierząt.class) {
                if (instance == null) {
                    instance = new ProstaFabrykaZwierząt();
                }
            }
        }
        return instance;
    }

    public Dźwięki utwórzGoryl() {
        return new Goryl();
    }
    public Dźwięki utwórzKapucynka() {
        return new Kapucynka();
    }
    public Dźwięki utwórzMałpa() {
        return new Małpa();
    }

    public Dźwięki utwórzSłoń() {
        return new Słoń();
    }
    public Dźwięki utwórzŻyrafa() {
        return new Żyrafa();
    }
}
