package za.ac.cput.domain;

/**
 * Warehouse
 * Warehouse model class
 * Warehouse Builder
 * Tebogo Pii 230226442
 */
public class Warehouse {
    private String warehouseId;
    private String location;
    private int capacity;

    private Warehouse() {}

    private Warehouse(Builder builder) {
        this.warehouseId = builder.warehouseId;
        this.location = builder.location;
        this.capacity = builder.capacity;
    }

    public String getWarehouseId() {
        return warehouseId;
    }
    public String getLocation() {
        return location;
    }
    public int getCapacity() {
        return capacity;
    }

    public static class Builder {
        private String warehouseId;
        private String location;
        private int capacity;

        public Builder setWarehouseId(String warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder copy(Warehouse warehouse) {
            this.warehouseId = warehouse.warehouseId;
            this.location = warehouse.location;
            this.capacity = warehouse.capacity;
            return this;
        }

        public Warehouse build() {
            return new Warehouse(this);
        }
    }

    @Override
    public String toString() {
        return "Warehouse{" + "id='" + warehouseId + '\'' + ", location='" + location + '\'' + '}';
    }
}

