package pl.saramak.dagger2;

import dagger.Component;


import pl.saramak.dagger2.Main;
import pl.saramak.dagger2.app.Application;
import pl.saramak.dagger2.test.DaggerTestComponent;
import pl.saramak.dagger2.test.TestModule;

import pl.saramak.dagger2.twitter.TwitterModule;



/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'mario' at '8/22/15 8:48 AM' with Gradle 2.5
 *
 * @author mario, @date 8/22/15 8:48 AM
 */
public class LibraryTest {
    public static void main(String[] args) {
        Application application = new Application(){
            @Override
            public void injectComponent() {
                DaggerTestComponent.builder().testModule(new TestModule()).build().inject(this);
            }
        };
        application.injectComponent();
        application.start();

    }


}
