//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import org.joml.Vector3d
import net.minecraft.util.math.Vec3d

//region Standard math operators
/**
 * Adds a [Vector3d] to a [Vector3d].
 */
public operator fun Vector3d.plus(other: Vector3d): Vector3d {
    return Vector3d(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vector3d] from a [Vector3d].
 */
public operator fun Vector3d.minus(other: Vector3d): Vector3d {
    return Vector3d(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vector3d] and a [Vector3d].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector3d.times(other: Vector3d): Vector3d {
    return Vector3d(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Negates a [Vector3d].
 */
public operator fun Vector3d.unaryMinus(): Vector3d {
    return Vector3d(
        -this.x,
        -this.y,
        -this.z
    )
}
//endregion

//region Type compatibility operator variations
/**
 * Adds a [net.minecraft.util.math.Vec3d] to a [org.joml.Vector3d].
 */
public operator fun Vector3d.plus(other: net.minecraft.util.math.Vec3d): Vector3d {
    return Vector3d(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [net.minecraft.util.math.Vec3d] from a [org.joml.Vector3d].
 */
public operator fun Vector3d.minus(other: Vector3d): Vector3d {
    return Vector3d(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [net.minecraft.util.math.Vec3d] and a [org.joml.Vector3d].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector3d.times(other: Vector3d): Vector3d {
    return Vector3d(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vector3d] and a Double.
 */
public operator fun Vector3d.div(other: Double): Vector3d {
    return Vector3d(
        this.x / other,
        this.y / other,
        this.z / other
    )
}

/**
 * The [`x`][Vector3d.x] of a [Vector3d].
 */
public operator fun Vector3d.component1(): Double {
    return this.x
}

/**
 * The [`y`][Vector3d.y] of a [Vector3d].
 */
public operator fun Vector3d.component2(): Double {
    return this.y
}

/**
 * The [`z`][Vector3d.z] of a [Vector3d].
 */
public operator fun Vector3d.component3(): Double {
    return this.z
}

/**
 * Returns the dot product of a [Vector3d] and a [net.minecraft.util.math.Vec3d]
 */
public infix fun Vector3d.dot(other: net.minecraft.util.math.Vec3d): Double {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the dot product of a [Vector3d] and a [org.joml.Vector3d]
 */
public infix fun Vector3d.dot(other: org.joml.Vector3d): Double {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}
//endregion

//region Conversion methods
/**
 * Converts a [Vector3d] to a [Vec3d].
 */
public fun Vector3d.toVec3d(): net.minecraft.util.math.Vec3d {
    return Vec3d(
        this.x,
        this.y,
        this.z
    )
}
//endregion
