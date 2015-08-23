package pl.saramak.dagger2.app;

import dagger.Component;

import pl.saramak.dagger2.time.TimerModule;
import pl.saramak.dagger2.twitter.TwitterModule;

import javax.inject.Singleton;

/**
 * Created by mario on 22.08.15.
 */
@Component(modules = {TwitterModule.class, TimerModule.class})
@Singleton
public interface AppComponent {

    public void inject(Application app);

}
