package symulatorDzungli.dekorowanieZwierząt;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class PtakiLicznik implements Dźwięki {
    Dźwięki ptaki;
    String nazwa;
    static int liczbaPtaków;


    public PtakiLicznik(Dźwięki ptaki) {
        this.ptaki = ptaki;
    }

    public void dzwieki() {
        ptaki.dzwieki();
        liczbaPtaków++;
    }

    public static int pobierzLiczbaPtaków() {
        return liczbaPtaków;
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        ptaki.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        ptaki.powiadomObserwatorów();
    }
    public static int zresetujLiczbe() {return liczbaPtaków=0;}
    public String pobierzNazwa() {
        return nazwa;
    }

}

