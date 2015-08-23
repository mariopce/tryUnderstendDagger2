package pl.saramak.dagger2.time;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by mario on 23.08.15.
 */
@Module
public class TimerModule {

    @Singleton
    @Provides
    @Named("Warsaw")
    public Timer provideWTimer(){
        return new WarsawTimer();
    }

    @Singleton
    @Provides
    @London
    public Timer provideLTimer(){
        return new LondonTimer();
    }
}
