package pl.saramak.dagger2.test;

import dagger.internal.Factory;
import java.io.PrintStream;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TestModule_ProvidePrintStreamFactory implements Factory<PrintStream> {
  private final TestModule module;

  public TestModule_ProvidePrintStreamFactory(TestModule module) {  
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

  public static Factory<PrintStream> create(TestModule module) {  
    return new TestModule_ProvidePrintStreamFactory(module);
  }
}

