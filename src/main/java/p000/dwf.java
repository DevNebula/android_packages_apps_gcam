package p000;

/* compiled from: PG */
/* renamed from: dwf */
final class dwf extends hci {
    /* renamed from: a */
    private final /* synthetic */ dwd f24086a;

    dwf(dwd dwd) {
        this.f24086a = dwd;
    }

    public final void onShutterButtonClick() {
        dwd dwd = this.f24086a;
        if (dwd.f26234w != C0252go.f5832ae) {
            dwd.mo15522w();
            gwv gwv = dwd.f26229r;
            if (gwv != null && gwv.f19754e != 2) {
                dxj dxj = dwd.f26224m;
                if (dxj != null && dxj.f16936d && dwd.mo15515p()) {
                    gwv = dwd.f26229r;
                    abc abc = dwd.f26224m.f16938f.f151q;
                    if (!gwv.f19755f) {
                        return;
                    }
                    if (gwv.m11850b(abc)) {
                        int i = gwv.f19754e;
                        if (i == 3 || i == 4) {
                            gwv.mo13480b();
                            return;
                        } else if (i == 1) {
                            gwv.f19754e = 2;
                            return;
                        } else if (i == 0) {
                            gwv.mo13477a(2);
                            return;
                        } else {
                            return;
                        }
                    }
                    gwv.mo13480b();
                    return;
                }
                return;
            }
            return;
        }
        dxn dxn = dwd.f26237z;
        if (dxn != null) {
            dxn.f3565s = true;
        }
        dwd.mo15510a(false, true);
    }
}
