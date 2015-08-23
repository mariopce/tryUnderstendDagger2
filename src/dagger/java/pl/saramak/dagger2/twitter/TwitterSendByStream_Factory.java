package pl.saramak.dagger2.twitter;

import dagger.internal.Factory;
import java.io.PrintStream;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TwitterSendByStream_Factory implements Factory<TwitterSendByStream> {
  private final Provider<PrintStream> streamProvider;

  public TwitterSendByStream_Factory(Provider<PrintStream> streamProvider) {  
    assert streamProvider != null;
    this.streamProvider = streamProvider;
  }

  @Override
  public TwitterSendByStream get() {  
    return new TwitterSendByStream(streamProvider.get());
  }

  public static Factory<TwitterSendByStream> create(Provider<PrintStream> streamProvider) {  
    return new TwitterSendByStream_Factory(streamProvider);
  }
}

