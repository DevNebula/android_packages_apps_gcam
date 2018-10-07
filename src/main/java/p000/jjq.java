package p000;

/* compiled from: PG */
/* renamed from: jjq */
public abstract class jjq implements jiq {
    /* renamed from: a */
    public final String f21555a;
    /* renamed from: b */
    public final int f21556b;
    /* renamed from: c */
    private final String f21557c = getClass().getSimpleName();

    protected jjq(String str, int i) {
        this.f21555a = str;
        this.f21556b = i;
    }

    /* renamed from: a */
    public final int mo9460a() {
        return this.f21556b;
    }

    /* renamed from: b */
    public final String mo9462b() {
        return this.f21555a;
    }

    public String toString() {
        String str = this.f21557c;
        String str2 = this.f21555a;
        int i = this.f21556b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 29) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("[type=");
        stringBuilder.append(str2);
        stringBuilder.append(", priority=");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
