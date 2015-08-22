package pl.saramak.dagger2.twitter;

import pl.saramak.dagger2.twitter.Twitter;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.PrintStream;

/**
 * Created by mario on 22.08.15.
 */
public class TwitterSendByStream implements Twitter {

    @Inject PrintStream stream;


    public TwitterSendByStream(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void tweet(String message) {
         stream.println(message);
    }
}
