package p000;

import android.animation.ObjectAnimator;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: bpt */
public final class bpt {
    /* renamed from: a */
    public final bpx f1445a = new bqg(this.f1446b);
    /* renamed from: b */
    public final bqb f1446b = new bqk();
    /* renamed from: c */
    public bqo f1447c;
    /* renamed from: d */
    public ilp f1448d;
    /* renamed from: e */
    public ObjectAnimator f1449e;
    /* renamed from: f */
    public EvCompView f1450f;

    /* renamed from: a */
    public final void mo2080a(int i, int i2, float f) {
        this.f1445a.mo13422a(i, i2, f);
    }

    /* renamed from: a */
    public final void mo2082a(boolean z) {
        ((bqo) jqk.m13331a(this.f1447c, "EvCompViewController must be first initialized", new Object[0])).mo2087a(z);
    }

    /* renamed from: a */
    public final void mo2081a(OnClickListener onClickListener) {
        ((bqo) jqk.m13331a(this.f1447c, "EvCompViewController must be first initialized", new Object[0])).setOnClickListener(onClickListener);
    }
}
