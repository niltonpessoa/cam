package com.nostra13.universalimageloader.core.assist;

public class ImageSize {
    private static final String SEPARATOR = "x";
    private static final int TO_STRING_MAX_LENGHT = 9;
    private final int height;
    private final int width;

    public ImageSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public ImageSize(int i, int i2, int i3) {
        if (i3 % 180 == 0) {
            this.width = i;
            this.height = i2;
            return;
        }
        this.width = i2;
        this.height = i;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public ImageSize scale(float f) {
        return new ImageSize((int) (((float) this.width) * f), (int) (((float) this.height) * f));
    }

    public ImageSize scaleDown(int i) {
        return new ImageSize(this.width / i, this.height / i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(9);
        sb.append(this.width);
        sb.append(SEPARATOR);
        sb.append(this.height);
        return sb.toString();
    }
}
