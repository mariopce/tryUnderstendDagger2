package pl.saramak.dagger2.twitter;

import dagger.MembersInjector;
import java.io.PrintStream;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class TwitterSendByStream_MembersInjector implements MembersInjector<TwitterSendByStream> {
  private final Provider<PrintStream> streamProvider;

  public TwitterSendByStream_MembersInjector(Provider<PrintStream> streamProvider) {  
    assert streamProvider != null;
    this.streamProvider = streamProvider;
  }

  @Override
  public void injectMembers(TwitterSendByStream instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.stream = streamProvider.get();
  }

  public static MembersInjector<TwitterSendByStream> create(Provider<PrintStream> streamProvider) {  
      return new TwitterSendByStream_MembersInjector(streamProvider);
  }
}

