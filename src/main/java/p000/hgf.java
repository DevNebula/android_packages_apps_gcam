package p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* renamed from: hgf */
public final class hgf implements hhj {
    /* renamed from: a */
    public final bpt f20047a;
    /* renamed from: b */
    public final fbr f20048b;
    /* renamed from: c */
    private final kwk f20049c;
    /* renamed from: d */
    private final aws f20050d;
    /* renamed from: e */
    private final Context f20051e;
    /* renamed from: f */
    private final ikd f20052f;
    /* renamed from: g */
    private final bps f20053g;

    public hgf(bpt bpt, kwk kwk, fbr fbr, bps bps, aws aws, Context context, ikd ikd) {
        this.f20047a = bpt;
        this.f20049c = kwk;
        this.f20048b = fbr;
        this.f20053g = bps;
        this.f20050d = aws;
        this.f20051e = context;
        this.f20052f = ikd;
    }

    /* renamed from: a */
    public final void mo7877a() {
        boolean z;
        EvCompView evCompView = (EvCompView) ((hes) this.f20049c.mo10566a()).f6486j.mo7919a((int) R.id.evcomp);
        bpt bpt = this.f20047a;
        Context context = this.f20051e;
        ilp ilp = this.f20048b.f4692b;
        bps bps = this.f20053g;
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.dash_length);
        valueAnimator.addUpdateListener(new bpu((float) context.getResources().getDimensionPixelSize(R.dimen.evCompRulerShortDashLength), (float) context.getResources().getDimensionPixelSize(R.dimen.evCompRulerLongDashLength), evCompView));
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(context, 17498112);
        objectAnimator.setTarget(evCompView);
        bpt.f1449e = objectAnimator;
        bpt.f1450f = evCompView;
        int integer = context.getResources().getInteger(R.integer.evcomp_visibility_timeout_millis);
        bpt.f1448d = ilp;
        View bqo = new bqo(context);
        bpt.f1447c = bqo;
        if (evCompView.f2471g == null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        evCompView.f2471g = bqo;
        evCompView.addView(bqo);
        bqo.f1476a = new bqp(bpt);
        bpt.f1446b.mo14574a(bpt.f1445a, evCompView, valueAnimator, integer, ilp, bps);
        bpt.f1445a.mo14573a(evCompView, bqo, bpt.f1449e, bpt.f1446b, bps);
        bpt.f1445a.mo7343a();
        this.f20050d.mo1824a().mo8557a(this.f20053g.f1443a.mo13672a(new hgg(this), kpq.f8776a));
        this.f20050d.mo1824a().mo8557a(this.f20048b.f4693c.mo13672a(new hgh(this), this.f20052f));
    }
}
