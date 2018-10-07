package p000;

import com.google.android.libraries.smartburst.utils.Feature;

/* compiled from: PG */
/* renamed from: jyr */
final class jyr extends jtn {
    /* renamed from: b */
    private final jtn f24889b;
    /* renamed from: c */
    private final jyy f24890c;

    public jyr(jtn jtn, jyy jyy) {
        super(jtn.f21737a);
        this.f24889b = jtn;
        this.f24890c = jyy;
    }

    /* renamed from: a */
    public final jzf mo13856a(long j, jky jky) {
        for (Feature feature : jky.mo9480a()) {
            float[] values = feature.getValues();
            for (int i = 0; i < values.length; i++) {
                String name = feature.getType().name();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 13);
                stringBuilder.append(name);
                stringBuilder.append("[");
                stringBuilder.append(i);
                stringBuilder.append("]");
                this.f24890c.mo13890a(stringBuilder.toString(), j, values[i]);
            }
        }
        return this.f24889b.mo13856a(j, jky);
    }

    public final String toString() {
        return this.f24889b.toString();
    }
}
