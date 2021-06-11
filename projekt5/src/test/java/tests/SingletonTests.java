package tests;

import org.junit.Test;

import symulatorDzungli.fabrykaAbstrakcyjnaZwierząt.*;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SingletonTests {

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

    @Test
    public void sprawdzFabrykaKotowSingleton() {
        HashSet <Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            AbstrakcyjnaFabrykaKotów singleton = FabrykaKotówZLicznikiem.getInstance();
            AbstrakcyjnaFabrykaKotów singleton2 = FabrykaKotówZLicznikiem.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        assertThat(1, is(singletons.size()));
    }

    @Test
    public void sprawdzFabrykaPtakówSingleton() {
        HashSet <Integer> singletons = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            AbstrakcyjnaFabrykaPtaków singleton = FabrykaPtakówZLicznikiem.getInstance();
            AbstrakcyjnaFabrykaPtaków singleton2 = FabrykaPtakówZLicznikiem.getInstance();
            singletons.add(singleton.hashCode());
            singletons.add(singleton2.hashCode());
        }
        assertThat(1, is(singletons.size()));
    }
}
