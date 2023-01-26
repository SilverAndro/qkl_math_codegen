//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import net.minecraft.util.math.Vec2f
import org.joml.Vector2f
import net.minecraft.client.util.math.Vector2f

//region Standard math operators
/**
 * Adds a [Vec2f] to a [Vec2f].
 */
public operator fun Vec2f.plus(other: Vec2f): Vec2f {
    return Vec2f(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [Vec2f] from a [Vec2f].
 */
public operator fun Vec2f.minus(other: Vec2f): Vec2f {
    return Vec2f(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [Vec2f] and a [Vec2f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec2f.times(other: Vec2f): Vec2f {
    return Vec2f(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Negates a [Vec2f].
 */
public operator fun Vec2f.unaryMinus(): Vec2f {
    return Vec2f(
        -this.x,
        -this.y
    )
}
//endregion

//region Type compatibility operator variations
/**
 * Adds a [org.joml.Vector2f] to a [net.minecraft.util.math.Vec2f].
 */
public operator fun Vec2f.plus(other: org.joml.Vector2f): Vec2f {
    return Vec2f(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [org.joml.Vector2f] from a [net.minecraft.util.math.Vec2f].
 */
public operator fun Vec2f.minus(other: Vec2f): Vec2f {
    return Vec2f(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [org.joml.Vector2f] and a [net.minecraft.util.math.Vec2f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec2f.times(other: Vec2f): Vec2f {
    return Vec2f(
        this.x * other.x,
        this.y * other.y
    )
}

/**
 * Adds a [net.minecraft.client.util.math.Vector2f] to a [net.minecraft.util.math.Vec2f].
 */
public operator fun Vec2f.plus(other: net.minecraft.client.util.math.Vector2f): Vec2f {
    return Vec2f(
        this.x + other.x,
        this.y + other.y
    )
}

/**
 * Subtracts a [net.minecraft.client.util.math.Vector2f] from a [net.minecraft.util.math.Vec2f].
 */
public operator fun Vec2f.minus(other: Vec2f): Vec2f {
    return Vec2f(
        this.x - other.x,
        this.y - other.y
    )
}

/**
 * Multiplies a [net.minecraft.client.util.math.Vector2f] and a [net.minecraft.util.math.Vec2f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec2f.times(other: Vec2f): Vec2f {
    return Vec2f(
        this.x * other.x,
        this.y * other.y
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vec2f] and a Float.
 */
public operator fun Vec2f.div(other: Float): Vec2f {
    return Vec2f(
        this.x / other,
        this.y / other
    )
}

/**
 * The [`x`][Vec2f.x] of a [Vec2f].
 */
public operator fun Vec2f.component1(): Float {
    return this.x
}

/**
 * The [`y`][Vec2f.y] of a [Vec2f].
 */
public operator fun Vec2f.component2(): Float {
    return this.y
}

/**
 * Returns the dot product of a [Vec2f] and a [org.joml.Vector2f]
 */
public fun Vec2f.dot(other: org.joml.Vector2f): Float {
    return (this.x * other.x) + (this.y * other.y)
}

/**
 * Returns the dot product of a [Vec2f] and a [net.minecraft.client.util.math.Vector2f]
 */
public fun Vec2f.dot(other: net.minecraft.client.util.math.Vector2f): Float {
    return (this.x * other.x) + (this.y * other.y)
}

/**
 * Returns the dot product of a [Vec2f] and a [net.minecraft.util.math.Vec2f]
 */
public fun Vec2f.dot(other: net.minecraft.util.math.Vec2f): Float {
    return (this.x * other.x) + (this.y * other.y)
}
//endregion

//region Conversion methods
/**
 * Converts a [Vec2f] to a [org.joml.Vector2f].
 */
public fun Vec2f.toJomlVector2f(): org.joml.Vector2f {
    return Vector2f(
        this.x,
        this.y
    )
}

/**
 * Converts a [Vec2f] to a [net.minecraft.client.util.math.Vector2f].
 */
public fun Vec2f.toMinecraftVector2f(): net.minecraft.client.util.math.Vector2f {
    return Vector2f(
        this.x,
        this.y
    )
}
//endregion