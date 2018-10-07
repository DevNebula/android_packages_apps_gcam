package p000;

import android.support.p003v8.renderscript.Allocation;
import android.support.p003v8.renderscript.BaseObj;
import android.support.p003v8.renderscript.Element;
import android.support.p003v8.renderscript.RenderScript;
import android.support.p003v8.renderscript.Sampler;
import android.support.p003v8.renderscript.ScriptC;

/* compiled from: PG */
/* renamed from: xo */
public final class C0848xo extends ScriptC {
    /* renamed from: a */
    public Element f26613a;

    public C0848xo(RenderScript renderScript) {
        Object obj = new byte[C0582xp.f10019a];
        Object a = C0582xp.m6308a();
        System.arraycopy(a, 0, obj, 0, a.length);
        a = new byte[C0582xp.f10020b];
        Object b = C0582xp.m6309b();
        System.arraycopy(b, 0, a, 0, b.length);
        super(renderScript, "tinyplanet", obj, a);
        Element.ALLOCATION(renderScript);
        Element.SAMPLER(renderScript);
        Element.F32(renderScript);
        Element.I32(renderScript);
        this.f26613a = Element.U8_4(renderScript);
    }

    /* renamed from: a */
    public final synchronized void mo15699a(float f) {
        setVar(2, f);
    }

    /* renamed from: a */
    public final synchronized void mo15700a(int i) {
        setVar(5, i);
    }

    /* renamed from: a */
    public final synchronized void mo15701a(Allocation allocation) {
        setVar(0, (BaseObj) allocation);
    }

    /* renamed from: b */
    public final synchronized void mo15704b(int i) {
        setVar(4, i);
    }

    /* renamed from: b */
    public final synchronized void mo15703b(float f) {
        setVar(3, f);
    }

    /* renamed from: c */
    public final synchronized void mo15705c(float f) {
        setVar(6, f);
    }

    /* renamed from: d */
    public final synchronized void mo15706d(float f) {
        setVar(7, f);
    }

    /* renamed from: a */
    public final synchronized void mo15702a(Sampler sampler) {
        setVar(1, (BaseObj) sampler);
    }
}
