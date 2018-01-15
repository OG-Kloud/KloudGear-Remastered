package kloud.item.model;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;

public class SkullModel extends ArmorModel {
	
    ModelRenderer head;
    ModelRenderer Shape4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;

	public SkullModel(EntityEquipmentSlot slot) {
		super(slot);
		
		textureWidth = 64;
        textureHeight = 32;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 25, 0);
        Shape1.addBox(-7F, -7F, 0F, 3, 2, 2);
        Shape1.setRotationPoint(0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 25, 5);
        Shape2.addBox(6F, -8F, 0F, 1, 1, 1);
        Shape2.setRotationPoint(0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 25, 5);
        Shape3.addBox(-7F, -8F, 0F, 1, 1, 1);
        Shape3.setRotationPoint(0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 25, 0);
        Shape4.addBox(4F, -7F, 0F, 3, 2, 2);
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
