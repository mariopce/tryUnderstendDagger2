package pl.saramak.dagger2.twitter;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TwitterModule_ProvideTwitterFactory implements Factory<Twitter> {
  private final TwitterModule module;

  public TwitterModule_ProvideTwitterFactory(TwitterModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Twitter get() {  
    Twitter provided = module.provideTwitter();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Twitter> create(TwitterModule module) {  
    return new TwitterModule_ProvideTwitterFactory(module);
  }
}

