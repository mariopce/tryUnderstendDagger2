package pl.saramak.dagger2.test;

import dagger.Component;
import pl.saramak.dagger2.app.AppScope;
import pl.saramak.dagger2.app.AppScope2;
import pl.saramak.dagger2.app.Application;
import pl.saramak.dagger2.time.TimerModule;
import pl.saramak.dagger2.time.TimerTestModule;

import javax.inject.Singleton;

/**
 * Created by mario on 22.08.15.
 */
@AppScope2
@Component(modules = {TestModule.class, TimerTestModule.class})
public interface TestComponent{
    public void inject(Application test);

}