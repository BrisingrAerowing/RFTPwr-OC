package rftpwroc;

import li.cil.oc.api.Network;
import li.cil.oc.api.network.Visibility;
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
	public Object[] getBigEnergy(final Context context, Arguments arguments)
	{
		return new Object[] {power.getBigEnergy()};
	}

	@Callback(doc = "function():number - Gets the maximum amount of energy")
	public Object[] getBigMaxEnergy(final Context context, Arguments arguments)
	{
		return new Object[] {power.getBigMaxEnergy()};
	}

}
