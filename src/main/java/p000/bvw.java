package p000;

import android.content.ContentProvider.PipeDataWriter;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

/* renamed from: bvw */
final /* synthetic */ class bvw implements PipeDataWriter {
    /* renamed from: a */
    private final bvv f1661a;
    /* renamed from: b */
    private final String f1662b;
    /* renamed from: c */
    private final ByteArrayOutputStream f1663c;

    bvw(bvv bvv, String str, ByteArrayOutputStream byteArrayOutputStream) {
        this.f1661a = bvv;
        this.f1662b = str;
        this.f1663c = byteArrayOutputStream;
    }

    public final void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri, String str, Bundle bundle, Object obj) {
        bvv bvv = this.f1661a;
        String str2 = this.f1662b;
        ByteArrayOutputStream byteArrayOutputStream = this.f1663c;
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        ird ird = bvv.f11849a;
        String str3 = buk.f1625a;
        String valueOf = String.valueOf(fileDescriptor);
        int length = String.valueOf(str3).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 33) + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        stringBuilder.append("ByteArrayOutputStream.writeTo#fd=");
        stringBuilder.append(valueOf);
        ird.mo8856a(stringBuilder.toString());
        try {
            byteArrayOutputStream.writeTo(new BufferedOutputStream(new FileOutputStream(fileDescriptor)));
        } catch (Throwable e) {
            bli.m892b(buk.f1625a, "Error when writeTo the ParcelFileDescriptor", e);
        } finally {
            bvv.f11849a.mo8857b();
        }
    }
}
