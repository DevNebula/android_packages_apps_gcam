package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: csl */
public final class csl implements emh, eok, eol {
    /* renamed from: a */
    public static final String f13232a = bli.m887a("FSDelCtrl");
    /* renamed from: b */
    public final Resources f13233b;
    /* renamed from: c */
    public final ViewGroup f13234c;
    /* renamed from: d */
    public final View f13235d;
    /* renamed from: e */
    public boolean f13236e = false;
    /* renamed from: f */
    private final hfz f13237f;

    public csl(ctw ctw, Resources resources, hfz hfz) {
        this.f13234c = ctw.f2940g;
        this.f13235d = ctw.f2941h;
        this.f13233b = resources;
        this.f13237f = hfz;
        this.f13234c.setClickable(true);
    }

    /* renamed from: a */
    public final boolean mo6328a(MotionEvent motionEvent) {
        if (this.f13234c.getVisibility() != 0) {
            return false;
        }
        View view = this.f13235d;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        rect.offset(hhz.m3208a(view), hhz.m3215b(view));
        if (rect.contains((int) rawX, (int) rawY)) {
            return this.f13235d.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        mo12901b(false);
        mo12900a(false);
        return false;
    }

    /* renamed from: a */
    public final void mo12900a(boolean z) {
        if (z) {
            this.f13234c.animate().setDuration(200).alpha(0.0f).setListener(new csm(this)).start();
        } else {
            this.f13234c.setVisibility(8);
        }
    }

    /* renamed from: j */
    public final void mo6373j() {
        mo12899a();
        mo12900a(false);
        bli.m888a(f13232a, "performDeletion");
    }

    /* renamed from: b */
    public final void mo12901b(boolean z) {
        if (z) {
            this.f13237f.mo7842g();
        } else {
            mo12899a();
        }
        this.f13236e = false;
    }

    /* renamed from: a */
    final void mo12899a() {
        if (this.f13236e) {
            this.f13236e = false;
            this.f13237f.mo7831b();
        }
    }
}
