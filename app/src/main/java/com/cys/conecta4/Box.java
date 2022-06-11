package com.cys.conecta4;

import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Box {
    private ImageButton imageButton;
    private boolean status;
    private int numChip;
    private String colorChip;
    private int sector;

    public Box(ImageButton imageButton, int sector, int numChip) {
        this.imageButton = imageButton;
        this.status = false;
        this.numChip = numChip;
        this.colorChip = "W";
        this.sector = sector;
    }

    public int getNumChip() {
        return numChip;
    }

    public void setNumChip(int numChip) {
        this.numChip = numChip;
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

    public void activate(ImageButton imageButton){
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Sector: "+ getSector());
            }
        });
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
