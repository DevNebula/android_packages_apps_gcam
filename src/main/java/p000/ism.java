package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ism */
final class ism implements iri {
    /* renamed from: a */
    private final AtomicBoolean f21254a = new AtomicBoolean(false);
    /* renamed from: b */
    private final iur f21255b;
    /* renamed from: c */
    private final /* synthetic */ irh f21256c;

    ism(irh irh, iur iur) {
        this.f21256c = irh;
        this.f21255b = iur;
    }

    /* renamed from: a */
    public final void mo8871a() {
        iqz iqz = this.f21256c.f7718e;
        String str = this.f21255b.f7848b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" was closed.");
        iqz.mo8836d(stringBuilder.toString());
        this.f21256c.mo8868a(this.f21255b, this.f21254a.get(), -1);
    }

    /* renamed from: b */
    public final void mo8874b() {
        iqz iqz = this.f21256c.f7718e;
        String str = this.f21255b.f7848b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 25);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" was disconnected.");
        iqz.mo8836d(stringBuilder.toString());
        this.f21256c.mo8868a(this.f21255b, this.f21254a.get(), -2);
    }

    /* renamed from: a */
    public final void mo8872a(int i) {
        iqz iqz = this.f21256c.f7718e;
        String str = this.f21255b.f7848b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 35);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" received error ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        iqz.mo8836d(stringBuilder.toString());
        this.f21256c.mo8868a(this.f21255b, this.f21254a.get(), i);
    }

    /* renamed from: a */
    public final void mo8873a(iwl iwl) {
        iqz iqz = this.f21256c.f7718e;
        String str = this.f21255b.f7848b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
        stringBuilder.append("Camera ");
        stringBuilder.append(str);
        stringBuilder.append(" was opened.");
        iqz.mo8836d(stringBuilder.toString());
        this.f21254a.set(true);
    }
}
