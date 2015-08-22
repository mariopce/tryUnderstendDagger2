package pl.saramak.dagger2;

import pl.saramak.dagger2.twitter.Twitter;
import pl.saramak.dagger2.twitter.TwitterStream;

import javax.inject.Inject;

/**
 * Created by mario on 22.08.15.
 */
public class Application {
    
    @Inject Twitter twitter;

    public void start() {
        twitter.tweet("Teraz jest " + System.currentTimeMillis());
    }
}
