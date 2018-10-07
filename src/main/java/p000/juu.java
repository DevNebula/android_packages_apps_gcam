package p000;

import com.google.android.libraries.smartburst.filterfw.FrameManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: juu */
public final class juu extends jum {
    /* renamed from: a */
    private final jxm f24817a;
    /* renamed from: b */
    private final jtv f24818b;
    /* renamed from: c */
    private final jwq f24819c;
    /* renamed from: d */
    private final int f24820d;
    /* renamed from: e */
    private final float f24821e;
    /* renamed from: f */
    private final float f24822f;
    /* renamed from: g */
    private final float f24823g;
    /* renamed from: h */
    private final float f24824h;
    /* renamed from: i */
    private final float f24825i;

    public juu(jxm jxm, jtv jtv, jwq jwq) {
        this(jxm, jtv, jwq, (byte) 0);
    }

    private juu(jxm jxm, jtv jtv, jwq jwq, byte b) {
        jri.m13404b((Object) jxm);
        jri.m13404b((Object) jtv);
        jri.m13404b((Object) jwq);
        this.f24817a = jxm;
        this.f24818b = jtv;
        this.f24819c = jwq;
        this.f24820d = 3;
        this.f24821e = 0.1f;
        this.f24822f = 10.0f;
        this.f24823g = 1.0f;
        this.f24824h = 9.0f;
        this.f24825i = 1.0f;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        jri.m13404b((Object) juh);
        FrameManager.attachToThread();
        try {
            if (!juh.mo9563b()) {
                List arrayList = new ArrayList();
                arrayList.addAll(ken.m13713a(juh.f8350a));
                List b = khb.m4945b();
                while (!arrayList.isEmpty()) {
                    jri.m13395a(arrayList.isEmpty() ^ 1);
                    int size = arrayList.size();
                    Long l = null;
                    float f = Float.NEGATIVE_INFINITY;
                    int i = 0;
                    while (i < size) {
                        float f2;
                        Long valueOf;
                        int i2 = i + 1;
                        long longValue = ((Long) arrayList.get(i)).longValue();
                        float a = this.f24818b.mo9554a(longValue).mo9629a();
                        if (b.isEmpty()) {
                            f2 = 0.0f;
                        } else {
                            jri.m13395a(b.isEmpty() ^ 1);
                            jxa a2 = this.f24817a.mo9599a(longValue);
                            int size2 = b.size();
                            float f3 = Float.POSITIVE_INFINITY;
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj = b.get(i3);
                                i3++;
                                long longValue2 = ((Long) obj).longValue();
                                jxa a3 = this.f24817a.mo9599a(longValue2);
                                float a4 = this.f24819c.mo9582a(longValue, longValue2);
                                a4 *= this.f24822f;
                                f2 = (Math.abs(((Float) a3.mo9589a(jxa.f8426q)).floatValue() - ((Float) a2.mo9589a(jxa.f8426q)).floatValue()) * this.f24821e) + a4;
                                if (f2 < f3) {
                                    f3 = f2;
                                }
                            }
                            if (f3 < this.f24823g) {
                                i = i2;
                            } else {
                                f2 = f3;
                            }
                        }
                        f2 = (f2 * this.f24825i) + (this.f24824h * a);
                        if (f2 > f) {
                            valueOf = Long.valueOf(longValue);
                        } else {
                            f2 = f;
                            valueOf = l;
                        }
                        i = i2;
                        l = valueOf;
                        f = f2;
                    }
                    if (l == null) {
                        break;
                    }
                    b.add(l);
                    long longValue3 = l.longValue();
                    Iterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (((Long) listIterator.next()).longValue() == longValue3) {
                            listIterator.remove();
                        }
                    }
                    if (b.size() >= this.f24820d) {
                        break;
                    }
                }
                juh juh2 = new juh(b);
            }
            FrameManager.detachFromThread();
            return juh;
        } catch (Throwable th) {
            FrameManager.detachFromThread();
        }
    }

    public final String toString() {
        return "DiverseFrameSegmentFilter";
    }
}
