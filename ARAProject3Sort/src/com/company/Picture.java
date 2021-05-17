package com.company;

import java.awt.image.BufferedImage;

public class Picture {


//if this variables==1 -> the same images =null (because defaul value=0)!!!!!
    public int blushInt;
    public int toolInt;
    public int browInt;
    public int dropInt;
    public int glassInt;

    public int getGlassInt() {
        return glassInt;
    }

    public void setGlassInt(int glassInt) {
        this.glassInt = glassInt;
    }

    public int getBlushInt() {
        return blushInt;
    }

    public int getToolInt() {
        return toolInt;
    }

    public int getBrowInt() {
        return browInt;
    }

    public int getDropInt() {
        return dropInt;
    }

    public void setBlushInt(int blushInt) {
        this.blushInt = blushInt;
    }

    public void setToolInt(int toolInt) {
        this.toolInt = toolInt;
    }

    public void setBrowInt(int browInt) {
        this.browInt = browInt;
    }

    public void setDropInt(int dropInt) {
        this.dropInt = dropInt;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }

    public Integer face;
    public Integer hair;
    public Integer mouth;
    public int drop;
    public Integer eye;
    public Integer eye_color;
    public Integer eye_dir;
    public Integer glass;
    public Integer tool;
    public Integer brow;
    public int blush;
    public Double probability;

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    //setter
    public void setFace(Integer face) {
        this.face = face;
    }

    public void setHair(Integer hair) {
        this.hair = hair;
    }

    public void setMouth(Integer mouth) {
        this.mouth = mouth;
    }

    public void setDrop(Integer drop) {
        this.drop = drop;
    }

    public void setEye(Integer eye) {
        this.eye = eye;
    }

    public void setEye_color(Integer eye_color) {
        this.eye_color = eye_color;
    }

    public void setEye_dir(Integer eye_dir) {
        this.eye_dir = eye_dir;
    }

    public void setGlass(Integer glass) {
        this.glass = glass;
    }

    public void setTool(Integer tool) {
        this.tool = tool;
    }

    public void setBrow(Integer brow) {
        this.brow = brow;
    }

    public void setBlush(int blush) {
        this.blush = blush;
    }

//getter
    public Integer getFace() {
        return face;
    }

    public Integer getHair() {
        return hair;
    }

    public Integer getMouth() {
        return mouth;
    }

    public Integer getDrop() {
        return drop;
    }

    public Integer getEye() {
        return eye;
    }

    public Integer getEye_color() {
        return eye_color;
    }

    public Integer getEye_dir() {
        return eye_dir;
    }

    public Integer getGlass() {
        return glass;
    }

    public Integer getTool() {
        return tool;
    }

    public Integer getBrow() {
        return brow;
    }

    public Integer getBlush() {
        return blush;
    }




}
