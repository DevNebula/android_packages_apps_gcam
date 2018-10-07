package com.google.android.libraries.smartburst.utils;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import java.util.Collection;
import java.util.List;
import p000.jky;
import p000.jkz;
import p000.jza;
import p000.khb;
import p000.khx;

/* compiled from: PG */
public class FeatureTableUtils {
    public static FloatArray getAllValidFeatureValue(FeatureTable featureTable, jza jza) {
        if (jza.f8493A != 1) {
            throw new IllegalArgumentException("Can not apply on features with more than 1 value!");
        }
        FloatArray floatArray = new FloatArray();
        jkz rowIterator = featureTable.getRowIterator(featureTable.getEarliestTimestamp());
        while (rowIterator.mo9482a()) {
            floatArray.add(((jky) rowIterator.next()).mo9479a(jza).getValue());
        }
        return floatArray;
    }

    public static long[] getAllValidTimestamps(FeatureTable featureTable) {
        Collection b = khb.m4945b();
        jkz rowIterator = featureTable.getRowIterator(featureTable.getEarliestTimestamp());
        while (rowIterator.mo9482a()) {
            b.add(Long.valueOf(((jky) rowIterator.next()).mo9481b()));
        }
        return khx.m5003a(b);
    }

    public static FloatArray getFeatureInRange(FeatureTable featureTable, jza jza, long j, long j2) {
        if (jza.f8493A != 1) {
            throw new IllegalArgumentException("Can not apply on features with more than 1 value!");
        }
        FloatArray floatArray = new FloatArray();
        jkz rowIterator = featureTable.getRowIterator(j);
        while (rowIterator.mo9482a()) {
            jky jky = (jky) rowIterator.next();
            if (jky.mo9481b() > j2) {
                break;
            }
            floatArray.add(jky.mo9479a(jza).getValue());
        }
        return floatArray;
    }

    public static List getTimestampsInRange(FeatureTable featureTable, long j, long j2) {
        List b = khb.m4945b();
        jkz rowIterator = featureTable.getRowIterator(j);
        while (rowIterator.mo9482a()) {
            jky jky = (jky) rowIterator.next();
            if (jky.mo9481b() > j2) {
                break;
            }
            b.add(Long.valueOf(jky.mo9481b()));
        }
        return b;
    }
}
