package com.github.crembluray.minecraftfeastmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelTurkey - CremBluRay
 * Created using Tabula 7.0.1
 */
public class ModelTurkey extends ModelBase {
    public ModelRenderer field_78140_b;
    public ModelRenderer field_78136_f;
    public ModelRenderer field_78139_e;
    public ModelRenderer field_78142_a;
    public ModelRenderer field_78137_g;
    public ModelRenderer shape7;
    public ModelRenderer field_78138_d;
    public ModelRenderer field_78141_c;
    public ModelRenderer field_78143_h;
    public ModelRenderer shape11;

    public ModelTurkey() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78138_d = new ModelRenderer(this, 26, 0);
        this.field_78138_d.setRotationPoint(1.0F, 19.0F, 1.0F);
        this.field_78138_d.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.field_78141_c = new ModelRenderer(this, 26, 0);
        this.field_78141_c.setRotationPoint(-2.0F, 19.0F, 1.0F);
        this.field_78141_c.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.shape11 = new ModelRenderer(this, 40, 10);
        this.shape11.setRotationPoint(-0.1F, 15.7F, 4.5F);
        this.shape11.addBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
        this.field_78140_b = new ModelRenderer(this, 0, 9);
        this.field_78140_b.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.field_78140_b.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(field_78140_b, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78143_h = new ModelRenderer(this, 14, 4);
        this.field_78143_h.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.field_78143_h.addBox(-0.5F, -2.0F, -3.0F, 1, 2, 2, 0.0F);
        this.field_78142_a = new ModelRenderer(this, 0, 0);
        this.field_78142_a.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.field_78142_a.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        this.field_78136_f = new ModelRenderer(this, 24, 13);
        this.field_78136_f.setRotationPoint(4.0F, 13.0F, 0.0F);
        this.field_78136_f.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.shape7 = new ModelRenderer(this, 40, 0);
        this.shape7.setRotationPoint(-0.1F, 9.7F, 4.5F);
        this.shape7.addBox(-4.5F, -0.5F, -0.5F, 9, 6, 1, 0.0F);
        this.field_78139_e = new ModelRenderer(this, 24, 13);
        this.field_78139_e.setRotationPoint(-4.0F, 13.0F, 0.0F);
        this.field_78139_e.addBox(0.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.field_78137_g = new ModelRenderer(this, 14, 0);
        this.field_78137_g.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.field_78137_g.addBox(-1.0F, -4.0F, -4.0F, 2, 2, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78138_d.render(f5);
        this.field_78141_c.render(f5);
        this.shape11.render(f5);
        this.field_78140_b.render(f5);
        this.field_78143_h.render(f5);
        this.field_78142_a.render(f5);
        this.field_78136_f.render(f5);
        this.shape7.render(f5);
        this.field_78139_e.render(f5);
        this.field_78137_g.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
