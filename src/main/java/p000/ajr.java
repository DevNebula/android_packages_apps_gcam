package p000;

/* compiled from: PG */
/* renamed from: ajr */
final class ajr implements ajo {
    /* renamed from: a */
    private final String f10349a;

    ajr(String str) {
        this.f10349a = str;
    }

    /* renamed from: a */
    public final String mo337a() {
        return this.f10349a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajr)) {
            return false;
        }
        return this.f10349a.equals(((ajr) obj).f10349a);
    }

    public final int hashCode() {
        return this.f10349a.hashCode();
    }

    public final String toString() {
        String str = this.f10349a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 29);
        stringBuilder.append("StringHeaderFactory{value='");
        stringBuilder.append(str);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
