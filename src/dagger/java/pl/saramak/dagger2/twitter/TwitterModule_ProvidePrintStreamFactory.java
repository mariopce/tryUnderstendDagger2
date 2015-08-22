package pl.saramak.dagger2.twitter;

import dagger.internal.Factory;
import java.io.PrintStream;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TwitterModule_ProvidePrintStreamFactory implements Factory<PrintStream> {
  private final TwitterModule module;

  public TwitterModule_ProvidePrintStreamFactory(TwitterModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public PrintStream get() {  
    PrintStream provided = module.providePrintStream();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<PrintStream> create(TwitterModule module) {  
    return new TwitterModule_ProvidePrintStreamFactory(module);
  }
}

