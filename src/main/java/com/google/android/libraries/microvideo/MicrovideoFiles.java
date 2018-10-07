package com.google.android.libraries.microvideo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.C0554wb;
import p000.C0556wd;
import p000.ion;

/* compiled from: PG */
public final class MicrovideoFiles {
    private MicrovideoFiles() {
    }

    public static C0556wd extractXMPData(File file) {
        return ion.m4009a(file.getPath());
    }

    public static InputStream openVideoStream(File file) {
        Integer i = extractXMPData(file).mo11457i("http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset");
        if (i == null) {
            throw new C0554wb("Property value missing", 5);
        }
        long length = file.length() - ((long) i.intValue());
        if (length <= 0) {
            throw new IOException("Microvideo file seems to be truncated. Provided offset is greater  than or equal to the file size.");
        }
        InputStream fileInputStream = new FileInputStream(file);
        fileInputStream.skip(length);
        return fileInputStream;
    }
}
