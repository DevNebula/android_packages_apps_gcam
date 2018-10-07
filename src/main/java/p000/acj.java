package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.p001v4.app.SharedElementCallback;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.common.p006io.ByteStreams;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: acj */
public final class acj implements Cloneable {
    /* renamed from: a */
    public aqg f236a;
    /* renamed from: b */
    public acq f237b;
    /* renamed from: c */
    public acj f238c;
    /* renamed from: d */
    public boolean f239d = true;
    /* renamed from: e */
    private final Context f240e;
    /* renamed from: f */
    private final acm f241f;
    /* renamed from: g */
    private final Class f242g;
    /* renamed from: h */
    private final aqg f243h;
    /* renamed from: i */
    private final ace f244i;
    /* renamed from: j */
    private Object f245j;
    /* renamed from: k */
    private boolean f246k;
    /* renamed from: l */
    private boolean f247l;

    static {
        new aqg().mo1698a(afm.f413b).mo1694a(acg.LOW).mo1713h();
    }

    protected acj(acc acc, acm acm, Class cls, Context context) {
        this.f241f = acm;
        this.f242g = cls;
        this.f243h = acm.f10117e;
        this.f240e = context;
        ace ace = acm.f10113a.f189c;
        acq acq = (acq) ace.f213f.get(cls);
        if (acq == null) {
            acq acq2 = acq;
            for (Entry entry : ace.f213f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    acq2 = (acq) entry.getValue();
                }
            }
            acq = acq2;
        }
        if (acq == null) {
            acq = ace.f208a;
        }
        this.f237b = acq;
        this.f236a = this.f243h;
        this.f244i = acc.f189c;
    }

    /* renamed from: a */
    public final acj mo124a(aqg aqg) {
        aqe.m610a((Object) aqg, "Argument must not be null");
        aqg b = m117b();
        while (b.f917x) {
            b = b.clone();
        }
        if (aqg.m619a(aqg.f896c, 2)) {
            b.f897d = aqg.f897d;
        }
        if (aqg.m619a(aqg.f896c, 262144)) {
            b.f918y = aqg.f918y;
        }
        if (aqg.m619a(aqg.f896c, (int) SharedElementCallback.MAX_IMAGE_SIZE)) {
            b.f895B = aqg.f895B;
        }
        if (aqg.m619a(aqg.f896c, 4)) {
            b.f898e = aqg.f898e;
        }
        if (aqg.m619a(aqg.f896c, 8)) {
            b.f899f = aqg.f899f;
        }
        if (aqg.m619a(aqg.f896c, 16)) {
            b.f900g = aqg.f900g;
        }
        if (aqg.m619a(aqg.f896c, 32)) {
            b.f901h = aqg.f901h;
        }
        if (aqg.m619a(aqg.f896c, 64)) {
            b.f902i = aqg.f902i;
        }
        if (aqg.m619a(aqg.f896c, 128)) {
            b.f903j = aqg.f903j;
        }
        if (aqg.m619a(aqg.f896c, 256)) {
            b.f904k = aqg.f904k;
        }
        if (aqg.m619a(aqg.f896c, 512)) {
            b.f906m = aqg.f906m;
            b.f905l = aqg.f905l;
        }
        if (aqg.m619a(aqg.f896c, 1024)) {
            b.f907n = aqg.f907n;
        }
        if (aqg.m619a(aqg.f896c, 4096)) {
            b.f914u = aqg.f914u;
        }
        if (aqg.m619a(aqg.f896c, 8192)) {
            b.f910q = aqg.f910q;
        }
        if (aqg.m619a(aqg.f896c, 16384)) {
            b.f911r = aqg.f911r;
        }
        if (aqg.m619a(aqg.f896c, 32768)) {
            b.f916w = aqg.f916w;
        }
        if (aqg.m619a(aqg.f896c, 65536)) {
            b.f909p = aqg.f909p;
        }
        if (aqg.m619a(aqg.f896c, 131072)) {
            b.f908o = aqg.f908o;
        }
        if (aqg.m619a(aqg.f896c, (int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
            b.f913t.putAll(aqg.f913t);
            b.f894A = aqg.f894A;
        }
        if (aqg.m619a(aqg.f896c, (int) ByteStreams.ZERO_COPY_CHUNK_SIZE)) {
            b.f919z = aqg.f919z;
        }
        if (!b.f909p) {
            b.f913t.clear();
            b.f896c &= -2049;
            b.f908o = false;
            b.f896c &= -131073;
            b.f894A = true;
        }
        b.f896c |= aqg.f896c;
        b.f912s.mo11617a(aqg.f912s);
        this.f236a = b.mo1712g();
        return this;
    }

    /* renamed from: a */
    private final aqb m114a(aqs aqs, aqf aqf, aqc aqc, acq acq, acg acg, int i, int i2, aqg aqg) {
        acj acj = this.f238c;
        if (acj == null) {
            return m115a(aqs, aqf, aqg, aqc, acq, acg, i, i2);
        }
        if (this.f247l) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        acq acq2;
        acg acg2;
        int i3;
        int i4;
        acq acq3 = acj.f237b;
        if (acj.f239d) {
            acq2 = acq;
        } else {
            acq2 = acq3;
        }
        if (acj.f236a.mo1702a(8)) {
            acg2 = this.f238c.f236a.f899f;
        } else {
            switch (acg.ordinal()) {
                case 0:
                case 1:
                    acg2 = acg.IMMEDIATE;
                    break;
                case 2:
                    acg2 = acg.HIGH;
                    break;
                case 3:
                    acg2 = acg.NORMAL;
                    break;
                default:
                    String valueOf = String.valueOf(this.f236a.f899f);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    stringBuilder.append("unknown priority: ");
                    stringBuilder.append(valueOf);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        aqg aqg2 = this.f238c.f236a;
        int i5 = aqg2.f906m;
        int i6 = aqg2.f905l;
        if (arq.m682b(i, i2)) {
            aqg aqg3 = this.f238c.f236a;
            if (arq.m682b(aqg3.f906m, aqg3.f905l)) {
                i3 = i6;
                i4 = i5;
            } else {
                i5 = aqg.f906m;
                i3 = aqg.f905l;
                i4 = i5;
            }
        } else {
            i3 = i6;
            i4 = i5;
        }
        aqc aqk = new aqk(aqc);
        aqb a = m115a(aqs, aqf, aqg, aqk, acq, acg, i, i2);
        this.f247l = true;
        acj = this.f238c;
        aqb a2 = acj.m114a(aqs, aqf, aqk, acq2, acg2, i4, i3, acj.f236a);
        this.f247l = false;
        aqk.f10667a = a;
        aqk.f10668b = a2;
        return aqk;
    }

    /* renamed from: a */
    public final acj clone() {
        try {
            acj acj = (acj) super.clone();
            acj.f236a = acj.f236a.clone();
            acj.f237b = acj.f237b.clone();
            return acj;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private final aqg m117b() {
        aqg aqg = this.f243h;
        aqg aqg2 = this.f236a;
        if (aqg != aqg2) {
            return aqg2;
        }
        return aqg2.clone();
    }

    /* renamed from: a */
    public final aqt mo128a(ImageView imageView) {
        aqs aqm;
        arq.m678a();
        aqe.m610a((Object) imageView, "Argument must not be null");
        aqg aqg = this.f236a;
        if (!(aqg.mo1702a((int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX) || !aqg.f909p || imageView.getScaleType() == null)) {
            switch (acl.f250a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aqg = aqg.clone().mo1699a(amf.f523b, new aly());
                    break;
                case 2:
                    aqg = aqg.clone().mo1711f();
                    break;
                case 3:
                case 4:
                case 5:
                    aqg = aqg.clone().mo1700a(amf.f522a, new amt(), false);
                    break;
                case 6:
                    aqg = aqg.clone().mo1711f();
                    break;
            }
        }
        Class cls = this.f242g;
        if (Bitmap.class.equals(cls)) {
            aqm = new aqm(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            aqm = new aqn(imageView);
        } else {
            String valueOf = String.valueOf(cls);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 64);
            stringBuilder.append("Unhandled class: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (aqt) m116a(aqm, null, aqg);
    }

    /* renamed from: a */
    public final aqs mo127a(aqs aqs, aqf aqf) {
        return m116a(aqs, aqf, m117b());
    }

    /* renamed from: a */
    private final aqs m116a(aqs aqs, aqf aqf, aqg aqg) {
        arq.m678a();
        aqe.m610a((Object) aqs, "Argument must not be null");
        if (this.f246k) {
            aqg a = aqg.mo1693a();
            aqb a2 = m114a(aqs, aqf, null, this.f237b, a.f899f, a.f906m, a.f905l, a);
            Object a3 = aqs.mo12303a();
            if (a2.mo1676a(a3)) {
                Object obj;
                if (a.f904k) {
                    obj = null;
                } else if (a3.mo1680e()) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    a2.mo1684i();
                    if (!((aqb) aqe.m610a(a3, "Argument must not be null")).mo1682g()) {
                        a3.mo1677b();
                    }
                    return aqs;
                }
            }
            this.f241f.mo11611a(aqs);
            aqs.mo12305a(a2);
            acm acm = this.f241f;
            acm.f10116d.f10638a.add(aqs);
            C0043api c0043api = acm.f10115c;
            c0043api.f859a.add(a2);
            if (c0043api.f861c) {
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                c0043api.f860b.add(a2);
            } else {
                a2.mo1677b();
            }
            return aqs;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    public final acj mo125a(Object obj) {
        this.f245j = obj;
        this.f246k = true;
        return this;
    }

    /* renamed from: a */
    private final aqb m115a(aqs aqs, aqf aqf, aqg aqg, aqc aqc, acq acq, acg acg, int i, int i2) {
        Context context = this.f240e;
        ace ace = this.f244i;
        Object obj = this.f245j;
        Class cls = this.f242g;
        afs afs = ace.f214g;
        arc arc = acq.f255a;
        aqb aqb = (aqi) aqi.f10639a.mo9113a();
        if (aqb == null) {
            aqb = new aqi();
        }
        aqb.f10645d = context;
        aqb.f10646e = ace;
        aqb.f10647f = obj;
        aqb.f10648g = cls;
        aqb.f10649h = aqg;
        aqb.f10650i = i;
        aqb.f10651j = i2;
        aqb.f10652k = acg;
        aqb.f10653l = aqs;
        aqb.f10643b = aqf;
        aqb.f10654m = null;
        aqb.f10644c = aqc;
        aqb.f10655n = afs;
        aqb.f10656o = arc;
        aqb.f10657p = C0252go.f5937i;
        return aqb;
    }

    /* renamed from: a */
    public final aqa mo126a(int i, int i2) {
        aqs aqd = new aqd(this.f244i.f209b, i, i2);
        if ((arq.m680b() ^ 1) != 0) {
            this.f244i.f209b.post(new ack(this, aqd));
        } else {
            mo127a(aqd, (aqf) aqd);
        }
        return aqd;
    }
}
