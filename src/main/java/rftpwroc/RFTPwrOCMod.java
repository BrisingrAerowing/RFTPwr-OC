package rftpwroc;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import li.cil.oc.api.Driver;

@Mod(modid =  RFTPwrOCMod.MODID, name = RFTPwrOCMod.NAME, version = RFTPwrOCMod.VERSION)
public class RFTPwrOCMod {
	public  static final String MODID = "rftpwroc";
	public static final String NAME = "RFTools Power Compat for OC";
	public static final String VERSION = "0.1";

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Driver.add(new BigPowerDriver());
	}

}
