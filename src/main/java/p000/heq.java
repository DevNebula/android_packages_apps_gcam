package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: heq */
public final class heq {
    /* renamed from: a */
    private static final String f6474a = bli.m887a("ViewfinderSizeSel");
    /* renamed from: b */
    private final iqp f6475b;
    /* renamed from: c */
    private final bkw f6476c;

    public heq(iqp iqp, bkw bkw) {
        this.f6475b = iqp;
        this.f6476c = bkw;
    }

    /* renamed from: a */
    public final iqp mo7776a(List list, ipz ipz, iut iut, boolean z) {
        String a;
        int i;
        double d;
        double d2;
        boolean z2;
        double d3 = ((double) ipz.f7671c) / ((double) ipz.f7672d);
        jri.m13404b((Object) list);
        jri.m13395a(list.isEmpty() ^ 1);
        if (!z) {
            if (iut == iut.FRONT) {
                a = ije.m3831a(this.f6476c.f1283a, "camera:blacklisted_preview_resolutions_back", "");
            } else {
                a = ije.m3831a(this.f6476c.f1283a, "camera:blacklisted_preview_resolutions_back", "");
            }
            list = gly.m11392a(list, a);
        }
        int i2 = 0;
        for (iqp iqp : list) {
            if (iqp.f7696b <= 1080) {
                i2++;
            }
        }
        Object arrayList = new ArrayList(i2);
        for (iqp iqp2 : list) {
            i = iqp2.f7696b;
            if (i <= 1080) {
                arrayList.add(new iqp(iqp2.f7695a, i));
            }
        }
        jri.m13404b(arrayList);
        jri.m13395a(arrayList.isEmpty() ^ 1);
        iqp iqp22 = this.f6475b;
        int min = Math.min(iqp22.f7695a, iqp22.f7696b);
        i2 = -1;
        int i3 = 0;
        double d4 = Double.MAX_VALUE;
        while (i3 < arrayList.size()) {
            iqp22 = (iqp) arrayList.get(i3);
            if (Math.abs((((double) iqp22.f7695a) / ((double) iqp22.f7696b)) - d3) > 0.02d) {
                d = d4;
                i = i2;
                d2 = d;
            } else {
                double abs = (double) Math.abs(iqp22.f7696b - min);
                if (abs < d4) {
                    d2 = abs;
                    i = i3;
                } else if (abs != d4) {
                    d = d4;
                    i = i2;
                    d2 = d;
                } else if (iqp22.f7696b < min) {
                    d2 = abs;
                    i = i3;
                } else {
                    d = d4;
                    i = i2;
                    d2 = d;
                }
            }
            i3++;
            i2 = i;
            d4 = d2;
        }
        if (i2 == -1) {
            a = f6474a;
            String valueOf = String.valueOf(arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
            stringBuilder.append("No preview size match the aspect ratio. available sizes: ");
            stringBuilder.append(valueOf);
            bli.m898e(a, stringBuilder.toString());
            int i4 = 0;
            d4 = Double.MAX_VALUE;
            while (i4 < arrayList.size()) {
                iqp22 = (iqp) arrayList.get(i4);
                if (((double) Math.abs(iqp22.f7696b - min)) >= d4) {
                    d = d4;
                    i = i2;
                    d2 = d;
                } else {
                    d2 = (double) Math.abs(iqp22.f7696b - min);
                    i = i4;
                }
                i4++;
                i2 = i;
                d4 = d2;
            }
        }
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13405b(z2);
        return (iqp) arrayList.get(i2);
    }

    /* renamed from: a */
    public final iqp mo7777a(List list, iqp iqp, iut iut) {
        return mo7776a(list, ipz.m4077b(iqp), iut, false);
    }
}
