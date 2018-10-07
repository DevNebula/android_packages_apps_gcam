package p000;

import android.graphics.PointF;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: ctm */
public final class ctm implements cth {
    /* renamed from: a */
    public final ctg f13254a;
    /* renamed from: b */
    public cth f13255b;
    /* renamed from: c */
    public int f13256c;
    /* renamed from: d */
    private final ctn f13257d;
    /* renamed from: e */
    private final float f13258e;
    /* renamed from: f */
    private long f13259f = -1;
    /* renamed from: g */
    private int f13260g;
    /* renamed from: h */
    private double f13261h;
    /* renamed from: i */
    private boolean f13262i;
    /* renamed from: j */
    private long f13263j;

    public ctm(ctn ctn, ctg ctg, float f) {
        this.f13257d = (ctn) jri.m13404b((Object) ctn);
        this.f13254a = (ctg) jri.m13404b((Object) ctg);
        this.f13258e = f;
        ctg.mo5769a((cth) this);
    }

    /* renamed from: b */
    public final void mo12907b() {
        if (this.f13261h > ((double) this.f13258e)) {
            this.f13256c = C0252go.f5793S;
            this.f13257d.mo5795b();
            return;
        }
        this.f13256c = C0252go.f5794T;
        this.f13257d.mo5793a();
    }

    /* renamed from: a */
    public final boolean mo5772a(float f, float f2) {
        if (this.f13256c == C0252go.f5791Q) {
            cth cth = this.f13255b;
            if (cth != null) {
                return cth.mo5772a(f, f2);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5776b(float f, float f2) {
        this.f13256c = C0252go.f5791Q;
        this.f13259f = -1;
        this.f13262i = true;
        this.f13261h = 0.0d;
        cth cth = this.f13255b;
        return cth != null ? cth.mo5776b(f, f2) : false;
    }

    /* JADX WARNING: Missing block: B:5:0x000f, code:
            if (r0.mo5778c(r6, r7) != false) goto L_0x0011;
     */
    /* renamed from: c */
    public final boolean mo5778c(float r6, float r7) {
        /*
        r5 = this;
        r4 = 1;
        r0 = r5.f13256c;
        r1 = p000.C0252go.f5791Q;
        if (r0 != r1) goto L_0x0012;
    L_0x0007:
        r0 = r5.f13255b;
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r0 = r0.mo5778c(r6, r7);
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r4;
    L_0x0012:
        r0 = r5.f13256c;
        r1 = p000.C0252go.f5792R;
        if (r0 != r1) goto L_0x0011;
    L_0x0018:
        r0 = r5.f13261h;
        r2 = r5.f13258e;
        r2 = (double) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0039;
    L_0x0021:
        r0 = r5.f13262i;
        if (r0 == 0) goto L_0x002f;
    L_0x0025:
        r0 = p000.C0252go.f5793S;
        r5.f13256c = r0;
        r0 = r5.f13257d;
        r0.mo5795b();
        goto L_0x0011;
    L_0x002f:
        r0 = p000.C0252go.f5794T;
        r5.f13256c = r0;
        r0 = r5.f13257d;
        r0.mo5793a();
        goto L_0x0011;
    L_0x0039:
        r0 = p000.C0252go.f5794T;
        r5.f13256c = r0;
        r0 = r5.f13257d;
        r0.mo5793a();
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: ctm.c(float, float):boolean");
    }

    /* renamed from: d */
    public final void mo5779d(float f, float f2) {
        if (this.f13256c == C0252go.f5791Q) {
            cth cth = this.f13255b;
            if (cth != null) {
                cth.mo5779d(f, f2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5775a(float f, float f2, int i, long j) {
        if (this.f13256c == C0252go.f5791Q) {
            cth cth = this.f13255b;
            if (cth != null) {
                return cth.mo5775a(f, f2, i, j);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5777b(float f, float f2, int i, long j) {
        if (i == 2) {
            this.f13263j = j;
        } else if (i == 1) {
            this.f13263j = 0;
        }
        if (this.f13256c == C0252go.f5791Q) {
            cth cth = this.f13255b;
            if (cth != null) {
                return cth.mo5777b(f, f2, i, j);
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo5780e(float f, float f2) {
        if (this.f13256c == C0252go.f5791Q) {
            this.f13256c = C0252go.f5795U;
        }
        cth cth = this.f13255b;
        return cth != null ? cth.mo5780e(f, f2) : false;
    }

    /* renamed from: a */
    public final void mo5771a() {
        cth cth = this.f13255b;
        if (cth != null) {
            cth.mo5771a();
        }
    }

    /* renamed from: a */
    public final boolean mo5773a(float f, float f2, float f3) {
        cth cth = this.f13255b;
        return cth != null ? cth.mo5773a(f, f2, f3) : false;
    }

    /* renamed from: a */
    public final boolean mo5774a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j) {
        boolean z;
        float f7;
        cth cth;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        double hypot = Math.hypot((double) f8, (double) f9);
        if (hypot > this.f13261h) {
            z = true;
        } else {
            z = false;
        }
        this.f13262i = z;
        this.f13261h = hypot;
        int a = C0252go.m2699a(f8, f9);
        float f10 = (float) (this.f13261h / ((double) this.f13258e));
        if (f10 > 1.0f) {
            f7 = 1.0f;
        } else {
            f7 = f10;
        }
        if (this.f13256c == C0252go.f5791Q) {
            cth = this.f13255b;
            if (cth != null && cth.mo5774a(f, f2, f3, f4, f5, f6, i, j)) {
                return true;
            }
            if (a == C0252go.f5797W) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f13259f < 0) {
                this.f13259f = currentTimeMillis;
                return false;
            } else if (i > 1) {
                return false;
            } else {
                this.f13256c = C0252go.f5792R;
                this.f13260g = a;
                ctn ctn = this.f13257d;
                PeekableFilmstripLayout peekableFilmstripLayout = ctn.f2904a;
                peekableFilmstripLayout.f12803c.setTranslationX((float) peekableFilmstripLayout.getMeasuredWidth());
                peekableFilmstripLayout = ctn.f2904a;
                peekableFilmstripLayout.setBackgroundColor(peekableFilmstripLayout.getResources().getColor(17170445, null));
                FilmstripTransitionLayout filmstripTransitionLayout = ctn.f2904a.f12806f;
                if (filmstripTransitionLayout.f2513k != null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13405b(z);
                if (filmstripTransitionLayout.f2514l == null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13405b(z);
                filmstripTransitionLayout.setVisibility(0);
                filmstripTransitionLayout.mo2618b();
                ctu ctu = filmstripTransitionLayout.f2513k;
                float f11 = ctu.f2918a;
                PointF pointF = ctu.f2919b;
                filmstripTransitionLayout.f2514l = new cto(f11, pointF.x, pointF.y);
                ctn.f2904a.f12811k.mo13441j();
                ctn.f2904a.f12802b.mo12906e();
            }
        }
        if (this.f13256c == C0252go.f5792R && i <= 1) {
            if (this.f13260g == C0252go.f5796V) {
                this.f13257d.mo5794a(f5, 0.0f, f7);
            } else {
                this.f13257d.mo5794a(f5, f6, f7);
            }
        }
        if (this.f13256c == C0252go.f5795U) {
            if (Math.abs(j - this.f13263j) < 200) {
                return false;
            }
            cth = this.f13255b;
            if (cth != null && cth.mo5774a(f, f2, f3, f4, f5, f6, i, j)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo5781f(float f, float f2) {
        if (this.f13256c == C0252go.f5791Q) {
            cth cth = this.f13255b;
            if (cth != null) {
                return cth.mo5781f(f, f2);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo5782g(float f, float f2) {
        if (this.f13256c == C0252go.f5795U) {
            this.f13256c = C0252go.f5791Q;
        }
        if (this.f13256c == C0252go.f5791Q) {
            cth cth = this.f13255b;
            if (cth != null) {
                return cth.mo5782g(f, f2);
            }
        }
        if (this.f13256c == C0252go.f5792R) {
            mo12907b();
        }
        return false;
    }
}
