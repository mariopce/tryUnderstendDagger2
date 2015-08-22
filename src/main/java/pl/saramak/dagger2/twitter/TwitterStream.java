package pl.saramak.dagger2.twitter;

import pl.saramak.dagger2.twitter.Twitter;

import java.io.PrintStream;

/**
 * Created by mario on 22.08.15.
 */
public class TwitterStream implements Twitter {

    PrintStream stream;

    public TwitterStream(){
        stream = System.out;
    }
    @Override
    public void tweet(String message) {
         stream.println(message);
    }
}
