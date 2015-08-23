package pl.saramak.dagger2.test;

import dagger.MembersInjector;
import dagger.internal.ScopedProvider;
import java.io.PrintStream;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.saramak.dagger2.app.Application;
import pl.saramak.dagger2.app.Application_MembersInjector;
import pl.saramak.dagger2.time.Timer;
import pl.saramak.dagger2.time.TimerModule;
import pl.saramak.dagger2.time.TimerModule_ProvideLTimerFactory;
import pl.saramak.dagger2.twitter.Twitter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerTestComponent implements TestComponent {
  private Provider<PrintStream> providePrintStreamProvider;
  private Provider<Twitter> provideTwitterProvider;
  private Provider<Timer> provideLTimerProvider;
  private MembersInjector<Application> applicationMembersInjector;

  private DaggerTestComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static TestComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.providePrintStreamProvider = ScopedProvider.create(TestModule_ProvidePrintStreamFactory.create(builder.testModule));
    this.provideTwitterProvider = ScopedProvider.create(TestModule_ProvideTwitterFactory.create(builder.testModule, providePrintStreamProvider));
    this.provideLTimerProvider = ScopedProvider.create(TimerModule_ProvideLTimerFactory.create(builder.timerModule));
    this.applicationMembersInjector = Application_MembersInjector.create(provideTwitterProvider, provideLTimerProvider);
  }

  @Override
  public void inject(Application test) {  
    applicationMembersInjector.injectMembers(test);
  }

  public static final class Builder {
    private TestModule testModule;
    private TimerModule timerModule;
  
    private Builder() {  
    }
  
    public TestComponent build() {  
      if (testModule == null) {
        this.testModule = new TestModule();
      }
      if (timerModule == null) {
        this.timerModule = new TimerModule();
      }
      return new DaggerTestComponent(this);
    }
  
    public Builder testModule(TestModule testModule) {  
      if (testModule == null) {
        throw new NullPointerException("testModule");
      }
      this.testModule = testModule;
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

