package pl.saramak.dagger2.app;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.saramak.dagger2.time.Timer;
import pl.saramak.dagger2.twitter.Twitter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Application_MembersInjector implements MembersInjector<Application> {
  private final Provider<Twitter> twitterProvider;
  private final Provider<Timer> timerProvider;

  public Application_MembersInjector(Provider<Twitter> twitterProvider, Provider<Timer> timerProvider) {  
    assert twitterProvider != null;
    this.twitterProvider = twitterProvider;
    assert timerProvider != null;
    this.timerProvider = timerProvider;
  }

  @Override
  public void injectMembers(Application instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.twitter = twitterProvider.get();
    instance.timer = timerProvider.get();
  }

  public static MembersInjector<Application> create(Provider<Twitter> twitterProvider, Provider<Timer> timerProvider) {  
      return new Application_MembersInjector(twitterProvider, timerProvider);
  }
}

