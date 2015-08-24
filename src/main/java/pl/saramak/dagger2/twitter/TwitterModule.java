package pl.saramak.dagger2.twitter;

import dagger.Module;
import dagger.Provides;
import pl.saramak.dagger2.app.AppScope;
import pl.saramak.dagger2.stream.SysErrStream;
import pl.saramak.dagger2.stream.SysOutStream;

import javax.inject.Singleton;
import java.io.PrintStream;

/**
 * Created by mario on 22.08.15.
 */
@Module
public class TwitterModule {


    private boolean debug;

    public TwitterModule(boolean debug) {
        this.debug = debug;
    }

    @Provides
    @AppScope
    public PrintStream providePrintStream() {
        if (debug) {
            return new SysOutStream();
        } else {
            return new SysErrStream();
        }

    }

    @Provides
    @AppScope
    public Twitter provideTwitter(PrintStream stream) {
        return new TwitterSendByStream(stream);
    }


}
