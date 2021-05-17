package com.company;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;




//C:\другое\javaКурс\ARAProject\готовые фотки\achepixels\bigsize\brow0.tif

public class Image {

    static double faceProb = 20;

    static double eyeProb = 33;

    static double eye_color0_1Prob = 11.3;
    static double eye_color2_6Prob = 3;
    static double eye_color7_10Prob = 15.3;

    static double blushProb = 3.2;
    static double blushNullProb = 84;

    static double browProb = 27;
    static double browNullProb = 19;

    static double dropProb = 17.2;
    static double dropNullProb = 65.6;

    static double eye_dir0Prob = 11;
    static double eye_dir0Prob1_2 = 20;
    static double eye_dir0Prob1_3 = 49;

    static double glassProb0_3_9 = 2.8;
    static double glassProbOther = 5.6;
    static double glassNullProb = 58;

    static double hair0_10Prob = 3;
    static double hair11_12Prob = 1.7;
    static double hair13_26Prob = 5.1;

    static double mouth1_5Prob = 7.2;
    static double mouth0Prob6 = 4.5;
    static double mouth7_10Prob = 18;

    static double tool0_1Prob = 0.8;
    static double toolProbOther = 1.6;
    static double toolNullProb = 52;


    static ArrayList<Picture> listWithPictures = new ArrayList<>();

    //cout pictures


    public static void image() throws IOException {


        int i = 0;


        while (i < 1000) {
            Picture picture = new Picture();

            int faceRandom = (int) (Math.random() * 5);//face
            //hair
            Integer hairRandom = 0;
            int proportionHair = (int) (Math.random() * 30);
            if (proportionHair < 9)
                hairRandom = (int) (Math.random() * 11);
            else if (proportionHair == 11) {
                if (new Random().nextBoolean())
                    hairRandom = 11;
                else
                    hairRandom = 12;
            } else
                hairRandom = (int) (13 + Math.random() * 14);

            int eyeRandom = (int) (Math.random() * 3);//eye 3

            //eye color 11
            int eyeColorRandom = 0;
            int proportionColor = (int) (Math.random() * 18);
            if (proportionColor < 4) {
                if (new Random().nextBoolean())
                    eyeColorRandom = 0;
                else
                    eyeColorRandom = 1;
            } else if (proportionColor == 4 || proportionColor == 5 || proportionColor == 6)
                eyeColorRandom = (int) (2 + Math.random() * 5);
            else
                eyeColorRandom = (int) (7 + Math.random() * 4);

            //dir
            int eyeDirRandom = 0;
            int proportionDir = (int) (Math.random() * 10);
            if (proportionDir < 4)
                eyeDirRandom = (int) (1 + Math.random() * 2);
            else if (proportionDir == 4)
                eyeDirRandom = 0;
            else
                eyeDirRandom = 3;

            //glass
            int glassRandom = 0;
            int proportionGlass = (int) (Math.random() * 16);
            if (proportionGlass < 4)
                glassRandom = (int) (Math.random() * 4);
            else if (proportionGlass == 4)
                glassRandom = 9;
            else
                glassRandom = (int) (4 + Math.random() * 5);//glass9

            //mouth
            int mouthRandom = 0;
            int proportionMouth = (int) (Math.random() * 100);
            if (proportionMouth < 7)
                mouthRandom = (int) (1 + Math.random() * 5);//mouth
            else if (proportionMouth > 6 && proportionMouth < 11) {
                if (new Random().nextBoolean())
                    mouthRandom = 0;
                else
                    mouthRandom = 6;
            } else
                mouthRandom = (int) (7 + Math.random() * 3);


            int browRandom = (int) (Math.random() * 3);//brow 3

            int toolRandom = 0;
            int proportionTool = (int) (Math.random() * 30);
            if (proportionTool == 1) {
                if (new Random().nextBoolean())
                    toolRandom = 0;
                else
                    toolRandom = 1;
            } else
                toolRandom = (int) (2 + Math.random() * 30);

            int dropRandom = (int) (Math.random() * 2);//drop2

            int blushRandom = (int) (Math.random() * 6);//blush6

            //не совместимые элементы
            if (toolRandom == 30 && mouthRandom == 0) {
                i--;
                System.out.println("исключительная комбинация");
                continue;
            }
            if (toolRandom == 30 && hairRandom == 3) {
                i--;
                System.out.println("исключительная комбинация");
                continue;
            }

            if (toolRandom == 30 && hairRandom == 6) {
                //i--;
                System.out.println("исключительная комбинация");
                continue;
            }

            if (toolRandom == 9 && mouthRandom == 4) {
                //i--;
                System.out.println("исключительная комбинация");
                continue;
            }

            if (glassRandom == 9 && (hairRandom == 11 || hairRandom == 12)) {
                //i--;
                System.out.println("исключительная комбинация");
                continue;
            }


/////////////////////////////////////////////////////////////////////////////
            ArrayList<Double> localList = new ArrayList<>();

            localList.add(faceProb);

            //blush
            if (new Random().nextBoolean() || mouthRandom < 5 || glassRandom == 0 || glassRandom == 8 || glassRandom == 2 || glassRandom == 5) {
                picture.setBlushInt(1);
                localList.add(blushNullProb);
            } else
                localList.add(blushProb);

            //drop
            if (new Random().nextBoolean() || mouthRandom < 5) {
                picture.setDropInt(1);
                localList.add(dropNullProb);
            } else
                localList.add(dropProb);

            //tool
            if (new Random().nextBoolean()) {
                if (toolRandom == 0 || toolRandom == 1)
                    localList.add(tool0_1Prob);
                else
                    localList.add(toolProbOther);
            } else {
                localList.add(toolNullProb);
                picture.setToolInt(1);
            }

            //correct glass
            if (new Random().nextBoolean()) {
                if (glassRandom < 4 || glassRandom == 9)
                    localList.add(glassProb0_3_9);
                else
                    localList.add(glassProbOther);
            } else {
                picture.setGlassInt(1);
                localList.add(glassNullProb);
            }

            //correct brow
            if ((glassRandom == 4 || glassRandom == 7 || glassRandom == 1) && picture.getGlassInt() != 1 || (
                    (glassRandom == 9 && picture.getGlassInt() != 1) || hairRandom == 11 || hairRandom == 12)) {
                picture.setBrowInt(1);
                localList.add(browNullProb);
            } else
                localList.add(browProb);


            if (eyeColorRandom == 0 || eyeColorRandom == 1)
                localList.add(eye_color0_1Prob);
            else if (eyeColorRandom > 1 && eyeColorRandom < 7)
                localList.add(eye_color2_6Prob);
            else if (eyeColorRandom > 6)
                localList.add(eye_color7_10Prob);


            //hair
            if (hairRandom < 11)
                localList.add(hair0_10Prob);
            else if (hairRandom == 11 || hairRandom == 12)
                localList.add(hair11_12Prob);
            else if (hairRandom > 12)
                localList.add(hair13_26Prob);

            //mouth
            if (mouthRandom == 0 || mouthRandom == 6)
                localList.add(mouth0Prob6);
            else if (mouthRandom > 0 && eyeColorRandom < 6)
                localList.add(mouth1_5Prob);
            else if (mouthRandom > 6)
                localList.add(mouth7_10Prob);

            //eye
            localList.add(eyeProb);


            if (eyeDirRandom == 0)
                localList.add(eye_dir0Prob);
            else if (eyeDirRandom == 1 || eyeDirRandom == 2)
                localList.add(eye_dir0Prob1_2);
            else
                localList.add(eye_dir0Prob1_3);


////////////////////////////////////////////////////////////////////////

            picture.setFace(faceRandom);
            picture.setHair(hairRandom);
            picture.setMouth(mouthRandom);
            picture.setDrop(dropRandom);
            picture.setEye(eyeRandom);
            picture.setEye_color(eyeColorRandom);
            picture.setEye_dir(eyeDirRandom);
            picture.setGlass(glassRandom);
            picture.setTool(toolRandom);
            picture.setBrow(browRandom);
            picture.setBlush(blushRandom);
            picture.setProbability(averageGeometry(localList));


            listWithPictures.add(picture);
            i++;

        }

    }


    public static Double averageGeometry(ArrayList<Double> arrayList) {
        Double product = 1.0;
        for ( Double i : arrayList )
            product = product * i;
        double power = 1 / (double) arrayList.size();
        Double root = Math.pow(product, power);
        return root;
    }

}





