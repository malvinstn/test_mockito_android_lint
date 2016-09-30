package com.malvinstn.testmockitolint;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import android.support.test.runner.AndroidJUnit4;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(AndroidJUnit4.class)
public class FooAndroidTest {

    private Foo foo;

    @Before
    public void setUp() throws Exception {
        foo = new Foo();

    }

    @Test
    public void testDoFoo() {
        // Throws java.lang.UnsupportedOperationException:
        // cannot proxy inaccessible class class com.malvinstn.testmockitolint.Bar.
        Bar mockBar = Mockito.mock(Bar.class);
        when(mockBar.bar()).thenReturn(0);
        int i = foo.doFoo(mockBar);
        assertEquals(0, i);
    }

    @Test
    public void testDoFoo2() {
        // Throws org.mockito.exceptions.misusing.MissingMethodInvocationException:
        // when() requires an argument which has to be 'a method call on a mock'.
        Bar2 mockBar2 = Mockito.mock(Bar2.class);
        when(mockBar2.bar()).thenReturn(0);
        int i = foo.doFoo(mockBar2);
        assertEquals(0, i);
    }

    @Test
    public void testDoFoo3() {
        // Runs fine
        Bar3 mockBar3 = Mockito.mock(Bar3.class);
        when(mockBar3.bar()).thenReturn(0);
        int i = foo.doFoo(mockBar3);
        assertEquals(0, i);
    }
}