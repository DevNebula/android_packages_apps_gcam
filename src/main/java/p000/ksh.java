package p000;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: ksh */
public class ksh extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public ksh(String str) {
        super(str);
    }

    /* renamed from: a */
    static ksh m5203a() {
        return new ksh("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    static ksh m5204b() {
        return new ksh("Protocol message had invalid UTF-8.");
    }

    /* renamed from: c */
    static ksi m5205c() {
        return new ksi("Protocol message tag had invalid wire type.");
    }

    /* renamed from: d */
    static ksh m5206d() {
        return new ksh("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: e */
    static ksh m5207e() {
        return new ksh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: f */
    static ksh m5208f() {
        return new ksh("Failed to parse the message.");
    }

    /* renamed from: g */
    static ksh m5209g() {
        return new ksh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
