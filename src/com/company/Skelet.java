package com.company;

public class Skelet extends Boss{
    private int arrows;

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }
    public String info(){
        return super.info() +","+ "Количество стрел: "+arrows;
    }
}
