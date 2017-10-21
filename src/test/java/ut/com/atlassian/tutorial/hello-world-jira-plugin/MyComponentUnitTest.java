package ut.com.atlassian.tutorial.hello-world-jira-plugin;

import org.junit.Test;
import com.atlassian.tutorial.hello-world-jira-plugin.api.MyPluginComponent;
import com.atlassian.tutorial.hello-world-jira-plugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}