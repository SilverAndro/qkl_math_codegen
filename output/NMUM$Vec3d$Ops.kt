//
// DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
//

package org.quiltmc.qkl.library.math

import net.minecraft.util.math.Vec3d

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
 */
public operator fun Vec3d.times(other: Vec3d): Vec3d {
    return Vec3d(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Divides a [Vec3d] and a [Vec3d].
 */
public operator fun Vec3d.div(other: Vec3d): Vec3d {
    return Vec3d(
        this.x / other.x,
        this.y / other.y,
        this.z / other.z
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

