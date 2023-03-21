package com.course.builder;

public class Tv {
    private String brand;
    private String model;
    private double size;
    private int refreshRate;
    private DisplayType displayType;
    private boolean smartTv;

    private Tv(TvBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.size = builder.size;
        this.refreshRate = builder.refreshRate;
        this.displayType = builder.displayType;
        this.smartTv = builder.smartTv;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", refreshRate=" + refreshRate +
                ", displayType=" + displayType +
                ", smartTv=" + smartTv +
                '}';
    }

    public static class TvBuilder {
        private String brand;
        private String model;
        private double size;
        private int refreshRate;
        private DisplayType displayType;
        private boolean smartTv;

        public TvBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public TvBuilder model(String model) {
            this.model = model;
            return this;
        }

        public TvBuilder size(double size) {
            this.size = size;
            return this;
        }

        public TvBuilder refreshRate(int refreshRate) {
            this.refreshRate = refreshRate;
            return this;
        }

        public TvBuilder displayType(DisplayType displayType) {
            this.displayType = displayType;
            return this;
        }

        public TvBuilder smartTv(boolean smartTv) {
            this.smartTv = smartTv;
            return this;
        }

        public Tv build() {
            return new Tv(this);
        }
    }
}
