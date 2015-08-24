package pl.saramak.dagger2.time;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TimerTestModule_ProvideWTimerFactory implements Factory<Timer> {
  private final TimerTestModule module;

  public TimerTestModule_ProvideWTimerFactory(TimerTestModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Timer get() {  
    Timer provided = module.provideWTimer();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Timer> create(TimerTestModule module) {  
    return new TimerTestModule_ProvideWTimerFactory(module);
  }
}

