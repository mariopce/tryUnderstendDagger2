package pl.saramak.dagger2.app;

import pl.saramak.dagger2.time.London;
import pl.saramak.dagger2.time.Timer;
import pl.saramak.dagger2.twitter.Twitter;

import pl.saramak.dagger2.twitter.TwitterModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by mario on 22.08.15.
 */
public class Application {

    @Inject Twitter twitter;

    @Inject
    @London
    Timer timer;

    public void start() {
        twitter.tweet("Teraz jest " + timer.getTime());
    }


    public void injectComponent(){
        AppComponent component = getComponent();
        component.inject(this);
    }

    private AppComponent getComponent() {
        return DaggerAppComponent.builder().twitterModule(new TwitterModule(true)).build();
    }
}
