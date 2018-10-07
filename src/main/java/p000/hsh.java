package p000;

import android.support.p003v8.renderscript.Element;
import android.support.p003v8.renderscript.Element.Builder;
import android.support.p003v8.renderscript.FieldPacker;
import android.support.p003v8.renderscript.RenderScript;
import android.support.p003v8.renderscript.Script.FieldBase;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: hsh */
public final class hsh extends FieldBase {
    /* renamed from: a */
    private hvy[] f20797a = null;
    /* renamed from: b */
    private FieldPacker f20798b = null;

    static {
        WeakReference weakReference = new WeakReference(null);
    }

    public hsh(RenderScript renderScript, int i) {
        Builder builder = new Builder(renderScript);
        builder.add(Element.I32(renderScript), "offset");
        builder.add(Element.I32(renderScript), "radius_x");
        builder.add(Element.I32(renderScript), "radius_y");
        this.mElement = builder.create();
        init(renderScript, i);
    }

    /* renamed from: a */
    public final synchronized int mo13561a(int i) {
        int i2;
        hvy[] hvyArr = this.f20797a;
        if (hvyArr == null) {
            i2 = 0;
        } else {
            i2 = hvyArr[i].f7119a;
        }
        return i2;
    }

    /* renamed from: a */
    public final synchronized void mo13562a(int i, int i2) {
        if (this.f20798b == null) {
            this.f20798b = new FieldPacker(this.mElement.getBytesSize() * getType().getX());
        }
        if (this.f20797a == null) {
            this.f20797a = new hvy[getType().getX()];
        }
        hvy[] hvyArr = this.f20797a;
        if (hvyArr[i] == null) {
            hvyArr[i] = new hvy();
        }
        this.f20797a[i].f7119a = i2;
        this.f20798b.reset(this.mElement.getBytesSize() * i);
        this.f20798b.addI32(i2);
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i2);
        this.mAllocation.setFromFieldPacker(i, 0, fieldPacker);
    }

    /* renamed from: b */
    public final synchronized void mo13563b(int i, int i2) {
        if (this.f20798b == null) {
            this.f20798b = new FieldPacker(this.mElement.getBytesSize() * getType().getX());
        }
        if (this.f20797a == null) {
            this.f20797a = new hvy[getType().getX()];
        }
        hvy[] hvyArr = this.f20797a;
        if (hvyArr[i] == null) {
            hvyArr[i] = new hvy();
        }
        this.f20798b.reset((this.mElement.getBytesSize() * i) + 4);
        this.f20798b.addI32(i2);
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i2);
        this.mAllocation.setFromFieldPacker(i, 1, fieldPacker);
    }

    /* renamed from: c */
    public final synchronized void mo13564c(int i, int i2) {
        if (this.f20798b == null) {
            this.f20798b = new FieldPacker(this.mElement.getBytesSize() * getType().getX());
        }
        if (this.f20797a == null) {
            this.f20797a = new hvy[getType().getX()];
        }
        hvy[] hvyArr = this.f20797a;
        if (hvyArr[i] == null) {
            hvyArr[i] = new hvy();
        }
        this.f20798b.reset((this.mElement.getBytesSize() * i) + 8);
        this.f20798b.addI32(i2);
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i2);
        this.mAllocation.setFromFieldPacker(i, 2, fieldPacker);
    }
}
