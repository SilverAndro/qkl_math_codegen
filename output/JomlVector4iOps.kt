//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import org.joml.Vector4i

//region Standard math operators
/**
 * Adds a [Vector4i] to a [Vector4i].
 */
public operator fun Vector4i.plus(other: Vector4i): Vector4i {
    return Vector4i(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z,
        this.w + other.w
    )
}

/**
 * Subtracts a [Vector4i] from a [Vector4i].
 */
public operator fun Vector4i.minus(other: Vector4i): Vector4i {
    return Vector4i(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z,
        this.w - other.w
    )
}

/**
 * Multiplies a [Vector4i] and a [Vector4i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector4i.times(other: Vector4i): Vector4i {
    return Vector4i(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z,
        this.w * other.w
    )
}

/**
 * Negates a [Vector4i].
 */
public operator fun Vector4i.unaryMinus(): Vector4i {
    return Vector4i(
        -this.x,
        -this.y,
        -this.z,
        -this.w
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vector4i] and an Int.
 */
public operator fun Vector4i.div(other: Int): Vector4i {
    return Vector4i(
        this.x / other,
        this.y / other,
        this.z / other,
        this.w / other
    )
}

/**
 * The [`x`][Vector4i.x] of a [Vector4i].
 */
public operator fun Vector4i.component1(): Int {
    return this.x
}

/**
 * The [`y`][Vector4i.y] of a [Vector4i].
 */
public operator fun Vector4i.component2(): Int {
    return this.y
}

/**
 * The [`z`][Vector4i.z] of a [Vector4i].
 */
public operator fun Vector4i.component3(): Int {
    return this.z
}

/**
 * The [`w`][Vector4i.w] of a [Vector4i].
 */
public operator fun Vector4i.component4(): Int {
    return this.w
}

/**
 * Returns the dot product of a [Vector4i] and a [org.joml.Vector4i]
 */
public infix fun Vector4i.dot(other: org.joml.Vector4i): Int {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z) + (this.w * other.w)
}
//endregion
