package com.unknow.vectors

class KVectorManager {
    companion object {

        fun Sum(value1 : KVector2, value2 : KVector2) : KVector2 {
            return KVector2(value1.getX() + value2.getX(), value1.getY() + value2.getY())
        }

        fun Sum(value1 : KVector2, value2 : KVector3) : KVector2 {
            return KVector2(value1.getX() + value2.getX(), value1.getY() + value2.getY())
        }

        fun Sum(value1 : KVector2, value2 : KVector4) : KVector2 {
            return KVector2(value1.getX() + value2.getX(), value1.getY() + value2.getY())
        }

        fun Sum(value1 : KVector3, value2 : KVector2) : KVector3 {
            return KVector3(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ())
        }

        fun Sum(value1 : KVector3, value2 : KVector3) : KVector3 {
            return KVector3(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ())
        }

        fun Sum(value1 : KVector3, value2 : KVector4) : KVector3 {
            return KVector3(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ())
        }

        fun Sum(value1 : KVector4, value2 : KVector2) : KVector4 {
            return KVector4(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ(), value1.getW())
        }

        fun Sum(value1 : KVector4, value2 : KVector3) : KVector4 {
            return KVector4(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ(), value1.getW())
        }

        fun Sum(value1 : KVector4, value2 : KVector4) : KVector4 {
            return KVector4(value1.getX() + value2.getX(), value1.getY() + value2.getY(), value1.getZ() + value2.getZ(), value1.getW() + value2.getW())
        }

        fun Multiply(value1 : KVector2, value2 : KVector2) : KVector2 {
            return KVector2(value1.getX() * value2.getX(), value1.getY() * value2.getY())
        }

        fun Multiply(value1 : KVector2, value2 : KVector3) : KVector2 {
            return KVector2(value1.getX() * value2.getX(), value1.getY() * value2.getY())
        }

        fun Multiply(value1 : KVector2, value2 : KVector4) : KVector2 {
            return KVector2(value1.getX() * value2.getX(), value1.getY() * value2.getY())
        }

        fun Multiply(value1 : KVector3, value2 : KVector2) : KVector3 {
            return KVector3(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ())
        }

        fun Multiply(value1 : KVector3, value2 : KVector3) : KVector3 {
            return KVector3(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ())
        }

        fun Multiply(value1 : KVector3, value2 : KVector4) : KVector3 {
            return KVector3(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ())
        }

        fun Multiply(value1 : KVector4, value2 : KVector2) : KVector4 {
            return KVector4(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ(), value1.getW())
        }

        fun Multiply(value1 : KVector4, value2 : KVector3) : KVector4 {
            return KVector4(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ(), value1.getW())
        }

        fun Multiply(value1 : KVector4, value2 : KVector4) : KVector4 {
            return KVector4(value1.getX() * value2.getX(), value1.getY() * value2.getY(), value1.getZ() * value2.getZ(), value1.getW() * value2.getW())
        }

        fun Divide(value1 : KVector2, value2 : KVector2) : KVector2 {
            return KVector2(value1.getX() / value2.getX(), value1.getY() / value2.getY())
        }

        fun Divide(value1 : KVector2, value2 : KVector3) : KVector2 {
            return KVector2(value1.getX() / value2.getX(), value1.getY() / value2.getY())
        }

        fun Divide(value1 : KVector2, value2 : KVector4) : KVector2 {
            return KVector2(value1.getX() / value2.getX(), value1.getY() / value2.getY())
        }

        fun Divide(value1 : KVector3, value2 : KVector2) : KVector3 {
            return KVector3(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ())
        }

        fun Divide(value1 : KVector3, value2 : KVector3) : KVector3 {
            return KVector3(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ())
        }

        fun Divide(value1 : KVector3, value2 : KVector4) : KVector3 {
            return KVector3(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ())
        }

        fun Divide(value1 : KVector4, value2 : KVector2) : KVector4 {
            return KVector4(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ(), value1.getW())
        }

        fun Divide(value1 : KVector4, value2 : KVector3) : KVector4 {
            return KVector4(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ(), value1.getW())
        }

        fun Divide(value1 : KVector4, value2 : KVector4) : KVector4 {
            return KVector4(value1.getX() / value2.getX(), value1.getY() / value2.getY(), value1.getZ() / value2.getZ(), value1.getW() / value2.getW())
        }
    }
}