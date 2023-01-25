//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import org.joml.Vector2d

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
 */
public operator fun Vector2d.times(other: Vector2d): Vector2d {
    return Vector2d(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Divides a [Vector2d] and a [Vector2d].
 */
public operator fun Vector2d.div(other: Vector2d): Vector2d {
    return Vector2d(
        this.x / other.x,
        this.y / other.y
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

