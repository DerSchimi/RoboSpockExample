package de.derschimi.app

import android.widget.ListView
import org.robolectric.Robolectric
import pl.polidea.robospock.RoboSpecification

/**
 * Created by daniel on 21.09.2014.
 */
//@Config(manifest="App/src/main/AndroidManifest.xml")
//@Config(manifest=Config.NONE)
class MainActivitySpecification extends RoboSpecification {
    def mainActivity

    def "setup"() {
        mainActivity = Robolectric.buildActivity(AppActivity.class).create().get()
    }

    def "should use ListView for left drawer"() {
        expect:
        mainActivity.findViewById(R.id.left_drawer) instanceof ListView
    }

    def "test app title"() {
        expect:
        mainActivity.getTitle().equals("App");
    }


    def "change app title"() {

        when:
        mainActivity.setTitle("new name")

        then:
        mainActivity.getTitle().equals("new name");

    }
}

