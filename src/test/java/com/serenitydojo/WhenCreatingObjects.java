package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void testMakeNoise() {
        Dog dog = new Dog("yellow", "toy", 3);
        String noise = dog.makeNoise();
        Assert.assertEquals(noise, "Woof");

    }

    @Test
    public void testFed() {
        Dog dog = new Dog("yellow", "toy", 3);
        dog.feed();
        Assert.assertTrue(dog.isFed());
    }

    @Test
    public void testRefactorNoise() {
        Dog dog = new Dog("yellow", "toy", 3);
        String noise = dog.makeNoiseRefactor();
        Assert.assertEquals(noise, "Woof");
    }

}
