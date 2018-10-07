package p000;

import java.io.PushbackReader;
import java.io.Reader;

/* compiled from: PG */
/* renamed from: wl */
public final class C0563wl extends PushbackReader {
    /* renamed from: a */
    private int f9968a = 0;
    /* renamed from: b */
    private int f9969b = 0;
    /* renamed from: c */
    private int f9970c = 0;

    public C0563wl(Reader reader) {
        super(reader, 8);
    }

    public final int read(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[8];
        int i3 = 0;
        Object obj = 1;
        int i4 = i;
        int i5 = 0;
        while (obj != null && i3 < i2) {
            if (super.read(cArr2, i5, 1) == 1) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                int i6;
                char c = cArr2[i5];
                switch (this.f9968a) {
                    case 0:
                        if (c == '&') {
                            this.f9968a = 1;
                            break;
                        }
                        break;
                    case 1:
                        if (c != '#') {
                            this.f9968a = 5;
                            break;
                        }
                        this.f9968a = 2;
                        break;
                    case 2:
                        if (c != 'x') {
                            if (c >= '0' && c <= '9') {
                                this.f9969b = Character.digit(c, 10);
                                this.f9970c = 1;
                                this.f9968a = 4;
                                break;
                            }
                            this.f9968a = 5;
                            break;
                        }
                        this.f9969b = 0;
                        this.f9970c = 0;
                        this.f9968a = 3;
                        break;
                        break;
                    case 3:
                        if ((c < '0' || c > '9') && ((c < 'a' || c > 'f') && (c < 'A' || c > 'F'))) {
                            if (c != ';' || !C0567wp.m6221a((char) this.f9969b)) {
                                this.f9968a = 5;
                                break;
                            }
                            this.f9968a = 0;
                            c = (char) this.f9969b;
                            break;
                        }
                        this.f9969b = (this.f9969b << 4) + Character.digit(c, 16);
                        this.f9970c++;
                        if (this.f9970c > 4) {
                            this.f9968a = 5;
                            break;
                        }
                        this.f9968a = 3;
                        break;
                    case 4:
                        if (c < '0' || c > '9') {
                            if (c != ';' || !C0567wp.m6221a((char) this.f9969b)) {
                                this.f9968a = 5;
                                break;
                            }
                            this.f9968a = 0;
                            c = (char) this.f9969b;
                            break;
                        }
                        this.f9969b = (this.f9969b * 10) + Character.digit(c, 10);
                        this.f9970c++;
                        if (this.f9970c > 5) {
                            this.f9968a = 5;
                            break;
                        }
                        this.f9968a = 4;
                        break;
                        break;
                    case 5:
                        this.f9968a = 0;
                        break;
                }
                int i7 = this.f9968a;
                if (i7 == 0) {
                    if (C0567wp.m6221a(c)) {
                        c = ' ';
                    }
                    i5 = i4 + 1;
                    cArr[i4] = c;
                    i6 = i3 + 1;
                    i3 = 0;
                } else if (i7 == 5) {
                    unread(cArr2, 0, i5 + 1);
                    i5 = i4;
                    i6 = i3;
                    i3 = 0;
                } else {
                    i6 = i5 + 1;
                    i5 = i4;
                    int i8 = i6;
                    i6 = i3;
                    i3 = i8;
                }
                i4 = i5;
                i5 = i3;
                i3 = i6;
            } else if (i5 > 0) {
                unread(cArr2, 0, i5);
                this.f9968a = 5;
                obj = 1;
                i5 = 0;
            }
        }
        return (i3 > 0 || obj != null) ? i3 : -1;
    }
}
