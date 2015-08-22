package pl.saramak.dagger2.twitter;

import dagger.Component;
import pl.saramak.dagger2.Application;

import javax.inject.Singleton;

/**
 * Created by mario on 22.08.15.
 */
@Component(modules = TwitterModule.class)
public interface TwitterComponent {

    public void inject(Application app);
    public Twitter twitter();
}
