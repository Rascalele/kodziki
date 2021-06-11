package symulatorDzungli.fabrykaAbstrakcyjnaZwierząt;

import symulatorDzungli.dekorowanieZwierząt.ZwierzetaLicznik;
import symulatorDzungli.rodzajeZwierząt.*;
import symulatorDzungli.rodzajeZwierząt.aleja1.*;
import symulatorDzungli.rodzajeZwierząt.aleja1.Kapucynka;
import symulatorDzungli.rodzajeZwierząt.aleja1.Małpa;

public class FabrykaZwierzątZLicznikiem extends AbstrakcyjnaFabrykaZwierząt {

    //Singleton
    private static FabrykaZwierzątZLicznikiem instance;
    private FabrykaZwierzątZLicznikiem() {
    }

    public static FabrykaZwierzątZLicznikiem getInstance() {
        if (instance == null ) {
            synchronized (FabrykaZwierzątZLicznikiem.class) {
                if (instance == null) {
                    instance = new FabrykaZwierzątZLicznikiem();
                }
            }
        }
        return instance;
    }

    // Przy tworzeniu obiektów użyto wzorca Dekorator
    public Dźwięki utwórzGoryl() {
        return new ZwierzetaLicznik(new Goryl());
    }
    public Dźwięki utwórzKapucynka() {
        return new ZwierzetaLicznik(new Kapucynka());
    }
    public Dźwięki utwórzMałpa() {
        return new ZwierzetaLicznik(new Małpa());
    }

    public Dźwięki utwórzSłoń() {
        return new ZwierzetaLicznik(new Słoń());
    }
    public Dźwięki utwórzŻyrafa() {
        return new ZwierzetaLicznik(new Żyrafa());
    }
}
