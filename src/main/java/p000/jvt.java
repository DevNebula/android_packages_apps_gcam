package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.utils.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: PG */
/* renamed from: jvt */
public final class jvt implements jwa {
    /* renamed from: a */
    private final Map f24858a = new ConcurrentSkipListMap();
    /* renamed from: b */
    private final List f24859b = new ArrayList();
    /* renamed from: c */
    private final jvv f24860c;
    /* renamed from: d */
    private jvu f24861d;
    /* renamed from: e */
    private jvu f24862e;
    /* renamed from: f */
    private float f24863f = 0.0f;
    /* renamed from: g */
    private float f24864g = 0.0f;
    /* renamed from: h */
    private float f24865h = 0.01f;
    /* renamed from: i */
    private float f24866i = 1.0f;

    public jvt(jvv jvv) {
        boolean z;
        boolean z2 = true;
        jri.m13404b((Object) jvv);
        if (jvv.f8386e < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (jvv.f8389h >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (jvv.f8388g < 0.0f) {
            z2 = false;
        }
        jri.m13395a(z2);
        this.f24860c = jvv;
    }

    /* renamed from: a */
    private final double m16707a(double d) {
        switch (this.f24860c.f8393l.ordinal()) {
            case 1:
            case 2:
                return d * d;
            case 3:
                return Math.abs(d);
            default:
                String valueOf = String.valueOf(this.f24860c.f8393l);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                stringBuilder.append("Unrecognized variation method: ");
                stringBuilder.append(valueOf);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final Set mo13879a() {
        return new HashSet(this.f24858a.keySet());
    }

    /* renamed from: a */
    public final void mo9575a(long j) {
        this.f24860c.f8382a.mo9556b(j);
        this.f24860c.f8384c.mo9556b(j);
        this.f24860c.f8383b.mo9556b(j);
        this.f24858a.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final void mo9576b(long j) {
        jvu jvu = this.f24862e;
        if (jvu == null || j > jvu.f8373a) {
            jvu jvu2;
            float f;
            float f2;
            this.f24860c.f8382a.mo9557c(j);
            this.f24860c.f8384c.mo9557c(j);
            this.f24860c.f8383b.mo9557c(j);
            long j2 = j;
            jvu jvu3 = new jvu(j2, Math.max(this.f24860c.f8382a.mo9554a(j).mo9629a(), 0.0f), this.f24860c.f8384c.mo9554a(j).mo9629a() + 1.0f, this.f24860c.f8383b.mo9554a(j).mo9629a());
            this.f24858a.put(Long.valueOf(jvu3.f8373a), jvu3);
            this.f24859b.add(jvu3);
            MathUtils.calcSigmoidParams(0.1f, 0.99f, 0.3f, 0.05f);
            for (jvu jvu4 : this.f24859b) {
                jvu4.f8378f = jvu4.f8376d;
            }
            int[] iArr = new int[]{-1, 1};
            int size = this.f24859b.size();
            double gaussian = (double) MathUtils.gaussian(0.0f, 0.0f, this.f24860c.f8388g);
            for (int i = size - 1; i >= 0; i--) {
                jvu2 = (jvu) this.f24859b.get(i);
                jvu4 = this.f24862e;
                if (jvu4 != null) {
                    f = ((float) (jvu4.f8373a - jvu2.f8373a)) / 1000000.0f;
                } else {
                    f = 0.0f;
                }
                if (f > this.f24860c.f8389h) {
                    break;
                }
                double d = ((double) jvu2.f8378f) * gaussian;
                int i2 = 0;
                double d2 = gaussian;
                while (true) {
                    int i3 = i2;
                    if (i3 >= 2) {
                        break;
                    }
                    int i4 = iArr[i3];
                    int i5 = i + i4;
                    while (i5 >= 0 && i5 < size) {
                        jvu4 = (jvu) this.f24859b.get(i5);
                        float abs = ((float) Math.abs(jvu2.f8373a - jvu4.f8373a)) / 1000000.0f;
                        jvv jvv = this.f24860c;
                        if (abs > jvv.f8389h) {
                            break;
                        }
                        double gaussian2 = (double) MathUtils.gaussian(abs, 0.0f, jvv.f8388g);
                        d += ((double) jvu4.f8378f) * gaussian2;
                        d2 += gaussian2;
                        i5 += i4;
                    }
                    i2 = i3 + 1;
                }
                jvu2.f8379g = (float) (d / d2);
            }
            Iterator it = this.f24859b.iterator();
            f = 1.0E-6f;
            while (true) {
                f2 = f;
                if (!it.hasNext()) {
                    break;
                }
                f = Math.max(((jvu) it.next()).f8379g, f2);
            }
            this.f24864g = f2;
            f = this.f24864g;
            jvv jvv2 = this.f24860c;
            this.f24863f = jvv2.f8386e * f;
            this.f24865h = jvv2.f8387f * f;
            if (f > 0.0f) {
                this.f24866i = (float) Math.pow((double) f, (double) (1.0f - jvv2.f8385d));
            } else {
                this.f24866i = 1.0f;
                Log.w("AUCFrameDropper", "The max motion saliency must be a positive number!");
            }
            for (jvu jvu42 : this.f24859b) {
                jvu42.f8380h = ((float) Math.pow((double) Math.max(jvu42.f8379g - this.f24863f, this.f24865h), (double) this.f24860c.f8385d)) * this.f24866i;
            }
            it = this.f24859b.iterator();
            jvu42 = null;
            while (true) {
                jvu2 = jvu42;
                if (!it.hasNext()) {
                    break;
                }
                jvu42 = (jvu) it.next();
                jvu42.f8381i = 0.0d;
                if (jvu2 != null) {
                    long j3 = jvu42.f8373a;
                    long j4 = jvu2.f8373a;
                    float f3 = jvu2.f8380h;
                    float f4 = jvu42.f8380h;
                    jvu42.f8381i = (((((double) (j3 - j4)) / 1000000.0d) * ((double) (f3 + f4))) / 2.0d) + jvu2.f8381i;
                }
            }
            if (this.f24861d == null) {
                this.f24861d = jvu3;
            }
            this.f24862e = jvu3;
            return;
        }
        Log.w("AUCFrameDropper", "Invalid timestamp: new frame timestamp is smaller than older timestamp.");
    }

    /* renamed from: b */
    public final kbg mo13880b() {
        return kau.f21835a;
    }

    /* renamed from: c */
    public final void mo13881c() {
        this.f24860c.f8382a.mo9555a();
        this.f24860c.f8383b.mo9555a();
        this.f24860c.f8384c.mo9555a();
        this.f24858a.clear();
        this.f24859b.clear();
        this.f24861d = null;
        this.f24862e = null;
        this.f24863f = 0.0f;
        this.f24864g = 0.0f;
    }

    /* renamed from: d */
    public final long mo13882d() {
        if (this.f24858a.isEmpty()) {
            throw new IllegalStateException("Can't drop frame from empty list.");
        } else if (this.f24858a.size() == 1) {
            return ((Long) this.f24858a.keySet().iterator().next()).longValue();
        } else {
            int i;
            jvu jvu;
            Iterator it = this.f24858a.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
            ArrayList arrayList = new ArrayList(this.f24858a.values());
            int size = arrayList.size();
            jvu jvu2 = null;
            int i2 = 0;
            while (i2 < size) {
                i = i2 + 1;
                jvu = (jvu) arrayList.get(i2);
                if (jvu2 == null) {
                    jvu2 = jvu;
                    i2 = i;
                } else if (jvu.f8374b <= jvu2.f8374b) {
                    jvu2 = jvu;
                    i2 = i;
                } else {
                    i2 = i;
                }
            }
            if (jvu2 == null) {
                jvu = null;
            } else if (jvu2.f8374b >= -10.0f) {
                jvu = null;
            } else {
                jvu = jvu2;
            }
            if (jvu != null) {
                return jvu.f8373a;
            }
            if (this.f24858a.isEmpty()) {
                jvu = null;
            } else {
                ArrayList arrayList2 = new ArrayList(this.f24858a.values());
                if (arrayList2.size() == 1) {
                    jvu = (jvu) arrayList2.get(0);
                } else {
                    jvu = (jvu) arrayList2.get(0);
                    int size2 = arrayList2.size();
                    double d = Double.NEGATIVE_INFINITY;
                    jvu jvu3 = jvu;
                    i2 = 0;
                    while (i2 < size2) {
                        double d2;
                        int i3 = i2 + 1;
                        jvu = (jvu) arrayList2.get(i2);
                        List arrayList3 = new ArrayList();
                        int size3 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            i = i4 + 1;
                            jvu2 = (jvu) arrayList2.get(i4);
                            if (jvu2 != jvu) {
                                arrayList3.add(jvu2);
                                i4 = i;
                            } else {
                                i4 = i;
                            }
                        }
                        jvv jvv = this.f24860c;
                        double d3 = (double) jvv.f8390i;
                        double d4 = (double) jvv.f8391j;
                        double d5 = (double) jvv.f8392k;
                        jri.m13395a(arrayList3.isEmpty() ^ 1);
                        double d6 = 1.0d - ((d3 + d4) + d5);
                        int size4 = arrayList3.size();
                        double d7 = 0.0d;
                        double d8 = 0.0d;
                        double d9 = 0.0d;
                        i4 = 0;
                        while (i4 < arrayList3.size()) {
                            int i5 = i4 + 1;
                            jvu2 = (jvu) arrayList3.get(i4);
                            d7 += (double) jvu2.f8374b;
                            d8 += (double) jvu2.f8375c;
                            d9 += (double) jvu2.f8380h;
                            i4 = i5;
                        }
                        if (size4 > 0) {
                            d2 = (double) size4;
                            d7 /= d2;
                            d8 /= d2;
                            d9 /= d2;
                        }
                        if (this.f24862e == null) {
                            throw new IllegalStateException("mLastFrame is null when frames is not empty");
                        }
                        double d10;
                        if (this.f24860c.f8393l == jvw.VARIANCE) {
                            d2 = this.f24862e.f8381i;
                            d2 *= d2;
                        } else {
                            d2 = this.f24862e.f8381i;
                        }
                        d2 = Math.max(d2, 9.999999974752427E-7d);
                        d7 = ((d8 * d4) + (d7 * d3)) + (d9 * d5);
                        if (arrayList3.size() >= 2) {
                            jvu2 = this.f24862e;
                            if (jvu2 == null) {
                                throw new IllegalStateException("mLastFrame is null when frames is not empty");
                            }
                            d9 = jvu2.f8381i;
                            int size5 = arrayList3.size();
                            size = size5 - 1;
                            d3 = (double) (size5 + 1);
                            d4 = (double) size;
                            d5 = ((jvu) arrayList3.get(0)).f8381i;
                            double d11 = ((jvu) arrayList3.get(size)).f8381i;
                            d4 = Math.min(Math.max((((jvu) arrayList3.get(size)).f8381i - ((jvu) arrayList3.get(0)).f8381i) / d4, d9 / d3), d9 / d4);
                            d9 = m16707a(d9 - d11) + m16707a(d5);
                            for (size = 1; size < size5; size++) {
                                d9 += m16707a((((jvu) arrayList3.get(size)).f8381i - ((jvu) arrayList3.get(size - 1)).f8381i) - d4);
                            }
                            d9 /= d3;
                            if (this.f24860c.f8393l == jvw.STDEV) {
                                d9 = Math.sqrt(d9);
                            }
                        } else {
                            d9 = 0.0d;
                        }
                        d9 = d7 - (((d9 * 30.0d) / d2) * d6);
                        if (d9 >= d) {
                            jvu3 = jvu;
                        }
                        if (d9 >= d) {
                            d10 = d9;
                        } else {
                            d10 = d;
                        }
                        d = d10;
                        i2 = i3;
                    }
                    jvu = jvu3;
                }
            }
            return jvu.f8373a;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24860c.f8382a);
        String valueOf2 = String.valueOf(this.f24860c.f8384c);
        String valueOf3 = String.valueOf(this.f24860c.f8383b);
        String valueOf4 = String.valueOf(null);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 60) + length2) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length());
        stringBuilder.append("AUCFrameDropper[motion=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", sharpness=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", quality=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", motion-blur=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
