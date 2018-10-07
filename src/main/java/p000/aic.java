package p000;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: aic */
final class aic implements arw {
    aic() {
    }

    /* renamed from: b */
    private static aid m6541b() {
        try {
            return new aid(MessageDigest.getInstance("SHA-256"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
