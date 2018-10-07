package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: epo */
final class epo extends epr {
    /* renamed from: a */
    private final int f17605a;
    /* renamed from: b */
    private final String f17606b;
    /* renamed from: c */
    private final boolean f17607c;
    /* renamed from: d */
    private final boolean f17608d;
    /* renamed from: e */
    private final float f17609e;
    /* renamed from: f */
    private final String f17610f;
    /* renamed from: g */
    private final String f17611g;
    /* renamed from: h */
    private final boolean f17612h;
    /* renamed from: i */
    private final float f17613i;
    /* renamed from: j */
    private final kbg f17614j;
    /* renamed from: k */
    private final Boolean f17615k;
    /* renamed from: l */
    private final Rect f17616l;
    /* renamed from: m */
    private final kbg f17617m;
    /* renamed from: n */
    private final Boolean f17618n;

    epo(int i, String str, boolean z, boolean z2, float f, String str2, String str3, boolean z3, float f2, kbg kbg, Boolean bool, Rect rect, kbg kbg2, Boolean bool2) {
        this.f17605a = i;
        this.f17606b = str;
        this.f17607c = z;
        this.f17608d = z2;
        this.f17609e = f;
        this.f17610f = str2;
        this.f17611g = str3;
        this.f17612h = z3;
        this.f17613i = f2;
        this.f17614j = kbg;
        this.f17615k = bool;
        this.f17616l = rect;
        this.f17617m = kbg2;
        this.f17618n = bool2;
    }

    /* renamed from: a */
    public final Rect mo6451a() {
        return this.f17616l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof epr)) {
            return false;
        }
        epr epr = (epr) obj;
        if (this.f17605a == epr.mo6460j() && this.f17606b.equals(epr.mo6452b()) && this.f17607c == epr.mo6454d() && this.f17608d == epr.mo6457g() && Float.floatToIntBits(this.f17609e) == Float.floatToIntBits(epr.mo6464n()) && this.f17610f.equals(epr.mo6453c()) && this.f17611g.equals(epr.mo6456f()) && this.f17612h == epr.mo6455e() && Float.floatToIntBits(this.f17613i) == Float.floatToIntBits(epr.mo6461k()) && this.f17614j.equals(epr.mo6462l()) && this.f17615k.equals(epr.mo6463m()) && this.f17616l.equals(epr.mo6451a()) && this.f17617m.equals(epr.mo6459i()) && this.f17618n.equals(epr.mo6458h())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo6452b() {
        return this.f17606b;
    }

    /* renamed from: c */
    public final String mo6453c() {
        return this.f17610f;
    }

    /* renamed from: d */
    public final boolean mo6454d() {
        return this.f17607c;
    }

    /* renamed from: e */
    public final boolean mo6455e() {
        return this.f17612h;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((this.f17605a ^ 1000003) * 1000003) ^ this.f17606b.hashCode()) * 1000003;
        if (this.f17607c) {
            i = 1231;
        } else {
            i = 1237;
        }
        hashCode = (i ^ hashCode) * 1000003;
        if (this.f17608d) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (((((((i ^ hashCode) * 1000003) ^ Float.floatToIntBits(this.f17609e)) * 1000003) ^ this.f17610f.hashCode()) * 1000003) ^ this.f17611g.hashCode()) * 1000003;
        if (this.f17612h) {
            i2 = 1231;
        }
        return ((((((((((((i ^ i2) * 1000003) ^ Float.floatToIntBits(this.f17613i)) * 1000003) ^ this.f17614j.hashCode()) * 1000003) ^ this.f17615k.hashCode()) * 1000003) ^ this.f17616l.hashCode()) * 1000003) ^ this.f17617m.hashCode()) * 1000003) ^ this.f17618n.hashCode();
    }

    /* renamed from: f */
    public final String mo6456f() {
        return this.f17611g;
    }

    /* renamed from: g */
    public final boolean mo6457g() {
        return this.f17608d;
    }

    /* renamed from: h */
    public final Boolean mo6458h() {
        return this.f17618n;
    }

    /* renamed from: i */
    public final kbg mo6459i() {
        return this.f17617m;
    }

    /* renamed from: j */
    public final int mo6460j() {
        return this.f17605a;
    }

    /* renamed from: k */
    public final float mo6461k() {
        return this.f17613i;
    }

    public final String toString() {
        int i = this.f17605a;
        String str = this.f17606b;
        boolean z = this.f17607c;
        boolean z2 = this.f17608d;
        float f = this.f17609e;
        String str2 = this.f17610f;
        String str3 = this.f17611g;
        boolean z3 = this.f17612h;
        float f2 = this.f17613i;
        String valueOf = String.valueOf(this.f17614j);
        String valueOf2 = String.valueOf(this.f17615k);
        String valueOf3 = String.valueOf(this.f17616l);
        String valueOf4 = String.valueOf(this.f17617m);
        String valueOf5 = String.valueOf(this.f17618n);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(valueOf).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        StringBuilder stringBuilder = new StringBuilder((((((((length + 288) + length2) + length3) + length4) + length5) + length6) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length());
        stringBuilder.append("DecorateAtTimeCaptureRequestData{mode=");
        stringBuilder.append(i);
        stringBuilder.append(", filename=");
        stringBuilder.append(str);
        stringBuilder.append(", frontFacing=");
        stringBuilder.append(z);
        stringBuilder.append(", isHDR=");
        stringBuilder.append(z2);
        stringBuilder.append(", zoom=");
        stringBuilder.append(f);
        stringBuilder.append(", flashSetting=");
        stringBuilder.append(str2);
        stringBuilder.append(", hdrPlusSetting=");
        stringBuilder.append(str3);
        stringBuilder.append(", gridLinesOn=");
        stringBuilder.append(z3);
        stringBuilder.append(", timerSeconds=");
        stringBuilder.append(f2);
        stringBuilder.append(", touchCoordinate=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", volumeButtonShutter=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", activeSensorSize=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", meteringData=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", isSelfieFlashOn=");
        stringBuilder.append(valueOf5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: l */
    public final kbg mo6462l() {
        return this.f17614j;
    }

    /* renamed from: m */
    public final Boolean mo6463m() {
        return this.f17615k;
    }

    /* renamed from: n */
    public final float mo6464n() {
        return this.f17609e;
    }
}
