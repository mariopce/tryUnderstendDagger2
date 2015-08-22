package pl.saramak.dagger2.stream;

import javax.inject.Singleton;
import java.io.PrintStream;

/**
 * Created by mario on 22.08.15.
 */
@Singleton
public class SysErrStream extends PrintStream {
    public SysErrStream() {
        super(System.err);
    }

    @Override
    public void println(String s) {
        super.println("Err " + s);
    }
}
