package pl.saramak.dagger2;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.saramak.dagger2.twitter.Twitter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Application_MembersInjector implements MembersInjector<Application> {
  private final Provider<Twitter> twitterProvider;

  public Application_MembersInjector(Provider<Twitter> twitterProvider) {  
    assert twitterProvider != null;
    this.twitterProvider = twitterProvider;
  }

  @Override
  public void injectMembers(Application instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.twitter = twitterProvider.get();
  }

  public static MembersInjector<Application> create(Provider<Twitter> twitterProvider) {  
      return new Application_MembersInjector(twitterProvider);
  }
}

