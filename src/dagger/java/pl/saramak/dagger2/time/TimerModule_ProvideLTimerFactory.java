package pl.saramak.dagger2.time;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TimerModule_ProvideLTimerFactory implements Factory<Timer> {
  private final TimerModule module;

  public TimerModule_ProvideLTimerFactory(TimerModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Timer get() {  
    Timer provided = module.provideLTimer();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Timer> create(TimerModule module) {  
    return new TimerModule_ProvideLTimerFactory(module);
  }
}

