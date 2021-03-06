package com.brand.netherthings.blocks.Crops.Fertilizable;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public interface WitherFertilizable {
	
	   boolean isFertilizable(BlockView var1, BlockPos var2, BlockState var3, boolean var4);

	   boolean canGrow(World var1, Random var2, BlockPos var3, BlockState var4);

	   void grow(World var1, Random var2, BlockPos var3, BlockState var4);
	}
