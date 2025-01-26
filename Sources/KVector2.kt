package com.unknow.vectors

import com.unknow.vectors.interfaces.KVectorsInterface

class KVector2 : KVectorsInterface {
    private var x : Int = 0
    private var y : Int = 0

    constructor(value : Int) {
        x = value
        y = value
    }

    constructor(x : Int, y : Int) {
        this.x = x
        this.y = y
    }

    fun getX() : Int {
        return this.x
    }

    fun setX(value : Int) {
        x = value
    }

    fun getY() : Int {
        return this.y
    }

    fun setY(value : Int) {
        y = value
    }

    fun setXY(value : Int) {
        x = value
        y = value
    }

    override fun Zero() {
        x = 0
        y = 0
    }

    override fun Up() {
        Zero()
        y = 1
    }

    override fun Down() {
        Zero()
        y = -1
    }
}