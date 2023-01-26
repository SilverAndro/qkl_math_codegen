//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import net.minecraft.util.math.Vec3i
import org.joml.Vector3i
import net.minecraft.util.math.BlockPos

//region Standard math operators
/**
 * Adds a [Vec3i] to a [Vec3i].
 */
public operator fun Vec3i.plus(other: Vec3i): Vec3i {
    return Vec3i(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vec3i] from a [Vec3i].
 */
public operator fun Vec3i.minus(other: Vec3i): Vec3i {
    return Vec3i(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vec3i] and a [Vec3i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec3i.times(other: Vec3i): Vec3i {
    return Vec3i(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Negates a [Vec3i].
 */
public operator fun Vec3i.unaryMinus(): Vec3i {
    return Vec3i(
        -this.x,
        -this.y,
        -this.z
    )
}
//endregion

//region Type compatibility operator variations
/**
 * Adds a [org.joml.Vector3i] to a [net.minecraft.util.math.Vec3i].
 */
public operator fun Vec3i.plus(other: org.joml.Vector3i): Vec3i {
    return Vec3i(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [org.joml.Vector3i] from a [net.minecraft.util.math.Vec3i].
 */
public operator fun Vec3i.minus(other: Vec3i): Vec3i {
    return Vec3i(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [org.joml.Vector3i] and a [net.minecraft.util.math.Vec3i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec3i.times(other: Vec3i): Vec3i {
    return Vec3i(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Adds a [net.minecraft.util.math.BlockPos] to a [net.minecraft.util.math.Vec3i].
 */
public operator fun Vec3i.plus(other: net.minecraft.util.math.BlockPos): Vec3i {
    return Vec3i(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [net.minecraft.util.math.BlockPos] from a [net.minecraft.util.math.Vec3i].
 */
public operator fun Vec3i.minus(other: Vec3i): Vec3i {
    return Vec3i(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [net.minecraft.util.math.BlockPos] and a [net.minecraft.util.math.Vec3i].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vec3i.times(other: Vec3i): Vec3i {
    return Vec3i(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [Vec3i] and an Int.
 */
public operator fun Vec3i.div(other: Int): Vec3i {
    return Vec3i(
        this.x / other,
        this.y / other,
        this.z / other
    )
}

/**
 * The [`x`][Vec3i.x] of a [Vec3i].
 */
public operator fun Vec3i.component1(): Int {
    return this.x
}

/**
 * The [`y`][Vec3i.y] of a [Vec3i].
 */
public operator fun Vec3i.component2(): Int {
    return this.y
}

/**
 * The [`z`][Vec3i.z] of a [Vec3i].
 */
public operator fun Vec3i.component3(): Int {
    return this.z
}

/**
 * Returns the dot product of a [Vec3i] and a [org.joml.Vector3i]
 */
public infix fun Vec3i.dot(other: org.joml.Vector3i): Int {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the dot product of a [Vec3i] and a [net.minecraft.util.math.BlockPos]
 */
public infix fun Vec3i.dot(other: net.minecraft.util.math.BlockPos): Int {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the dot product of a [Vec3i] and a [net.minecraft.util.math.Vec3i]
 */
public infix fun Vec3i.dot(other: net.minecraft.util.math.Vec3i): Int {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}
//endregion

//region Conversion methods
/**
 * Converts a [Vec3i] to a [org.joml.Vector3i].
 */
public fun Vec3i.toVector3i(): org.joml.Vector3i {
    return Vector3i(
        this.x,
        this.y,
        this.z
    )
}

/**
 * Converts a [Vec3i] to a [net.minecraft.util.math.BlockPos].
 */
public fun Vec3i.toBlockPos(): net.minecraft.util.math.BlockPos {
    return BlockPos(
        this.x,
        this.y,
        this.z
    )
}
//endregion
