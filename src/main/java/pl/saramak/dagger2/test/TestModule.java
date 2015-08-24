package pl.saramak.dagger2.test;

import dagger.Module;
import dagger.Provides;
import pl.saramak.dagger2.app.AppScope2;
import pl.saramak.dagger2.stream.SysErrStream;
import pl.saramak.dagger2.stream.SysOutStream;
import pl.saramak.dagger2.twitter.Twitter;
import pl.saramak.dagger2.twitter.TwitterSendByStream;

import javax.inject.Singleton;
import java.io.PrintStream;

/**
 * Created by mario on 22.08.15.
 */
@Module
public class TestModule {

    @Provides
    @AppScope2
    public PrintStream providePrintStream() {
            return new SysErrStream();
    }

    @Provides
    @AppScope2
    public Twitter provideTwitter(PrintStream stream) {
        return new TwitterSendByStream(stream);
    }
}
