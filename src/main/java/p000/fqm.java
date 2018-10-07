package p000;

import java.util.List;

/* renamed from: fqm */
final /* synthetic */ class fqm implements kaw {
    /* renamed from: a */
    private final fqh f18651a;
    /* renamed from: b */
    private final List f18652b;

    fqm(fqh fqh, List list) {
        this.f18651a = fqh;
        this.f18652b = list;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        fqh fqh = this.f18651a;
        List list = this.f18652b;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        int size = list.size();
        if (intValue >= 0 && intValue < size) {
            Object obj2 = null;
            size = 0;
            while (size < list.size()) {
                iwz iwz;
                if (size == num.intValue()) {
                    iwz = (iwz) list.get(size);
                } else {
                    ((fkp) list.get(size)).close();
                    iwz = obj2;
                }
                size++;
                iwz obj22 = iwz;
            }
            jri.m13404b(obj22);
            return fqh.f24294e.f18640f.mo6882a(obj22, (iqm) jri.m13404b(fqh.f24293d));
        }
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
}
