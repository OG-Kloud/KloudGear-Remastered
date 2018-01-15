package kloud;

import kloud.item.ItemHandler;
import kloud.proxy.Common;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KG.ID, name = KG.NAME, version = KG.VER)
public class KG {
	public static final String ID = "hexxitgear", NAME = "Hexxit Gear Revisited", VER = "@Version";
	
	@Mod.Instance
	public static KG instance;
	
	@SidedProxy(serverSide = "kloud.proxy.Common", clientSide = "kloud.proxy.Client")
	public static Common proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	
	public static class ArmorMaterials {
		public static final ArmorMaterial SCALE = EnumHelper.addArmorMaterial("SCALE", ID + ":scale", 1500, new int[]{3,5,4,2}, 
				20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
		public static final ArmorMaterial BONE = EnumHelper.addArmorMaterial("TRIBAL", ":tribal", 1500, new int[]{3, 5, 4, 2},
				20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 5.0F);
		public static final ArmorMaterial CLOTH = EnumHelper.addArmorMaterial("THIEF", ":thief", 1500, new int[]{3, 5, 4, 2},
				20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 5.0F);
	}
	
	public static class CreativeTab {
		public static CreativeTabs kgTab = new KGTab("kloudgear");
	}
	
	private static class KGTab extends CreativeTabs {

		public KGTab(String label) {
			super(label);
		}

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemHandler.tribalHelm);
		}
		
	}

}
