package p000;

/* compiled from: PG */
/* renamed from: qj */
public final class C0429qj {
    /* renamed from: a */
    public int f9551a;
    /* renamed from: b */
    public int f9552b;
    /* renamed from: c */
    public Object f9553c;
    /* renamed from: d */
    public int f9554d;

    C0429qj(int i, int i2, int i3, Object obj) {
        this.f9551a = i;
        this.f9552b = i2;
        this.f9554d = i3;
        this.f9553c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0429qj c0429qj = (C0429qj) obj;
        int i = this.f9551a;
        if (i != c0429qj.f9551a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f9554d - this.f9552b) == 1 && this.f9554d == c0429qj.f9552b && this.f9552b == c0429qj.f9554d) {
            return true;
        }
        if (this.f9554d != c0429qj.f9554d) {
            return false;
        }
        if (this.f9552b != c0429qj.f9552b) {
            return false;
        }
        Object obj2 = this.f9553c;
        if (obj2 != null) {
            if (obj2.equals(c0429qj.f9553c)) {
                return true;
            }
            return false;
        } else if (c0429qj.f9553c != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return (((this.f9551a * 31) + this.f9552b) * 31) + this.f9554d;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("[");
        switch (this.f9551a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 4:
                str = "up";
                break;
            case 8:
                str = "mv";
                break;
            default:
                str = "??";
                break;
        }
        stringBuilder.append(str);
        stringBuilder.append(",s:");
        stringBuilder.append(this.f9552b);
        stringBuilder.append("c:");
        stringBuilder.append(this.f9554d);
        stringBuilder.append(",p:");
        stringBuilder.append(this.f9553c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
