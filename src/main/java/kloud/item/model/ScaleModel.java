package kloud.item.model;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ScaleModel extends ArmorModel {

	ModelRenderer head;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    
	public ScaleModel(EntityEquipmentSlot slot) {
		super(slot);
		
		this.textureWidth = 64;
		this.textureHeight = 64;
		
		head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 0, 16);
        Shape1.addBox(-5F, -9F, -5F, 10, 9, 10);
        Shape1.setRotationPoint(0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 24, 0);
        Shape2.addBox(-6F, -7F, -2F, 1, 5, 3);
        Shape2.setRotationPoint(0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 4, 20);
        Shape3.addBox(-7F, -8F, 0F, 1, 4, 2);
        Shape3.setRotationPoint(0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 2, 2);
        Shape4.addBox(-9F, -9F, 2F, 2, 1, 1);
        Shape4.setRotationPoint(0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 4, 4);
        Shape5.addBox(-8F, -8F, 1F, 1, 3, 1);
        Shape5.setRotationPoint(0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 2, 2);
        Shape6.addBox(-9F, -7F, 2F, 2, 1, 1);
        Shape6.setRotationPoint(0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 24, 0);
        Shape7.addBox(5F, -7F, -2F, 1, 5, 3);
        Shape7.setRotationPoint(0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 4, 20);
        Shape8.addBox(6F, -8F, 0F, 1, 4, 2);
        Shape8.setRotationPoint(0F, 0F, 0F);
        Shape9 = new ModelRenderer(this, 4, 4);
        Shape9.addBox(7F, -9F, 1F, 1, 3, 1);
        Shape9.setRotationPoint(0F, 1F, 0F);
        Shape10 = new ModelRenderer(this, 2, 2);
        Shape10.addBox(7F, -9F, 2F, 2, 1, 1);
        Shape10.setRotationPoint(0F, 0F, 0F);
        Shape11 = new ModelRenderer(this, 2, 2);
        Shape11.addBox(7F, -7F, 2F, 2, 1, 1);
        Shape11.setRotationPoint(0F, 0F, 0F);
        
        Shape1.addChild(head);
        Shape1.addChild(Shape2);
        Shape1.addChild(Shape3);
        Shape1.addChild(Shape4);
        Shape1.addChild(Shape5);
        Shape1.addChild(Shape6);
        Shape1.addChild(Shape7);
        Shape1.addChild(Shape8);
        Shape1.addChild(Shape9);
        Shape1.addChild(Shape10);
        Shape1.addChild(Shape11);
        
	}
	
	@Override
	public void render(@Nonnull Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		Shape1.showModel = slot == EntityEquipmentSlot.HEAD;
		this.bipedHead = Shape1;
		this.bipedHeadwear.showModel = false;

		
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

}
