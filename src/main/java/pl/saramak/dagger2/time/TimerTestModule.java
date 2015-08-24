package pl.saramak.dagger2.time;

import dagger.Module;
import dagger.Provides;
import pl.saramak.dagger2.app.AppScope;
import pl.saramak.dagger2.app.AppScope2;

import javax.inject.Named;

/**
 * Created by mario on 23.08.15.
 */
@Module
public class TimerTestModule {



    @Named("Warsaw")
    @Provides
    public Timer provideWTimer(){
        return new WarsawTimer();
    }


    @Provides
    @London
    public Timer provideLTimer(){
        return new LondonTimer();
    }

}
