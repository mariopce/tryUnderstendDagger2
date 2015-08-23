package pl.saramak.dagger2.time;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mario on 23.08.15.
 */
@Qualifier
@Retention(value = RetentionPolicy.RUNTIME)
public @interface London {
}
