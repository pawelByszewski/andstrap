package ue.softisland.plavent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(GradleRobolectricTestRunner.class)
public class EventsActivityTest {

    @Test
    public void testSomething() throws Exception {
        assertThat(5).isEqualTo(5);
    }
}