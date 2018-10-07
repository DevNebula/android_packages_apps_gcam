package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;

/* compiled from: PG */
/* renamed from: xj */
public final class C0782xj extends C0579xh {
    public C0782xj(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo11533a(int i) {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new C0554wb("IsStruct and IsArray options are mutually exclusive", 103);
        } else if ((i & 2) > 0 && (i & 768) > 0) {
            throw new C0554wb("Structs and arrays can't have \"value\" options", 103);
        }
    }

    /* renamed from: a */
    protected final int mo11532a() {
        return -2147475470;
    }

    /* renamed from: b */
    public final boolean mo14452b() {
        return (this.f10018a & 768) > 0;
    }

    /* renamed from: a */
    public final void mo14450a(C0782xj c0782xj) {
        if (c0782xj != null) {
            mo11536c(this.f10018a | c0782xj.f10018a);
        }
    }

    /* renamed from: c */
    public final C0782xj mo14453c() {
        mo11534a(512, true);
        return this;
    }

    /* renamed from: d */
    public final C0782xj mo14455d() {
        mo11534a(4096, true);
        return this;
    }

    /* renamed from: e */
    public final C0782xj mo14457e() {
        mo11534a(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX, true);
        return this;
    }

    /* renamed from: f */
    public final C0782xj mo14458f() {
        mo11534a(1024, true);
        return this;
    }

    /* renamed from: a */
    public final C0782xj mo14449a(boolean z) {
        mo11534a(64, z);
        return this;
    }

    /* renamed from: b */
    public final C0782xj mo14451b(boolean z) {
        mo11534a(16, z);
        return this;
    }

    /* renamed from: c */
    public final C0782xj mo14454c(boolean z) {
        mo11534a(128, z);
        return this;
    }

    /* renamed from: d */
    public final C0782xj mo14456d(boolean z) {
        mo11534a(256, z);
        return this;
    }
}
