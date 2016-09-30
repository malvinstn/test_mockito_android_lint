package com.malvinstn.testmockitolint;

class Foo {

    int doFoo(Bar b) {
        return b.bar();
    }

    int doFoo(Bar2 b) {
        return b.bar();
    }

    public int doFoo(Bar3 b) {
        return b.bar();
    }
}
