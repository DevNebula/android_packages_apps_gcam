package com.google.googlex.gcam.androidutils;

import android.util.Log;

/* compiled from: PG */
public class Logf {
    /* renamed from: d */
    public static int m1408d(String str, String str2, Throwable th, Object... objArr) {
        return Log.d(str, String.format(str2, objArr), th);
    }

    /* renamed from: d */
    public static int m1409d(String str, String str2, Object... objArr) {
        return Log.d(str, String.format(str2, objArr));
    }

    /* renamed from: e */
    public static int m1410e(String str, String str2, Throwable th, Object... objArr) {
        return Log.e(str, String.format(str2, objArr), th);
    }

    /* renamed from: e */
    public static int m1411e(String str, String str2, Object... objArr) {
        return Log.e(str, String.format(str2, objArr));
    }

    /* renamed from: i */
    public static int m1412i(String str, String str2, Throwable th, Object... objArr) {
        return Log.i(str, String.format(str2, objArr), th);
    }

    /* renamed from: i */
    public static int m1413i(String str, String str2, Object... objArr) {
        return Log.i(str, String.format(str2, objArr));
    }

    public static int println(int i, String str, String str2, Object... objArr) {
        return Log.println(i, str, String.format(str2, objArr));
    }

    /* renamed from: v */
    public static int m1414v(String str, String str2, Throwable th, Object... objArr) {
        return Log.v(str, String.format(str2, objArr), th);
    }

    /* renamed from: v */
    public static int m1415v(String str, String str2, Object... objArr) {
        return Log.v(str, String.format(str2, objArr));
    }

    /* renamed from: w */
    public static int m1416w(String str, String str2, Throwable th, Object... objArr) {
        return Log.w(str, String.format(str2, objArr), th);
    }

    /* renamed from: w */
    public static int m1417w(String str, String str2, Object... objArr) {
        return Log.w(str, String.format(str2, objArr));
    }

    public static int wtf(String str, String str2, Throwable th, Object... objArr) {
        return Log.wtf(str, String.format(str2, objArr), th);
    }

    public static int wtf(String str, String str2, Object... objArr) {
        return Log.wtf(str, String.format(str2, objArr));
    }
}
