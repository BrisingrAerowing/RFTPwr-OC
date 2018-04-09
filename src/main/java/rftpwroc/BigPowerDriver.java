package rftpwroc;

import li.cil.oc.api.driver.DriverBlock;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import mcjty.lib.api.power.IBigPower;

public class BigPowerDriver implements DriverBlock {
	@Override
	public boolean worksWith(World world, BlockPos blockPos, EnumFacing enumFacing) {
		TileEntity tile = world.getTileEntity(blockPos);

		return tile != null && tile instanceof IBigPower;
	}

	@Override
	public ManagedEnvironment createEnvironment(World world, BlockPos blockPos, EnumFacing enumFacing) {
		IBigPower pwr = (IBigPower)world.getTileEntity(blockPos);
		return new BigPowerEnvironment(pwr);
	}
}
