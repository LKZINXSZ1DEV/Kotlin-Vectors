package com.unknow.vectors

import com.unknow.vectors.interfaces.KVectorsInterface

class KVector4 : KVectorsInterface {
    private var x : Int = 0
    private var y : Int = 0
    private var z : Int = 0
    private var w : Int = 0

    constructor(value : Int) {
        x = value
        y = value
        z = value
        w = value
    }

    constructor(x : Int, y : Int, z : Int, w : Int) {
        this.x = x
        this.y = y
        this.z = z
        this.w = w
    }

    fun getX() : Int {
        return this.x
    }

    fun setX(value : Int) {
        this.x = value
    }

    fun getY() : Int {
        return this.y
    }

    fun setY(value : Int) {
        this.y = value
    }

    fun getZ() : Int {
        return this.z
    }

    fun setZ(value : Int) {
        this.z = value
    }

    fun getW() : Int {
        return this.w
    }

    fun setW(value : Int) {
        this.w = value
    }

    fun setXYZW(value : Int) {
        this.x = value
        this.y = value
        this.z = value
        this.w = value
    }

    override fun Zero() {
        x = 0
        y = 0
        z = 0
        w = 0
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