package pl.saramak.dagger2;

import dagger.Component;
import pl.saramak.dagger2.twitter.DaggerTwitterComponent;
import pl.saramak.dagger2.twitter.Twitter;
import pl.saramak.dagger2.twitter.TwitterComponent;
import pl.saramak.dagger2.twitter.TwitterModule;

import javax.inject.Inject;

/**
 * Created by mario on 22.08.15.
 */
public class Application {

    @Inject Twitter twitter;

    public void start() {
        twitter.tweet("Teraz jest " + System.currentTimeMillis());
    }


    public void injectComponent(){
        TwitterComponent component = getComponent();
        component.inject(this);
    }

    private TwitterComponent getComponent() {
        return DaggerTwitterComponent.builder().twitterModule(new TwitterModule(true)).build();
    }
}
