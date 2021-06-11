package bench;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.RunnerException;
import symulatorDzungli.fabrykaAbstrakcyjnaZwierząt.AbstrakcyjnaFabrykaZwierząt;
import symulatorDzungli.fabrykaAbstrakcyjnaZwierząt.FabrykaZwierzątZLicznikiem;
import symulatorDzungli.prostaFabryka.ProstaFabrykaZwierząt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//@State(Scope.Benchmark)
public class BenchmarkTest {

    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }

    //private static final int ITERATIONS = 100000;

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    public void AbstrakcyjnaFabrykaBenchmark() {
        final AbstrakcyjnaFabrykaZwierząt zwieFabryka = FabrykaZwierzątZLicznikiem.getInstance();
        zwieFabryka.utwórzGoryl();
        zwieFabryka.utwórzKapucynka();
        zwieFabryka.utwórzMałpa();
        zwieFabryka.utwórzSłoń();
        zwieFabryka.utwórzŻyrafa();
    }

    @Benchmark
    @Fork(1)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.All)
    public void ProstaFabrykaBenchmark() {
        final ProstaFabrykaZwierząt zwieFabrykaP = ProstaFabrykaZwierząt.getInstance();
        zwieFabrykaP.utwórzGoryl();
        zwieFabrykaP.utwórzKapucynka();
        zwieFabrykaP.utwórzMałpa();
        zwieFabrykaP.utwórzSłoń();
        zwieFabrykaP.utwórzŻyrafa();
    }
}