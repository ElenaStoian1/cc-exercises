import java.util.Objects;

public class Gap {
    private int gapSize;
    private int gapFrom;
    private int gapTo;

    public Gap() {
    }

    public Gap(int gapSize, int gapFrom, int gapTo) {
        this.gapSize = gapSize;
        this.gapFrom = gapFrom;
        this.gapTo = gapTo;
    }

    public int getGapSize() {
        return gapSize;
    }

    public void setGapSize(int gapSize) {
        this.gapSize = gapSize;
    }

    public int getGapFrom() {
        return gapFrom;
    }

    public void setGapFrom(int gapFrom) {
        this.gapFrom = gapFrom;
    }

    public int getGapTo() {
        return gapTo;
    }

    public void setGapTo(int gapTo) {
        this.gapTo = gapTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gap gap = (Gap) o;
        return gapSize == gap.gapSize && gapFrom == gap.gapFrom && gapTo == gap.gapTo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gapSize, gapFrom, gapTo);
    }
}
