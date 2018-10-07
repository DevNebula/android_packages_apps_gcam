package p000;

import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: gza */
public final class gza {
    /* renamed from: a */
    public float f6208a = 0.0f;
    /* renamed from: b */
    public float f6209b = 0.0f;
    /* renamed from: c */
    public final gyz f6210c;
    /* renamed from: d */
    public int f6211d;
    /* renamed from: e */
    public boolean f6212e = true;
    /* renamed from: f */
    private final WindowManager f6213f;
    /* renamed from: g */
    private final ilp f6214g;

    static {
        bli.m887a("PrevSwipeGstMgr");
    }

    public gza(gyz gyz, WindowManager windowManager, ilp ilp) {
        this.f6210c = gyz;
        this.f6213f = windowManager;
        this.f6214g = ilp;
    }

    /* renamed from: a */
    public final boolean mo7576a(boolean z) {
        if (!this.f6212e || m2991b(z)) {
            return false;
        }
        int i;
        if (this.f6208a > 0.0f) {
            i = C0252go.f5894bn;
        } else {
            i = C0252go.f5895bo;
        }
        float max = Math.max(0.0f, Math.min(1.0f, Math.abs(this.f6208a) / 250.0f));
        if (((double) Math.abs(this.f6208a)) < 125.0d) {
            if (Math.abs(this.f6209b) > 3.0f) {
                this.f6210c.mo7564a(max, i);
            } else {
                this.f6210c.mo7568b(max, i);
                mo7574a();
            }
        } else if (Math.abs(this.f6208a) < 250.0f) {
            this.f6210c.mo7564a(max, i);
        } else {
            gyz gyz = this.f6210c;
            if (gyz.mo7571b(i)) {
                hhx a = gyz.mo7563a(i);
                if (a != null) {
                    gyz.mo7573c(a);
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo7575a(float f, boolean z) {
        if (!m2991b(z)) {
            if (this.f6213f.getDefaultDisplay().getRotation() == 1) {
                f = -f;
            }
            this.f6209b = f / 1000.0f;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo7577b(float f, boolean z) {
        if (!this.f6212e) {
            return false;
        }
        if (m2991b(z)) {
            return false;
        }
        if (z && this.f6213f.getDefaultDisplay().getRotation() == 1) {
            f = -f;
        }
        this.f6208a += f;
        int i = this.f6211d + 1;
        this.f6211d = i;
        if (i > 2) {
            float f2;
            if (this.f6208a <= 0.0f) {
                i = C0252go.f5895bo;
            } else {
                i = C0252go.f5894bn;
            }
            if (this.f6208a > 0.0f && this.f6210c.mo7570b()) {
                f2 = 0.0f;
            } else if (this.f6208a >= 0.0f || !this.f6210c.mo7567a()) {
                float max = Math.max(0.0f, Math.min(1.0f, Math.abs(this.f6208a) / 250.0f));
                gyz gyz = this.f6210c;
                if (gyz.mo7571b(i)) {
                    hhx a = gyz.mo7563a(i);
                    if (a != null) {
                        if (!gyz.f6197e && ((double) max) > 0.0d) {
                            gyz.mo7565a(a);
                            gyz.f6197e = true;
                        }
                        gyz.f6195c.mo12642a();
                        gyz.f6195c.setAlpha(max);
                        gyz.f6195c.mo12643a((int) ((1.0f - max) * 250.0f), a, i);
                        if (!gyz.f6199g) {
                            boolean z2;
                            BottomBarController bottomBarController = gyz.f6193a;
                            if (i == C0252go.f5895bo) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            bottomBarController.setProgress(max, z2);
                        }
                        if (max <= 0.0f) {
                            gyz.mo7572c();
                            gyz.f6197e = false;
                        }
                    }
                    f2 = max;
                } else {
                    f2 = max;
                }
            } else {
                f2 = 0.0f;
            }
            if (f2 == 0.0f) {
                this.f6210c.mo7568b(0.0f, i);
                mo7574a();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7574a() {
        this.f6211d = 0;
        this.f6208a = 0.0f;
        this.f6209b = 0.0f;
        gyz gyz = this.f6210c;
        if (gyz.f6199g) {
            if (gyz.f6200h.mo9709b()) {
                ((gzf) gyz.f6200h.mo9706a()).mo7581c();
            }
        } else if (gyz.f6198f == hhx.PHOTO) {
            gyz.f6193a.setProgress(1.0f, true);
        } else {
            gyz.f6193a.setProgress(1.0f, false);
        }
        gyz.mo7572c();
    }

    /* renamed from: b */
    private final boolean m2991b(boolean z) {
        if (z && (((Boolean) this.f6214g.mo13673b()).booleanValue() || this.f6213f.getDefaultDisplay().getRotation() == 0 || this.f6213f.getDefaultDisplay().getRotation() == 2)) {
            return true;
        }
        return false;
    }
}
