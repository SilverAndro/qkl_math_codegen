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
 * Divides a [Vec3i] and a [Vec3i].
 */
public operator fun Vec3i.div(other: Vec3i): Vec3i {
    return Vec3i(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z
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
public operator fun Vec3i.plus(other: Vector3i): Vec3i {
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
 * Divides a [org.joml.Vector3i] and a [net.minecraft.util.math.Vec3i].
 */
public operator fun Vec3i.div(other: Vec3i): Vec3i {
    return Vec3i(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z
    )
}

/**
 * Adds a [net.minecraft.util.math.BlockPos] to a [net.minecraft.util.math.Vec3i].
 */
public operator fun Vec3i.plus(other: BlockPos): Vec3i {
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

/**
 * Divides a [net.minecraft.util.math.BlockPos] and a [net.minecraft.util.math.Vec3i].
 */
public operator fun Vec3i.div(other: Vec3i): Vec3i {
    return Vec3i(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z
    )
}

//endregion

//region Vector specific operators
/**
 * The [`x`][Vec3i.x] of a [Vec3i].
 */
public operator fun Vec3i.component1(): Int {
    this.x
}

/**
 * The [`y`][Vec3i.y] of a [Vec3i].
 */
public operator fun Vec3i.component2(): Int {
    this.y
}

/**
 * The [`z`][Vec3i.z] of a [Vec3i].
 */
public operator fun Vec3i.component3(): Int {
    this.z
}

//endregion

