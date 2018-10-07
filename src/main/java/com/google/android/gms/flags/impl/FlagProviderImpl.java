package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.util.DynamiteApi;
import p000.htl;
import p000.hxg;
import p000.hxj;
import p000.hyc;
import p000.hyd;
import p000.hye;
import p000.hyf;
import p000.hyg;
import p000.iah;

@DynamiteApi
public class FlagProviderImpl extends iah {
    /* renamed from: a */
    private boolean f23473a = false;
    /* renamed from: b */
    private SharedPreferences f23474b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return this.f23473a ? ((Boolean) htl.m3457a(new hyc(this.f23474b, str, Boolean.valueOf(z)))).booleanValue() : z;
    }

    public void init(hxg hxg) {
        Context context = (Context) hxj.m16273a(hxg);
        if (!this.f23473a) {
            try {
                this.f23474b = hyg.m3642a(context.createPackageContext("com.google.android.gms", 0));
                this.f23473a = true;
            } catch (NameNotFoundException e) {
            }
        }
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return this.f23473a ? ((Integer) htl.m3457a(new hyd(this.f23474b, str, Integer.valueOf(i)))).intValue() : i;
    }

    public long getLongFlagValue(String str, long j, int i) {
        return this.f23473a ? ((Long) htl.m3457a(new hye(this.f23474b, str, Long.valueOf(j)))).longValue() : j;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return this.f23473a ? (String) htl.m3457a(new hyf(this.f23474b, str, str2)) : str2;
    }
}
