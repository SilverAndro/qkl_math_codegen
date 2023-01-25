//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import net.minecraft.client.util.math.Vector2f
import org.joml.Vector2f
import net.minecraft.util.math.Vec2f

//region Standard math operators
/**
 * Adds a [Vector2f] to a [Vector2f].
 */
public operator fun Vector2f.plus(other: Vector2f): Vector2f {
    return Vector2f(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [Vector2f] from a [Vector2f].
 */
public operator fun Vector2f.minus(other: Vector2f): Vector2f {
    return Vector2f(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [Vector2f] and a [Vector2f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector2f.times(other: Vector2f): Vector2f {
    return Vector2f(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Divides a [Vector2f] and a [Vector2f].
 */
public operator fun Vector2f.div(other: Vector2f): Vector2f {
    return Vector2f(
        this.x / other.x,
        this.y / other.y
    )
}

/**
 * Negates a [Vector2f].
 */
public operator fun Vector2f.unaryMinus(): Vector2f {
    return Vector2f(
        -this.x,
        -this.y
    )
}

//endregion

//region Type compatibility operator variations
/**
 * Adds a [org.joml.Vector2f] to a [net.minecraft.client.util.math.Vector2f].
 */
public operator fun Vector2f.plus(other: Vector2f): Vector2f {
    return Vector2f(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [org.joml.Vector2f] from a [net.minecraft.client.util.math.Vector2f].
 */
public operator fun Vector2f.minus(other: Vector2f): Vector2f {
    return Vector2f(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [org.joml.Vector2f] and a [net.minecraft.client.util.math.Vector2f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector2f.times(other: Vector2f): Vector2f {
    return Vector2f(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Divides a [org.joml.Vector2f] and a [net.minecraft.client.util.math.Vector2f].
 */
public operator fun Vector2f.div(other: Vector2f): Vector2f {
    return Vector2f(
        this.x / other.x,
        this.y / other.y
    )
}

/**
 * Adds a [net.minecraft.util.math.Vec2f] to a [net.minecraft.client.util.math.Vector2f].
 */
public operator fun Vector2f.plus(other: Vec2f): Vector2f {
    return Vector2f(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [net.minecraft.util.math.Vec2f] from a [net.minecraft.client.util.math.Vector2f].
 */
public operator fun Vector2f.minus(other: Vector2f): Vector2f {
    return Vector2f(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [net.minecraft.util.math.Vec2f] and a [net.minecraft.client.util.math.Vector2f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector2f.times(other: Vector2f): Vector2f {
    return Vector2f(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Divides a [net.minecraft.util.math.Vec2f] and a [net.minecraft.client.util.math.Vector2f].
 */
public operator fun Vector2f.div(other: Vector2f): Vector2f {
    return Vector2f(
        this.x / other.x,
        this.y / other.y
    )
}

//endregion

//region Vector specific operators
/**
 * The [`x`][Vector2f.x] of a [Vector2f].
 */
public operator fun Vector2f.component1(): Float {
    this.x
}

/**
 * The [`y`][Vector2f.y] of a [Vector2f].
 */
public operator fun Vector2f.component2(): Float {
    this.y
}

//endregion

