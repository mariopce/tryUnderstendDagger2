package pl.saramak.dagger2.test;

import dagger.Component;
import pl.saramak.dagger2.Application;
import pl.saramak.dagger2.LibraryTest;
import pl.saramak.dagger2.twitter.TwitterModule;

import javax.inject.Singleton;

/**
 * Created by mario on 22.08.15.
 */
@Singleton
@Component(modules = TestModule.class)
public interface TestComponent{
    public void inject(Application test);
}