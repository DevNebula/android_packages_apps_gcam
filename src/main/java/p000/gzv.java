package p000;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* renamed from: gzv */
final class gzv implements kaw {
    /* renamed from: a */
    private final /* synthetic */ boolean f19844a;
    /* renamed from: b */
    private final /* synthetic */ kbg f19845b;
    /* renamed from: c */
    private final /* synthetic */ Context f19846c;

    gzv(boolean z, kbg kbg, Context context) {
        this.f19844a = z;
        this.f19845b = kbg;
        this.f19846c = context;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        obj = (List) obj;
        jri.m13404b(obj);
        if (this.f19844a) {
            return Boolean.valueOf(false);
        }
        boolean z = (this.f19845b.mo9709b() && !((Boolean) obj.get(0)).booleanValue()) ? true : (hak.m3034a(this.f19846c) && !((Boolean) obj.get(1)).booleanValue()) ? true : ((Boolean) obj.get(3)).booleanValue() ? !((Boolean) obj.get(2)).booleanValue() : false;
        return Boolean.valueOf(z);
    }
}
