package com.malvinstn.testmockitolint;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class FooUnitTest {

    private Foo foo;

    @Before
    public void setUp() throws Exception {
        foo = new Foo();

    }

    @Test
    public void testDoFoo() {
        Bar mockBar = Mockito.mock(Bar.class);
        when(mockBar.bar()).thenReturn(0);
        int i = foo.doFoo(mockBar);
        assertEquals(0, i);
    }

    @Test
    public void testDoFoo2() {
        Bar2 mockBar2 = Mockito.mock(Bar2.class);
        when(mockBar2.bar()).thenReturn(0);
        int i = foo.doFoo(mockBar2);
        assertEquals(0, i);
    }

    @Test
    public void testDoFoo3() {
        Bar3 mockBar3 = Mockito.mock(Bar3.class);
        when(mockBar3.bar()).thenReturn(0);
        int i = foo.doFoo(mockBar3);
        assertEquals(0, i);
    }
}