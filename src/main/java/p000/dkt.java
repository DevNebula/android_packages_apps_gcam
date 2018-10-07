package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dkt */
public final class dkt {
    /* renamed from: a */
    private static final String f3323a = bli.m887a("CdrVidSnapSizePkr");

    /* renamed from: a */
    public static kbg m1700a(inc inc, ine ine, List list) {
        ine ine2 = ine.RES_2160P;
        iqp iqp = new iqp(0, 0);
        iqp iqp2 = iqp;
        for (iqp iqp3 : list) {
            String str = f3323a;
            String valueOf = String.valueOf(iqp3);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("supportedImageSize = ");
            stringBuilder.append(valueOf);
            bli.m896d(str, stringBuilder.toString());
            if (ipz.m4077b(iqp3).equals(ipz.m4077b(ine.mo8639c())) && ((!(ine == ine2 || inc == inc.FPS_60) || iqp3.mo8812a() <= ine.mo8638b()) && iqp3.mo8812a() > iqp2.mo8812a())) {
                iqp2 = iqp3;
            }
        }
        if (iqp2.mo8812a() != 0) {
            return kbg.m4804c(iqp2);
        }
        return kau.f21835a;
    }
}
