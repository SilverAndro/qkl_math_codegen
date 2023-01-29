// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen

package org.quiltmc.qkl.library.math

import org.joml.Vector2i

//region Standard math operators
/**
 * Adds a [Vector2i] to a [Vector2i].
 */
public operator fun Vector2i.plus(other: Vector2i): Vector2i {
    return Vector2i(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [Vector2i] from a [Vector2i].
 */
public operator fun Vector2i.minus(other: Vector2i): Vector2i {
    return Vector2i(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [Vector2i] and a [Vector2i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector2i.times(other: Vector2i): Vector2i {
    return Vector2i(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Negates a [Vector2i].
 */
public operator fun Vector2i.unaryMinus(): Vector2i {
    return Vector2i(
        -this.x,
        -this.y
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vector2i] and an Int.
 */
public operator fun Vector2i.div(other: Int): Vector2i {
    return Vector2i(
        this.x / other,
        this.y / other
    )
}

/**
 * The [`x`][Vector2i.x] of a [Vector2i].
 */
public operator fun Vector2i.component1(): Int {
    return this.x
}

/**
 * The [`y`][Vector2i.y] of a [Vector2i].
 */
public operator fun Vector2i.component2(): Int {
    return this.y
}

/**
 * Returns the dot product of a [Vector2i] and a [Vector2i].
 */
public infix fun Vector2i.dot(other: Vector2i): Int {
    return (this.x * other.x) + (this.y * other.y)
}
//endregion
