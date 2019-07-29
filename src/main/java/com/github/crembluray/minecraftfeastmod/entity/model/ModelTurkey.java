package com.github.crembluray.minecraftfeastmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelTurkey extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer leftWing;
    public ModelRenderer rightWing;
    public ModelRenderer feathers;
    public ModelRenderer leftLeg;
    public ModelRenderer rightLeg;
    public ModelRenderer feathersBottom;
    public ModelRenderer head;
    public ModelRenderer beak;
    public ModelRenderer Gizzard;

    public ModelTurkey() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        this.beak = new ModelRenderer(this, 14, 0);
        this.beak.setRotationPoint(0.0F, 0.0F, -0.0F);
        this.beak.addBox(-1.0F, -4.0F, -4.0F, 2, 2, 2, 0.0F);
        this.body = new ModelRenderer(this, 0, 9);
        this.body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.body.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
        this.leftWing = new ModelRenderer(this, 24, 13);
        this.leftWing.setRotationPoint(4.0F, 13.0F, 0.0F);
        this.leftWing.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.Gizzard = new ModelRenderer(this, 14, 4);
        this.Gizzard.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Gizzard.addBox(-0.5F, -2.0F, -3.0F, 1, 2, 2, 0.0F);
        this.leftLeg = new ModelRenderer(this, 26, 0);
        this.leftLeg.setRotationPoint(1.0F, 19.0F, 1.0F);
        this.leftLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.rightWing = new ModelRenderer(this, 24, 13);
        this.rightWing.setRotationPoint(-4.0F, 13.0F, 0.0F);
        this.rightWing.addBox(0.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.feathersBottom = new ModelRenderer(this, 40, 10);
        this.feathersBottom.setRotationPoint(-0.1F, 15.7F, 4.5F);
        this.feathersBottom.addBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.feathers = new ModelRenderer(this, 40, 0);
        this.feathers.setRotationPoint(-0.1F, 9.7F, 4.5F);
        this.feathers.addBox(-4.5F, -0.5F, -0.5F, 9, 6, 1, 0.0F);
        this.rightLeg = new ModelRenderer(this, 26, 0);
        this.rightLeg.setRotationPoint(-2.0F, 19.0F, 1.0F);
        this.rightLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.head.addChild(this.beak);
        this.head.addChild(this.Gizzard);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        if (this.isChild)
        {
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 5.0F * f5, 2.0F * f5);
            this.head.render(f5);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
            this.body.render(f5);
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.rightWing.render(f5);
            this.leftWing.render(f5);
            GlStateManager.popMatrix();
        }
        else
        {
            this.head.render(f5);
            this.body.render(f5);
            this.rightLeg.render(f5);
            this.leftLeg.render(f5);
            this.rightWing.render(f5);
            this.leftWing.render(f5);
        }
        this.feathersBottom.render(f5);
        this.feathers.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rightWing.rotateAngleZ = ageInTicks;
        this.leftWing.rotateAngleZ = -ageInTicks;
    }
}
