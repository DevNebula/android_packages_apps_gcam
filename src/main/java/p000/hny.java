package p000;

import android.view.KeyEvent;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hny */
public final class hny implements emp, emq, eol {
    /* renamed from: a */
    public int f20213a;
    /* renamed from: b */
    private final gpf f20214b;
    /* renamed from: c */
    private Set f20215c = khb.m4963e();
    /* renamed from: d */
    private boolean f20216d;

    public hny(gpf gpf) {
        this.f20214b = gpf;
    }

    /* renamed from: a */
    public final void mo13554a(hnz hnz) {
        this.f20215c.add(hnz);
    }

    /* renamed from: a */
    private final boolean m12154a(int i, boolean z) {
        switch (((gpe) this.f20214b.mo13673b()).ordinal()) {
            case 0:
                for (hnz a : this.f20215c) {
                    a.mo7988a(z);
                }
                return true;
            case 1:
                if (i == 25) {
                    for (hnz a2 : this.f20215c) {
                        a2.mo7990c(z);
                    }
                } else {
                    for (hnz a22 : this.f20215c) {
                        a22.mo7989b(z);
                    }
                }
                return true;
            case 2:
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final boolean mo6336a(int i, KeyEvent keyEvent) {
        if ((i != 24 && i != 25) || this.f20213a == C0252go.f5863bI) {
            return false;
        }
        if (keyEvent.getRepeatCount() == 0) {
            this.f20216d = false;
        }
        if (this.f20213a == C0252go.f5862bH || this.f20216d) {
            return true;
        }
        return m12154a(i, true);
    }

    /* renamed from: b */
    public final boolean mo6337b(int i, KeyEvent keyEvent) {
        if ((i != 24 && i != 25) || this.f20213a == C0252go.f5863bI) {
            return false;
        }
        if (this.f20213a == C0252go.f5862bH || this.f20216d) {
            return true;
        }
        return m12154a(i, false);
    }

    /* renamed from: b */
    public final void mo13555b(hnz hnz) {
        this.f20215c.remove(hnz);
    }

    /* renamed from: a */
    public final void mo13553a(int i) {
        int i2;
        this.f20213a = i;
        boolean z = this.f20216d;
        if (i == C0252go.f5862bH) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.f20216d = i2 | z;
    }
}
