package p000;

import java.lang.reflect.Type;

/* compiled from: PG */
/* renamed from: kmz */
enum kmz extends kmy {
    kmz(String str) {
        super(str, 0);
    }

    /* renamed from: a */
    final /* synthetic */ Type mo10149a(Type type) {
        return new kmx(type);
    }

    /* renamed from: c */
    final Type mo10153c(Type type) {
        jri.m13404b((Object) type);
        if (!(type instanceof Class)) {
            return type;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return new kmx(cls.getComponentType());
        }
        return type;
    }
}
