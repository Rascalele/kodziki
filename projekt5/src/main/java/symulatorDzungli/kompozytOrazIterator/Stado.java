package symulatorDzungli.kompozytOrazIterator;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

import java.util.ArrayList;
import java.util.Iterator;

public class Stado implements Dźwięki {
    ArrayList zwierzeta = new ArrayList();

    public void dodaj(Dźwięki zwierze) {
        zwierzeta.add(zwierze);
    }
    public void dzwieki() {
        // użyto tu wzorca Iterator
        Iterator iterator = zwierzeta.iterator();
        while (iterator.hasNext()) {
            Dźwięki zwierze = (Dźwięki)iterator.next();
            zwierze.dzwieki();
        }
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        Iterator iterator = zwierzeta.iterator();
        while (iterator.hasNext()) {
            Dźwięki zwierze = (Dźwięki)iterator.next();
            zwierze.zarejestrujObserwatora(obserwator);
        }
    }
    public void powiadomObserwatorów() {}
    
}
