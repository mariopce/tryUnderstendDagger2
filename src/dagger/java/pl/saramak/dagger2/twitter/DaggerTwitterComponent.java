package pl.saramak.dagger2.twitter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.saramak.dagger2.Application;
import pl.saramak.dagger2.Application_MembersInjector;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerTwitterComponent implements TwitterComponent {
  private Provider<Twitter> provideTwitterProvider;
  private MembersInjector<Application> applicationMembersInjector;

  private DaggerTwitterComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static TwitterComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideTwitterProvider = TwitterModule_ProvideTwitterFactory.create(builder.twitterModule);
    this.applicationMembersInjector = Application_MembersInjector.create(provideTwitterProvider);
  }

  @Override
  public void inject(Application app) {  
    applicationMembersInjector.injectMembers(app);
  }

  @Override
  public Twitter twitter() {  
    return provideTwitterProvider.get();
  }

  public static final class Builder {
    private TwitterModule twitterModule;
  
    private Builder() {  
    }
  
    public TwitterComponent build() {  
      if (twitterModule == null) {
        this.twitterModule = new TwitterModule();
      }
      return new DaggerTwitterComponent(this);
    }
  
    public Builder twitterModule(TwitterModule twitterModule) {  
      if (twitterModule == null) {
        throw new NullPointerException("twitterModule");
      }
      this.twitterModule = twitterModule;
      return this;
    }
  }
}

