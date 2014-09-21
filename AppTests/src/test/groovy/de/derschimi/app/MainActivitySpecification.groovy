package de.derschimi.app

import android.widget.TextView
import org.robolectric.Robolectric
import org.robolectric.annotation.Config
import pl.polidea.robospock.RoboSpecification

/**
 * Created by daniel on 21.09.2014.
 */
@Config(manifest = "/App/src/main/AndroidManifest.xml")
class MainActivitySpecification extends RoboSpecification {

    def "Should say hello world"() {
        setup:
        def mainActivity = Robolectric.buildActivity(AppActivity.class).create().get()

        when:
        def tv = (TextView) mainActivity.findViewById(R.id.fragmentname)

        then:
        "Account{name='JohnWhite', password='24a28dbe'}" == tv.getText()
    }


}
