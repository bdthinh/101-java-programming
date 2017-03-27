package com.company;

/**
 * Created by thinhdbui on 27/3/17.
 * Animal uses to describe an animal with name and leg. It's abstract class.
 */

public abstract class Animal {

    protected String _name;
    protected int _leg;

    /**
     *
     * @return leg of Animal
     */
    public int get_leg() {
        return _leg;
    }
}
