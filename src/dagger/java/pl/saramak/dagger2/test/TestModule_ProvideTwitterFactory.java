package pl.saramak.dagger2.test;

import dagger.internal.Factory;
import java.io.PrintStream;
import javax.annotation.Generated;
import javax.inject.Provider;
import pl.saramak.dagger2.twitter.Twitter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TestModule_ProvideTwitterFactory implements Factory<Twitter> {
  private final TestModule module;
  private final Provider<PrintStream> streamProvider;

  public TestModule_ProvideTwitterFactory(TestModule module, Provider<PrintStream> streamProvider) {  
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

  public static Factory<Twitter> create(TestModule module, Provider<PrintStream> streamProvider) {  
    return new TestModule_ProvideTwitterFactory(module, streamProvider);
  }
}

