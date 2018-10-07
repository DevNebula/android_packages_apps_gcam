package p000;

import com.google.common.p006io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: esw */
final class esw {
    static {
        bli.m887a("SafeJpegSaving");
    }

    /* renamed from: a */
    static InputStream m2146a(gsi gsi, gsl gsl, InputStream inputStream, File file, kbg kbg) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteStreams.copy(inputStream, byteArrayOutputStream);
        gsl.mo7395a(file);
        gsl.mo7400e(new File(file.getParentFile(), ".nomedia"));
        gsi.mo7392a(file, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), kbg);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }
}
