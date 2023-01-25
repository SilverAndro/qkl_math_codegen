import data.MathType

val types = buildList {
    //
    // JOML
    //

    add(MathType(
        "org.joml.Vector2d",
        MathType.Components.XY,
        MathType.BackingType.DOUBLE,
        false
    ))
    add(MathType(
        "org.joml.Vector2f",
        MathType.Components.XY,
        MathType.BackingType.FLOAT,
        false
    ))
    add(MathType(
        "org.joml.Vector2i",
        MathType.Components.XY,
        MathType.BackingType.INT,
        false
    ))
    add(MathType(
        "org.joml.Vector3f",
        MathType.Components.XYZ,
        MathType.BackingType.FLOAT,
        false
    ))
    add(MathType(
        "org.joml.Vector3d",
        MathType.Components.XYZ,
        MathType.BackingType.DOUBLE,
        false
    ))
    add(MathType(
        "org.joml.Vector3i",
        MathType.Components.XYZ,
        MathType.BackingType.INT,
        false
    ))
    add(MathType(
        "org.joml.Vector4f",
        MathType.Components.XYZW,
        MathType.BackingType.FLOAT,
        false
    ))
    add(MathType(
        "org.joml.Vector4d",
        MathType.Components.XYZW,
        MathType.BackingType.DOUBLE,
        false
    ))
    add(MathType(
        "org.joml.Vector4i",
        MathType.Components.XYZW,
        MathType.BackingType.INT,
        false
    ))

    //
    // Minecraft
    //

    add(MathType(
        "net.minecraft.util.math.Vec2f",
        MathType.Components.XY,
        MathType.BackingType.FLOAT,
        false
    ))
    add(MathType(
        "net.minecraft.util.math.Vec3d",
        MathType.Components.XYZ,
        MathType.BackingType.DOUBLE,
        false
    ))
    add(MathType(
        "net.minecraft.util.math.Vec3i",
        MathType.Components.XYZ,
        MathType.BackingType.INT,
        false
    ))
    add(MathType(
        "net.minecraft.util.math.BlockPos",
        MathType.Components.XYZ,
        MathType.BackingType.INT,
        false
    ))
    add(MathType(
        "net.minecraft.client.util.math.Vector2f",
        MathType.Components.XY,
        MathType.BackingType.FLOAT,
        false
    ))
}

fun canOperateWith(typeA: MathType, typeB: MathType) {

}