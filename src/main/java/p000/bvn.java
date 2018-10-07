package p000;

import android.content.ContentValues;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: bvn */
public final class bvn implements bvm {
    /* renamed from: a */
    private static final String f11837a = bli.m887a("SpecTypeManager");
    /* renamed from: b */
    private final bvf f11838b;
    /* renamed from: c */
    private final bvp f11839c;

    bvn(bvf bvf, bvp bvp) {
        this.f11838b = bvf;
        this.f11839c = bvp;
    }

    /* renamed from: a */
    public final void mo2175a(long j, bve bve) {
        String str = f11837a;
        String valueOf = String.valueOf(bve);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("add ");
        stringBuilder.append(j);
        stringBuilder.append(" as ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        bvf bvf = this.f11838b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_store_id", Long.valueOf(j));
        contentValues.put("special_type_id", bve.mo2167d());
        String str2 = bvf.f1650a;
        String valueOf2 = String.valueOf(bve);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
        stringBuilder2.append("add to database for ");
        stringBuilder2.append(j);
        stringBuilder2.append(" as ");
        stringBuilder2.append(valueOf2);
        bli.m888a(str2, stringBuilder2.toString());
        kny.m18475a(bvf.f1653c, new bvi(contentValues), bvf.f1654d);
    }

    /* renamed from: a */
    public final kbg mo2174a(long j) {
        kbg kbg;
        Object obj;
        kbg a = this.f11838b.mo2170a(j);
        if (a.mo9709b()) {
            kbg = a;
        } else {
            kbg = this.f11839c.mo2176a(j);
            if (kbg.mo9709b()) {
                mo2175a(j, (bve) kbg.mo9706a());
            }
        }
        String str = f11837a;
        if (kbg.mo9709b()) {
            obj = (Serializable) kbg.mo9706a();
        } else {
            obj = " not available";
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
        stringBuilder.append(j);
        stringBuilder.append(" find special type: ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        return kbg;
    }
}
