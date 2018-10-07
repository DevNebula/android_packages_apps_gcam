package p000;

import android.support.p003v8.renderscript.Allocation;
import android.support.p003v8.renderscript.FieldPacker;
import android.support.p003v8.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: hsd */
public final class hsd {
    /* renamed from: a */
    public static final String f6927a = bli.m887a("RefocusFilter");
    /* renamed from: b */
    public RenderScript f6928b;
    /* renamed from: c */
    public Object f6929c;
    /* renamed from: d */
    public boolean f6930d;
    /* renamed from: e */
    public hsa f6931e;

    private hsd(RenderScript renderScript) {
        this.f6928b = renderScript;
    }

    public hsd(RenderScript renderScript, byte b) {
        this(renderScript);
        this.f6930d = false;
    }

    /* renamed from: a */
    public static int m3387a(int i, hrz hrz) {
        return hsb.m3386a(hrz.mo8077a(i));
    }

    /* renamed from: a */
    public final void mo8083a(int i) {
        hsg hsg = (hsg) this.f6929c;
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i);
        hsg.invoke(1, fieldPacker);
    }

    /* renamed from: b */
    public final void mo8085b(int i, hrz hrz) {
        hsb hsi = new hsi(i, hrz, this.f6928b);
        if (hsi.f20799d > 3.0f) {
            this.f6930d = true;
        } else {
            this.f6930d = false;
        }
        hsg hsg = (hsg) this.f6929c;
        hsh hsh = hsi.f6924c;
        if (hsh == null) {
            hsg.bindAllocation(null, 4);
        } else {
            hsg.bindAllocation(hsh.getAllocation(), 4);
        }
        hsg = (hsg) this.f6929c;
        Allocation allocation = hsi.f20800e;
        if (allocation == null) {
            hsg.bindAllocation(null, 3);
        } else {
            hsg.bindAllocation(allocation, 3);
        }
    }

    /* renamed from: a */
    public final void mo8084a(hsc hsc) {
        hsg hsg = (hsg) this.f6929c;
        int i = hsc.f6925a;
        int i2 = hsc.f6926b;
        FieldPacker fieldPacker = new FieldPacker(8);
        fieldPacker.addI32(i);
        fieldPacker.addI32(i2);
        hsg.invoke(0, fieldPacker);
    }
}
