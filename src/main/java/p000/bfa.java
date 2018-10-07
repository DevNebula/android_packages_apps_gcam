package p000;

import android.media.CamcorderProfile;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bfa */
public final class bfa {
    /* renamed from: a */
    public static final String f1144a = bli.m887a("CdrCharFty");
    /* renamed from: b */
    public final inn f1145b;
    /* renamed from: c */
    public final inx f1146c;
    /* renamed from: d */
    public final fbn f1147d;

    public bfa(inn inn, inx inx, fbn fbn) {
        this.f1145b = inn;
        this.f1146c = inx;
        this.f1147d = fbn;
    }

    /* renamed from: a */
    static List m831a(iur iur, inc inc) {
        List linkedList = new LinkedList();
        for (iob iob : iob.values()) {
            ine ine = iob.f7575b;
            if (CamcorderProfile.hasProfile(Integer.parseInt(iur.f7848b), iob.f7574a)) {
                Object a = inx.m3958a(iur, iob);
                jri.m13404b(a);
                if (inn.m3945b(a, inc, ine)) {
                    linkedList.addFirst(ine);
                }
            }
        }
        return linkedList;
    }
}
