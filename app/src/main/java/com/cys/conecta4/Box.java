package com.cys.conecta4;

import android.widget.ImageButton;

public class Box {
    private ImageButton imageButton;
    private boolean status;
    private String colorChip;
    private int sector;

    public Box(ImageButton imageButton, boolean status, String colorChip, int sector) {
        this.imageButton = imageButton;
        this.status = false;
        this.colorChip = "W";
        this.sector = 0;
    }

    public ImageButton getImageButton() {
        return imageButton;
    }

    public void setImageButton(ImageButton imageButton) {
        this.imageButton = imageButton;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getColorChip() {
        return colorChip;
    }

    public void setColorChip(String colorChip) {
        this.colorChip = colorChip;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Box{" +
                "imageButton=" + imageButton.toString() +
                ", status=" + this.isStatus()+
                ", colorChip='" + this.getColorChip() + '\'' +
                ", sector=" + this.getSector() +
                '}';
    }
}
