package p000;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* renamed from: gf */
public class C0243gf {
    /* renamed from: b */
    public int f5362b;
    /* renamed from: c */
    public C0244gg f5363c;
    /* renamed from: d */
    public Context f5364d;
    /* renamed from: e */
    public boolean f5365e = false;
    /* renamed from: f */
    public boolean f5366f = false;
    /* renamed from: g */
    public boolean f5367g = true;
    /* renamed from: h */
    public boolean f5368h = false;

    public C0243gf(Context context) {
        this.f5364d = context.getApplicationContext();
    }

    /* renamed from: a */
    public static String m2573a(Object obj) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0261ha.m3024a(obj, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public void mo7097b(Object obj) {
        C0244gg c0244gg = this.f5363c;
        if (c0244gg != null) {
            c0244gg.onLoadComplete(this, obj);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo7096a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f5362b);
        printWriter.print(" mListener=");
        printWriter.println(this.f5363c);
        if (this.f5365e || this.f5368h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f5365e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f5368h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.f5366f || this.f5367g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f5366f);
            printWriter.print(" mReset=");
            printWriter.println(this.f5367g);
        }
    }

    /* renamed from: c */
    public boolean mo7098c() {
        return false;
    }

    /* renamed from: d */
    public void mo7099d() {
    }

    /* renamed from: e */
    public void mo7100e() {
    }

    /* renamed from: f */
    public void mo7101f() {
    }

    /* renamed from: g */
    public final void mo7102g() {
        this.f5367g = true;
        this.f5365e = false;
        this.f5366f = false;
        this.f5368h = false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0261ha.m3024a((Object) this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f5362b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
