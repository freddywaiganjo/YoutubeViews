import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

/**
 * Created by user on 12/03/2019.
 */

/**
 * Some views will be added to the video. some may not reflect. I welcome anyone with the exact algorithm to help crack
 * this for a bounty.
 */

@RunWith(AllTests.class)
public final class LoopThru {

    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
//        i is the no. of views you would like to add. Be keen to avoid exhausting memory heap
        for (int i= 0; i<1000; i++) {
            suite.addTest(new JUnit4TestAdapter(Youtube.class));
        }

        return suite;
    }
}
