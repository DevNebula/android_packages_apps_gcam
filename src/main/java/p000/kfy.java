package p000;

/* compiled from: PG */
/* renamed from: kfy */
abstract class kfy extends kgt {
    kfy() {
    }

    /* renamed from: a */
    abstract kft mo14033a();

    public void clear() {
        mo14033a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfu = (kfu) obj;
        if (kfu.mo9953a() > 0 && mo14033a().mo9938a(kfu.mo9987a()) == kfu.mo9953a()) {
            return true;
        }
        return false;
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfu = (kfu) obj;
        Object b = kfu.mo9987a();
        int a = kfu.mo9953a();
        if (a != 0) {
            return mo14033a().mo9940a(b, a, 0);
        }
        return false;
    }
}
