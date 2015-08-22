package pl.saramak.dagger2.twitter;

import dagger.Module;
import dagger.Provides;
import pl.saramak.dagger2.twitter.Twitter;
import pl.saramak.dagger2.twitter.TwitterStream;

import javax.inject.Singleton;

/**
 * Created by mario on 22.08.15.
 */
@Module
public class TwitterModule {

    @Provides
    public Twitter provideTwitter(){
        return new TwitterStream();
    }
}
