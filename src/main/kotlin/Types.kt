import data.MathType

val types = buildList {
    //
    // JOML
    //

    add(MathType(
        "org.joml.Vector2d",
        MathType.Components.XY,
        MathType.BackingType.DOUBLE
    ))
    add(MathType(
        "org.joml.Vector2f",
        MathType.Components.XY,
        MathType.BackingType.FLOAT
    ))
    add(MathType(
        "org.joml.Vector2i",
        MathType.Components.XY,
        MathType.BackingType.INT
    ))
    add(MathType(
        "org.joml.Vector3f",
        MathType.Components.XYZ,
        MathType.BackingType.FLOAT
    ))
    add(MathType(
        "org.joml.Vector3d",
        MathType.Components.XYZ,
        MathType.BackingType.DOUBLE
    ))
    add(MathType(
        "org.joml.Vector3i",
        MathType.Components.XYZ,
        MathType.BackingType.INT
    ))
    add(MathType(
        "org.joml.Vector4f",
        MathType.Components.XYZW,
        MathType.BackingType.FLOAT
    ))
    add(MathType(
        "org.joml.Vector4d",
        MathType.Components.XYZW,
        MathType.BackingType.DOUBLE
    ))
    add(MathType(
        "org.joml.Vector4i",
        MathType.Components.XYZW,
        MathType.BackingType.INT
    ))

    //
    // Minecraft
    //

    add(MathType(
        "net.minecraft.util.math.Vec2f",
        MathType.Components.XY,
        MathType.BackingType.FLOAT
    ))
    add(MathType(
        "net.minecraft.util.math.Vec3d",
        MathType.Components.XYZ,
        MathType.BackingType.DOUBLE
    ))
    add(MathType(
        "net.minecraft.util.math.Vec3i",
        MathType.Components.XYZ,
        MathType.BackingType.INT
    ))
    add(MathType(
        "net.minecraft.util.math.BlockPos",
        MathType.Components.XYZ,
        MathType.BackingType.INT
    ))
    add(MathType(
        "net.minecraft.client.util.math.Vector2f",
        MathType.Components.XY,
        MathType.BackingType.FLOAT
    ))
}

fun canOperateWith(typeA: MathType, typeB: MathType): Boolean {
    return typeA != typeB && typeA.components == typeB.components && typeA.backingType == typeB.backingType
}

fun component(index: Int) = arrayOf('x', 'y', 'z', 'w')[index]