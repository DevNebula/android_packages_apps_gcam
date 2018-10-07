package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: kee */
public abstract class kee extends kes implements kcx {
    kee() {
    }

    /* renamed from: c */
    public abstract kee mo9757a();

    /* renamed from: b */
    final /* synthetic */ keh mo9852b() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: a */
    public static kee m13693a(Object obj, Object obj2, Object obj3, Object obj4) {
        khb.m4952b(obj, obj2);
        khb.m4952b(obj3, obj4);
        return new kgg(new Object[]{obj, obj2, obj3, obj4}, 2);
    }

    /* renamed from: a */
    public static kee m13694a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        khb.m4952b(obj, obj2);
        khb.m4952b(obj3, obj4);
        khb.m4952b(obj5, obj6);
        return new kgg(new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, 3);
    }

    /* renamed from: d */
    public final /* synthetic */ keh mo9856d() {
        return mo9757a().keySet();
    }

    public /* synthetic */ Collection values() {
        return mo9757a().keySet();
    }

    Object writeReplace() {
        return new keg(this);
    }
}
