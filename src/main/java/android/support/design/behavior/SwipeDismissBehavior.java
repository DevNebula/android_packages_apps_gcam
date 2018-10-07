package android.support.design.behavior;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p000.C0189dj;
import p000.C0354lo;
import p000.C0357lr;
import p000.C0638bg;

/* compiled from: PG */
public class SwipeDismissBehavior extends C0189dj {
    /* renamed from: a */
    public C0354lo f10412a;
    /* renamed from: b */
    public int f10413b = 2;
    /* renamed from: c */
    public float f10414c = 0.5f;
    /* renamed from: d */
    public float f10415d = 0.0f;
    /* renamed from: e */
    public float f10416e = 0.5f;
    /* renamed from: f */
    private boolean f10417f;
    /* renamed from: g */
    private final C0357lr f10418g = new C0638bg(this);

    /* renamed from: a */
    public boolean mo423a(View view) {
        return true;
    }

    /* renamed from: a */
    public static float m6738a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    /* renamed from: a */
    public boolean mo422a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f10417f;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f10417f = coordinatorLayout.mo11689a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.f10417f;
                break;
            case 1:
            case 3:
                this.f10417f = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.f10412a == null) {
            this.f10412a = C0354lo.m5580b((ViewGroup) coordinatorLayout, this.f10418g);
        }
        return this.f10412a.mo10627b(motionEvent);
    }

    /* renamed from: b */
    public final boolean mo5982b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0354lo c0354lo = this.f10412a;
        if (c0354lo == null) {
            return false;
        }
        c0354lo.mo10620a(motionEvent);
        return true;
    }
}
