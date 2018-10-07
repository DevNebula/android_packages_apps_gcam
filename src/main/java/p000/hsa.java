package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p003v8.renderscript.Allocation;
import android.support.p003v8.renderscript.Element;
import android.support.p003v8.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: hsa */
public final class hsa {
    /* renamed from: a */
    public Bitmap f6912a;
    /* renamed from: b */
    public Bitmap f6913b;
    /* renamed from: c */
    public Allocation f6914c;
    /* renamed from: d */
    public Allocation f6915d;
    /* renamed from: e */
    public int f6916e;
    /* renamed from: f */
    public int f6917f;
    /* renamed from: g */
    public int f6918g;
    /* renamed from: h */
    private Allocation f6919h;
    /* renamed from: i */
    private Allocation f6920i;
    /* renamed from: j */
    private Allocation f6921j;

    private hsa(Bitmap bitmap, int i, RenderScript renderScript) {
        this.f6912a = bitmap;
        this.f6914c = Allocation.createFromBitmap(renderScript, this.f6912a);
        this.f6913b = Bitmap.createBitmap(this.f6912a.getWidth(), this.f6912a.getHeight(), Config.ARGB_8888);
        this.f6915d = Allocation.createFromBitmap(renderScript, this.f6913b);
        this.f6918g = i;
        int i2 = i + i;
        this.f6916e = this.f6912a.getWidth() + i2;
        this.f6917f = i2 + this.f6912a.getHeight();
    }

    public hsa(Bitmap bitmap, int i, RenderScript renderScript, hsg hsg) {
        this(bitmap, i, renderScript);
        this.f6919h = Allocation.createSized(renderScript, Element.F32_4(renderScript), this.f6916e * this.f6917f);
        this.f6920i = Allocation.createSized(renderScript, Element.F32_4(renderScript), this.f6916e * this.f6917f);
        this.f6921j = Allocation.createSized(renderScript, Element.F32_4(renderScript), this.f6916e * this.f6917f);
        Allocation allocation = this.f6919h;
        if (allocation == null) {
            hsg.bindAllocation(null, 0);
        } else {
            hsg.bindAllocation(allocation, 0);
        }
        allocation = this.f6920i;
        if (allocation == null) {
            hsg.bindAllocation(null, 1);
        } else {
            hsg.bindAllocation(allocation, 1);
        }
        allocation = this.f6921j;
        if (allocation == null) {
            hsg.bindAllocation(null, 2);
        } else {
            hsg.bindAllocation(allocation, 2);
        }
    }
}
