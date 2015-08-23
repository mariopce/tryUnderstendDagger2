package pl.saramak.dagger2.test;

import dagger.Component;
import pl.saramak.dagger2.app.Application;
import pl.saramak.dagger2.time.TimerModule;

import javax.inject.Singleton;

/**
 * Created by mario on 22.08.15.
 */
@Singleton
@Component(modules = {TestModule.class, TimerModule.class})
public interface TestComponent{
    public void inject(Application test);

}