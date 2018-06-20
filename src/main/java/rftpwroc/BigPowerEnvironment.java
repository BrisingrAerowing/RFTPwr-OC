package rftpwroc;

import li.cil.oc.api.prefab.AbstractManagedEnvironment;
import li.cil.oc.api.driver.NamedBlock;
import mcjty.lib.api.power.IBigPower;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;

public class BigPowerEnvironment extends AbstractManagedEnvironment implements NamedBlock {

	private IBigPower power;

	public BigPowerEnvironment(IBigPower power)
	{
		this.power = power;
	}

	@Override
	public String preferredName() {
		return "big_power";
	}

	@Override
	public int priority() {
		return 5;
	}

	@Callback(doc = "function():number - Gets the amount of energy stored.")
	public  Object[] getStoredPower(final Context context, Arguments arguments)
	{
		return new Object[] {(double)power.getStoredPower() };
	}

	@Callback(doc = "function():number - Gets the maximum amount of energy that can be stored.")
	public Object[] getCapacity(final Context context, Arguments arguments)
	{
		return new Object[] {(double)power.getCapacity()};
	}

	@Deprecated
	@Callback(doc = "function():number - Gets the amount of energy stored. Deprecated. Use getStoredPower instead ")
	public Object[] getBigEnergy(final Context context, Arguments arguments)
	{
		return new Object[] {(double)power.getStoredPower()};
	}

	@Deprecated
	@Callback(doc = "function():number - Gets the maximum amount of energy. Deprecated. Use getCapacity instead.")
	public Object[] getBigMaxEnergy(final Context context, Arguments arguments)
	{
		return new Object[] {(double)power.getCapacity()};
	}

}
