package p000;

/* compiled from: PG */
/* renamed from: wo */
public final class C0566wo {
    /* renamed from: a */
    public String f9975a;

    public C0566wo(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            this.f9975a = str.substring(0, indexOf);
            str.substring(indexOf + 1);
            return;
        }
        this.f9975a = "";
    }
}
