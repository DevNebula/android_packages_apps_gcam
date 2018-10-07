package p000;

/* compiled from: PG */
/* renamed from: fby */
public final class fby {
    /* renamed from: a */
    private gie f4694a;
    /* renamed from: b */
    private gif f4695b;

    fby(byte b) {
        this();
    }

    /* renamed from: a */
    public final fby mo6735a(gie gie) {
        if (gie == null) {
            throw new NullPointerException("Null aeMode");
        }
        this.f4694a = gie;
        return this;
    }

    /* renamed from: a */
    public final fby mo6736a(gif gif) {
        if (gif == null) {
            throw new NullPointerException("Null aeState");
        }
        this.f4695b = gif;
        return this;
    }

    /* renamed from: a */
    public final fbx mo6734a() {
        String str = "";
        if (this.f4694a == null) {
            str = String.valueOf(str).concat(" aeMode");
        }
        if (this.f4695b == null) {
            str = String.valueOf(str).concat(" aeState");
        }
        if (str.isEmpty()) {
            return new fda(this.f4694a, this.f4695b);
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
