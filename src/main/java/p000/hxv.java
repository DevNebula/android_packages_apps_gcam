package p000;

import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

@TargetApi(14)
/* renamed from: hxv */
public final class hxv extends hxu {
    /* renamed from: d */
    public final ApplicationErrorReport f20831d;
    /* renamed from: e */
    public String f20832e;

    public hxv() {
        this.f20831d = new ApplicationErrorReport();
        this.f20831d.crashInfo = new CrashInfo();
        this.f20831d.crashInfo.throwLineNumber = -1;
    }

    /* renamed from: a */
    public final FeedbackOptions mo8253a() {
        htl.m3488b(this.f20831d.crashInfo.exceptionClassName);
        htl.m3488b(this.f20831d.crashInfo.throwClassName);
        htl.m3488b(this.f20831d.crashInfo.throwMethodName);
        htl.m3488b(this.f20831d.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.f20831d.crashInfo.throwFileName)) {
            this.f20831d.crashInfo.throwFileName = "unknown";
        }
        return super.mo8253a().f23457d.crashInfo = this.f20831d.crashInfo.f23460g = this.f20832e;
    }

    /* renamed from: a */
    public final hxv mo13595a(int i) {
        this.f20831d.crashInfo.throwLineNumber = i;
        return this;
    }

    /* renamed from: a */
    public final hxv mo13596a(String str) {
        this.f20831d.crashInfo.exceptionClassName = str;
        return this;
    }

    /* renamed from: b */
    public final hxv mo13597b(String str) {
        this.f20831d.crashInfo.stackTrace = str;
        return this;
    }

    /* renamed from: c */
    public final hxv mo13598c(String str) {
        this.f20831d.crashInfo.throwClassName = str;
        return this;
    }

    /* renamed from: d */
    public final hxv mo13599d(String str) {
        this.f20831d.crashInfo.throwFileName = str;
        return this;
    }

    /* renamed from: e */
    public final hxv mo13600e(String str) {
        this.f20831d.crashInfo.throwMethodName = str;
        return this;
    }
}
