// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen

package org.quiltmc.qkl.library.math

import org.joml.Vector2d

//region Standard math operators
/**
 * Adds a [Vector2d] to a [Vector2d].
 */
public operator fun Vector2d.plus(other: Vector2d): Vector2d {
    return Vector2d(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [Vector2d] from a [Vector2d].
 */
public operator fun Vector2d.minus(other: Vector2d): Vector2d {
    return Vector2d(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [Vector2d] and a [Vector2d].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector2d.times(other: Vector2d): Vector2d {
    return Vector2d(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Negates a [Vector2d].
 */
public operator fun Vector2d.unaryMinus(): Vector2d {
    return Vector2d(
        -this.x,
        -this.y
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vector2d] and a Double.
 */
public operator fun Vector2d.div(other: Double): Vector2d {
    return Vector2d(
        this.x / other,
        this.y / other
    )
}

/**
 * The [`x`][Vector2d.x] of a [Vector2d].
 */
public operator fun Vector2d.component1(): Double {
    return this.x
}

/**
 * The [`y`][Vector2d.y] of a [Vector2d].
 */
public operator fun Vector2d.component2(): Double {
    return this.y
}

/**
 * Returns the dot product of a [Vector2d] and a [org.joml.Vector2d]
 */
public infix fun Vector2d.dot(other: org.joml.Vector2d): Double {
    return (this.x * other.x) + (this.y * other.y)
}
//endregion
