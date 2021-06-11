package symulatorDzungli.fabrykaAbstrakcyjnaZwierząt;

import symulatorDzungli.dekorowanieZwierząt.KotyLicznik;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;
import symulatorDzungli.rodzajeZwierząt.aleja2.Gepard;
import symulatorDzungli.rodzajeZwierząt.aleja2.Lew;
import symulatorDzungli.rodzajeZwierząt.aleja2.Pantera;
import symulatorDzungli.rodzajeZwierząt.aleja2.Tygrys;

public class FabrykaKotówZLicznikiem extends AbstrakcyjnaFabrykaKotów {
    //Singleton
    private static FabrykaKotówZLicznikiem instance;

    private FabrykaKotówZLicznikiem() {
    }

    public static FabrykaKotówZLicznikiem getInstance() {
        if (instance == null) {
            synchronized (FabrykaKotówZLicznikiem.class) {
                if (instance == null) {
                    instance = new FabrykaKotówZLicznikiem();
                }
            }
        }
        return instance;
    }

    // Przy tworzeniu obiektów użyto wzorca Dekorator
    public Dźwięki utwórzGepard() {
        return new KotyLicznik(new Gepard());
    }

    public Dźwięki utwórzLew() {
        return new KotyLicznik(new Lew());
    }

    public Dźwięki utwórzPantera() {
        return new KotyLicznik(new Pantera());
    }

    public Dźwięki utwórzTygrys() {
        return new KotyLicznik(new Tygrys());
    }
}
