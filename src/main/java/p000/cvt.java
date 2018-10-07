package p000;

import android.view.KeyEvent;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: cvt */
public final class cvt extends cvs {
    /* renamed from: c */
    private final ezx f25809c;
    /* renamed from: d */
    private final BottomBarController f25810d;
    /* renamed from: e */
    private final hcd f25811e;
    /* renamed from: f */
    private boolean f25812f = true;
    /* renamed from: g */
    private boolean f25813g = true;

    public cvt(bag bag, bah bah, ezx ezx, BottomBarController bottomBarController, hcd hcd) {
        super(bag, bah);
        this.f25809c = ezx;
        this.f25810d = bottomBarController;
        this.f25811e = hcd;
    }

    public final void close() {
        this.f25809c.close();
    }

    /* renamed from: f_ */
    public final fha mo12931f_() {
        return null;
    }

    /* renamed from: b */
    public final String mo12925b() {
        return null;
    }

    /* renamed from: a */
    public final void mo12922a(gos gos) {
    }

    /* renamed from: a */
    public final void mo12921a(cfh cfh, ezy ezy) {
        ezx ezx = this.f25809c;
        cfh.mo12485p().mo7919a((int) R.id.viewfinder_frame);
        ezx.mo13206a(this.f25810d, this.f25811e);
    }

    /* renamed from: c */
    public final boolean mo12928c() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo12930f() {
        return this.f25809c.mo6333J();
    }

    /* renamed from: a */
    public final void mo12920a(aah aah) {
    }

    /* renamed from: a */
    public final boolean mo12923a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo12927b(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final void mo12926b(boolean z) {
    }

    /* renamed from: m_ */
    public final void mo12937m_() {
        if (!this.f25812f) {
            this.f25809c.mo13207c();
            this.f25812f = true;
        }
    }

    /* renamed from: j */
    public final void mo12934j() {
        if (this.f25812f) {
            this.f25809c.mo13208d();
            this.f25812f = true;
        }
    }

    /* renamed from: k */
    public final void mo12935k() {
        if (this.f25813g) {
            this.f25809c.mo13209e();
            this.f25813g = false;
        }
    }

    /* renamed from: l */
    public final void mo12936l() {
        if (!this.f25813g) {
            this.f25809c.mo13210f();
            this.f25813g = true;
        }
    }
}
