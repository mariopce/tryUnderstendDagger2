package pl.saramak.dagger2.stream;

import javax.inject.Singleton;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by mario on 22.08.15.
 */
@Singleton
public class SysOutStream extends PrintStream {
    public SysOutStream() {
        super(System.out);
    }
    public void println(String m){
        super.println("Out:: " + m);
    }
}
