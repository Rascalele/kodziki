package symulatorDzungli.fabrykaAbstrakcyjnaZwierząt;

import symulatorDzungli.dekorowanieZwierząt.PtakiLicznik;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;
import symulatorDzungli.rodzajeZwierząt.aleja3.Czapla;
import symulatorDzungli.rodzajeZwierząt.aleja3.Papuga;
import symulatorDzungli.rodzajeZwierząt.aleja3.Ptak;

public class FabrykaPtakówZLicznikiem extends AbstrakcyjnaFabrykaPtaków{

    //Singleton
    private static FabrykaPtakówZLicznikiem instance;

    private FabrykaPtakówZLicznikiem() {
    }

    public static FabrykaPtakówZLicznikiem getInstance() {
        if (instance == null) {
            synchronized (FabrykaPtakówZLicznikiem.class) {
                if (instance == null) {
                    instance = new FabrykaPtakówZLicznikiem();
                }
            }
        }
        return instance;
    }

    // Przy tworzeniu obiektów użyto wzorca Dekorator
    public Dźwięki utwórzCzapla() {
        return new PtakiLicznik(new Czapla());
    }

    public Dźwięki utwórzPapuga() {
        return new PtakiLicznik(new Papuga());
    }

    public Dźwięki utwórzPtak() {
        return new PtakiLicznik(new Ptak());
    }

}
