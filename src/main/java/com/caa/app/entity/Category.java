    package com.caa.app.entity;

    import jakarta.persistence.*;

    @Entity
    @Table(name = "categories")
    public class Category {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long id;

        @Column(name = "name")
        private String name;

        private String icon;

        @Column(name = "display_order")
        private Integer displayOrder;

        @Column(nullable = false)
        private Boolean active = true;

        public Category(){}

        public Category(Long id, Boolean active, Integer displayOrder, String icon, String name) {
            this.id = id;
            this.active = active;
            this.displayOrder = displayOrder;
            this.icon = icon;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Integer getDisplayOrder() {
            return displayOrder;
        }

        public void setDisplayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }
    }
