package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: hcx */
public class hcx implements hcy {
    /* renamed from: a */
    public final String f19908a;
    /* renamed from: b */
    public final List f19909b;
    /* renamed from: c */
    public final List f19910c;
    /* renamed from: d */
    public final List f19911d;
    /* renamed from: e */
    public final List f19912e;
    /* renamed from: f */
    public final AtomicInteger f19913f;
    /* renamed from: g */
    public final Handler f19914g;
    /* renamed from: h */
    public volatile View f19915h;
    /* renamed from: i */
    public volatile int f19916i;
    /* renamed from: j */
    public volatile int f19917j;
    /* renamed from: k */
    public volatile boolean f19918k;
    /* renamed from: l */
    public volatile int f19919l;
    /* renamed from: m */
    public volatile int f19920m;
    /* renamed from: n */
    public volatile boolean f19921n;
    /* renamed from: o */
    public volatile boolean f19922o;
    /* renamed from: p */
    public volatile boolean f19923p;
    /* renamed from: q */
    public volatile boolean f19924q;
    /* renamed from: r */
    public volatile String f19925r;
    /* renamed from: s */
    public boolean f19926s = false;
    /* renamed from: t */
    public final Object f19927t = new Object();
    /* renamed from: u */
    public final /* synthetic */ hco f19928u;

    /* renamed from: a */
    public hcx mo13515a(kbn kbn) {
        this.f19912e.add(kbn);
        return this;
    }

    /* renamed from: a */
    public hcx mo13513a() {
        this.f19912e.add(new hcp(this));
        return this;
    }

    /* renamed from: a */
    public hcx mo13514a(Runnable runnable, Executor executor) {
        this.f19911d.add(Pair.create(runnable, executor));
        return this;
    }

    /* renamed from: b */
    public hcx mo13518b(Runnable runnable, Executor executor) {
        this.f19909b.add(Pair.create(runnable, executor));
        return this;
    }

    /* renamed from: b */
    public hcx mo13517b() {
        this.f19918k = true;
        return this;
    }

    /* renamed from: c */
    public hcx mo13519c() {
        this.f19922o = false;
        return this;
    }

    /* renamed from: a */
    public hcx mo13516a(boolean z) {
        this.f19921n = z;
        return this;
    }

    /* renamed from: d */
    public iqo mo13520d() {
        Context context = this.f19915h.getContext();
        CharSequence charSequence = this.f19908a;
        View textView = new TextView(context);
        textView.setTextAppearance(R.style.Tooltip);
        textView.setText(charSequence);
        hcz hda = new hda(this.f19915h);
        hcn hcn = new hcn(textView, this.f19916i, this.f19915h, this.f19917j, 0);
        int i = this.f19919l;
        hde hde = hcn.f6351a;
        if (hde == null) {
        }
        boolean z = this.f19918k;
        if (hde != null) {
            hde.f6397q = z;
            if (z) {
                hde.f6396p = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) hde.f6383c);
                hde.f6396p.setRepeatCount(-1);
                hde.f6396p.setRepeatMode(2);
                hde.f6396p.setDuration(1000);
                hde.f6396p.setInterpolator(hde.getContext(), R.anim.tooltip_animation_interpolator);
            }
        }
        boolean z2 = this.f19921n;
        hde hde2 = hcn.f6351a;
        if (hde2 != null) {
            hde2.f6386f = z2;
        }
        z2 = this.f19922o;
        List list = this.f19909b;
        if (hde2 != null) {
            hde2.f6399s = list;
        }
        hda.mo13521a();
        z2 = this.f19924q;
        hda.mo13524b(new hcq(this, hcn, hda));
        hda.mo13522a(new hcr(this, hcn, hda));
        Collection collection = this.f19911d;
        hde2 = hcn.f6351a;
        hde2.f6384d.clear();
        hde2.f6384d.addAll(collection);
        koq.m16958c(hcn.f6352b).mo10200a(new hcs(this, hcn), kpq.f8776a);
        this.f19928u.f6354b.add(hcn);
        return new hct(this, hcn, hda);
    }

    public hcx(hco hco, String str) {
        this.f19928u = hco;
        this.f19908a = str;
        this.f19909b = Collections.synchronizedList(new ArrayList());
        this.f19910c = Collections.synchronizedList(new ArrayList());
        this.f19911d = Collections.synchronizedList(new ArrayList());
        this.f19912e = Collections.synchronizedList(new ArrayList());
        this.f19913f = new AtomicInteger(0);
        this.f19914g = new Handler(Looper.getMainLooper());
        this.f19920m = 0;
        this.f19919l = 0;
        this.f19921n = true;
        this.f19923p = true;
        this.f19924q = false;
        this.f19925r = "";
        this.f19918k = false;
    }

    /* renamed from: a */
    public hcx mo7729a(View view) {
        this.f19915h = view;
        this.f19916i = 2;
        return this;
    }
}
