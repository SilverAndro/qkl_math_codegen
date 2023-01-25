//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import org.joml.Vector4f

//region Standard math operators
/**
 * Adds a [Vector4f] to a [Vector4f].
 */
public operator fun Vector4f.plus(other: Vector4f): Vector4f {
    return Vector4f(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z,
        this.w + other.w
    )
}

/**
 * Subtracts a [Vector4f] from a [Vector4f].
 */
public operator fun Vector4f.minus(other: Vector4f): Vector4f {
    return Vector4f(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z,
        this.w - other.w
    )
}

/**
 * Multiplies a [Vector4f] and a [Vector4f].
 */
public operator fun Vector4f.times(other: Vector4f): Vector4f {
    return Vector4f(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z,
        this.w * other.w
    )
}

/**
 * Divides a [Vector4f] and a [Vector4f].
 */
public operator fun Vector4f.div(other: Vector4f): Vector4f {
    return Vector4f(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z,
        this.w / other.w
    )
}

/**
 * Negates a [Vector4f].
 */
public operator fun Vector4f.unaryMinus(): Vector4f {
    return Vector4f(
        -this.x,
        -this.y,
        -this.z,
        -this.w
    )
}

//endregion
