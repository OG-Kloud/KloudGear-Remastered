package kloud.item.model;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;

public class HoodModel extends ArmorModel {
	
	ModelRenderer head;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;

	public HoodModel(EntityEquipmentSlot slot) {
		super(slot);
		
		textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -7.5F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 48, 0);
        Shape1.addBox(-3.5F, -8.8F, 5F, 7, 5, 1);
        Shape1.setRotationPoint(0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 48, 6);
        Shape2.addBox(-3F, -8.6F, 6F, 6, 3, 1);
        Shape2.setRotationPoint(0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 48, 11);
        Shape3.addBox(-1.333333F, -8.5F, 7F, 3, 1, 1);
        Shape3.setRotationPoint(0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 0, 33);
        Shape4.addBox(-5F, -9F, -5F, 10, 9, 10);
        Shape4.setRotationPoint(0F, 0F, 0F);
        
        Shape1.addChild(head);
        Shape1.addChild(Shape2);
        Shape1.addChild(Shape3);
        Shape1.addChild(Shape4);
	}
	
	@Override
	public void render(@Nonnull Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		Shape1.showModel = slot == EntityEquipmentSlot.HEAD;
		this.bipedHead = Shape1;
		this.bipedHeadwear.showModel = false;

		
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

}
