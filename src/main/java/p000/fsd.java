package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fsd */
final class fsd implements kaw {
    /* renamed from: a */
    private final /* synthetic */ List f18751a;
    /* renamed from: b */
    private final /* synthetic */ fsc f18752b;

    fsd(fsc fsc, List list) {
        this.f18752b = fsc;
        this.f18751a = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        obj = (Integer) obj;
        jri.m13404b(obj);
        int intValue = obj.intValue();
        int size = this.f18751a.size();
        if (intValue < 0 || intValue >= size) {
            String a;
            String str = "index";
            if (intValue < 0) {
                a = jri.m13393a("%s (%s) must not be negative", str, Integer.valueOf(intValue));
            } else if (size < 0) {
                StringBuilder stringBuilder = new StringBuilder(26);
                stringBuilder.append("negative size: ");
                stringBuilder.append(size);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                a = jri.m13393a("%s (%s) must be less than size (%s)", str, Integer.valueOf(intValue), Integer.valueOf(size));
            }
            throw new IndexOutOfBoundsException(a);
        }
        fuc fuc = this.f18752b.f18749a;
        long longValue = ((Long) this.f18751a.get(obj.intValue())).longValue();
        synchronized (fuc.f4955d) {
            fub a2 = fuc.mo6912a(longValue);
            jri.m13406b(a2.f4949g.mo9709b() ^ 1, (Object) "Base frame already selected!");
            a2.f4949g = kbg.m4804c(Long.valueOf(longValue));
        }
        return obj;
    }
}
