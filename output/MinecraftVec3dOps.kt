//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import net.minecraft.util.math.Vec3d
import org.joml.Vector3d

//region Standard math operators
/**
 * Adds a [Vec3d] to a [Vec3d].
 */
public operator fun Vec3d.plus(other: Vec3d): Vec3d {
    return Vec3d(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vec3d] from a [Vec3d].
 */
public operator fun Vec3d.minus(other: Vec3d): Vec3d {
    return Vec3d(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vec3d] and a [Vec3d].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec3d.times(other: Vec3d): Vec3d {
    return Vec3d(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Negates a [Vec3d].
 */
public operator fun Vec3d.unaryMinus(): Vec3d {
    return Vec3d(
        -this.x,
        -this.y,
        -this.z
    )
}
//endregion

//region Type compatibility operator variations
/**
 * Adds a [org.joml.Vector3d] to a [net.minecraft.util.math.Vec3d].
 */
public operator fun Vec3d.plus(other: org.joml.Vector3d): Vec3d {
    return Vec3d(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [org.joml.Vector3d] from a [net.minecraft.util.math.Vec3d].
 */
public operator fun Vec3d.minus(other: Vec3d): Vec3d {
    return Vec3d(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [org.joml.Vector3d] and a [net.minecraft.util.math.Vec3d].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec3d.times(other: Vec3d): Vec3d {
    return Vec3d(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vec3d] and a Double.
 */
public operator fun Vec3d.div(other: Double): Vec3d {
    return Vec3d(
        this.x / other,
        this.y / other,
        this.z / other
    )
}

/**
 * The [`x`][Vec3d.x] of a [Vec3d].
 */
public operator fun Vec3d.component1(): Double {
    return this.x
}

/**
 * The [`y`][Vec3d.y] of a [Vec3d].
 */
public operator fun Vec3d.component2(): Double {
    return this.y
}

/**
 * The [`z`][Vec3d.z] of a [Vec3d].
 */
public operator fun Vec3d.component3(): Double {
    return this.z
}

/**
 * Returns the dot product of a [Vec3d] and a [org.joml.Vector3d]
 */
public fun Vec3d.dot(other: org.joml.Vector3d): Double {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the dot product of a [Vec3d] and a [net.minecraft.util.math.Vec3d]
 */
public fun Vec3d.dot(other: net.minecraft.util.math.Vec3d): Double {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}
//endregion

//region Conversion methods
/**
 * Converts a [Vec3d] to a [org.joml.Vector3d].
 */
public fun Vec3d.toVector3d(): org.joml.Vector3d {
    return Vector3d(
        this.x,
        this.y,
        this.z
    )
}
//endregion
