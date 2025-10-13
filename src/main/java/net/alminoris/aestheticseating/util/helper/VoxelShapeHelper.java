package net.alminoris.aestheticseating.util.helper;

import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class VoxelShapeHelper
{
    public static VoxelShape rotateShape(List<AABB> boxes, Direction facing)
    {
        List<VoxelShape> rotatedShapes = new ArrayList<>();

        for (AABB originalBox : boxes)
        {
            VoxelShape rotatedShape;

            double minX = originalBox.minX;
            double minY = originalBox.minY;
            double minZ = originalBox.minZ;
            double maxX = originalBox.maxX;
            double maxY = originalBox.maxY;
            double maxZ = originalBox.maxZ;

            switch (facing)
            {
                case NORTH -> rotatedShape = Shapes.box(minX, minY, minZ, maxX, maxY, maxZ);

                case SOUTH -> rotatedShape = Shapes.box(
                        1 - maxX, minY, 1 - maxZ,
                        1 - minX, maxY, 1 - minZ
                );

                case WEST -> rotatedShape = Shapes.box(
                        minZ, minY, 1 - maxX,
                        maxZ, maxY, 1 - minX
                );

                case EAST -> rotatedShape = Shapes.box(
                        1 - maxZ, minY, minX,
                        1 - minZ, maxY, maxX
                );

                default -> rotatedShape = Shapes.box(minX, minY, minZ, maxX, maxY, maxZ);
            }

            rotatedShape = ensureValidBox(rotatedShape);
            rotatedShapes.add(rotatedShape);
        }

        VoxelShape finalShape = Shapes.empty();
        for (VoxelShape shape : rotatedShapes)
        {
            finalShape = Shapes.or(finalShape, shape);
        }

        return finalShape;
    }

    private static VoxelShape ensureValidBox(VoxelShape shape)
    {
        AABB box = shape.bounds();

        double minX = Math.min(box.minX, box.maxX);
        double maxX = Math.max(box.minX, box.maxX);
        double minY = Math.min(box.minY, box.maxY);
        double maxY = Math.max(box.minY, box.maxY);
        double minZ = Math.min(box.minZ, box.maxZ);
        double maxZ = Math.max(box.minZ, box.maxZ);

        return Shapes.box(minX, minY, minZ, maxX, maxY, maxZ);
    }
}
