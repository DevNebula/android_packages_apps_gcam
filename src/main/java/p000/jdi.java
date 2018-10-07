package p000;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jdi */
public final class jdi extends jdv {
    private jdi(jdo jdo, jaq jaq) {
        super(jdo, jaq);
    }

    /* renamed from: a */
    public static jdi m18375a(jdo jdo, ByteBuffer byteBuffer) {
        return new jdi(jdo, jdv.m18019a(jdo, new jdj(jdo, byteBuffer)));
    }

    public final String toString() {
        String jet = ((jet) mo15565d()).toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(jet).length() + 10);
        stringBuilder.append("GLBuffer{");
        stringBuilder.append(jet);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
