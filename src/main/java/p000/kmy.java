package p000;

import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: kmy */
public enum kmy {
    ;
    
    /* renamed from: c */
    public static final kmy f8723c = null;

    /* renamed from: a */
    abstract Type mo10149a(Type type);

    /* renamed from: c */
    abstract Type mo10153c(Type type);

    /* renamed from: a */
    boolean mo10151a() {
        return true;
    }

    /* renamed from: b */
    public String mo10152b(Type type) {
        return kms.m5065b(type);
    }

    /* renamed from: a */
    final ken mo10150a(Type[] typeArr) {
        keo d = ken.m13718d();
        for (Type c : typeArr) {
            d.mo15104c(mo10153c(c));
        }
        return d.mo15102a();
    }
}
