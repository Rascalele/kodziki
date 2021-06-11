package symulatorDzungli.obserwator;

import java.util.ArrayList;
import java.util.Iterator;

public class Obserwowany implements DźwiękObserwowany {
    ArrayList obserwatorzy = new ArrayList();
    DźwiękObserwowany zwierze;

    public Obserwowany(DźwiękObserwowany zwierze) {
        this.zwierze = zwierze;
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }
    public void powiadomObserwatorów() {
        Iterator iterator = obserwatorzy.iterator();
        while (iterator.hasNext()) {
            Obserwator obserwator = (Obserwator)iterator.next();
            obserwator.aktualizuj(zwierze);
        }
    }
}
