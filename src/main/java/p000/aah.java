package p000;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Parameters;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: aah */
public abstract class aah {
    /* renamed from: a */
    public abstract C0619zs mo8a();

    /* renamed from: a */
    public abstract void mo11a(Handler handler, aag aag);

    /* renamed from: a */
    public abstract void mo12a(Handler handler, aas aas, aaf aaf, aaf aaf2);

    /* renamed from: a */
    public abstract void mo14a(Handler handler, C0623zw c0623zw);

    @TargetApi(16)
    /* renamed from: a */
    public abstract void mo15a(Handler handler, C0624zx c0624zx);

    /* renamed from: a */
    public abstract boolean mo18a(abo abo);

    /* renamed from: b */
    public abstract Handler mo20b();

    /* renamed from: b */
    public abstract void mo21b(Handler handler, aag aag);

    /* renamed from: c */
    public abstract int mo22c();

    /* renamed from: d */
    public abstract abq mo23d();

    /* renamed from: e */
    public abstract aaz mo24e();

    /* renamed from: f */
    public abstract abh mo25f();

    /* renamed from: g */
    public abstract abs mo26g();

    @Deprecated
    /* renamed from: h */
    public abstract Parameters mo27h();

    /* renamed from: i */
    public abstract abo mo28i();

    /* renamed from: a */
    public void mo17a(byte[] bArr) {
        try {
            mo26g().mo82a(new aaj(this, bArr));
        } catch (RuntimeException e) {
            mo8a().mo11592b().mo59a(e);
        }
    }

    /* renamed from: a */
    protected final boolean mo19a(abo abo, int i) {
        if (abo != null) {
            Object obj;
            int obj2;
            aaz e = mo24e();
            float f = abo.f148n;
            if (e.mo46a(aba.ZOOM)) {
                if (abo.f148n > e.f66t) {
                    aby aby = aaz.f47a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Zoom ratio is not supported: ratio = ");
                    stringBuilder.append(abo.f148n);
                    abx.m90d(aby, stringBuilder.toString());
                    obj2 = null;
                } else {
                    obj2 = 1;
                }
            } else if (f != 1.0f) {
                abx.m90d(aaz.f47a, "Zoom is not supported");
                obj2 = null;
            } else {
                obj2 = 1;
            }
            if (obj2 == null) {
                obj2 = null;
            } else {
                aby aby2;
                StringBuilder stringBuilder2;
                obj2 = abo.f149o;
                if (obj2 <= e.f61o && obj2 >= e.f60n) {
                    obj2 = 1;
                } else {
                    aby2 = aaz.f47a;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Exposure compensation index is not supported. Min = ");
                    stringBuilder2.append(e.f60n);
                    stringBuilder2.append(", max = ");
                    stringBuilder2.append(e.f61o);
                    stringBuilder2.append(",");
                    stringBuilder2.append(" setting = ");
                    stringBuilder2.append(obj2);
                    abx.m90d(aby2, stringBuilder2.toString());
                    obj2 = null;
                }
                if (obj2 == null) {
                    obj2 = null;
                } else {
                    String str;
                    abc abc = abo.f151q;
                    if (e.mo48a(abc)) {
                        obj2 = 1;
                    } else if (e.mo48a(abc.FIXED)) {
                        abx.m91e(aaz.f47a, "Focus mode not supported... trying FIXED");
                        abo.f151q = abc.FIXED;
                        obj2 = 1;
                    } else {
                        aby2 = aaz.f47a;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Focus mode not supported:");
                        if (abc == null) {
                            str = "null";
                        } else {
                            str = abc.name();
                        }
                        stringBuilder2.append(str);
                        abx.m90d(aby2, stringBuilder2.toString());
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        obj2 = null;
                    } else {
                        abb abb = abo.f150p;
                        if (e.mo47a(abb)) {
                            obj2 = 1;
                        } else {
                            aby2 = aaz.f47a;
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Flash mode not supported:");
                            if (abb == null) {
                                str = "null";
                            } else {
                                str = abb.name();
                            }
                            stringBuilder2.append(str);
                            abx.m90d(aby2, stringBuilder2.toString());
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            obj2 = null;
                        } else {
                            abw b = abo.mo72b();
                            if (e.f52f.contains(b)) {
                                obj2 = 1;
                            } else {
                                aby2 = aaz.f47a;
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Unsupported photo size:");
                                stringBuilder2.append(b);
                                abx.m90d(aby2, stringBuilder2.toString());
                                obj2 = null;
                            }
                            if (obj2 == null) {
                                obj2 = null;
                            } else {
                                b = abo.mo74c();
                                if (e.f49c.contains(b)) {
                                    obj2 = 1;
                                } else {
                                    aby2 = aaz.f47a;
                                    stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append("Unsupported preview size:");
                                    stringBuilder2.append(b);
                                    abx.m90d(aby2, stringBuilder2.toString());
                                    obj2 = null;
                                }
                                if (obj2 == null) {
                                    obj2 = null;
                                } else {
                                    if (!abo.f154t) {
                                        obj2 = 1;
                                    } else if (e.mo46a(aba.VIDEO_STABILIZATION)) {
                                        obj2 = 1;
                                    } else {
                                        abx.m90d(aaz.f47a, "Video stabilization is not supported");
                                        obj2 = null;
                                    }
                                    if (obj2 != null) {
                                        obj2 = 1;
                                    } else {
                                        obj2 = null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (obj2 != null) {
                try {
                    mo26g().mo82a(new aal(this, i, abo.mo67a()));
                } catch (RuntimeException e2) {
                    mo8a().mo11592b().mo59a(e2);
                }
                return true;
            }
            abx.m91e(C0619zs.f10099i, "Unsupported settings in applySettings()");
            return false;
        }
        abx.m90d(C0619zs.f10099i, "null argument in applySettings()");
        return false;
    }

    /* renamed from: a */
    public void mo16a(boolean z) {
        try {
            mo26g().mo82a(new aam(this, z));
        } catch (RuntimeException e) {
            mo8a().mo11592b().mo59a(e);
        }
    }

    /* renamed from: a */
    public final void mo9a(int i) {
        try {
            mo26g().mo82a(new aak(this, i));
        } catch (RuntimeException e) {
            mo8a().mo11592b().mo59a(e);
        }
    }

    /* renamed from: a */
    public void mo10a(SurfaceTexture surfaceTexture) {
        try {
            mo26g().mo82a(new aan(this, surfaceTexture));
        } catch (RuntimeException e) {
            mo8a().mo11592b().mo59a(e);
        }
    }

    /* renamed from: j */
    public void mo29j() {
        if (!mo23d().mo81c()) {
            aaw aaw = new aaw();
            try {
                mo26g().mo83a(new aao(this, aaw), aaw.f39b, "set preview texture");
            } catch (RuntimeException e) {
                mo8a().mo11592b().mo59a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo13a(Handler handler, aat aat) {
        try {
            mo26g().mo82a(new aaq(this, handler, aat));
        } catch (RuntimeException e) {
            mo8a().mo11592b().mo59a(e);
        }
    }

    /* renamed from: k */
    public final void mo30k() {
        if (!mo23d().mo81c()) {
            aaw aaw = new aaw();
            try {
                mo26g().mo83a(new aar(this, aaw), aaw.f39b, "stop preview");
            } catch (RuntimeException e) {
                mo8a().mo11592b().mo59a(e);
            }
        }
    }
}
