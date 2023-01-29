//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import org.joml.Vector3f

//region Standard math operators
/**
 * Adds a [Vector3f] to a [Vector3f].
 */
public operator fun Vector3f.plus(other: Vector3f): Vector3f {
    return Vector3f(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vector3f] from a [Vector3f].
 */
public operator fun Vector3f.minus(other: Vector3f): Vector3f {
    return Vector3f(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vector3f] and a [Vector3f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector3f.times(other: Vector3f): Vector3f {
    return Vector3f(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Negates a [Vector3f].
 */
public operator fun Vector3f.unaryMinus(): Vector3f {
    return Vector3f(
        -this.x,
        -this.y,
        -this.z
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vector3f] and a Float.
 */
public operator fun Vector3f.div(other: Float): Vector3f {
    return Vector3f(
        this.x / other,
        this.y / other,
        this.z / other
    )
}

/**
 * The [`x`][Vector3f.x] of a [Vector3f].
 */
public operator fun Vector3f.component1(): Float {
    return this.x
}

/**
 * The [`y`][Vector3f.y] of a [Vector3f].
 */
public operator fun Vector3f.component2(): Float {
    return this.y
}

/**
 * The [`z`][Vector3f.z] of a [Vector3f].
 */
public operator fun Vector3f.component3(): Float {
    return this.z
}

/**
 * Returns the dot product of a [Vector3f] and a [org.joml.Vector3f]
 */
public infix fun Vector3f.dot(other: org.joml.Vector3f): Float {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the cross product of a [Vector3f] and a [Vector3f]
 */
public infix fun Vector3f.cross(other: Vector3f) {
    return Vector3f(
        (this.y * other.z) - (this.z * other.y),
        (this.z * other.x) - (this.x * other.z),
        (this.x * other.y) - (this.y * other.x),
    )
}
//endregion
