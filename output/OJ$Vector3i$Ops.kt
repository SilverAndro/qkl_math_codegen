//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import org.joml.Vector3i

//region Standard math operators
/**
 * Adds a [Vector3i] to a [Vector3i].
 */
public operator fun Vector3i.plus(other: Vector3i): Vector3i {
    return Vector3i(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vector3i] from a [Vector3i].
 */
public operator fun Vector3i.minus(other: Vector3i): Vector3i {
    return Vector3i(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vector3i] and a [Vector3i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector3i.times(other: Vector3i): Vector3i {
    return Vector3i(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Divides a [Vector3i] and a [Vector3i].
 */
public operator fun Vector3i.div(other: Vector3i): Vector3i {
    return Vector3i(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z
    )
}

/**
 * Negates a [Vector3i].
 */
public operator fun Vector3i.unaryMinus(): Vector3i {
    return Vector3i(
        -this.x,
        -this.y,
        -this.z
    )
}

//endregion

//region Type compatibility operator variations
/**
 * Adds a [net.minecraft.util.math.Vec3i] to a [org.joml.Vector3i].
 */
public operator fun Vector3i.plus(other: Vec3i): Vector3i {
    return Vector3i(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [net.minecraft.util.math.Vec3i] from a [org.joml.Vector3i].
 */
public operator fun Vector3i.minus(other: Vector3i): Vector3i {
    return Vector3i(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [net.minecraft.util.math.Vec3i] and a [org.joml.Vector3i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector3i.times(other: Vector3i): Vector3i {
    return Vector3i(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Divides a [net.minecraft.util.math.Vec3i] and a [org.joml.Vector3i].
 */
public operator fun Vector3i.div(other: Vector3i): Vector3i {
    return Vector3i(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z
    )
}

/**
 * Adds a [net.minecraft.util.math.BlockPos] to a [org.joml.Vector3i].
 */
public operator fun Vector3i.plus(other: BlockPos): Vector3i {
    return Vector3i(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [net.minecraft.util.math.BlockPos] from a [org.joml.Vector3i].
 */
public operator fun Vector3i.minus(other: Vector3i): Vector3i {
    return Vector3i(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [net.minecraft.util.math.BlockPos] and a [org.joml.Vector3i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector3i.times(other: Vector3i): Vector3i {
    return Vector3i(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Divides a [net.minecraft.util.math.BlockPos] and a [org.joml.Vector3i].
 */
public operator fun Vector3i.div(other: Vector3i): Vector3i {
    return Vector3i(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z
    )
}

//endregion

