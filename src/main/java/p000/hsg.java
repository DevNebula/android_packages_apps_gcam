package p000;

import android.support.p003v8.renderscript.Element;
import android.support.p003v8.renderscript.FieldPacker;
import android.support.p003v8.renderscript.RenderScript;
import android.support.p003v8.renderscript.ScriptC;

/* compiled from: PG */
/* renamed from: hsg */
public final class hsg extends ScriptC {
    /* renamed from: a */
    public Element f26500a;

    public hsg(RenderScript renderScript) {
        Object obj = new byte[hsj.f6941a];
        Object a = hsj.m3392a();
        int length = a.length;
        System.arraycopy(a, 0, obj, 0, length);
        a = hsj.m3393b();
        int length2 = a.length;
        System.arraycopy(a, 0, obj, length, length2);
        a = hsj.m3394c();
        System.arraycopy(a, 0, obj, length + length2, a.length);
        a = new byte[hsj.f6942b];
        Object d = hsj.m3395d();
        length2 = d.length;
        System.arraycopy(d, 0, a, 0, length2);
        d = hsj.m3396e();
        int length3 = d.length;
        System.arraycopy(d, 0, a, length2, length3);
        d = hsj.m3397f();
        System.arraycopy(d, 0, a, length2 + length3, d.length);
        super(renderScript, "layered_filter_fast_f32", obj, a);
        this.f26500a = Element.U8_4(renderScript);
    }

    /* renamed from: a */
    public final void mo15549a(int i) {
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i);
        invoke(2, fieldPacker);
    }
}
