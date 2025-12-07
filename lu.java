import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class lu extends lm {
   private static ab d = new ab();
   private List e = new ArrayList();
   private Random f = new Random();
   private Minecraft g;
   public String a = null;
   private int h = 0;
   private String i = "";
   private int j = 0;
   public float b;
   float c = 1.0F;

   public lu(Minecraft var1) {
      this.g = var1;
   }

   public void a(float var1, boolean var2, int var3, int var4) {
      iy var5 = new iy(this.g.c, this.g.d);
      int var6 = var5.a();
      int var7 = var5.b();
      kd var8 = this.g.o;
      this.g.r.b();
      GL11.glEnable(3042);
      if (this.g.y.i) {
         this.a(this.g.g.a(var1), var6, var7);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBindTexture(3553, this.g.n.a("/gui/gui.png"));
      eu var9 = this.g.g.b;
      this.k = -90.0F;
      this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
      this.b(var6 / 2 - 91 - 1 + var9.d * 20, var7 - 22 - 1, 0, 22, 24, 22);
      GL11.glBindTexture(3553, this.g.n.a("/gui/icons.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(775, 769);
      this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
      GL11.glDisable(3042);
      boolean var10 = this.g.g.aW / 3 % 2 == 1;
      if (this.g.g.aW < 10) {
         var10 = false;
      }

      int var11 = this.g.g.E;
      int var12 = this.g.g.F;
      this.f.setSeed((long)(this.h * 312871));
      if (this.g.b.d()) {
         int var13 = this.g.g.m();

         for(int var14 = 0; var14 < 10; ++var14) {
            int var15 = var7 - 32;
            if (var13 > 0) {
               int var16 = var6 / 2 + 91 - var14 * 8 - 9;
               if (var14 * 2 + 1 < var13) {
                  this.b(var16, var15, 34, 9, 9, 9);
               }

               if (var14 * 2 + 1 == var13) {
                  this.b(var16, var15, 25, 9, 9, 9);
               }

               if (var14 * 2 + 1 > var13) {
                  this.b(var16, var15, 16, 9, 9, 9);
               }
            }

            byte var35 = 0;
            if (var10) {
               var35 = 1;
            }

            int var17 = var6 / 2 - 91 + var14 * 8;
            if (var11 <= 4) {
               var15 += this.f.nextInt(2);
            }

            this.b(var17, var15, 16 + var35 * 9, 0, 9, 9);
            if (var10) {
               if (var14 * 2 + 1 < var12) {
                  this.b(var17, var15, 70, 0, 9, 9);
               }

               if (var14 * 2 + 1 == var12) {
                  this.b(var17, var15, 79, 0, 9, 9);
               }
            }

            if (var14 * 2 + 1 < var11) {
               this.b(var17, var15, 52, 0, 9, 9);
            }

            if (var14 * 2 + 1 == var11) {
               this.b(var17, var15, 61, 0, 9, 9);
            }
         }

         if (this.g.g.a((gb)gb.f)) {
            int var26 = (int)Math.ceil((double)(this.g.g.aX - 2) * (double)10.0F / (double)300.0F);
            int var30 = (int)Math.ceil((double)this.g.g.aX * (double)10.0F / (double)300.0F) - var26;

            for(int var36 = 0; var36 < var26 + var30; ++var36) {
               if (var36 < var26) {
                  this.b(var6 / 2 - 91 + var36 * 8, var7 - 32 - 9, 16, 18, 9, 9);
               } else {
                  this.b(var6 / 2 - 91 + var36 * 8, var7 - 32 - 9, 25, 18, 9, 9);
               }
            }
         }
      }

      GL11.glDisable(3042);
      GL11.glEnable(32826);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      i.b();
      GL11.glPopMatrix();

      for(int var22 = 0; var22 < 9; ++var22) {
         int var27 = var6 / 2 - 90 + var22 * 20 + 2;
         int var31 = var7 - 16 - 3;
         this.a(var22, var27, var31, var1);
      }

      i.a();
      GL11.glDisable(32826);
      if (Keyboard.isKeyDown(61)) {
         var8.a("Minecraft Alpha v1.1.2_01 (" + this.g.G + ")", 2, 2, 16777215);
         var8.a(this.g.l(), 2, 12, 16777215);
         var8.a(this.g.m(), 2, 22, 16777215);
         var8.a(this.g.n(), 2, 32, 16777215);
         long var23 = Runtime.getRuntime().maxMemory();
         long var32 = Runtime.getRuntime().totalMemory();
         long var41 = Runtime.getRuntime().freeMemory();
         long var19 = var32 - var41;
         String var21 = "Used memory: " + var19 * 100L / var23 + "% (" + var19 / 1024L / 1024L + "MB) of " + var23 / 1024L / 1024L + "MB";
         this.b(var8, var21, var6 - var8.a(var21) - 2, 2, 14737632);
         var21 = "Allocated memory: " + var32 * 100L / var23 + "% (" + var32 / 1024L / 1024L + "MB)";
         this.b(var8, var21, var6 - var8.a(var21) - 2, 12, 14737632);
      } else {
         var8.a("Minecraft Alpha v1.1.2_01", 2, 2, 16777215);
      }

      if (this.j > 0) {
         float var24 = (float)this.j - var1;
         int var28 = (int)(var24 * 256.0F / 20.0F);
         if (var28 > 255) {
            var28 = 255;
         }

         if (var28 > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            int var33 = Color.HSBtoRGB(var24 / 50.0F, 0.7F, 0.6F) & 16777215;
            var8.b(this.i, -var8.a(this.i) / 2, -4, var33 + (var28 << 24));
            GL11.glDisable(3042);
            GL11.glPopMatrix();
         }
      }

      byte var25 = 10;
      boolean var29 = false;
      if (this.g.p instanceof de) {
         var25 = 20;
         var29 = true;
      }

      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);

      for(int var34 = 0; var34 < this.e.size() && var34 < var25; ++var34) {
         if (((ko)this.e.get(var34)).b < 200 || var29) {
            double var37 = (double)((ko)this.e.get(var34)).b / (double)200.0F;
            var37 = (double)1.0F - var37;
            var37 *= (double)10.0F;
            if (var37 < (double)0.0F) {
               var37 = (double)0.0F;
            }

            if (var37 > (double)1.0F) {
               var37 = (double)1.0F;
            }

            var37 *= var37;
            int var18 = (int)((double)255.0F * var37);
            if (var29) {
               var18 = 255;
            }

            if (var18 > 0) {
               byte var42 = 2;
               int var20 = -var34 * 9;
               String var44 = ((ko)this.e.get(var34)).a;
               this.a(var42, var20 - 1, var42 + 320, var20 + 8, var18 / 2 << 24);
               GL11.glEnable(3042);
               var8.a(var44, var42, var20, 16777215 + (var18 << 24));
            }
         }
      }

      GL11.glPopMatrix();
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   private void a(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.c = (float)((double)this.c + (double)(var1 - this.c) * 0.01);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(0, 769);
      GL11.glColor4f(this.c, this.c, this.c, 1.0F);
      GL11.glBindTexture(3553, this.g.n.a("/misc/vignette.png"));
      ho var4 = ho.a;
      var4.b();
      var4.a((double)0.0F, (double)var3, (double)-90.0F, (double)0.0F, (double)1.0F);
      var4.a((double)var2, (double)var3, (double)-90.0F, (double)1.0F, (double)1.0F);
      var4.a((double)var2, (double)0.0F, (double)-90.0F, (double)1.0F, (double)0.0F);
      var4.a((double)0.0F, (double)0.0F, (double)-90.0F, (double)0.0F, (double)0.0F);
      var4.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBlendFunc(770, 771);
   }

   private void a(int var1, int var2, int var3, float var4) {
      ev var5 = this.g.g.b.a[var1];
      if (var5 != null) {
         float var6 = (float)var5.b - var4;
         if (var6 > 0.0F) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
         }

         d.a(this.g.o, this.g.n, var5, var2, var3);
         if (var6 > 0.0F) {
            GL11.glPopMatrix();
         }

         d.b(this.g.o, this.g.n, var5, var2, var3);
      }
   }

   public void a() {
      if (this.j > 0) {
         --this.j;
      }

      ++this.h;

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         ++((ko)this.e.get(var1)).b;
      }

   }

   public void a(String var1) {
      while(this.g.o.a(var1) > 320) {
         int var2;
         for(var2 = 1; var2 < var1.length() && this.g.o.a(var1.substring(0, var2 + 1)) <= 320; ++var2) {
         }

         this.a(var1.substring(0, var2));
         var1 = var1.substring(var2);
      }

      this.e.add(0, new ko(var1));

      while(this.e.size() > 50) {
         this.e.remove(this.e.size() - 1);
      }

   }

   public void b(String var1) {
      this.i = "Now playing: " + var1;
      this.j = 60;
   }
}
