package p000;

/* compiled from: PG */
/* renamed from: kqo */
public abstract class kqo implements kte {
    /* renamed from: d */
    public int f25357d = 0;

    /* renamed from: a */
    int mo15154a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    void mo15155a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final byte[] mo15156b() {
        try {
            byte[] bArr = new byte[mo14187e()];
            krh b = krh.m14082b(bArr);
            mo14185a(b);
            b.mo14152a();
            return bArr;
        } catch (Throwable e) {
            String name = getClass().getName();
            String str = "byte array";
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: c */
    public final kqx mo14186c() {
        try {
            kue b = kqx.m5119b(mo14187e());
            mo14185a(b.f22011a);
            return b.mo14193d();
        } catch (Throwable e) {
            String name = getClass().getName();
            String str = "ByteString";
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }
}
