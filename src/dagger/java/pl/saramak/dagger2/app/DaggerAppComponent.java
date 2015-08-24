package pl.saramak.dagger2.app;

import dagger.MembersInjector;
import dagger.internal.ScopedProvider;
import java.io.PrintStream;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.saramak.dagger2.time.Timer;
import pl.saramak.dagger2.time.TimerModule;
import pl.saramak.dagger2.time.TimerModule_ProvideLTimerFactory;
import pl.saramak.dagger2.twitter.Twitter;
import pl.saramak.dagger2.twitter.TwitterModule;
import pl.saramak.dagger2.twitter.TwitterModule_ProvidePrintStreamFactory;
import pl.saramak.dagger2.twitter.TwitterModule_ProvideTwitterFactory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<PrintStream> providePrintStreamProvider;
  private Provider<Twitter> provideTwitterProvider;
  private Provider<Timer> provideLTimerProvider;
  private MembersInjector<Application> applicationMembersInjector;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.providePrintStreamProvider = ScopedProvider.create(TwitterModule_ProvidePrintStreamFactory.create(builder.twitterModule));
    this.provideTwitterProvider = ScopedProvider.create(TwitterModule_ProvideTwitterFactory.create(builder.twitterModule, providePrintStreamProvider));
    this.provideLTimerProvider = TimerModule_ProvideLTimerFactory.create(builder.timerModule);
    this.applicationMembersInjector = Application_MembersInjector.create(provideTwitterProvider, provideLTimerProvider);
  }

  @Override
  public void inject(Application app) {  
    applicationMembersInjector.injectMembers(app);
  }

  public static final class Builder {
    private TwitterModule twitterModule;
    private TimerModule timerModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (twitterModule == null) {
        throw new IllegalStateException("twitterModule must be set");
      }
      if (timerModule == null) {
        this.timerModule = new TimerModule();
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder twitterModule(TwitterModule twitterModule) {  
      if (twitterModule == null) {
        throw new NullPointerException("twitterModule");
      }
      this.twitterModule = twitterModule;
      return this;
    }
  
    public Builder timerModule(TimerModule timerModule) {  
      if (timerModule == null) {
        throw new NullPointerException("timerModule");
      }
      this.timerModule = timerModule;
      return this;
    }
  }
}

