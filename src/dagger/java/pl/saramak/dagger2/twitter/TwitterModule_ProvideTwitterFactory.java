package pl.saramak.dagger2.twitter;

import dagger.internal.Factory;
import java.io.PrintStream;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TwitterModule_ProvideTwitterFactory implements Factory<Twitter> {
  private final TwitterModule module;
  private final Provider<PrintStream> streamProvider;

  public TwitterModule_ProvideTwitterFactory(TwitterModule module, Provider<PrintStream> streamProvider) {  
    assert module != null;
    this.module = module;
    assert streamProvider != null;
    this.streamProvider = streamProvider;
  }

  @Override
  public Twitter get() {  
    Twitter provided = module.provideTwitter(streamProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Twitter> create(TwitterModule module, Provider<PrintStream> streamProvider) {  
    return new TwitterModule_ProvideTwitterFactory(module, streamProvider);
  }
}

