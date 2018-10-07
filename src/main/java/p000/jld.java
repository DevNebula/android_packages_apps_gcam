package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.utils.Feature;
import java.io.Writer;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jld */
public final class jld implements FeatureTable {
    /* renamed from: a */
    public final Writer f21620a;
    /* renamed from: b */
    private final Executor f21621b;
    /* renamed from: c */
    private final FeatureTable f21622c;

    public jld(FeatureTable featureTable, Writer writer, Executor executor) {
        jri.m13404b((Object) featureTable);
        jri.m13404b((Object) writer);
        jri.m13404b((Object) executor);
        this.f21622c = featureTable;
        this.f21620a = writer;
        this.f21621b = executor;
    }

    public final int getAssignmentCount(jza jza) {
        return this.f21622c.getAssignmentCount(jza);
    }

    public final int getCapacity() {
        return this.f21622c.getCapacity();
    }

    public final int getColumnCount() {
        return this.f21622c.getColumnCount();
    }

    public final Feature[] getColumnValues(jza jza) {
        return this.f21622c.getColumnValues(jza);
    }

    public final long getEarliestTimestamp() {
        return this.f21622c.getEarliestTimestamp();
    }

    public final Feature getFeature(long j, jza jza) {
        return this.f21622c.getFeature(j, jza);
    }

    public final int getFeatureCount() {
        return this.f21622c.getFeatureCount();
    }

    public final EnumSet getFeatureTypes() {
        return this.f21622c.getFeatureTypes();
    }

    public final float getFrameRate() {
        return this.f21622c.getFrameRate();
    }

    public final long getLatestValidTimestamp() {
        return this.f21622c.getLatestValidTimestamp();
    }

    public final int getNumRowsWithData() {
        return this.f21622c.getNumRowsWithData();
    }

    public final int getRowCount() {
        return this.f21622c.getRowCount();
    }

    public final jky getRowForTimestamp(long j) {
        return this.f21622c.getRowForTimestamp(j);
    }

    public final jkz getRowIterator(long j) {
        return this.f21622c.getRowIterator(j);
    }

    public final boolean setFeatureValue(long j, Feature feature) {
        boolean featureValue = this.f21622c.setFeatureValue(j, feature);
        this.f21621b.execute(new jle(this, j, feature));
        return featureValue;
    }

    public final String toString() {
        return String.format("[%s: %s]", new Object[]{"LoggingFeatureTable", this.f21622c.toString()});
    }
}
