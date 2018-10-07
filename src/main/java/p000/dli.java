package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dli */
public final class dli {
    /* renamed from: a */
    public final ebd f3327a;
    /* renamed from: b */
    public final gxz f3328b;
    /* renamed from: c */
    public final dlj f3329c;
    /* renamed from: d */
    private final cfh f3330d;
    /* renamed from: e */
    private final View f3331e;

    static {
        bli.m887a("VideoUI");
    }

    public dli(cfh cfh, View view, ebd ebd, gxz gxz) {
        this.f3328b = gxz;
        this.f3330d = cfh;
        this.f3331e = view;
        this.f3327a = ebd;
        this.f3330d.mo12489t().inflate(R.layout.video_module, (ViewGroup) this.f3331e.findViewById(R.id.root_module_layout), true);
        this.f3328b.mo7534a((TextView) this.f3331e.findViewById(R.id.recording_time));
        this.f3329c = new dlj(this.f3330d, view);
    }

    /* renamed from: a */
    public final void mo6014a() {
        this.f3327a.mo13122c(true);
    }

    /* renamed from: b */
    public static void m1701b() {
        ikd.m12501a();
    }

    /* renamed from: c */
    public static void m1702c() {
    }

    /* renamed from: a */
    public final void mo6015a(boolean z) {
        if (z) {
            this.f3327a.mo13133m();
            this.f3327a.mo13119b(false);
            this.f3328b.mo7536b();
        } else {
            this.f3327a.mo13139p();
            this.f3328b.mo7535a(false);
        }
        this.f3327a.mo13122c(true);
    }
}
