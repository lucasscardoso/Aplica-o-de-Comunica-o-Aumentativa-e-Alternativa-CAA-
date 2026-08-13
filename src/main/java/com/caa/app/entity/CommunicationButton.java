package com.caa.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "communication_button")
public class CommunicationButton {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;

    @Column(name = "speech_text")
    private String speechText;


    private String icon;

    @Column(name = "display_order")
    private Integer displayOrder;

    @Column(nullable = false)
    private Boolean active = true;

    @ManyToOne
    private Category category;


    public CommunicationButton(){}

    public CommunicationButton(Long id, String label, String speechText, String icon, Integer displayOrder, Boolean active, Category category) {
        this.id = id;
        this.label = label;
        this.speechText = speechText;
        this.icon = icon;
        this.displayOrder = displayOrder;
        this.active = active;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getspeechText() {
        return speechText;
    }

    public void setspeechText(String speechText) {
        this.speechText = speechText;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
