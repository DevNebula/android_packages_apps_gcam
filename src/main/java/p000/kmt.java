package p000;

import java.lang.reflect.ParameterizedType;

/* compiled from: PG */
/* renamed from: kmt */
enum kmt {
    ;
    
    /* renamed from: a */
    public static final kmt f8716a = null;

    static {
        ParameterizedType parameterizedType = (ParameterizedType) new kmv((byte) 0).getClass().getGenericSuperclass();
        kmt[] values = kmt.values();
        int length = values.length;
        int i;
        while (i < length) {
            kmt kmt = values[i];
            if (kmt.mo10144a(kmv.class) != parameterizedType.getOwnerType()) {
                i++;
            } else {
                f8716a = kmt;
                return;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    abstract Class mo10144a(Class cls);
}
