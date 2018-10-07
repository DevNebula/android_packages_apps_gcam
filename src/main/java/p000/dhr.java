package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: dhr */
final class dhr extends djm {
    /* renamed from: a */
    private final Uri f13936a;
    /* renamed from: b */
    private final eqi f13937b;
    /* renamed from: c */
    private final kpw f13938c;

    dhr(Uri uri, eqi eqi, kpw kpw) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f13936a = uri;
        if (eqi == null) {
            throw new NullPointerException("Null mediaStoreRecord");
        }
        this.f13937b = eqi;
        if (kpw == null) {
            throw new NullPointerException("Null processingVideoRecordResult");
        }
        this.f13938c = kpw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof djm)) {
            return false;
        }
        djm djm = (djm) obj;
        if (this.f13936a.equals(djm.mo5989c()) && this.f13937b.equals(djm.mo5987a()) && this.f13938c.equals(djm.mo5988b())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    final eqi mo5987a() {
        return this.f13937b;
    }

    /* renamed from: b */
    final kpw mo5988b() {
        return this.f13938c;
    }

    /* renamed from: c */
    final Uri mo5989c() {
        return this.f13936a;
    }

    public final int hashCode() {
        return ((((this.f13936a.hashCode() ^ 1000003) * 1000003) ^ this.f13937b.hashCode()) * 1000003) ^ this.f13938c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13936a);
        String valueOf2 = String.valueOf(this.f13937b);
        String valueOf3 = String.valueOf(this.f13938c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 70) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("ProcessingVideo{uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mediaStoreRecord=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", processingVideoRecordResult=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
